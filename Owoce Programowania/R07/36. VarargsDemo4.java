/**
	Ten program ilustruje działanie metody, która przyjmuje
	zmienną liczbę argumentów.
*/

public class VarargsDemo4
{
   public static void main(String[] args)
   {
      int result;  // Przechowywanie wyniku.
		
		// Tworzenie tablicy wartości typu int.
		int[] values = { 10, 20, 30, 40, 50 };
      
      // Wywołanie metody z dwoma argumentami.
      result = sum(10, 20);
      System.out.println(result);
      
      // Wywołanie metody z czterema argumentami.
      result = sum(10, 20, 30, 40);
      System.out.println(result);

      // Wywołanie metody z tablicą jako argumentem.
      result = sum(values);
      System.out.println(result);
   }
   
   /**
   	Metoda sum przyjmuje zmienną liczbę argumentów 
   	typu int i zwraca ich sumę.
		@param numbers Zbiór liczb.
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
