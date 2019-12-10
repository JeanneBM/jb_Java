import java.io.*;

/**
   Ten program ilustruje odczyt pliku za pomocą
   obiektu typu FileReader.
*/

public class SimpleFileReader
{
   public static void main(String[] args)
   {
      int rawData;        // Przechowywanie kodu znaku.
      char ch;            // Przechowywanie znaku.

      try
      {
         // Otwieranie pliku.
         FileReader freader =
                new FileReader("GoodFile.txt");

         // Wczytywanie kodu znaku z pliku.
         rawData = freader.read();
         while (rawData != -1)
         {
            // Przekształcanie kodu na znak.
            ch = (char) rawData;
            // Wyświetlanie znaku.
            System.out.print(ch);
            // Pobieranie następnego kodu ze strumienia.
            rawData = freader.read();
         }
      }
      catch (IOException e)
      {
         System.out.println("Błąd: " +
                            e.getMessage());
      }
   }
}
