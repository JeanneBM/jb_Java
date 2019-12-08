/**
   Ten program ilustruje zgłaszanie niestandardowych 
   wyjątków przez konstruktor z klasy BankAccount.
*/

public class AccountTest
{
   public static void main(String [] args)
   {
      // Wymuszanie zgłoszenia wyjątku NegativeStartingBalance.
      try
      {
         BankAccount account =
                     new BankAccount(-100.0);
      }
      catch(NegativeStartingBalance e)
      {
         System.out.println(e.getMessage());
      }
   }
}
