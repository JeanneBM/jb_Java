/**
   Ta klasa określa ocenę z egzaminu końcowego.
*/

public class FinalExam extends GradedActivity
{
   private int numQuestions;  // Liczba pytań.
   private double pointsEach; // Liczba punktów za każde pytanie.
   private int numMissed;     // Liczba błędnych odpowiedzi.

   /**
     Konstruktor ustawia liczbę pytań na egzaminie
     i liczbę pominiętych pytań.
     @param questions Liczba pytań.
     @param missed Liczba błędnych odpowiedzi.
   */

   public FinalExam(int questions, int missed)
   {
      double numericScore;  // Przechowuje wynik punktowy.

      // Ustawianie wartości pól numQuestions i numMissed.
      numQuestions = questions;
      numMissed = missed;

      // Obliczanie punktów uzyskanych za pytania
      // i wynik punktowy z egzaminu.
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);

      // Wywołanie odziedziczonej metody setScore
      // w celu ustawienia wyniku liczbowego.
      setScore(numericScore);
   }

   /**
      Metoda getPointsEach zwraca liczbę 
      punktów za każde pytanie.
      @return Wartość w polu pointsEach.
   */

   public double getPointsEach()
   {
      return pointsEach;
   }

   /**
      Metoda getNumMissed zwraca liczbę
      pytań z błędnymi odpowiedziami.
      @return Wartość w polu numMissed.
   */

   public int getNumMissed()
   {
      return numMissed;
   }
}
