/**
   Ten program powoduje błąd i następuje awaria.
*/

public class BadArray
{
   public static void main(String[] args)
   {
      // Tworzenie tablicy trzyelementowej.
      int[] numbers = { 1, 2, 3 };

      // Próba odczytu danych spoza
      // granic tablicy.
      for (int i = 0; i <= 3; i++)
         System.out.println(numbers[i]);
   }
}
