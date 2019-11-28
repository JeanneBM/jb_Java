import javax.swing.JOptionPane;

/**
   Ten program oblicza sumę bieżącą.
*/

public class TotalSales
{
   public static void main(String[] args)
   {
      int days;            // Liczba dni.
      double sales;        // Wartość sprzedaży z danego dnia.
      double totalSales;   // Akumulator.
      String input;        // Dane wejściowe od użytkownika.

      // Pobieranie liczby dni.
      input = JOptionPane.showInputDialog("Z ilu dni " +
                                          "posiadasz dane sprzedażowe?");
      days = Integer.parseInt(input);

      // Przypisywanie 0 do akumulatora.
      totalSales = 0.0;

      // Pobieranie wartości sprzedaży i obliczanie sumy bieżącej.
      for (int count = 1; count <= days; count++)
      {
         input = JOptionPane.showInputDialog("Wprowadź wartość sprzedaży " +
                                             "z dnia " + count + ": ");
         sales = Double.parseDouble(input);
         totalSales += sales; // Dodawanie sales do totalSales.
      }

      // Wyświetlanie łącznej wartości sprzedaży.
      JOptionPane.showMessageDialog(null, 
      String.format("Łączna wartość sprzedaży to %,.2f złotych.", totalSales));

      System.exit(0);
   }
}
