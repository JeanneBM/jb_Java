import javax.swing.JOptionPane;

/**
   Ten program ilustruje działanie
   rekurencyjnej metody obliczania silni.
*/

public class FactorialDemo
{
   public static void main(String[] args)
   {
      String input;   // Przechowywanie danych wejściowych od użytkownika.
      int number;   // Przechowywanie liczby.

      // Pobieranie liczby od użytkownika.
      input = JOptionPane.showInputDialog("Podaj " +
                                          "nieujemną liczbę całkowitą:");
      number = Integer.parseInt(input);
      
      // Wyświetlanie silni liczby.
      JOptionPane.showMessageDialog(null,
                    number + "! wynosi " + factorial(number) + ".");

      System.exit(0);
   }
   
   /**
      W metodzie factorial użyto rekurencji do obliczania
      silni argumentu (zakładamy, że jest 
      to liczba nieujemna).
      @param n Liczba używana w obliczeniach.
      @return Silnia liczby n.
   */
   
   private static int factorial(int n)
   {
      if (n == 0)
         return 1;   // Przypadek bazowy.
      else
         return n * factorial(n - 1);
   }
}
