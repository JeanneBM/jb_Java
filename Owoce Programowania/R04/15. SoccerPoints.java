import java.util.Scanner;    // Needed for the Scanner class

/**
   Ten program oblicza sumę liczb punktów, jaką drużyna
   piłkarska zdobyła w serii gier. Użytkownik wpisuje
   serię liczb punktów, a po zakończeniu wprowadza –1.
*/

public class SoccerPoints
{
   public static void main(String[] args)
   {
      int points;          // Liczba punktów ze spotkania.
     int totalPoints = 0;  // Inicjowanie akumulatora wartością 0.

     // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      // Wyświetlanie ogólnych instrukcji.
     System.out.println("Podaj liczbę punktów, jaką zespół");
     System.out.println("zdobył w spotkaniach w tym sezonie.");
     System.out.println("Aby zakończyć, wpisz -1.");
      System.out.println();

      // Pobieranie pierwszej liczby punktów.
     System.out.print("Wprowadź liczbę punktów lub -1, aby zakończyć: ");
     points = keyboard.nextInt();

     // Sumowanie   punktów do momentu wprowadzenia -1.
      while (points != -1)
      {
         // Dodawanie points do totalPoints.
       totalPoints += points;

       // Pobieranie następnej liczby punktów.
       System.out.print("Wprowadź liczbę punktów lub -1, aby zakończyć: ");
       points = keyboard.nextInt();
     }

     // Wyświetlanie łącznej liczby punktów.
     System.out.println("Łączna liczba uzyskanych punktów: " +
                         totalPoints);
   }
}
