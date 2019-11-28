/**
   Ten program wyświetla tabelę szybkości w km/h
   i ich odpowiedników w mph.
*/

public class SpeedConverter
{
   public static void main(String[] args)
   {
      // Stałe.
     final int STARTING_KPH = 60;  // Prędkość początkowa.
     final int MAX_KPH = 130;      // Prędkość maksymalna.
     final int INCREMENT = 10;     // Poziom zwiększania prędkości.
      
      // Zmienne.
     int kph;     // Przechowywanie prędkości w km/h.
     double mph;  // Przechowywanie prędkości w mph.

     // Wyświetlanie nagłówków tabeli.
      System.out.println("KM/H\t\tMPH");
      System.out.println("-------------------");
      
      // Wyświetlanie prędkości.
     for (kph = STARTING_KPH; kph <= MAX_KPH; kph += INCREMENT)
     {
       // Obliczanie prędkości w mph.
       mph = kph * 0.6214;

       // Wyświetlanie prędkości w km/h i mph.
         System.out.printf("%d\t\t%.1f\n", kph, mph);
      }
   }
}
