public class Person implements Displayable
{
   private String name;
   
   // Konstruktor.
   public Person(String n)
   {
      name = n;
   }
   
   // Metoda display.
   public void display()
   {
      System.out.println("Nazywam się " + name);
   }
}

