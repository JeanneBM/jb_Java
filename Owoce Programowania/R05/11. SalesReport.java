import java.util.Scanner;        // Na potrzeby klasy Scanner.
import java.io.*;                // Na potrzeby klas z plikowymi operacjami wejścia-wyjścia.
import javax.swing.JOptionPane;  // Na potrzeby klasy JOptionPane.

/**
   Ten program otwiera plik zawierający wartości
   sprzedaży z 30 dni. Program oblicza i wyświetla 
   roczny poziom sprzedaży i średnią dzienną.
*/

public class SalesReport
{
   public static void main(String[] args) throws IOException
   {
      final int NUM_DAYS = 30; // Liczba dni z danymi sprzedażowymi.
      String filename;          // Nazwa otwieranego pliku.
      double totalSales;        // roczna wartość sprzedaży z danego okresu.
      double averageSales;      // średni poziom sprzedaży.

      // Pobieranie nazwy pliku.
      filename = getFileName();

      // Pobieranie rocznej wartości sprzedaży.
      totalSales = getTotalSales(filename);
      
      // Obliczanie średniej.
      averageSales = totalSales / NUM_DAYS;
 
      // Wyświetlanie sumy i średniej.
      displayResults(totalSales, averageSales);
      
      System.exit(0);
   }

   /**
      Metoda getFileName wyświetla prośbę o podanie
      nazwy otwieranego pliku.
      @return Referencja do obiektu typu String zawierającego
            nazwę pliku.
   */
   
   public static String getFileName()
   {
      String file;   // Przechowywanie nazwy pliku.
      
      // Wyświetlanie prośby o podanie nazwy pliku.
      file = JOptionPane.showInputDialog(
               "Podaj nazwę pliku zawierającego\n" +
               "wartość sprzedaży z 30 dni:");

      // Zwracanie nazwy pliku.
      return file;
   }     
      
   /**
      Metoda getTotalSales otwiera plik, wczytuje
      dzienne kwoty sprzedaży i oblicza ich
      sumę. Następnie zwraca tą sumę.
      @param filename Nazwa otwieranego pliku.
      @return roczna wartość sprzedaży.
   */
   
   public static double getTotalSales(String filename)throws IOException
   {
      double total = 0.0;  // Akumulator.
      double sales; // Dzienna wartość sprzedaży.

      // Otwieranie pliku.
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      
      // Ta pętla przetwarza wiersze wczytane z pliku i działa
      // do momentu dotarcia do końca pliku.
      while (inputFile.hasNext())
      {
        // Wczytywanie z pliku wartości typu double.
        sales = inputFile.nextDouble();

        // Dodawanie wartości zmiennej sales do wartości zapisanej już w zmiennej total.
         total += sales;
      }
      
      // Zamykanie pliku.
      inputFile.close();
 
      // Zwracanie rocznej wartości sprzedaży.
      return total;
   }
   
   /**
      Metoda displayResults wyświetla roczny i średni
      poziom sprzedaży.
      @param total roczna wartość sprzedaży.
      @param avg średni dzienny poziom sprzedaży.
   */
   
   public static void displayResults(double total, double avg)
   {
      // Wywietlanie sformatowanego rocznego i średniego poziomu sprzedaży.
      JOptionPane.showMessageDialog(null,
      String.format("roczna sprzedaż w podanym okresie wyniosła %,.2f złotego.\n" +
                    "średnia sprzedaż dzienna wyniosła %,.2f złotego.",
                       total, avg));
   }
}
