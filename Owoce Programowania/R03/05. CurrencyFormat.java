/**
   Ten program pokazuje, jak stosować metodę System.out.printf
   do formatowania liczb jako kwot pieniędzy.
*/

public class CurrencyFormat
{
   public static void main(String[] args)
   {
      double monthlyPay = 5000.0;
      double annualPay = monthlyPay * 12;
      System.out.printf("Roczna pensja wynosi %,.2f złotych.\n", annualPay);
   }
}
