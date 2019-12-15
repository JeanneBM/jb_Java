import java.util.Scanner;

/**
   Ten program ilustruje działanie 
   rekurencyjnej metody wyszukiwania binarnego.
*/

public class RecursiveBinarySearch
{
   public static void main(String [] args)
   {
      int searchValue;  // Szukana wartość.
      int result;      // Wynik wyszukiwania.
      String input;    // Wiersz danych wejściowych.
      char again;      // Przechowywanie jednego znaku.

      // Wartości w poniższej tablicy 
      // są posortowane rosnąco.
      int numbers[] = {101, 142, 147, 189, 199, 207, 222,
                       234, 289, 296, 310, 319, 388, 394,
                       417, 429, 447, 521, 536, 600};

      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      do
      {
         // Pobieranie szukanej wartości.
        System.out.print("Podaj szukaną " +
                         "wartość: ");
         searchValue = keyboard.nextInt();

         // Wyszukiwanie wartości.
         result = binarySearch(numbers, 0, 
                               (numbers.length - 1),
                               searchValue);

         // Wyświetlanie wyników.
         if (result == -1)
         {
            System.out.println(searchValue + 
                               " nie znaleziono.");
         }
         else
         {
            System.out.println(searchValue +
                               " znaleziono " +
                               "na pozycji " + result + ".");
         }

         // Czy użytkownik chce jeszcze raz szukać wartości?
         System.out.print("Czy chcesz znaleźć inną wartość? " +
                          "(T lub N): ");
         // Pobranie znaku nowego wiersza.
         keyboard.nextLine();
         // Wczytywanie wiersza danych wejściowych.
         input = keyboard.nextLine();

       } while (input.charAt(0) == 't' ||
                input.charAt(0) == 'T');
   }

   /**
      Metoda binarySearch wykonuje binarne wyszukiwanie
      w tablicy liczb całkowitych.
      @param array Przeszukiwana tablica.
      @param first Pierwszy element przeszukiwanego przedziału.
      @param last Ostatni element przeszukiwanego przedziału.
      @param value Szukana wartość.
      @return Indeks wartości (jeśli ją znaleziono)
              lub –1.
   */

   public static int binarySearch(int[] array, int first,
                                  int last, int value)
   {
      int middle;     // Punkt środkowy w wyszukiwaniu.
 
      // Wykrywanie przypadku bazowego, czyli sytuacji,
      // w której wartości nie znaleziono.
      if (first > last)
         return -1;
        
      // Obliczanie punktu środkowego.
      middle = (first + last) / 2;
       
      // Wyszukiwanie wartości.
      if (array[middle] == value)
         return middle;
      else if (array[middle] < value)
         return binarySearch(array, middle + 1,
                             last, value);
      else
         return binarySearch(array, first,
                             middle - 1, value);
   }
}
