import javax.swing.JOptionPane;

/**
   Ten program przelicza szklanki na litry.
*/

public class CupConverter
{
   public static void main(String[] args)
   {
      double cups;   // Przechowywanie liczby szklanek.
      double ounces;  // Przechowywanie liczby litrów.
 
      // Pobieranie liczby szklanek.
      cups = getCups();
 
      // Przeliczanie szklanek na litry.
      ounces = cupsToOunces(cups);

      // Wyświetlanie wyników.
      displayResults(cups, ounces);
      System.exit(0);
   }
   
   /**
      Metoda getCups wyświetla prośbę o wprowadzenie
      liczby szklanek.
      @return Liczba szklanek wprowadzona przez użytkownika.
   */
   
   public static double getCups()
   {
      String input;    // Przechowywanie danych wejściowych.
      double numCups;  // Przechowywanie liczby szklanek.
 
      // Pobieranie liczby szklanek od użytkownika.
      input = JOptionPane.showInputDialog(
              "Ten program przelicza\n" +
              "szklanki na litry. Używany\n" +
              "jest do tego wzór:\n" +
              " 1 szklanka = 0,24 litra.\n\n" + 
              "Podaj liczbę szklanek: ");

      // Przekształcanie danych wejściowych na typ double.
      numCups = Double.parseDouble(input);
      
      // Zwracanie liczby szklanek.
      return numCups;
   }
   
   /**
      Metoda cupsToOunces przelicza szklanki
      na litry na podstawie wzoru
      1 szklanka = 0,24 litra.
      @param numCups Liczba przeliczanych szklanek.
      @return Liczba litrów.
   */
   
   public static double cupsToOunces(double numCups)
   {
      return numCups * 0.24;
   }
   
   /**
      Metoda displayResults wyświetla komunikat 
      z wynikiem przeliczenia.
      @param cups Liczba szklanek.
      @param ounces Liczba litrów.
   */
   
   public static void displayResults(double cups, double ounces)
   {
      // Wyświetlanie liczby litrów.
      JOptionPane.showMessageDialog(null,
          "Szklanki: " + cups +
          "\nLitry: " + ounces);
   }
}
