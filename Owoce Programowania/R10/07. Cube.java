/**
   Ta klasa przechowuje dane o prostopadłościanie.
*/

public class Cube extends Rectangle
{
   private double height;  // Wysokość prostopadłościanu.

   /**
      Ten konstruktor ustawia długość, 
      szerokość i wysokość prostopadłościanu.
      @param len Długość prostopadłościanu.
      @param w Szerokość prostopadłościanu.
      @param h Wysokość prostopadłościanu.
   */

   public Cube(double len, double w, double h)
   {
      // Wywołanie konstruktora klasy bazowej.
      super(len, w);

      // Ustawianie wysokości.
      height = h;
   }

   /**
     Metoda getHeight zwraca wysokość prostopadłościanu.
     @return Wartość pola height.
   */

   public double getHeight()
   {
      return height;
   }

   /**
      Metoda getSurfaceArea oblicza i zwraca
      pole całkowite prostopadłościanu.
      @return Pole całkowite prostopadłościanu.
   */
   
   public double getSurfaceArea()
   {
      return getArea() * 6;
   }

   /**
      Metoda getVolume oblicza i zwraca
      objętość prostopadłościanu.
      @return Objętość prostopadłościanu.
   */
   
   public double getVolume()
   {
      return getArea() * height;
   }
}
