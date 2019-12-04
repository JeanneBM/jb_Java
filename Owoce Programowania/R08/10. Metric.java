/**
   Ta klasa ilustruje działanie metod statycznych.
*/

public class Metric
{
   /**
      Metoda milesToKilometers przekształca 
      odległość w milach na kilometry.
      @param m Odległość w milach.
      @return Odległość w kilometrach.
   */

   public static double milesToKilometers(double m)
   {
      return m * 1.609;
   }

   /**
      Metoda kilometersToMiles przekształca
      odległość w kilometrach na mile.
      @param k Odległość w kilometrach.
      @return Odległość w milach.
   */
   
   public static double kilometersToMiles(double k)
   {
      return k / 1.609;
   }
}
