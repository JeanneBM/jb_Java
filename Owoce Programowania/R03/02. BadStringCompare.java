/**
   W tym programie błędnie użyto operatora == do porównywania
   dwóch obiektów typu String. To porównanie nie zadziała.
*/

public class BadStringCompare
{
   public static void main(String [] args)
   {
      String name1 = new String("Alan");
      String name2 = new String("Alan");

      if (name1 == name2)  // Błąd!
      {
         System.out.println(name1 + " i " + name2 +
                            " są identyczne.");
      }
      else
      {
         System.out.println(name1 + " i " + name2 +
                            " NIE są identyczne.");
      }
   }
}

