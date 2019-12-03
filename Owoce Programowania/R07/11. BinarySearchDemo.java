import java.util.Scanner;

/**
   Ten program ilustruje metodę  
   wyszukiwania binarnego.
*/

public class BinarySearchDemo
{
   public static void main(String[] args)
   {
      // Wartości w tej tablicy są posortowane
      // rosnąco.
      int numbers[] = {101, 142, 147, 189, 199, 207, 222,
                       234, 289, 296, 310, 319, 388, 394,
                       417, 429, 447, 521, 536, 600};
      int result, searchValue;
		String input;
      
      // Tworzenie obiektów do pobierania danych z konsoli.
		Scanner keyboard = new Scanner(System.in);

      do
      {
         // Pobieranie szukanej wartości.
         System.out.print("Podaj szukaną wartość: ");
         searchValue = keyboard.nextInt();

         // Wyszukiwanie wartości.
         result = binarySearch(numbers, searchValue);

        // Wyświetlanie wyników.
        if (result == -1)
           System.out.println("Wartość " + searchValue + " nie została znaleziona.");
        else
        {
           System.out.println("Wartość " + searchValue + " została znaleziona " +
                              "na pozycji " + result + ".");
        }

		  // Pobieranie pozostałego znaku nowego wiersza.
		  keyboard.nextLine();
		  
        // Czy użytkownik chce ponowić wyszukiwanie?
        System.out.print("Czy chcesz znaleźć inną liczbę? (T lub N): ");
        input = keyboard.nextLine();
      } while (input.charAt(0) == 't' || input.charAt(0) == 'T');
   }

   /**
      Metoda binarySearch wykonuje wyszukiwanie binarne w tablicy
      liczb całkowitych. W tablicy szukana jest liczba przekazana
      jako argument value. Jeśli program znalazł liczbę, zwraca jej indeks
      w tablic. W przeciwnym razie zwracana jest wartosć -1; oznacza ona,
      że szukanej wartości nie znaleziono w tablicy.
      @param array Przeszukiwana tablica.
      @param value Szukana wartość.
   */

   public static int binarySearch(int[] array, int value)
   {
      int first;       // Pierwszy element tablicy.
      int last;        // Ostatni element tablicy.
      int middle;      // Punkt środkowy.
      int position;    // Pozycja szukanej wartości.
      boolean found;   // Flaga.

      // Ustawianie początkowych wartości.
      first = 0;
      last = array.length - 1;
      position = -1;
      found = false;

      // Szukanie wartości.
      while (!found && first <= last)
      {
         // Obliczanie punktu środkowego.
         middle = (first + last) / 2;
         
         // Jeśli wartość znaleziono w punkcie środkowym...
         if (array[middle] == value)
         {
            found = true;
            position = middle;
         }
         // w przeciwnym razie jeśli wartość znajduje się w pierwszej połowie...
         else if (array[middle] > value)
            last = middle - 1;
         // w przeciwnym razie jeśli wartość znajduje się w drugiej połowie....
         else
            first = middle + 1;
      }

      // Zwracanie pozycji elementu lub -1,
      // jeśli wartości nie znaleziono.
      return position;
   }
}
