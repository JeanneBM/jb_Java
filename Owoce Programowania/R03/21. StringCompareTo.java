/**
   Ten program porównuje dwa obiekty typu String 
   za pomocą metody compareTo.
*/

public class StringCompareTo
{
   public static void main(String [] args)
   {
      String name1 = "Alka",
             name2 = "Alan";

      // Porównanie "Alka" z "Alan".

      if (name1.compareTo(name2) < 0)
      {
         System.out.println(name1 + " jest mniejszy niż " + name2 + "."); 
      }
      else if (name1.compareTo(name2) == 0)
      {
         System.out.println(name1 + " jest równy względem " + name2 + "."); 
      }
      else if (name1.compareTo(name2) > 0)
      {
         System.out.println(name1 + " jest większy niż " + name2 + "."); 
      }
   }
}
