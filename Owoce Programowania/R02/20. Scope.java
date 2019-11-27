// Ten program nie może znaleźć zmiennej.

public class Scope
{
   public static void main(String[] args)
   {
      System.out.println(value);  // BŁĄD!
      int value = 100;
   }
}


