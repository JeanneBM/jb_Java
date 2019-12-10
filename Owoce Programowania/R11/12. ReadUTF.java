/**
   Ten program wczytuje z pliku binarnego łańcuchy znaków w formacie UTF-8.
*/

import java.io.*;

public class ReadUTF
{
   public static void main(String[] args)
                      throws IOException
   {
      String name;
      boolean endOfFile = false;
      
      // Tworzenie obiektów na potrzeby pobierania danych wejściowych.
      FileInputStream fstream =
                new FileInputStream("UTFnames.dat");
      DataInputStream inputFile =
                new DataInputStream(fstream);
      
      System.out.println("Wczytywanie imion z pliku:");
      
      // Wczytywanie zawartości pliku.
      while (!endOfFile)
      {
           try
           {
                name = inputFile.readUTF();
                System.out.print(name + " ");
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
