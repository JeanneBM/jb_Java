import java.util.Scanner; 

/**
   Ten program ilustruje przekazywanie tablicy
   jako argumentu metody.
*/

public class PassArray
{
   public static void main(String[] args)
   {
      final int ARRAY_SIZE = 4;  // Wielkość tablicy.

      // Tworzenie tablicy.
      int[] numbers = new int[ARRAY_SIZE];

      // Przekazywanie tablicy do metody getValues.
      getValues(numbers);

      System.out.println("Oto podane " +
                         "liczby:");

      // Przekazywanie tablicy do metody showArray.
      showArray(numbers);
   }

   /**
      Metoda getValues przyjmuje jako argument 
      referencję do tablicy. Użytkownik ma
      podać wartość każdego elementu tej tablicy.
      @param array Referencja do tablicy.
   */

   private static void getValues(int[] array)
   {
      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Podaj serię " +
                         array.length + " liczb.");

      // Wczytywanie wartości do tablicy.
      for (int index = 0; index < array.length; index++)
      {
         System.out.print("Podaj liczbę numer " +
                          (index + 1) + ": ");
         array[index] = keyboard.nextInt();
      }
   }

   /**
      Metoda showArray przyjmuje argument w postaci
      tablicy i wyświetla jej zawartość.
      @param array Referencja do tablicy.
   */

   public static void showArray(int[] array)
   {
      // Wyświetlanie elementów tablicy.
      for (int index = 0; index < array.length; index++)
         System.out.print(array[index] + " ");
   }
}
