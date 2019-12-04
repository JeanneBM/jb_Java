/**
   Ten program ilustruje działanie metody selectionSort
   z klasy ArrayTools.
*/

public class SelectionSortDemo
{
   public static void main(String[] arg)
   {
      int[] values = {5, 7, 2, 8, 9, 1};

      // Wyświetlanie nieposortowanej tablicy.
      System.out.println("Nieposortowane wartości:");
      for (int i = 0; i < values.length; i++)
         System.out.print(values[i] + " ");
      System.out.println();

      // Sortowanie tablicy.
      selectionSort(values);

      // Wyświetlanie posortowanej tablicy.
      System.out.println("Posortowane wartości:");
      for (int i = 0; i < values.length; i++)
         System.out.print(values[i] + " ");
      System.out.println();

   }

   /**
      Metoda selectionSort sortuje przez wybieranie tablicę
      wartości typu int. Tablica jest sortowana rosnąco.
      @param array Sortowana tablica.
   */

   public static void selectionSort(int[] array)
   {
      int startScan, index, minIndex, minValue;

      for (startScan = 0; startScan < (array.length-1); startScan++)
      {
         minIndex = startScan;
         minValue = array[startScan];
         for(index = startScan + 1; index < array.length; index++)
         {
            if (array[index] < minValue)
            {
               minValue = array[index];
               minIndex = index;
            }
         }
         array[minIndex] = array[startScan];
         array[startScan] = minValue;
      }
   }
}

