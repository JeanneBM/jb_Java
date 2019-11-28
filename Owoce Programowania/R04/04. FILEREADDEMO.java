import java.util.Scanner; // Potrzebne, by móc używać klasy Scanner.
import java.io.*;          // Potrzebne, by móc używać klasy File i wyjątków IOException.

/**
   Ten program wczytuje dane z pliku.
*/

public class FileReadDemo
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

      // Wczytywanie wierszy z pliku do momentu pobrania wszystkich danych.
      while (inputFile.hasNext())
      {
         // Wczytywanie następnego imienia.
       String friendName = inputFile.nextLine();

       // Wyświetlanie ostatniego wczytanego imienia.
       System.out.println(friendName);
     }

     // Zamykanie pliku.
      inputFile.close();
   }
}
