/**
   Ten program ilustruje metodę
   przyjmującą dwa argumenty.
*/

public class TwoArgs2
{
   public static void main(String[] args)
   {
      double a = 4.5;
      double b = 6.9;
      
      showSum(a, b);
   }
   
   /**
      Metoda showSum wyświetla sumę dwóch liczb.
      @param num1 Pierwsza liczba.
      @param num2 Druga liczba.
   */

   
   public static void showSum(double num1, double num2)
   {
      double sum;    // Przechowywanie sumy.
      
      sum = num1 + num2;
      System.out.println("Suma wynosi " + sum + ".");
   }
}
