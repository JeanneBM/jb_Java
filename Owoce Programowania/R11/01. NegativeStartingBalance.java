/**
   Wyjątki typu NegativeStartingBalance są zgłaszane
   przez klasę BankAccount w sytuacji, gdy do konstruktora
   przekazany zostanie ujemny początkowy stan konta.
*/

public class NegativeStartingBalance
                   extends Exception
{
   /**
      W tym konstruktorze używany jest
      niestandardowy komunikat o błędzie.
   */

   public NegativeStartingBalance()
   {
      super("Błąd: ujemny początkowy stan konta");
   }

   /**
      Ten konstruktor informuje w komunikacie o błędzie
      o nieprawidłowym początkowym stanie konta.
      @param Błędny początkowy stan konta.
   */

   public NegativeStartingBalance(double amount)
   {
      super("Błąd: ujemny początkowy stan konta: " +
            amount);
   }
}
