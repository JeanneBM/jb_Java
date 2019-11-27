/**
   Ten program ilustruje działanie operatora warunkowego.
*/

import javax.swing.JOptionPane;  // Potrzebne do używania klasy JOptionPane.

public class ConsultantCharges
{
   public static void main(String [] args)
   {
      double hours,     // Przechowywanie liczby przepracowanych godzin.
             charges;   // Przechowywanie opłat.
      String input;     // Na dane wejściowe.

      // Pobieranie liczby przepracowanych godzin.
      input = JOptionPane.showInputDialog("Ile godzin przepracowałeś? ");
      hours = Double.parseDouble(input);

      // Sprawdzanie, czy liczba jest większa niż 5.
      // Jeśli wartość zmiennej hours jest mniejsza niż 5,
      // do tej zmiennej przypisywane jest 5. W przeciwnym razie
      // program nie zmienia wartości zmiennej.
      hours = hours < 5 ? 5 : hours;

      // Obliczanie i wyświetlanie opłat. Z powodu wcześniejszych instrukcji 
      // zmienna hours ma wartość nie mniejszą niż 5.
      charges = 50.0 * hours;
      JOptionPane.showMessageDialog(null, "Opłaty wynoszą " + charges + " złotych.");
      
      System.exit(0);
   }
}
