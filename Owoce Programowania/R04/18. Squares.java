/**
   Ten program ilustruje pętlę for.
*/

public class Squares
{
   public static void main(String [] args)
   {
      int number; // Zmienna sterująca pętli.

     System.out.println("Liczba    Kwadrat liczby");
      System.out.println("-----------------------");
      
      for (number = 1; number <= 10; number++)
      {
         System.out.println(number + "\t\t" +
                            number * number);
      }
   }
}
