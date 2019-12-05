import java.io.*;
import java.util.Scanner;

/**
   Klasa TestScoreReader wczytuje wyniki testów
   jako tokeny z pliku i oblicza średnią 
   dla każdego wiersza wyników.
*/

public class TestScoreReader
{
   private Scanner inputFile;
   private String line;

   /**
      Konstruktor otwiera plik w celu
      wczytania z niego ocen.
      @param filename Otwierany plik.
   */
   
   public TestScoreReader(String filename)
                        throws IOException
   {
      File file = new File(filename);
      inputFile = new Scanner(file);
   }
   
   /**
      Metoda readNextLine wczytuje z pliku
      następny wiersz.
      @return true, jeśli wczytano wiersz, false
              w przeciwnym razie.
   */

   public boolean readNextLine() throws IOException
   {
      boolean lineRead; // Flaga.

      // Określanie, czy pozostały jakieś dane do wczytania.
      lineRead = inputFile.hasNext();

      // Jeśli pozostały, należy wczytać następny wiersz.
      if (lineRead)
        line = inputFile.nextLine();
       
      return lineRead;
   }

   /**
      Metoda getAverage oblicza średnią ostatniego
      zestawu wyników testów wczytanego z pliku.
      @return Średnia.
   */
    
   public double getAverage()
   {
      int total = 0;    // Akumulator.
      double average; // Średnia wyników testów.

      // Podział ostatniego wczytanego wiersza z pliku na tokeny.
      String[] tokens = line.split(",");
 
      // Obliczanie sumy wyników testów.
      for (String str : tokens)
      {
         total += Integer.parseInt(str);
      }
    
      // Obliczanie średniej wyników.
      // Rzutowanie w celu uniknięcia dzielenia całkowitoliczbowego.
      average = (double) total / tokens.length;

      // Zwracanie średniej.
      return average;
   }
   
   /**
      Metoda close zamyka plik.
   */
   
   public void close() throws IOException
   {
      inputFile.close();
   }
}

