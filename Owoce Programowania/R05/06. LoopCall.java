/**
   W tym programie definiowana i wywoływana jest prosta metoda.
*/

public class LoopCall
{
   public static void main(String[] args)
   {
      System.out.println("Powitanie przez metodę main.");
      for (int i = 0; i < 5; i++)
         displayMessage();
      System.out.println("Z powrotem w metodzie main.");
   }
   
   /**
      Wyświetlenie powitania przez metodę displayMessage. 
   */
   
   public static void displayMessage()
   {
      System.out.println("Powitanie przez metodę displayMessage.");
   }
}
