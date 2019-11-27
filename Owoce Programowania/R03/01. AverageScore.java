import java.util.Scanner;

/*
  Ten program ilustruje działanie instrukcji if. 
*/

public class AverageScore 
{
   public static void main(String[] args)
   {
      double score1, // Wynik nr 1.
            score2,  // Wynik nr 2.
            score3,  // Wynik nr 3.
            average; // Średni wynik.

      // Tworzenie obiektu klasy Scanner do wczytywania danych wejściowych.
     Scanner keyboard = new Scanner(System.in);

     System.out.println("Ten program oblicza średnią wyników trzech testów.");
      
      // Pobieranie pierwszego wyniku.
     System.out.print("Wprowadź wynik nr 1: ");
     score1 = keyboard.nextDouble();

     // Pobieranie drugiego wyniku.
     System.out.print("Wprowadź wynik nr 2: ");
      score2 = keyboard.nextDouble ();
      
      // Pobieranie trzeciego wyniku.
     System.out.print("Wprowadź wynik nr 3: ");
     score3 = keyboard.nextDouble ();

     // Obliczanie i wyświetlanie średniego wyniku.
     average = (score1 + score2 + score3) / 3.0;
     System.out.println("Średnia wynosi " + average + "."); 
      
      // Jeśli średnia przekracza 95, należy pogratulować użytkownikowi.
     if (average > 95)
       System.out.println("To świetny wynik!");
   }
} 

