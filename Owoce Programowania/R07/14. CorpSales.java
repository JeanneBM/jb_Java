import java.util.Scanner;

/**
   Ten program ilustruje działanie tablicy dwuwymiarowej.
*/

public class CorpSales
{
   public static void main(String[] args)
   {
      final int DIVS = 3; //Trzy jednostki firmy.
      final int QTRS = 4;       // Cztery kwartały.
      double totalSales = 0.0;  // Akumulator.
 
      // Tworzenie tablicy do przechowywania danych
      // sprzedażowych każdej jednostki z każdego kwartału.
      double[][] sales = new double[DIVS][QTRS];

      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

      // Wyświetlanie wprowadzenia.
      System.out.println("Ten program oblicza łączną wartość " +
                         "sprzedaży we wszystkich ");
      System.out.println("jednostkach firmy. " +
                         "Wprowadź następujące dane sprzedażowe:");

      // Pętle zagnieżdżone służące do zapełniania tablicy 
      // kwartalnymi wartościami sprzedaży w każdej jednostce.
      for (int div = 0; div < DIVS; div++)
      {
         for (int qtr = 0; qtr < QTRS; qtr++)
         {
            System.out.printf("Jednostka %d, kwartał %d: ",
                              (div + 1), (qtr + 1));
            sales[div][qtr] = keyboard.nextDouble();
         }
         System.out.println();   // Wyświetlanie pustego wiersza.
      }
 
      // Pętle zagnieżdżone dodające wszystkie elementy do tablicy.
      for (int div = 0; div < DIVS; div++)
      {
         for (int qtr = 0; qtr < QTRS; qtr++)
         {
            totalSales += sales[div][qtr];
         }
      }

      // Wyświetlanie łącznej wartości sprzedaży.
     System.out.printf("Łączna wartość sprzedaży to: %,.2f złotego.\n",
                        totalSales);
   }
}
