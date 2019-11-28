import javax.swing.JOptionPane;  // Potrzebne do tego, by móc używać klasy JOptionPane.

/**
   Ten program prosi użytkownika o wprowadzenie liczbowego wyniku
   testu i wyświetla odpowiednią ocenę w postaci litery. W tym
   programie do ustalenia oceny w postaci litery używana jest
   instrukcja if-else-if.
*/

public class TestResults
{
   public static void main(String[] args)
   {
      int testScore;    // Liczbowy wynik testu.
     String input;   // Do przechowywania danych wejściowych od użytkownika.

      // Pobieranie liczbowego wyniku testu.
     input = JOptionPane.showInputDialog("Wprowadź liczbowy wynik testu, " +
                    "a poznasz swoją ocenę: ");
      testScore = Integer.parseInt(input);

      // Wyświetlanie oceny.
      if (testScore < 60)
         JOptionPane.showMessageDialog(null, "Twoja ocena to 1.");
      else if (testScore < 70)
         JOptionPane.showMessageDialog(null, "Twoja ocena to 2.");
      else if (testScore < 80)
         JOptionPane.showMessageDialog(null, "Twoja ocena to 3.");
      else if (testScore < 90)
         JOptionPane.showMessageDialog(null, "Twoja ocena to 4.");
      else
         JOptionPane.showMessageDialog(null, "Twoja ocena to 5.");
         
      System.exit(0);
   }
}
