/**
   Ten program sekwencyjnie szuka określonej 
   wartości w tablicy elementów typu int.
*/

public class SearchArray
{
   public static void main(String[] args)
   {
      int[] tests = { 87, 75, 98, 100, 82 };
      int results;

      // Wyszukiwanie wartości 100 w tablicy.
      results = sequentialSearch(tests, 100);

      // Sprawdzanie, czy znaleziono wynik 100,
      // i wyświetlanie odpowiedniego komunikatu.
      if (results == -1)
      {
         System.out.println("W żadnym teście " +
                            "nie uzyskałeś 100 punktów.");
      }
      else
      {
        System.out.println("Uzyskałeś 100 punktów " +
                           "w teście numer " + (results + 1) + "."); 
      }
   }
   
   /**
      Metoda sequentialSearch
      szuka wartości w tablicy.
      @param array Przeszukiwana tablica.
      @param value Szukana wartość.
      @return Indeks wartości, jeśli została znaleziona;
              w przeciwnym razie zwracane jest -1.
   */

   public static int sequentialSearch(int[] array,
                                      int value)
   {
      int index;        // Zmienna sterująca pętli.
      int element;    // Element, w którym znaleziono szukaną wartość.
      boolean found;  // Flaga informująca o wyniku wyszukiwania.

      // Element 0 to miejsce rozpoczynania wyszukiwania.
      index = 0;

      // Zapisywanie domyślnych wartości zmiennych element i found.
      element = -1;
      found = false;

      // Przeszukiwanie tablicy.
      while (!found && index < array.length)
      {
         if (array[index] == value)
         {
            found = true;
            element = index;
         }
         index++;
      }

      return element;
   }
}

