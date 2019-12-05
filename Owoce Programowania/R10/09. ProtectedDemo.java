import javax.swing.JOptionPane;

/**
   Ten program ilustruje działanie klasy FinalExam2, 
   będącej rozszerzeniem klasy GradedActivity2. 
*/

public class ProtectedDemo
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

      // Pobieranie liczby błędnych odpowiedzi.
     input = JOptionPane.showInputDialog("Na ile pytań " +
                   "student udzielił błędnej odpowiedzi?");
     missed = Integer.parseInt(input);

     // Tworzenie obiektu typu FinalExam.
      FinalExam2 exam = new FinalExam2(questions, missed);

      // Wyświetlanie wyników testów.
     JOptionPane.showMessageDialog(null,
        "Liczba punktów za pytanie: " + exam.getPointsEach() +
        ".\nWynik egzaminu: " +
        exam.getScore() + "\nOcena z egzaminu: " +
           exam.getGrade());

      System.exit(0);
   }
}
