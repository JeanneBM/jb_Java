/**
   Klasa Grader oblicza średnią wartości
   z tablicy z wynikami testów po
   odrzuceniu najniższego wyniku.
*/

public class Grader
{
   // Pole testScores to zmienna 
   // wskazująca tablicę
   // z wynikami testów.
   private double[] testScores;
   
   /**
      Konstruktor
      @param scoreArray Tablica z wynikami testów.
   */
   
   public Grader(double[] scoreArray)
   {
      // Przypisywanie podanej jako argument tablicy 
      // do pola testScores.
      testScores = scoreArray;
   }
   
   /**
      Metoda getLowestScore.
      @return Najniższy wynik testu.
   */
   
   public double getLowestScore()
   {
      double lowest;    // Przechowywanie najniższego wyniku.
 
      // Pobieranie pierwszego wyniku testu z tablicy.
      lowest = testScores[0];

      // Pobieranie kolejnych elementów tablicy. Po 
      // napotkaniu wyniku niższego niż wartość zmiennej 
      // lowest należy przypisać go do tej zmiennej.
      for (int index = 1; index < testScores.length; index++)
      {
         if (testScores[index] < lowest)
            lowest = testScores[index];
      }
      
      // Zwracanie najniższego wyniku testu.
      return lowest;
   }
   
   /**
      Metoda getAverage.
     @return Średnia wyników testów
             po odrzuceniu najniższego wyniku.
   */
   
   public double getAverage()
   {
      double total = 0;   // Przechowywanie sumy wyników.
      double lowest;     // Przechowywanie najniższego wyniku.
      double average;    // Przechowywanie średniej.

      // Jeśli tablica zawiera mniej niż dwa wyniki testów,
      // należy wyświetlić komunikat o błędzie i przypisać
      // 0 do średniej.
      if (testScores.length < 2)
      {
        System.out.println("BŁĄD: Trzeba podać przynajmniej " +
                           "dwa wyniki testów!"); 
         average = 0;
      }
      else
      {
         // Najpierw należy obliczyć sumę wyników.
         for (double score : testScores)
            total += score;
            
         // Następnie pobierany jest najniższy wynik.
         lowest = getLowestScore();

         // Odejmowanie najniższego wyniku od sumy.
         total -= lowest;

         // Pobieranie średniej dla zmodyfikowanego zbioru wyniku.
         average = total / (testScores.length - 1);
      }
      
      // Zwracanie średniej dla zmodyfikowanego zbioru wyniku.
      return average;
   }
}
