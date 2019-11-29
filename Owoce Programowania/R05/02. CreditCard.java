import javax.swing.JOptionPane;

/**
   Ten program używa dwóch metod void.
*/

public class CreditCard
{
   public static void main(String[] args)
   {
      double salary;    // Roczne wynagrodzenie.
      int creditRating;  // Ocena kredytowa.
      String input;      // Przechowywanie danych wejściowych od użytkownika.

      // Pobieranie rocznego wynagrodzenia użytkownika.
      input = JOptionPane.showInputDialog("Jakie jest Twoje " +
                                 "roczne wynagrodzenie?");
      salary = Double.parseDouble(input);

      // Pobieranie oceny kredytowej użytkownika (od 1 do 10).
      input = JOptionPane.showInputDialog("Jaka jest Twoja " +
             "ocena kredytowa w  skali od 1 do 10?\n" +
             "(10 = bardzo wysoka, 1 = bardzo niska)");
      creditRating = Integer.parseInt(input);
      
      // Określanie, czy użytkownik otrzyma kartę kredytową.
      if (salary >= 20000 && creditRating >= 7)
         qualify();
      else
         noQualify();
         
      System.exit(0);
   }
   
   /**
      Metoda qualify informuje użytkownika o tym,
      że otrzyma kartę kredytową.
   */
   
   public static void qualify()
   {
      JOptionPane.showMessageDialog(null, "Gratulacje! " +
                                "Spełniasz warunki do uzyskania karty kredytowej!");
   }

   /**
     Metoda noQualify informuje użytkownika o tym, że 
     nie spełnia warunków do otrzymania karty kredytowej.
   */

    public static void noQualify()
    {
      JOptionPane.showMessageDialog(null, "Przykro nam, ale nie spełniasz " +
                        "warunków do otrzymania karty kredytowej.");
   }
}
