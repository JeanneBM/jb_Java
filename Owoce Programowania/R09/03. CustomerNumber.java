import javax.swing.JOptionPane;

/**
   Ten program sprawdza numer klienta,
   aby ustalić, czy jego format jest poprawny.
*/

public class CustomerNumber
{
   public static void main(String[] args)
   {
      String input;  // Przechowuje dane wejściowe od użytkownika.

      // Pobieranie numeru klienta.
      input = JOptionPane.showInputDialog("Podaj " +
         "numer klienta w formacie LLLCCCC\n" +
         "(LLL = litery i CCCC = cyfry)");

      // Sprawdzanie poprawności danych wejściowych.
      if (isValid(input))
      {
         JOptionPane.showMessageDialog(null,
                 "Jest to poprawny numer klienta.");
      }
      else
      {
         JOptionPane.showMessageDialog(null,
             "To nie jest poprawny format " +
             "numeru klienta.\nOto " +
             "przykład: ABC1234");
      }
      
      System.exit(0);
   }

   /**
      Metoda isValid sprawdza, czy podany obiekt typu
      String zawiera poprawny numer klienta. Jeśli tak jest,
      metoda zwraca wartość true.
      @param custNumber Sprawdzany obiekt typu String.
      @return true, jeśli dane mają poprawny format; w przeciwnym razie false.
   */

   private static boolean isValid(String custNumber)
   {
      boolean goodSoFar = true;  // Flaga.
      int i = 0;                // Zmienna sterująca.

      // Sprawdzanie długości.
      if (custNumber.length() != 7)
         goodSoFar = false;

      // Sprawdzanie, czy pierwsze trzy znaki to litery.
      while (goodSoFar && i < 3)
      {
         if (!Character.isLetter(custNumber.charAt(i)))
            goodSoFar = false;
         i++;
      }

      // Sprawdzanie, czy cztery ostatnie znaki to cyfry.
      while (goodSoFar && i < 7)
      {
         if (!Character.isDigit(custNumber.charAt(i)))
            goodSoFar = false;
         i++;
      }

      return goodSoFar;
   }
}
