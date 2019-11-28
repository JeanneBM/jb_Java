import java.util.Scanner; 
import java.io.*;

/**
   Ten program wczytuje serię liczb z pliku i oblicza
   ich sumę.
*/

public class FileSum
{
   public static void main(String[] args) throws IOException
   {
      double sum = 0.0;   // Akumulator inicjowany wartością 0.

      // Otwieranie pliku do odczytu.
      File file = new File("Numbers.txt");
      Scanner inputFile = new Scanner(file);

      // Wczytywanie wszystkich wartości z pliku
      // i obliczanie ich sumy.
      while (inputFile.hasNext())
      {
         // Wczytywanie wartości z pliku.
         double number = inputFile.nextDouble();
         
         // Dodawanie wartości do sumy.
         sum = sum + number;
      }

      // Zamykanie pliku.
      inputFile.close();

     // Wyświetlanie sumy liczb.
     System.out.println("Suma liczb z pliku " +
                        "Numbers.txt wynosi " + sum + "."); 
   }
}
