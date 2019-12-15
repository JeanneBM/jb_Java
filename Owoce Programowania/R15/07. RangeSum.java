/**
   Ten program ilustruje działanie rekurencyjnej metody rangeSum.
*/

public class RangeSum
{

   public static void main(String[] args)
   {
      int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      
      System.out.print("Suma elementów od 2. do " +
                       "5. wynosi " + rangeSum(numbers, 2, 5) + ".");
   }
   
   /**
      Metoda rangeSum oblicza sumę elementów 
      z określonego przedziału tablicy.
      @param start Określa element początkowy.
      @param end Określa element końcowy.
      @return Suma elementów z przedziału.
   */
   
   public static int rangeSum(int[] array, int start, int end)
   {
      if (start > end)
         return 0;
      else
         return array[start] +
                    rangeSum(array, start + 1, end);
   }
}
