/**
   Ten program ilustruje działanie klasy FinalExam3 zawierającej
   implementację interfejsu Relatable.
*/

public class RelatableExams
{
   public static void main(String[] args)
   {
      // Egzamin numer 1 składał się ze 100 pytań, a student
     // udzielił 20 błędnych odpowiedzi.
     FinalExam3 exam1 = new FinalExam3(100, 20);

     // Egzamin numer 2 składał się ze 100 pytań, a student
     // udzielił 30 błędnych odpowiedzi..
      FinalExam3 exam2 = new FinalExam3(100, 30);

      // Wyświetlanie wyników egzaminów.
     System.out.println("Egzamin numer 1: " + exam1.getScore());
     System.out.println("Egzamin numer 2: " + exam2.getScore());

     // Porównywanie wyników egzaminów.
     if (exam1.equals(exam2))
       System.out.println("Wyniki egzaminów są takie same.");

      if (exam1.isGreater(exam2))
         System.out.println("Wynik egzaminu numer 1 jest wyższy.");

     if (exam1.isLess(exam2))
       System.out.println("Wynik egzaminu numer 1 jest niższy.");
   }
}
