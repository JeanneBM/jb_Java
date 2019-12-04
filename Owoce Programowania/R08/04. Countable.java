/**
   Ta klasa ilustruje działanie pola statycznego.
*/

public class Countable
{
   private static int instanceCount = 0;

   /**
      Konstruktor inkrementuje pole statyczne
      instanceCount. Pozwala to śledzić
      liczbę utworzonych instancji tej
      klasy.
   */

   public Countable()
   {
      instanceCount++;
   }

   /**
      Metoda getInstanceCount zwraca 
      liczbę utworzonych instancji
      klasy.
      @return Wartość pola instanceCount.
   */

   public int getInstanceCount()
   {
      return instanceCount;
   }
}
