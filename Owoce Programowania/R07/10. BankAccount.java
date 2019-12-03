/**
   Klasa BankAccount symuluje funkcjonowanie konta bankowego.
*/

public class BankAccount
{
   private double balance;      // Stan konta.

   /**
     Ten konstruktor ustawia początkowy stan konta
     na wartość 0.0.
   */

   public BankAccount()
   {
      balance = 0.0;
   }
   
   /**
      Ten konstruktor ustawia początkowy stan konta
     na wartość przekazaną jako argument.
     @param startBalance Początkowy stan konta.
   */

   public BankAccount(double startBalance)
   {
      balance = startBalance;
   }

   /**
      Ten konstruktor ustawia początkowy stan konta
     na podstawie wartości podanej w argumencie typu String.
     @param str Początkowy stan konta jako wartość typu String.
   */

   public BankAccount(String str)
   {
      balance = Double.parseDouble(str);
   }

   /**
      Metoda deposit pozwala zdeponować
     środki na koncie.
     @param amount Wartość dodawana do 
                 pola balance.
   */

   public void deposit(double amount)
   {
      balance += amount;
   }

   /**
      Metoda deposit pozwala zdeponować
     środki na koncie.
     @param str Kwota dodawana do pola balance,
             podawana jako wartość typu String.
   */

   public void deposit(String str)
   {
      balance += Double.parseDouble(str);
   }

   /**
      Metoda withdraw pozwala wycofać 
     środki z konta.
     @param amount Kwota odejmowana
                 od pola balance.
   */

   public void withdraw(double amount)
   {
      balance -= amount;
   }

   /**
      Metoda withdraw pozwala wycofać 
     środki z konta.
     @param str Kwota odejmowana od pola balance,
             podawana jako wartość typu String.
   */

   public void withdraw(String str)
   {
      balance -= Double.parseDouble(str);
   }

   /**
      Metoda setBalance ustawia stan konta.
     @param b Wartość zapisywana w polu balance.
   */

   public void setBalance(double b)
   {
      balance = b;
   }

   /**
      Metoda setBalance ustawia stan konta.
    @param str Kwota zapisywana w polu balance,
             podawana jako wartość typu String.
   */

   public void setBalance(String str)
   {
      balance = Double.parseDouble(str);
   }
   
   /**
      Metoda getBalance zwraca
    stan konta.
    @return Wartość w polu balance.
   */

   public double getBalance()
   {
      return balance;
   }
}
