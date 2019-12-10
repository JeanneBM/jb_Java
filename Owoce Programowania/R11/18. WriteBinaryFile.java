import java.io.*;

/**
   Ten program otwiera plik binarny i zapisuje w tym pliku 
   zawartość tablicy typu int.
*/

public class WriteBinaryFile
{
   public static void main(String[] args)
                      throws IOException
   {
      // Tablica zapisywana w pliku.
      int[] numbers = { 2, 4, 6, 8, 10, 12, 14 };

      // Tworzenie obiektów na potrzeby zapisu danych binarnych.
      FileOutputStream fstream =
               new FileOutputStream("Numbers.dat");
      DataOutputStream outputFile =
               new DataOutputStream(fstream);
    
      System.out.println("Zapisywanie liczb w pliku...");
 
      // Zapisywanie elementów tablicy w pliku. 
      for (int i = 0; i < numbers.length; i++)
         outputFile.writeInt(numbers[i]);
    
      System.out.println("Gotowe.");

      // Zamykanie pliku.
      outputFile.close();   
   }
}
