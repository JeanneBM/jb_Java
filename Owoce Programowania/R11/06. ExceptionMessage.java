import java.io.*;               // Umożliwia używanie klas z plikowymi operacjami wejścia – wyjścia.
import java.util.Scanner;       // Umożliwia używanie klasy Scanner.
import javax.swing.JOptionPane; // Umożliwia używanie klasy JOptionPane.

/**
   Ten program pokazuje, jak można obsługiwać 
   wyjątki typu FileNotFoundException.
*/

public class ExceptionMessage
{
   public static void main(String[] args)
   {
      File file;         // Do pobierania danych wyjściowych z pliku.
      Scanner inputFile; // Do pobierania danych wyjściowych z pliku.
      String fileName;   // Przechowuje nazwę pliku.

      // Pobieranie nazwy pliku od użytkownika.
      fileName = JOptionPane.showInputDialog("Podaj " +
                                 "nazwę pliku:");

      // Próba otwarcia pliku.
      try
      {
         file = new File(fileName);
         inputFile = new Scanner(file);
         JOptionPane.showMessageDialog(null, 
                          "Plik znaleziono.");
      }
      catch (FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null, e.getMessage());
      }
      
      JOptionPane.showMessageDialog(null, "Gotowe.");
      System.exit(0);
   }
}
