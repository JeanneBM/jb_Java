/**
   Ten program ilustruje działanie klasy SportsCar.
*/

public class SportsCarDemo
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu SportsCar.
      SportsCar yourNewCar = new SportsCar(CarType.PORSCHE,
                                           CarColor.CZERWONY, 100000);

      // Wyświetlanie wartości obiektu.
      System.out.println(yourNewCar);
   }
}
