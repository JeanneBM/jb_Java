/**
   Ten program ilustruje działanie metody, która
   przyjmuje zmienną liczbę argumentów.
*/

public class VarargsDemo1
{
   public static void main(String[] args)
   {
      int result;  // Przechowywanie wyniku.
      
      // Wywołanie metody z dwoma argumentami.
      result = sum(10, 20);
      System.out.println(result);
      
      // Wywołanie metody z czteroma argumentami.
      result = sum(10, 20, 30, 40);
      System.out.println(result);

      // Wywołanie metody z sześcioma argumentami.
      result = sum(10, 20, 30, 40, 50, 60);
      System.out.println(result);
   }
   
   /**
      Metoda sum przyjmuje zmienną liczbę argumentów
      typu int i zwraca ich sumę.
      @param numbers Sumowane liczby.
      @return Suma liczb.
   */
   
   public static int sum(int... numbers)
   {
      int total = 0;  // Akumulator.
      
      // Dodawanie wszystkich wartości z tablicy numbers.
      for (int val : numbers)
         total += val;
      
      // Zwracanie sumy.
      return total;
   }
}
