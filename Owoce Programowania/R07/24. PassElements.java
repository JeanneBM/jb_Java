/**
   Tten program ilustruje przekazywanie pojedynczych
   elementów tablicy jako argumentów metody.
*/

public class PassElements
{
   public static void main(String[] args)
   {
      int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};

      for (int index = 0; index < numbers.length; index++)
         showValue(numbers[index]);
   }

   /**
      Metoda showValue wyświetla otrzymany argument.
      @param n Wyświetlana wartość.
   */

   public static void showValue(int n)
   {
      System.out.print(n + " ");
   }
}
