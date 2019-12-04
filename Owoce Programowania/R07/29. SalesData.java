/**
   Ta klasa przechowuje w tablicy wartości sprzedaży 
   z określonej liczby dni i udostępnia metody do pobierania
   sumy i średniej wartości sprzedaży, a także najwyższej
   i najniższej wartości sprzedaży.
*/

public class SalesData
{
   private double[] sales; // Dane sprzedażowe.

   /**
      Konstruktor kopiuje elementy otrzymanej 
      tablicy do tablicy sales.
      @param s Kopiowana tablica.
   */

   public SalesData(double[] s)
   {
      // Tworzenie tablicy o wielkości równej długości tablicy s.
      sales = new double[s.length];
      
      // Kopiowanie elementów z tablicy s do tablicy sales.
      for (int index = 0; index < s.length; index++)
         sales[index] = s[index];
   }

   /**
      Metoda getTotal.
      @return Suma wartości elementów
              tablicy sales.
   */

   public double getTotal()
   {
      double total = 0.0;     // Akumulator.

      // Sumowanie wartości elementów 
      // tablicy sales.
      for (int index = 0; index < sales.length; index++)
         total += sales[index];

      // Zwracanie sumy.
      return total;
   }

   /**
      Metoda getAverage.
      @return Średnia wartość elementów
              tablicy sales.
   */

   public double getAverage()
   {
      return getTotal() / sales.length;
   }

   /**
      Metoda getHighest.
      @return Największa wartość przechowywana
              w tablicy sales.
   */

   public double getHighest()
   {
      double highest = sales[0];

      for (int index = 1; index < sales.length; index++)
      {
         if (sales[index] > highest)
            highest = sales[index];
      }

      return highest;
   }

   /**
      Metoda getLowest.
      @return Najmniejsza wartość przechowywana
              w tablicy sales.
   */

   public double getLowest()
   {
      double lowest = sales[0];

      for (int index = 1; index < sales.length; index++)
      {
         if (sales[index] < lowest)
            lowest = sales[index];
      }

      return lowest;
   }
}

