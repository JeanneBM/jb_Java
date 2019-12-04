/**
   Ten program pokazuje, że można wykorzystać 
   typ wyliczeniowy w instrukcji switch.
*/

public class SportsCarDemo2
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu SportsCar.
      SportsCar yourNewCar = new SportsCar(CarType.PORSCHE,
                                           CarColor.CZERWONY, 100000);

      // Pobieranie marki samochodu i używanie jej w instrukcji switch.
      switch (yourNewCar.getMake())
      {
         case PORSCHE :
            System.out.println("Ten samochód wyprodukowano w Niemczech.");
            break;
         case FERRARI :
            System.out.println("Ten samochód wyprodukowano we Włoszech.");
            break;
         case JAGUAR :
            System.out.println("Ten samochód wyprodukowano w Anglii.");
            break;
         default:
            System.out.println("Nie jestem pewien, gdzie wyprodukowano "
                               + "ten samochód.");
      }
   }
}
