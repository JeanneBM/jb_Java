/**
   Ten program ilustruje polimorficzne działanie kodu.
*/

public class Polymorphic
{
   public static void main(String[] args)
   {
      // Tworzenie tablicy referencji typu GradedActivity.
     GradedActivity[] tests = new GradedActivity[3];

     // Pierwszy test to zwykły egzamin 
     // z wynikiem punktowym 95.
     tests[0] = new GradedActivity();
     tests[0].setScore(95);

     // Drugi test to sprawdzian typu zaliczył/nie zaliczył. 
     // Student źle odpowiedział na 5 z 20 pytań, a
     // minimalna liczba punktów potrzebna do zaliczenia to 60.
      tests[1] = new PassFailExam(20, 5, 60);

     // Trzeci test to egzamin końcowy. Obejmuje
     // 50 pytań, a student źle odpowiedział na 7 z nich.
     tests[2] = new FinalExam(50, 7);

     // Wyświetlanie ocen.
     for (int i = 0; i < tests.length; i++)
     {
       System.out.println("Test numer " + (i + 1) + ": " +
                          "punktów " + tests[i].getScore() +
                          ", ocena " + tests[i].getGrade());
      }
   }
}
