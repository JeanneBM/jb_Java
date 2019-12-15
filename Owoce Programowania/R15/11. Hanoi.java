/**
   Ta klasa wyświetla rozwiązanie łamigłówki
   Wieże Hanoi.
*/

public class Hanoi
{
   private int numDiscs;   // Liczba dysków.
   
   /**
      Konstruktor.
      @param n Liczba używanych dysków.
   */
   
   public Hanoi(int n)
   {
      // Przypisywanie liczby dysków.
      numDiscs = n;

      // Przenoszenie dysków z kołka 1 na kołek 3
      // z użyciem kołka 2 jako tymczasowego.
      moveDiscs(numDiscs, 1, 3, 2);
   }

   /**
      Metoda moveDiscs wyświetla ruchy dysków.
      @param num Liczba przenoszonych dysków.
      @param fromPeg Początkowy kołek.
      @param toPeg Docelowy kołek.
      @param tempPeg Tymczasowy kołek.
   */
   
   private void moveDiscs(int num, int fromPeg,
                          int toPeg, int tempPeg)
   {
      if (num > 0)
      {
         moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
         System.out.println("Przenieś dysk z kołka " +
                           fromPeg + " na kołek " + toPeg + ".");
         moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
      }
   }
}
