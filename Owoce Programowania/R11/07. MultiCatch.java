import java.io.*;    // Umożliwia używanie klas File i FileNotFoundException.
import java.util.*; // Umożliwia używanie klas Scanner i InputMismatchException.

/**
   Ten program ilustruje obsługę różnych typów wyjątków
   w jednej klauzuli catch.
*/

public class MultiCatch
{
   public static void main(String[] args)
   {
      int number;    // Przechowuje liczbę z pliku.

     try
     {
       // Otwieranie pliku.
         File file = new File("Numbers.txt");
         Scanner inputFile = new Scanner(file);

         // Przetwarzanie zawartości pliku.
         while (inputFile.hasNext())
         {
           // Pobieranie liczby z pliku.
           number = inputFile.nextInt();

           // Wyświetlanie liczby.
           System.out.println(number);
         }

         // Zamykanie pliku.
         inputFile.close();
      }
      catch(FileNotFoundException | InputMismatchException ex)
      {
         // Wyświetlanie komunikatu o błędzie.
         System.out.println("Błąd w trakcie przetwarzania pliku.");
      }
   }
}
