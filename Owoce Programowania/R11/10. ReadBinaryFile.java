import java.io.*;

/**
   Ten program otwiera plik binarny, a następnie 
   wczytuje i wyświetla jego zawartość.
*/

public class ReadBinaryFile
{
   public static void main(String[] args)
                      throws IOException
   {
      int number; // Liczba wczytana z pliku.
      boolean endOfFile = false;  // Flaga informująca o końcu pliku.

      // Tworzenie obiektów do wczytywania danych z pliku binarnego.
      FileInputStream fstream =
                new FileInputStream("Numbers.dat");
      DataInputStream inputFile =
               new DataInputStream(fstream);
    
      System.out.println("Wczytywanie liczb z pliku:");

      // Wczytywanie zawartości pliku.  
      while (!endOfFile)
      {
         try
         {
            number = inputFile.readInt();
            System.out.print(number + " ");
         }
         catch (EOFException e)
         {
            endOfFile = true;
         }
      }

      System.out.println("\nGotowe.");
      
      // Zamykanie pliku.
      inputFile.close();   
   }
}
