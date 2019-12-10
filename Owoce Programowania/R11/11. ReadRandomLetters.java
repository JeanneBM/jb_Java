import java.io.*;

/**
   Ten program używa klasy RandomAccessFile do otwarcia
   pliku Letters.dat i swobodnego wczytywania znaków
   z różnych lokalizacji.
*/

public class ReadRandomLetters
{
   public static void main(String[] args) throws IOException
   {
      final int CHAR_SIZE = 2;// Znaki zajmują po dwa bajty.
      long byteNum;            // Numer bajta.
      char ch;                 // Znak z pliku.

      // Otwieranie pliku do odczytu.
      RandomAccessFile randomFile =
                  new RandomAccessFile("Letters.dat", "r");
      
      // Przechodzenie do znaku numer 5. Jest to szósty 
      // znak, licząc od początku pliku.
      byteNum = CHAR_SIZE * 5;
      randomFile.seek(byteNum);
      
      // Wczytywanie znaku zapisanego w danej lokalizacji
      // i wyświetlanie go. Powinna to być litera f.
      ch = randomFile.readChar();
      System.out.println(ch);
      
      // Przejście do znaku numer 10 (jedenastego),
      // wczytanie go i wyświetlenie.
      // Powinna to być litera k.
      byteNum = CHAR_SIZE * 10;
      randomFile.seek(byteNum);
      ch = randomFile.readChar();
      System.out.println(ch);
      
      // Przejście do znaku numer 3 (czwartego znaku),
      // wczytanie go i wyświetlenie.
      // Powinna to być litera d.
      byteNum = CHAR_SIZE * 3;
      randomFile.seek(byteNum);
      ch = randomFile.readChar();
      System.out.println(ch);
      
      // Zamykanie pliku.
      randomFile.close();
   }
}
