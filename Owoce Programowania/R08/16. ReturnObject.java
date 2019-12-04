import javax.swing.JOptionPane;

/**
   Ten program pokazuje, że metoda
   może zwracać referencję do obiektu.
*/

public class ReturnObject
{
   public static void main(String[] args)
   {
      BankAccount account;

      // Pobieranie referencji do obiektu typu BankAccount.
      account = getAccount();

      // Wyświetlanie stanu konta.
      JOptionPane.showMessageDialog(null,
               "Stan konta wynosi " +
               account.getBalance() + ".");

      System.exit(0);
   }

   /**
      Metoda getAccount tworzy obiekt 
      typu BankAccount ze stanem 
      podanym przez użytkownika.
      @return Referencja do obiektu.
   */
   
   public static BankAccount getAccount()
   {
      String input;   // Przechowywanie danych wejściowych.
      double balance;  // Stan konta.

      // Pobieranie stanu konta od użytkownika.
      input = JOptionPane.showInputDialog("Podaj " +
                             "stan konta: ");
      balance = Double.parseDouble(input);
      
      // Tworzenie obiektu typu BankAccount 
      // i zwracanie referencji do niego.
      return new BankAccount(balance);
   }
}
