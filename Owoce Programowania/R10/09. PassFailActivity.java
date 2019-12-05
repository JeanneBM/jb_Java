/**
   Ta klasa przechowuje wynik punktowy i określa,
   czy student zaliczył pracę.
*/

public class PassFailActivity extends GradedActivity
{
   private double minPassingScore; // Minimalny wynik potrzebny do zaliczenia.

   /**
      Konstruktor ustawia minimalny wynik potrzebny do zaliczenia.
      @param mps Minimalny wynik potrzebny do zaliczenia.
   */

   public PassFailActivity(double mps)
   {
      minPassingScore = mps;
   }

   /**
      Metoda getGrade na podstawie wartości pola score 
      zwraca literę z informacją o zaliczeniu. Ta metoda
      przesłania metodę z klasy bazowej.
      @return Informacja o zaliczeniu.
   */

   @Override
   public char getGrade()
   {
      char letterGrade;

      if (super.getScore() >= minPassingScore)
         letterGrade = 'Z';
      else
         letterGrade = 'N';

      return letterGrade;
   }
}
