import java.io.*;

/**
   Ten program używa obiektu typu RandomAccessFile 
   do utworzenia pliku Letters.dat. W tym pliku
   zapisywane są litery alfabetu.
*/

public class WriteLetters
{
   public static void main(String[] args)
                      throws IOException
   {
    // Tablica letters zawiera 26 liter alfabetu.
    char[] letters = {
               'a', 'b', 'c', 'd', 'e', 'f', 'g',
               'h', 'i', 'j', 'k', 'l', 'm', 'n',
               'o', 'p', 'q', 'r', 's', 't', 'u',
               'v', 'w', 'x', 'y', 'z' };

    System.out.println("Otwieranie pliku.");

    // Otwieranie pliku do odczytu i zapisu.
    RandomAccessFile randomFile =
            new RandomAccessFile("Letters.dat", "rw");

    System.out.println("Zapisywanie danych w pliku...");

    // Sekwencyjny zapis tablicy letters do pliku.
    for (int i = 0; i < letters.length; i++)
       randomFile.writeChar(letters[i]);
    
    // Zamykanie pliku.
    randomFile.close();
    
    System.out.println("Gotowe.");
   }
}
