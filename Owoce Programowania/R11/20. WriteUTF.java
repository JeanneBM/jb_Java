/**
   Ten program otwiera plik binarny i zapisuje serię
   łańcuchów znaków w formacie UTF-8.
*/

import java.io.*;

public class WriteUTF
{
   public static void main(String[] args) throws IOException
   {
      String names[] = { "Waldemar", "Beata", "Halina", 
                         "Zygmunt", "Celina" };
      
      // Tworzenie obiektów potrzebnych do zapisu danych.
      FileOutputStream fstream =
                new FileOutputStream("UTFnames.dat");
      DataOutputStream outputFile =
                new DataOutputStream(fstream);
      
      System.out.println("Zapisywanie imion do pliku...");
      
      // Zapisywanie elementów tablicy w pliku.
      for (int i = 0; i < names.length; i++)
         outputFile.writeUTF(names[i]);
      
      System.out.println("Gotowe.");
      
      // Zamykanie pliku.
      outputFile.close();     
   }
}
