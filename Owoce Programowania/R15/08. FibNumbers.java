/**
   Ten program ilustruje działanie rekurencyjnej metody fib.
*/

public class FibNumbers
{
   public static void main(String[] args)
   {
      System.out.println("Oto pierwszych dziesięć liczb " +
                         "ciągu Fibonacciego:");

      for (int i = 0; i < 10; i++)
         System.out.print(fib(i) + " ");

      System.out.println();
   }
   
   /**
      Metoda fib oblicza n-tą liczbę
      w ciągu Fibonacciego.
      @param n N-ta liczba do obliczenia.
      @return N-ta liczba ciągu.
   */
   
   public static int fib(int n)
   {
      if (n == 0)
         return 0;
      else if (n == 1)
         return 1;
      else
         return fib(n - 1) + fib(n - 2);
   }
}
