import java.util.Scanner;

/**
   Ten program ilustruje działanie klasy PassFailExam.
*/

public class PassFailExamDemo
{
   public static void main(String[] args)
   {
      int questions;     // Liczba pytań.
      int missed;    // Liczba błędnych odpowiedzi.
      double minPassing; // Minimum passing score

      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

      // Pobieranie liczby pytań na egzaminie.
      System.out.print("Z ilu pytań " +
                       "składa się egzamin? ");
      questions = keyboard.nextInt();

      // Pobieranie liczby błędnych odpowiedzi.
      System.out.print("Na ile pytań udzielono " +
                       "błędnej odpowiedzi? ");
      missed = keyboard.nextInt();

      // Pobieranie minimalnej liczby punktów potrzebnej do zaliczenia.
     System.out.print("Ile punktów potrzeba " +
                      "do zaliczenia? ");
     minPassing = keyboard.nextDouble();

     // Tworzenie obiektu typu PassFailExam.
      PassFailExam exam =
           new PassFailExam(questions, missed, minPassing);

      // Wyświetlanie liczby punktów za każde pytanie.
     System.out.println("Liczba punktów za każde pytanie: " +
                        exam.getPointsEach() + ".");

     // Wyświetlanie liczby punktów z egzaminu.
     System.out.println("Liczba punktów z egzaminu: " +
                        exam.getScore());

     // Wyświetlanie informacji o zaliczeniu.
     System.out.println("Informacje o zaliczeniu: " +
                 exam.getGrade());
   }
}

