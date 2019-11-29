/**
   Ten program pokazuje, że dwie metody mogą
   zawierać zmienne lokalne o tej samej nazwie.
*/

public class LocalVars
{
   public static void main(String[] args)
   {
      texas();
      california();
   }
   
   /**
      Metoda texas zawiera zmienną lokalną birds.
   */
   
   public static void texas()
   {
      int birds = 5000;
      
      System.out.println("W stanie Teksas żyje " +
                         birds + " ptaków.");
   }
   
   /**
      Metoda california także zawiera zmienną lokalną birds.
   */
   public static void california()
   {
      int birds = 3500;

      System.out.println("W stanie Kalifornia żyje " +
                         birds + " ptaków.");
   }
}
