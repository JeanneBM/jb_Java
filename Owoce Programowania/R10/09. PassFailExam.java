/**
   Ta klasa określa, czy student zaliczył egzamin,
   czy nie zaliczył go.
*/

public class PassFailExam extends PassFailActivity
{
   private int numQuestions;  // Liczba pytań.
   private double pointsEach; // Liczba punktów za pytanie.
   private int numMissed;     // Liczba błędnych odpowiedzi.

   /**
     Konstruktor ustawia liczbę pytań, liczbę 
     błędnych odpowiedzi i minimalną liczbę punktów
     potrzebną do uzyskania zaliczenia.
     @param questions Liczba pytań.
     @param missed Liczba błędnych odpowiedzi.
     @param minPassing Minimalny wynik potrzebny do zaliczenia.
   */

   public PassFailExam(int questions, int missed, 
                       double minPassing)
   {
      // Wywoływanie konstruktora klasy bazowej.
     super(minPassing);

     // Deklarowanie zmiennej lokalnej z wynikiem.
     double numericScore;

     // Ustawianie wartości pól numQuestions i numMissed.
     numQuestions = questions;
     numMissed = missed;

     // Ustalanie liczby punktów za każde pytanie i
     // wyniku punktowego z egzaminu.
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);

      // Wywołanie metody setScore klasy bazowej
     // w celu ustawienia wyniku punktowego.
     setScore(numericScore);
   }

   /**
     Metoda getPointsEach zwraca liczbę punktów
     za każde pytanie.
     @return Wartość w polu pointsEach.
   */

   public double getPointsEach()
   {
      return pointsEach;
   }

   /**
      Metoda getNumMissed zwraca liczbę
      błędnych odpowiedzi.
      @return Wartość w polu numMissed.
   */

   public int getNumMissed()
   {
      return numMissed;
   }
}

