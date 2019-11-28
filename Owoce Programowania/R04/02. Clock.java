/**
   Ten program używa pętli zagnieżdżonych do symulowania pracy zegara.
*/

public class Clock
{
   public static void main(String[] args)
   {
      // Symulowanie pracy zegara.
      for (int hours = 1; hours <= 12; hours++)
      {
          for (int minutes = 0; minutes <= 59; minutes++)
          {
             for (int seconds = 0; seconds <= 59; seconds++)
             {
                System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds); 
             }
          }
       }
   }
}
