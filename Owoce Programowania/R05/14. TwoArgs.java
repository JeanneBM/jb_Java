/**
   Ten program ilustruje metodę
   przyjmującą dwa argumenty.
*/

public class TwoArgs
{
   public static void main(String[] args)
   {
      double a = 4.5;
      double b = 6.9;
      
      showSum(a, b);
   }
   
   /**
      Metoda showSum wyświetla sumę
      dwóch liczb.
   */
   
   public static void showSum(double num1, double num2)
   {
      double sum;    // Przechowywanie sumy.
      
      sum = num1 + num2;
      System.out.println("Suma wynosi " + sum + ".");
   }
}
