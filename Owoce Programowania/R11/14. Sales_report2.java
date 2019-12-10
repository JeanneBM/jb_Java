import java.io.*;    // Umożliwia używanie klas File i FileNotFoundException.
import java.util.*;             // Umożliwia używanie klas Scanner i InputMismatchException.
import javax.swing.JOptionPane; // Umożliwia używanie klasy JOptionPane.

/**
   Ten program pokazuje, jak zastosować bloki obsługi
   wyjątków do przywracania stanu po błędach.
 */
  
 public class SalesReport2
 {
    public static void main(String[] args)
    {
       String filename = "SalesData.txt"; // Nazwa pliku.
       int months = 0;                    // Licznik miesięcy.
       double oneMonth;                   // Wartość sprzedaży z danego miesiąca.
       double totalSales = 0.0;           // Łączna wartość sprzedaży.
       double averageSales;               // Średnia sprzedaż.

       // Próba otwarcia pliku za pomocą wywołania
       // metody openFile.
       Scanner inputFile = openFile(filename);
       
       // Jeśli metoda openFile zwróciła wartość null, to
       // pliku nie znaleziono. Należy pobrać nową nazwę pliku.
       while (inputFile == null)
       {
         filename = JOptionPane.showInputDialog(
                       "BŁĄD: " + filename +
                       " nie istnieje.\n" +
                       "Podaj inną nazwę pliku: ");
         inputFile = openFile(filename);
       }
 
       // Przetwarzanie zawartości pliku.
     while (inputFile.hasNext())
     {
       try
       {
         // Pobieranie wartości sprzedaży z danego miesiąca.
         oneMonth = inputFile.nextDouble();

         // Dodawanie wartości sprzedaży do sumy.
         totalSales += oneMonth;

         // Inkrementacja licznika miesięcy.
             months++;
          }
          catch(InputMismatchException e)
          {
             // Wyświetlanie komunikatu o błędzie.
             JOptionPane.showMessageDialog(null,
               "W pliku znaleziono dane niebędące liczbą.\n" +
               "Błędne dane zostaną pominięte.");

             // Pomijanie błędnych danych.
             inputFile.nextLine();
          }
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
                        
       System.exit(0);
    }
 
    /**
       Metoda openFile otwiera podany plik i 
       zwraca referencję do obiektu typu Scanner.
       @param filename Nazwa otwieranego pliku.
       @return Referencja do obiektu typu Scanner, jeśli podany
               plik istnieje; w przeciwnym razie wartość null.
    */
 
    public static Scanner openFile(String filename)
    {
       Scanner scan;
 
       // Próba otwarcia pliku.
       try
       {
          File file = new File(filename);
          scan = new Scanner(file);
       }
       catch(FileNotFoundException e)
       {
          scan = null;
       }
 
       return scan;
    }
 }
