/**
   Ten program ilustruje działanie klasy Countable.
*/

public class StaticDemo
{
   public static void main(String[] args)
   {
      int objectCount;

      // Tworzenie trzech instancji
      // klasy Countable.
      Countable object1 = new Countable();
      Countable object2 = new Countable();
      Countable object3 = new Countable();

      // Pobieranie liczby instancji
      // z pola statycznego klasy.
      objectCount = object1.getInstanceCount();
      System.out.println("Liczba utworzonych instancji klasy to " +
                         objectCount +
                         ".");
  }
}
