import javax.swing.JOptionPane;  // Potrzebne do tego, by móc używać klasy JOptionPane.

  /**
    Ten program wyświetla użytkownikowi prośbę o wpisanie liczbowego
    wyniku testu i wyświetla odpowiednią ocenę. 
    W programie do określania oceny używane są zagnieżdżone
    struktury decyzyjne.
*/

public class NestedDecision
{
   public static void main(String[] args)
   {
      int testScore;    // Liczbowy wynik testu.
     String input;   // Przechowywanie danych wejściowych od użytkownika.

      // Pobieranie liczbowego wyniku testu.
     input = JOptionPane.showInputDialog("Wprowadź liczbowy wynik testu, " +
                                         "a poznasz swoją ocenę: ");
      testScore = Integer.parseInt(input);

      // Wyświetlanie oceny.
      if (testScore < 60)
      {
         JOptionPane.showMessageDialog(null, "Twoja ocena to 1.");
      }
      else
      {
         if (testScore < 70)
         {
            JOptionPane.showMessageDialog(null, "Twoja ocena to 2.");
         }
         else
         {
            if (testScore < 80)
            {
               JOptionPane.showMessageDialog(null, "Twoja ocena to 3.");
            }
            else
            {
               if (testScore < 90)
               {
                  JOptionPane.showMessageDialog(null, "Twoja ocena to 4.");
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "Twoja ocena to 5.");
               }
            }
         }
      }
      System.exit(0);
   }
}
