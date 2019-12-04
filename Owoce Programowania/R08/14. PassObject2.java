/**
   Ten program przekazuje obiekt jako argument. Obiekt
   jest modyfikowany przez metodę przyjmującą ten argument.
*/

public class PassObject2
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu Rectangle.
      Rectangle box = new Rectangle(12.0, 5.0);

      // Wyświetlanie zawartości obiektu.
      System.out.println("Zawartość obiektu box:");
      System.out.println("Długość:  " + box.getLength() +
                         " Szerokość: " + box.getWidth());

      // Przekazywanie do metody changeRectangle
      // referencji do obiektu.
      changeRectangle(box);

      // Ponowne wyświetlanie zawartości obiektu.
      System.out.println("\nObecna zawartość obiektu " +
                         "box to:");
      System.out.println("Długość:  " + box.getLength() +
                         " Szerokość: " + box.getWidth());
   }

   /**
      Metoda changeRectangle ustawia długość 
      i szerokość obiektu typu Rectangle na 0.
      @param r Modyfikowany obiekt typu Rectangle.
   */

   public static void changeRectangle(Rectangle r)
   {
      r.setLength(0.0);
      r.setWidth(0.0);
   }
}
