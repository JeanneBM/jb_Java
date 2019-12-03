import java.util.Scanner; // Needed for the Scanner class

/**
   Ten program używa tablicy zawierającej
   trzy obiekty typu BankAccount.
*/

public class ObjectArray
{
   public static void main(String[] args)
   {
      final int NUM_ACCOUNTS = 3;  // Liczba kont.

      // Tworzenie tablicy wskazującej 
      // obiekty typu BankAccount.
      BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];

      // Tworzenie obiektów przechowywanych w tablicy.
      createAccounts(accounts);

      // Wyświetlanie stanu każdego konta.
      System.out.println("Oto stan " +
                         "każdego konta:");

      for (int index = 0; index < accounts.length; index++)
      {
         System.out.println("Konto numer " + (index + 1) +
                  ": " + accounts[index].getBalance() + " złotych"); 
      }
   }

   /**
      Metoda createAccounts tworzy obiekt typu BankAccount
      odpowiadający każdemu elementowi tablicy. Użytkownik
      widzi prośbę o podanie stanu każdego z tych kont.
      @param array Tablica z elementami wskazującymi konta.
   */

   private static void createAccounts(BankAccount[] array)
   {
      double balance;  // Przechowywanie stanu konta.

      // Tworzenie obiektu typu Scanner.
      Scanner keyboard = new Scanner(System.in);

      // Tworzenie kont.
      for (int index = 0; index < array.length; index++)
      {
         // Pobieranie stanu konta.
        System.out.print("Podaj stan " +
                         "konta numer " + (index + 1) + ": ");
        balance = keyboard.nextDouble();

        // Tworzenie konta.
         array[index] = new BankAccount(balance);
      }
   }
}
