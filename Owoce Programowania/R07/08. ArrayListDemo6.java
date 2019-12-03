import java.util.ArrayList;

/**
   Ten program pokazuje, jak zapisywać obiekty
    typu BankAccount w obiekcie typu ArrayList.
*/

public class ArrayListDemo6
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu ArrayList do przechowywania obiektów typu BankAccount.
      ArrayList<BankAccount> list = new ArrayList<BankAccount>();
      
      // Dodawanie trzech obiektów typu BankAccount do obiektu typu ArrayList.
      list.add(new BankAccount(100.0));
      list.add(new BankAccount(500.0));
      list.add(new BankAccount(1500.0));
      
      // Wyświetlanie każdego elementu.
      for (int index = 0; index < list.size(); index++)
      {
         BankAccount account = list.get(index);
         System.out.println("Konto o indeksie " + index +
                           "\nStan: " + account.getBalance());
      }      
   }
}
