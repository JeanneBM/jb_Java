import java.io.*;    // Umożliwia używanie klas File i FileNotFoundException.
import java.util.*;             // Umożliwia używanie klas Scanner i InputMismatchException.
import javax.swing.JOptionPane; // Umożliwia używanie klasy JOptionPane.

/**
   Ten program pokazuje, jak przechwytywać wiele wyjątków
   za pomocą jednej instrukcji try.
*/

public class SalesReport
{
   public static void main(String[] args)
   {
      String filename = "SalesData.txt"; // Nazwa pliku.
      int months = 0;                    // Licznik miesięcy.
      double oneMonth;                   // Sprzedaż z jednego miesiąca.
      double totalSales = 0.0;           // Łączna sprzedaż.
      double averageSales;               // Średnia sprzedaż.

      try
      {
         // Otwieranie pliku.
         File file = new File(filename);
         Scanner inputFile = new Scanner(file);

         // Przetwarzanie zawartości pliku.
         while (inputFile.hasNext())
         {
            // Pobieranie wartości sprzedaży z danego miesiąca.
            oneMonth = inputFile.nextDouble();
            
            // Pobieranie wartości sprzedaży z danego miesiąca.
            totalSales += oneMonth;
            
            // Inkrementacja licznika miesięcy.
            months++;
         }

         // Zamykanie pliku.
         inputFile.close();

         // Obliczanie średniej.
         averageSales = totalSales / months;

         // Wyświetlanie wyników.
        JOptionPane.showMessageDialog(null,
           String.format("Liczba miesięcy: %d\n" +
                         "Łączna sprzedaż: %,.2f złotych\n" +
                         "Średnia sprzedaż: %,.2f złotych",
                          months, totalSales, averageSales));
      }
      catch(FileNotFoundException e)
      {
         // Zgłaszany przez konstruktor z klasy Scanner, 
       // jeśli nie znaleziono plików.
       JOptionPane.showMessageDialog(null,
          "Plik " + filename + " nie istnieje.");
     }
     catch(InputMismatchException e)
     {
       // Zgłaszany przez metodę nextDouble klasy Scanner,
       // jeśli pobranej wartości nie można przekształcić na liczbę.
       JOptionPane.showMessageDialog(null,
           "W pliku znaleziono wartość niebędącą liczbą.");
      }
      
      System.exit(0);
   }
}
