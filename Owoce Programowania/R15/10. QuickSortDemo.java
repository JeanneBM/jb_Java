/**
   Ten program ilustruje działanie algorytmu QuickSort.
*/

public class QuickSortDemo
{
   /**
      Metoda main
   */
   
   public static void main(String[] args)
   {
      int[] array = { 7, 3, 9, 2, 0, 1, 8, 4, 6, 5 };

      // Wyświetla tablicę przed sortowaniem.
      System.out.println("Przed sortowaniem:");
      for (int i = 0; i < 10; i++)
         System.out.print(array[i] + " ");
      System.out.println();

      // Sortowanie tablicy.
      quickSort(array, 0, 9);
      
      // Ponowne wyświetlanie tablicy.
      System.out.println("Po sortowaniu:");
      for (int i = 0; i < 10; i++)
         System.out.print(array[i] + " ");
      System.out.println();
   }

   /**
      Metoda quickSort używa algorytmu QuickSort do sortowania
      tablicy od pozycji array[start] do pozycji array[end].
      
      @param array Sortowana tablica.
      @param start Początkowy indeks sortowanego 
                   obszaru.
      @param end Początkowy indeks sortowanego 
                 obszaru.
   */
   
   public static void quickSort(int array[], int start,
                                int end)
   {
      int pivotPoint;
      
      if (start < end)
      {
         // Określanie elementu podziałowego.
         pivotPoint = partition(array, start, end);
         
         // Sortowanie pierwszej podlisty.
         quickSort(array, start, pivotPoint - 1);
         
         // Sortowanie drugiej podlisty.
         quickSort(array, pivotPoint + 1, end);
      }
   }

   /**
      Metoda partition wybiera wartość pośrodku tablicy jako
      element podziałowy. Lista jest tak modyfikowana, aby
      wszystkie wartości mniejsze od elementu podziałowego znajdowały się po jego 
      lewej stronie, a wszystkie wartości większe od elementu podziałowego -
      po jego prawej stronie.
      
      @param array Sortowana tablica.
      @param start Początkowy indeks sortowanego
                   obszaru.
      @param end Końcowy indeks sortowanego
                 obszaru.
   */
   
   private static int partition(int array[], int start,
                                int end)
   {
      int pivotValue, pivotIndex, mid;

      mid = (start + end) / 2;

      swap(array, start, mid);
      pivotIndex = start;
      pivotValue = array[start];
      for (int scan = start + 1; scan <= end; scan++)
      {
         if (array[scan] < pivotValue)
         {
            pivotIndex++;
            swap(array, pivotIndex, scan);
         }
      }     
      swap(array, start, pivotIndex);
      
      return pivotIndex;
   }
   
   /**
      Metoda swap przestawia element array[a] z
      elementem array[b].
      @param array Tablica elementów.
      @param Pierwszy z przestawianych elementów.
      @param Drugi z przestawianych elementów.
   */
   
   private static void swap(int[] array, int a, int b)
   {
      int temp;
      
      temp = array[a];
      array[a] = array[b];
      array[b] = temp;
   }
}
