public class Rectangle
{
   private double length;
   private double width;

   /**
      Konstruktor
      @param len Długość prostokąta.
      @param w Szerokość prostokąta.
   */

   public Rectangle(double len, double w)
   {
      length = len;
      width = w;
   }

   /**
      Metoda setLength zapisuje wartość
      w polu length.
      @param len Wartość zapisywana w polu length.
   */

   public void setLength(double len)
   {
      length = len;
   }

   /**
      Metoda setWidth zapisuje wartość
      w polu width.
      @param w Wartość zapisywana w polu width.
   */

   public void setWidth(double w)
   {
      width = w;
   }

   /**
      Metoda getLength zwraca długość
      obiektu typu Rectangle.
      @return Wartość z pola length.
   */

   public double getLength()
   {
      return length;
   }

   /**
      Metoda getWidth zwraca szerokość 
      obiektu typu Rectangle.
      @return Wartość z pola width.
   */
   
   public double getWidth()
   {
      return width;
   }

   /**
      Metoda getArea zwraca powierzchnię 
      obiektu typu Rectangle.
      @return Iloczyn pól length i width.
   */

   public double getArea()
   {
      return length * width;
   }
}
