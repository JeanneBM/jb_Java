import javax.swing.JOptionPane;

/*
    Ten program ilustruje stosowanie okien dialogowych 
    przy użyciu klasy JOptionPane.
*/
 
public class NamesDialog
{
   public static void main(String[] args)
   {
      String firstName, lastName;

     // Pobieranie imienia użytkownika.
     firstName = 
       JOptionPane.showInputDialog("Jak masz na imię?");

     // Pobieranie nazwiska użytkownika.
      lastName = 
       JOptionPane.showInputDialog("Jak masz na nazwisko?");

     // Wyświetlanie powitania.
     JOptionPane.showMessageDialog(null, "Witaj, " + firstName + 
                                   " " + lastName + ".");
      System.exit(0);
   }
}

