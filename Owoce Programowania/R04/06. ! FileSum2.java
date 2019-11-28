import java.util.Scanner; 
import java.io.*;

/**
   Ta wersja programu upewnia się, że plik Numbers.txt
    istnieje, a dopiero potem go otwiera.
*/

public class FileSum2
{
   public static void main(String[] args) throws IOException
   {
      double sum = 0.0;   // Akumulator inicjowany wartością 0.

      // Upewnianie się, że plik istnieje.
      File file = new File("Numbers.txt");
      if (!file.exists())
      {
         System.out.println("Nie znaleziono pliku Numbers.txt.");
         System.exit(0);
      }
      
      // Otwieranie pliku do odczytu.
     Scanner inputFile = new Scanner(file);

     // Wczytywanie wszystkich wartości z pliku 
     // i obliczanie ich sumy.
      while (inputFile.hasNext())
      {
         // Wczytywanie wartości z pliku.
       double number = inputFile.nextDouble();

       // Dodawanie number do sum.
         sum = sum + number;
      }

      // Zamykanie pliku.
     inputFile.close();

     // Wyświetlanie sumy liczb.
     System.out.println("Suma liczb z pliku " +
                        "Numbers.txt wynosi " + sum + "."); 
   }
}
