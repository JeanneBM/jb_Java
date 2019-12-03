/**
   Ten program używa pól length tablicy dwuwymiarowej
   do wyświetlania liczby wierszy i liczby 
   kolumn w każdym wierszu.
*/

public class Lengths
{
   public static void main(String[] args)
   {
      // Deklarowanie tablicy dwuwymiarowej o trzech
      // wierszach i czterech kolumnach.

      int[][] numbers = { { 1,  2,  3,  4  },
                          { 5,  6,  7,  8  },
                          { 9, 10, 11, 12 } };

      // Wyświetlanie liczby wierszy.
      System.out.println("Liczba wierszy " +
                         "wynosi " + numbers.length + ".");
 
      // Wyświetlanie liczby kolumn w każdym wierszu.
      for (int index = 0; index < numbers.length; index++)
      {
         System.out.println("Liczba kolumn " +
                   "w wierszu numer " + index + " wynosi " +
                   numbers[index].length + ".");
      }
   }
}
