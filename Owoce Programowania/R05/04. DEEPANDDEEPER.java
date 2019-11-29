/**
   Ten program ilustruje warstwowe wywołania metod.
*/

public class DeepAndDeeper
{
   public static void main(String[] args)
   {
      System.out.println("Początek w metodzie main.");
      deep();
      System.out.println("Z powrotem w metodzie main.");
   }
   
   /**
      Metoda deep wyświetla komunikat, a następnie wywołuje
      metodę deeper.
   */
   
   public static void deep()
   {
      System.out.println("W metodzie deep.");
      deeper();
      System.out.println("Z powrotem w metodzie deep.");
   }

   /**
      Metoda deeper tylko wyświetla komunikat.
   */
   
   public static void deeper()
   {
      System.out.println("W metodzie deeper.");
   }
}
