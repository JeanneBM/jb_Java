/**
   Ta klasa zawiera metodę rekurencyjną message,
   która wyświetla komunikat n razy.
*/

public class Recursive
{
   public static void message(int n)
   {
      if (n > 0)
      {
         System.out.println("To jest metoda rekurencyjna.");
         message(n -1);
      }
   }
}
