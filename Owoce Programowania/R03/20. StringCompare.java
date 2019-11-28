/**
   Ten program w poprawny sposób porównuje dwa obiekty 
   typu String, używając metody equals. 
*/

public class StringCompare
{
   public static void main(String [] args)
   {
      String name1 = "Alan",
             name2 = "Alan",
             name3 = "Alka";

      // Porównanie "Alan" z "Alan".

      if (name1.equals(name2))
      {
         System.out.println(name1 + " i " + name2 +
                            " są identyczne.");
      }
      else
      {
         System.out.println(name1 + " i " + name2 +
                            " NIE są identyczne.");
      }

      // Porównanie "Alan" z "Alka".

      if (name1.equals(name3))
      {
         System.out.println(name1 + " i " + name3 +
                            " są identyczne.");
      }
      else
      {
         System.out.println(name1 + " i " + name3 +
                            " NIE są identyczne.");
      }
   }
}
