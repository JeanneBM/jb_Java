import java.util.Scanner;   // Potrzebne, by móc używać klasy Scanner.
import java.io.*;          // Potrzebne, by móc używać klasy File i wyjątków IOException.

/**
   Ten program zapisuje dane w pliku. Przed otwarciem pliku
   program sprawdza, czy plik o danej nazwie nie   istnieje.
*/

public class FileWriteDemo2
{
   public static void main(String[] args) throws IOException
   {
      String filename;      // Nazwa pliku.
     String friendName;  // Imię znajomego.
     int numFriends;     // Liczba znajomych.

      // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      // Pobieranie liczby znajomych.
     System.out.print("Podaj liczbę znajomych: ");
     numFriends = keyboard.nextInt();

     // Pobieranie pozostałego znaku nowego wiersza.
     keyboard.nextLine();

     // Pobieranie nazwy pliku.
     System.out.print("Podaj nazwę pliku: ");
      filename = keyboard.nextLine();
      
      // Upewnianie się, że plik o danej nazwie nie istnieje.
     File file = new File(filename);
     if (file.exists())
     {
       System.out.println("Plik " + filename +
                          " już istnieje.");
       System.exit(0);
     }

     // Otwieranie pliku.
      PrintWriter outputFile = new PrintWriter(file);

      // Pobieranie danych i zapisywanie ich w pliku.
     for (int i = 1; i <= numFriends; i++)
     {
       // Pobieranie imienia znajomego.
       System.out.print("Podaj imię znajomego " +
                        "numer " + i + ": ");
       friendName = keyboard.nextLine();

       // Zapis imienia w pliku.
         outputFile.println(friendName);
      }

      // Zamykanie pliku.
     outputFile.close();
     System.out.println("Dane zapisano w pliku.");
   }
}
