/**
   Ten program pokazuje zgłaszanie wyjątku
   przez metodę Integer.parseInt.
*/

public class ParseIntError
{
   public static void main(String[] args)
   {
       String str = "abcde";
       int number;

       try
       {
          number = Integer.parseInt(str);
       }
       catch (NumberFormatException e)
       { 
          System.out.println("Błąd konwersji: " +
                             e.getMessage());
       }
   }
}
