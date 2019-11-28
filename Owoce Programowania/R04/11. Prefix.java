/**
   Ten program ilustruje działanie operatorów ++ i --
   w trybie przedrostkowym.
*/

public class Prefix
{
   public static void main(String[] args)
   {
      int number = 4;  // Początkowa wartość zmiennej number to 4.

      // Wyświetlanie wartości zmiennej number.
     System.out.println("Wartość zmiennej number to " + number + "."); 
     System.out.println("Inkrementacja zmiennej number.");

     // Inkrementacja zmiennej number.
      ++number;
      
      // Ponowne wyświetlanie wartości zmiennej number.
     System.out.println("Teraz wartość zmiennej number to " + number + "."); 
     System.out.println("Dekrementacja zmiennej number.");

     // Dekrementacja zmiennej number.
     --number;

     // Ponowne wyświetlanie wartości zmiennej number.
     System.out.println("Teraz wartość zmiennej number to " + number + "."); 
   }
}
