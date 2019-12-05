/**
   Klasa przechowująca wyniki ocenianych zadań.
*/

public class GradedActivity
{
   private double score;  // Wynik punktowy.

   /**
     Metoda setScore ustawia wartość pola score.
     @param s Wartość zapisywana w polu score.
   */

   public void setScore(double s)
   {
      score = s;
   }

   /**
      Metoda getScore zwraca wynik.
      @return Wartość zapisana w polu score.
   */

   public double getScore()
   {
      return score;
   }

   /**
      Metoda getGrade zwraca standardową ocenę
      określoną na podstawie wartości pola score.
      @return Standardowa ocena.
   */

   public char getGrade()
   {
      char letterGrade;

      if (score >= 90)
         letterGrade = '5';
      else if (score >= 80)
        letterGrade = '4';
      else if (score >= 70)
        letterGrade = '3';
      else if (score >= 60)
        letterGrade = '2';
      else
        letterGrade = '1';

      return letterGrade;
   }
}
