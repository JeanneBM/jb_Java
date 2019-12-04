import javax.swing.JOptionPane;

/**
   Ten program pobiera wartości sprzedaży z tygodnia.
   Używana jest tu klasa SalesData do wyświetlania sumy,
   średniej, najwyższej i najniższej wartości sprzedaży.
*/

public class Sales
{
   public static void main(String[] args)
   {
      final int ONE_WEEK = 7; // Liczba elementów.

      // Tworzenie tablicy do przechowywania wartości sprzedaży z dni tygodnia.
      double[] sales = new double[ONE_WEEK];

      // Pobieranie wartości sprzedaży z tygodnia.
      getValues(sales);

      // Tworzenie obiektu typu SalesData zainicjowanego 
      // danymi sprzedażowymi z okresu tygodnia.
      SalesData week = new SalesData(sales);

      // Wyświetlanie sumy, średniej, najwyższej i najniższej
      // wartości sprzedaży z okresu tygodnia.
      JOptionPane.showMessageDialog(null,
        String.format("Sprzedaż w sumie wyniosła %,.2f złotych.\n" +
                      "Średnia sprzedaż wyniosła %,.2f złotych.\n" +
                      "Najwyższa wartość sprzedaży wyniosła %,.2f złotych.\n" +
                      "Najniższa  wartość sprzedaży wyniosła %,.2f złotych.",
                       week.getTotal(),
                       week.getAverage(),
                       week.getHighest(),
                       week.getLowest()));

      System.exit(0);
   }

   /**
      Metoda getValues wyświetla prośbę o podanie wartości
      sprzedaży przypisywanych każdemu elementowi tablicy.
      @param array Tablica, w której zapisywane są wartości.
   */

   private static void getValues(double[] array)
   {
      String input;  // Przechowywanie danych wejściowych od użytkownika.

      // Pobieranie wartości sprzedaży z każdego dnia tygodnia.
      for (int i = 0; i < array.length; i++)
      {
         input = JOptionPane.showInputDialog(
                  "Podaj wartość sprzedaży z dnia numer " + (i + 1) + ": ");
         array[i] = Double.parseDouble(input);
      }
   }
}
