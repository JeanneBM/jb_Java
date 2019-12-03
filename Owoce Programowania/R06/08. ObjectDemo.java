import java.util.Scanner;  // Na potrzeby klasy Scanner.
import java.util.Random;   // Na potrzeby klasy Random.
import java.io.*;          // Na potrzeby klas z plikowymi operacjami wejścia-wyjścia.

/*
   Ten program zapisuje liczby losowe w pliku.
*/

public class ObjectDemo
{
   public static void main(String[] args) throws IOException
   {
      int maxNumbers;    // Maksymalna liczba wartości losowych.
      int number;     // Przechowywanie liczby losowej.

      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
 
      // Tworzenie obiektu typu Random do generowania liczb losowych.
      Random rand = new Random();
      
      // Tworzenie obiektu typu PrintWriter służącego do otwierania pliku.
      PrintWriter outputFile = new PrintWriter("numbers.txt");

     // Pobieranie liczby zapisywanych liczb losowych.
     System.out.print("Ile liczb losowych program ma zapisać? ");
     maxNumbers = keyboard.nextInt();

     // Zapisywanie liczb losowych w pliku.
     for (int count = 0; count < maxNumbers; count++)
     {
       // Generowanie losowej liczby całkowitej.
         number = rand.nextInt();
         
         // Zapisywanie losowej liczby całkowitej w pliku.
        outputFile.println(number);
     }

     // Zamykanie pliku.
     outputFile.close();
     System.out.println("Gotowe. ");
   }
}
