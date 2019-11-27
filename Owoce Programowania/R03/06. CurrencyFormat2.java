import javax.swing.JOptionPane;

/**
   Ten program pokazuje, jak stosować metodę System.out.printf
   do formatowania liczb jako kwot pieniędzy.
*/

public class CurrencyFormat2
{
   public static void main(String[] args)
   {
      double monthlyPay = 5000.0;
      double annualPay = monthlyPay * 12;
      String output = String.format("Roczna pensja wynosi %,.2f złotych.", annualPay);
      JOptionPane.showMessageDialog(null, output);
   }
}

