import java.util.Scanner;   // Potrzebne, by móc używać klasy Scanner.
import java.io.*;         // Potrzebne, by móc używać klasy File i wyjątku IOException.

/**
    Ten program wczytuje pierwszy wiersz z pliku.
*/

public class ReadFirstLine
{
   public static void main(String[] args) throws IOException
   {
      // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
     Scanner keyboard = new Scanner(System.in);

     // Pobieranie nazwy pliku.
     System.out.print("Podaj nazwę pliku: ");
      String filename = keyboard.nextLine();

      // Otwieranie pliku.
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);

      // Wczytywanie pierwszego wiersza z pliku.
     String line = inputFile.nextLine();

     // Wyświetlanie wczytanego wiersza.
     System.out.println("Pierwszy wiersz tego  pliku to:");
     System.out.println(line);

     // Zamykanie pliku.
      inputFile.close();
   }
}
