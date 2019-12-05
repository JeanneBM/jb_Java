import javax.swing.JOptionPane;

/**
   Ten program ilustruje działanie 
   klasy GradedActivity.
*/

public class GradeDemo
{
   public static void main(String[] args)
   {
      String input;        // Przechowuje dane wejściowe.
      double testScore; // Wynik testu.

      // Tworzenie obiektu typu GradedActivity.
      GradedActivity grade = new GradedActivity();

      // Pobieranie wyniku testu.
      input = JOptionPane.showInputDialog("Podaj " +
                            "punktowy wynik testu.");
      testScore = Double.parseDouble(input);

      // Zapisywanie wyniku testu w obiekcie grade.
      grade.setScore(testScore);
      
      // Wyświetlanie oceny odpowiadającej wynikowi punktowemu.
      JOptionPane.showMessageDialog(null,
             "Ocena z tego testu to " +
                    grade.getGrade());

      System.exit(0);
   }
}
