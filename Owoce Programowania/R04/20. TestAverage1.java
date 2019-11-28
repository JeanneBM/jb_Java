import java.util.Scanner; 

/**
   Ten program ilustruje pętlę kontrolowaną przez użytkownika.
*/

public class TestAverage1
{
   public static void main(String[] args)
   {
      int score1, score2, score3;  // Wyniki trzech testów.
     double average;             // Średni wynik testu.
     char repeat;                // Przechowywanie 't' lub 'n'.
     String input;               // Przechowywanie danych wejściowych.

     System.out.println("Ten program oblicza średnią " +
                        "wyników trzech testów.");

      // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
     Scanner keyboard = new Scanner(System.in);

     // Pobieranie tylu zbiorów wyników testów, ile użytkownik chce podać.
      do
      {
         // Pobieranie wyniku pierwszego testu z danego zbioru.
       System.out.print("Podaj wynik nr 1: ");
       score1 = keyboard.nextInt();

       // Pobieranie wyniku drugiego testu z danego zbioru.
       System.out.print("Podaj wynik nr 2: ");
       score2 = keyboard.nextInt();

       // Pobieranie wyniku trzeciego testu z danego zbioru.
       System.out.print("Podaj wynik nr 3: ");
       score3 = keyboard.nextInt();

       // Pobieranie pozostałego znaku nowego wiersza.
         keyboard.nextLine();

         // Obliczanie i wyświetlanie średniej wyników testów.
       average = (score1 + score2 + score3) / 3.0;
       System.out.println("Średnia wynosi " + average + "."); 
       System.out.println(); // Wyświetlanie pustego wiersza.

       // Czy użytkownik chce obliczyć średnią następnego zbioru wyników?
       System.out.println("Chcesz obliczyć średnią " +
                          "następnego zbioru wyników testów?");
       System.out.print("Wpisz T (tak) lub N (nie): ");
       input = keyboard.nextLine();  // Wczytywanie wiersza.
       repeat = input.charAt(0);     // Pobieranie pierwszego znaku.

      } while (repeat == 'T' || repeat == 't');
   }
}

