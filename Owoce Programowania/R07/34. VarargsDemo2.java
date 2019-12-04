/**
   Ten program ilustruje działanie metody, która
   przyjmuje zmienną liczbę argumentów.
*/

public class VarargsDemo2
{
   public static void main(String[] args)
   {
      double total;  // Przechowywanie sumy stanów kont.

      // Tworzenie obiektu BankAccount ze stanem konta 100.
      BankAccount account1 = new BankAccount(100.0);
      
      // Tworzenie obiektu BankAccount ze stanem konta 500.
      BankAccount account2 = new BankAccount(500.0);
      
      // Tworzenie obiektu BankAccount ze stanem konta 1500.
      BankAccount account3 = new BankAccount(1500.0);
      
      // Wywołanie metody z jednym argumentem.
      total = totalBalance(account1);
      System.out.println("Suma: " + total + " złotych.");

      // Wywołanie metody z dwoma argumentami.
      total = totalBalance(account1, account2);
      System.out.println("Suma: " + total + " złotych.");
      
      // Wywołanie metody z trzema argumentami.
      total = totalBalance(account1, account2, account3);
      System.out.println("Suma: " + total + " złotych.");
    }

    /**
      Metoda totalBalance przyjmuje zmienną liczbę
      obiektów typu BankAccount i zwraca sumę ich
      stanów kont.
      @param accounts Konto lub konta.
      @return Suma stanów kont.
   */
   
   public static double totalBalance(BankAccount... accounts)
   {
      double total = 0.0;  // Akumulator.

      // Dodawanie wszystkich wartości z obiektów z tablicy accounts.
      for (BankAccount acctObject : accounts)
         total += acctObject.getBalance();
      
      // Zwracanie sumy.
      return total;
   }
}

