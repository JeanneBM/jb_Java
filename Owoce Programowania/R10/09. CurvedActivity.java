/**
   Ta klasa oblicza ocenę po modyfikacji wyniku. Jest to
   rozszerzenie klasy GradedActivity.
*/

public class CurvedActivity extends GradedActivity
{
   double rawScore;     // Niezmodyfikowany wynik.
   double percentage; // Procent określający poziom modyfikacji.

   /**
     Konstruktor ustawia procent określający poziom modyfikacji.
     @param percent Procent określający poziom modyfikacji.
   */

   public CurvedActivity(double percent)
   {
      percentage = percent;
      rawScore = 0.0;
   }

   /**
      Ta metoda setScore przesłania metodę setScore z klasy bazowej. 
      Ta wersja przyjmuje argument w postaci pierwotnego wyniku. Ta wartość
      jest mnożona przez procent określający poziom modyfikacji, a wynik
      jest przekazywany jako argument do metody setScore klasy bazowej.
      @param s Pierwotny wynik.
   */
   
   @Override
   public void setScore(double s)
   {
      rawScore = s;
      super.setScore(rawScore * percentage);
   }

   /**
      Metoda getRawScore zwraca pierwotny wynik.
      @return Wartość w polu rawScore.
   */

   public double getRawScore()
   {
      return rawScore;
   }

   /**
      Metoda getPercentage zwraca procent określający
      poziom modyfikacji wyników.
      @return Wartość pola percentage.
   */

   public double getPercentage()
   {
      return percentage;
   }
}
