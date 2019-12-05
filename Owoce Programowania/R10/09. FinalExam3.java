/**
   Ta klasa określa ocenę z egzaminu końcowego.
*/

public class FinalExam3 extends GradedActivity implements Relatable
{
   private int numQuestions;  // Liczba pytań.
   private double pointsEach; // Liczba punktów za każde pytanie.
   private int numMissed;     // Liczba błędnych odpowiedzi.

   /**
     Konstruktor ustawia liczbę pytań na egzaminie
     i liczbę błędnych odpowiedzi.
     @param questions Liczba pytań.
     @param missed Liczba błędnych odpowiedzi.
   */

   public FinalExam3(int questions, int missed)
   {
      double numericScore;  // Przechowuje wynik punktowy.

      // Ustawianie wartości pól numQuestions i numMissed.
      numQuestions = questions;
      numMissed = missed;

      // Obliczanie liczby punktów za każde pytanie
      // i wyniku punktowego z egzaminu.
      pointsEach = 100.0 / questions;
      numericScore = 100.0 - (missed * pointsEach);

      // Wywołanie odziedziczonej metody setScore 
      // w celu ustawienia wyniku punktowego.
      setScore(numericScore);
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
      Metoda getNumMissed zwraca liczbę
      błędnych odpowiedzi.
      @return Wartość pola numMissed.
   */

   public int getNumMissed()
   {
      return numMissed;
   }

   /**
      Metoda equals sprawdza, czy obiekt zawierający wywołaną metodę
      jest równy względem obiektu przekazanego jako argument.
      @return Wartość true, jeśli pole score w obiekcie zawierającym 
              wywołany obiekt ma wartość równą polu score obiektu
              przekazanego jako argument.
   */

   public boolean equals(GradedActivity g)
   {
      boolean status; 

      if (this.getScore() == g.getScore())
         status = true;
      else
         status = false;

      return status;
   }

   /**
      Metoda isGreater określa, czy obiekt zawierający wywołaną metodę
      jest większy niż obiekt przekazany jako argument.
      @return Wartość true, jeśli pole score w obiekcie zawierającym wywołaną metodę
              ma wartość większą niż pole score w obiekcie przekazanym jako argument.
   */

   public boolean isGreater(GradedActivity g)
   {
      boolean status; 

      if (this.getScore() > g.getScore())
         status = true;
      else
         status = false;

      return status;
   }

   /**
      Metoda isLess określa, czy obiekt zawierający wywołaną metodę
      jest mniejszy niż obiekt przekazany jako argument.
      @return Wartość true, jeśli pole score w obiekcie zawierającym wywołaną metodę
              ma wartość mniejszą niż pole score w obiekcie przekazanym jako argument.
   */

   public boolean isLess(GradedActivity g)
   {
      boolean status; 

      if (this.getScore() < g.getScore())
         status = true;
      else
         status = false;

      return status;
   }
}
