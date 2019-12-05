import javax.swing.JOptionPane;

/**
   Ten program ilustruje działanie klasy FinalExam,
   będącej rozszerzeniem klasy GradedActivity.
*/

public class FinalExamDemo
{
   public static void main(String[] args)
   {
      String input;     // Przechowuje dane wejściowe.
      int questions; // Liczba pytań.
      int missed;    // Liczba błędnych odpowiedzi.

      // Pobieranie liczby pytań na egzaminie.
      input = JOptionPane.showInputDialog("Z ilu " +
                 "pytań składa się egzamin końcowy?");
      questions = Integer.parseInt(input);

      // Pobieranie liczby pytań z błędnymi odpowiedziami.
      input = JOptionPane.showInputDialog("Na ile pytań " +
                     "udzielono złej odpowiedzi?");
      missed = Integer.parseInt(input);

      // Tworzenie obiektu typu FinalExam.
      FinalExam exam = new FinalExam(questions, missed);

      // Wyświetlanie wyników testów.
      JOptionPane.showMessageDialog(null,
          "Liczba punktów za każde pytanie: " + exam.getPointsEach() +
          ".\nWynik egzaminu: " +
          exam.getScore() + "\nOcena z egzaminu: " +
          exam.getGrade());

      System.exit(0);
   }
}


