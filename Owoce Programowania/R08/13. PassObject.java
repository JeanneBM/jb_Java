/**
   Ten program przekazuje obiekt jako argument.
*/

public class PassObject
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu Rectangle.
      Rectangle box = new Rectangle(12.0, 5.0);

      // Przekazywanie do metody displayRectangle 
      // referencji do obiektu.     
      displayRectangle(box);
   }

   /**
      Metoda displayRectangle wyświetla
      długość i szerokość prostokąta.
      @param r Referencja do obiektu 
               typu Rectangle.
   */

   public static void displayRectangle(Rectangle r)
   {
      // Wyświetlanie długości i szerokości.
      System.out.println("Długość : " + r.getLength() +
                         " Szerokość: " + r.getWidth());
   }
}
