//************************************************
// Klasa TestGrade określa ocenę                 *
// na podstawie liczbowego wyniku testu.         *
//************************************************

public class TestGrade
{
     private int score;

     //********************************************
     // Konstruktor przyjmuje argument zapisywany *
     // w polu score.                             *
     //********************************************

     public TestGrade(int S)
     {
          score = S;
     }

     //********************************************
     // Metoda setScore przyjmuje argument        *
     // zapisywany w polu score.                  *
     //********************************************

     public void SetScore(int S)
     {
          score = S;
     }

     //***********************************************
     // Metoda getScore zwraca wartość pola score.   *
     //***********************************************

     public int getScore()
     {
          return score;
     }

     //************************************************
     // Metoda getLetterGrade określa i zwraca        *
     // ocenę.                                        *
     //************************************************

     public char getLetterGrade()
     {
          char grade;

          if (score < 60)
               grade = '1';
          else if (score < 70)
               grade = '2';
          else if (score < 80)
               grade = '3';
          else if (score < 90)
               grade = '4';
          else if (score <= 100)
               grade = '5';
          else                // Błędny wynik.
               grade = '0';

          return grade;
     }
}
