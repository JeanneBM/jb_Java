import java.io.*;

/**
   Ten program ilustruje zapis pliku za pomocą
   obiektu typu FileWriter.
*/

public class SimpleFileWriter
{
   public static void main(String[] args)
   {
      // Łańcuch znaków zapisywany w pliku.
      String output = "Bądź wierny sobie.";
      int rawData;        // Przechowywanie kodu znaku.

      try
      {
         // Otwieranie pliku.
         FileWriter fwriter =
                new FileWriter("NewFile.txt");

         // 
         for (int i = 0; i < output.length(); i++)
         {
            // Przekształcanie znaku na format Unicode.
            rawData = (int) output.charAt(i);
            // Zapis danych w formacie Unicode.
            fwriter.write(rawData);
         }
         
         // Zamykanie pliku.
         fwriter.close();
      }
      catch (IOException e)
      {
         System.out.println("Błąd: " +
                            e.getMessage());
      }
   }
}
