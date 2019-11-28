import javax.swing.JOptionPane;

/**
   Ten program pokazuje, jak stosować metodę System.out.printf
   do formatowania liczb jako kwot pieniędzy.
*/

public class CurrencyFormat3
{
   public static void main(String[] args)
   {
      double monthlyPay = 5000.0;
      double annualPay = monthlyPay * 12;

      JOptionPane.showMessageDialog(null,
          String.format("Roczna pensja to %,.2f złotych.", annualPay));
   }
}
