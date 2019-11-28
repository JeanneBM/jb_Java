import javax.swing.JOptionPane;

/**
   Ten program wyznacza liczbę drużyn piłkarskich, jakie
   można utworzyć w lidze juniorów. Robi to na podstawie
   liczby graczy. Pokazano tu sprawdzanie poprawności
   danych wejściowych za pomocą pętli while.
*/

public class SoccerTeams
{
   public static void main(String[] args)
   {
      final int MIN_PLAYERS = 9;  // Minimalna liczba graczy w drużynie.
     final int MAX_PLAYERS = 15;  // Maksymalna liczba graczy w drużynie.
     int players;                 // Liczba dostępnych graczy.
     int teamSize;                // Liczba graczy na drużynę.
     int teams;                   // Liczba drużyn.
     int leftOver;                // Liczba graczy nieprzydzielonych do drużyn.
     String input;                // Przechowywanie danych wejściowych od użytkownika.

     // Pobieranie liczby zawodników w drużynie.
     input = JOptionPane.showInputDialog("Wprowadź liczbę " +
                                         "graczy w drużynie: ");
      teamSize = Integer.parseInt(input);
      
      // Sprawdzanie poprawności wprowadzonej liczby.
     while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)
     {
       input = JOptionPane.showInputDialog("Liczba musi wynosić " +
                                    "od " + MIN_PLAYERS +
                                    " do " +
                                    MAX_PLAYERS + ".\n Podaj " +
                                    "liczbę graczy: ");
         teamSize = Integer.parseInt(input);
      }

      // Pobieranie liczby dostępnych graczy.
     input = JOptionPane.showInputDialog("Wprowadź liczbę " +
                                         "dostępnych graczy: ");
     players = Integer.parseInt(input);

     // Zatwierdzanie wprowadzonej liczby.
      while (players < 0)
      {
         input = JOptionPane.showInputDialog("Wpisz wartość 0 " +
                                           "lub większą.");
         players = Integer.parseInt(input);
      }
 
      // Określanie liczby zespołów.
     teams = players / teamSize;

     // Określanie liczby nieprzydzielonych graczy.
     leftOver = players % teamSize;

     // Wyświetlanie wyników.
     JOptionPane.showMessageDialog(null, "Powstanie " +
                                   teams + " zespołów, a pozostanie" +
                                   leftOver +
                                   " nieprzydzielonych graczy.");
      System.exit(0);
   }
}
