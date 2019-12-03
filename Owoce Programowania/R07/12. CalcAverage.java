import java.util.Scanner;

/**
   Ten program pobiera zestaw wyników testów
   i używa klasy Grader do obliczenia średniej
   po odrzuceniu najniższego wyniku.
*/

public class CalcAverage
{
   public static void main(String[] args)
   {
      int numScores;    // Przechowywanie liczby wyników.

      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

      // Pobieranie liczby wyników.
      System.out.print("Ile wyników testów chcesz podać? ");
      numScores = keyboard.nextInt();

      // Tworzenie tablicy do przechowywania wyników testów.
      double[] scores = new double[numScores];
      
      // Pobieranie wyników testów i zapisywanie
      // ich w tablicy scores.
      for (int index = 0; index < numScores; index++)
      {
         System.out.print("Podaj wynik numer " +
                         (index + 1) + ": ");
         scores[index] = keyboard.nextDouble();
      }
      
      // Tworzenie obiektu typu Grader. 
      // Jako argument konstruktora 
      // przekazywana jest tablica scores.
      Grader myGrader = new Grader(scores);
            
      // Wyświetlanie średniej dla zmodyfikowanej tablicy wyników.
      System.out.println("Średnia wartości ze zmodyfikowanej listy to "  +
                         myGrader.getAverage() + ".");

      // Wyświetlanie najniższego wyniku.
      System.out.println("Najniższy wynik testu to " + 
                         myGrader.getLowestScore() + ".");
      
   }
}
