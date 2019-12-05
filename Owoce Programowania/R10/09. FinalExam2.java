/**
   Ta klasa określa ocenę z egzaminu końcowego.
   Wynik punktowy jest zaokrąglany w górę do następnej liczby 
   całkowitej, jeśli jego część ułamkowa wynosi 0,5 lub więcej.
*/

public class FinalExam2 extends GradedActivity2
{
   private int numQuestions;  // Liczba pytań.
   private double pointsEach; // Liczba punktów za każde pytanie.
   private int numMissed;     // Liczba złych odpowiedzi.

   /**
     Konstruktor ustawia liczbę pytań na egzaminie i
     liczbę pytań z błędnymi odpowiedziami.
     @param questions Liczba pytań.
     @param missed Liczba błędnych odpowiedzi.
   */

   public FinalExam2(int questions, int missed)
   {
      double numericScore;  // Przechowuje wynik punktowy.

      // Ustawianie wartości pól numQuestions i numMissed.
      numQuestions = questions;
      numMissed = missed;

      // Określanie liczby punktów za każde pytanie
      // i wyniku punktowego z egzaminu.
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);

      // Wywołanie odziedziczonej metody setScore 
      // w celu zapisania wyniku punktowego.
      setScore(numericScore);

      // Modyfikowanie wyniku.
      adjustScore();
    }

   /**
     Metoda getPointsEach zwraca liczbę punktów
     przyznawanych za każde pytanie.
     @return Wartość pola pointsEach.
   */

   public double getPointsEach()
   {
      return pointsEach;
   }

   /**
      Metoda getNumMissed zwraca 
      liczbę błędnych odpowiedzi.
      @return Wartość pola numMissed.
   */

   public int getNumMissed()
   {
      return numMissed;
   }

   /**
      Metoda adjustScore modyfikuje wynik punktowy.
      Jeśli część ułamkowa wyniku jest równa 0,5 lub więcej, 
      metoda zaokrągla wynik w górę.
   */

   private void adjustScore()
   {
      double fraction;

      // Pobieranie części ułamkowej wyniku.
      fraction = score - (int) score;

      // Jeśli część ułamkowa wynosi 0,5 lub więcej,
      // wynik jest zaokrąglany do następnej liczby całkowitej.
      if (fraction >= 0.5)
         score = score + (1.0 - fraction);
   }
}

