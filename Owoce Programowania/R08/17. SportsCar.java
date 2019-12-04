/**
   Klasa SportsCar.
*/

public class SportsCar
{
   private CarType make;    // Marka samochodu.
   private CarColor color; // Kolor samochodu.
   private double price;   // Cena samochodu.

   /**
     Konstruktor inicjuje markę,
     kolor i cenę samochodu.
     @param aMake Marka samochodu.
     @param aColor Kolor samochodu.
     @param aPrice Cena samochodu.
   */
   
   public SportsCar(CarType aMake, CarColor aColor, double aPrice)
   {
      make = aMake;
      color = aColor;
      price = aPrice;
   }

   /**
      Metoda getMake.
      @return Marka samochodu.
   */
   
   public CarType getMake()
   {
      return make;
   }

   /**
      Metoda getColor.
      @return Kolor samochodu.
   */
   
   public CarColor getColor()
   {
      return color;
   }
   
   /**
      Metoda getPrice.
      @return Cena samochodu.
   */
   
   public double getPrice()
   {
      return price;
   }
   
   /**
      Metoda toString.
      @return Łańcuch znaków określający markę,
            kolor i cenę samochodu.
   */
   
   public String toString()
   {
      // Tworzy łańcuch znaków reprezentujący obiekt.
      String str = String.format("Marka: %s\nKolor: %s\nCena: %,.2f złotych",
                                 make, color, price);
 
      // Zwraca łańcuch znaków.
      return str;
   }
}
