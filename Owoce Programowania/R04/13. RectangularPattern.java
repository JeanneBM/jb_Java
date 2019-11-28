import java.util.Scanner;

/**
   Ten program wyświetla prostokątny
   wzorzec gwiazdek.
*/

public class RectangularPattern
{
   public static void main(String[] args)
   {
      int rows, cols;
      
      // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
     Scanner keyboard = new Scanner(System.in);

     // Pobieranie liczby wierszy i kolumn.
     System.out.print("Podaj liczbę wierszy: ");
     rows = keyboard.nextInt();
     System.out.print("Podaj liczbę kolumn: ");
      cols = keyboard.nextInt();
   
      for (int r = 0; r < rows; r++)
      {
         for (int c = 0; c < cols; c++)
         {
           System.out.print("*");
         }
         System.out.println();
      }
   }
} 
