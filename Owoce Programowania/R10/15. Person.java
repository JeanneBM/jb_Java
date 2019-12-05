/**
   W tej klasie implementowany jest interfejs Displayable,
   jednak metoda domyślna display
   nie jest przesłaniana.
*/

public class Person implements Displayable
{
   private String name;
   
   // Konstruktor.
   public Person(String n)
   {
      name = n;
   }
}
