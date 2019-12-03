/**
   Ten program ilustruje metodę, która przyjmuje
   tablicę dwuwymiarową jako argument.
*/

public class Pass2Darray
{
   public static void main(String[] args)
   {
      int[][] numbers = { { 1,  2,  3,  4  },
                          { 5,  6,  7,  8  },
                          { 9, 10, 11, 12  } };

      // Wyświetlanie zawartości tablicy.
      System.out.println("Oto wartości " +
                         "zapisane w tablicy: ");
      showArray(numbers);

      // Wyświetlanie sumy wartości zapisanych w tablicy.
      System.out.println("Suma wartości " +
                         "wynosi " + arraySum(numbers) + ".");
   }

   /**
      Metoda showArray wyświetla zawartość
      tablicy dwuwymiarowej typu int.
      @param array Wyświetlana tablica.
   */

   private static void showArray(int[][] array)
   {
      for (int row = 0; row < array.length; row++)
      {
         for (int col = 0; col < array[row].length; col++)
            System.out.print(array[row][col] + " ");
            System.out.println();
      }
   }

   /**
      Metoda arraySum zwraca sumę wartości
      tablicy dwuwymiarowej typu int.
      @param array Sumowana tablica.
      @return Suma wartości elementów w tablicy.
   */

   private static int arraySum(int[][] array)
   {
      int total = 0;   // Akumulator.

      for (int row = 0; row < array.length; row++)
      {
         for (int col = 0; col < array[row].length; col++)
            total += array[row][col];
      }

      return total;
   }
}
