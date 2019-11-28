import java.util.Scanner;

/*
  Ten program ilustruje działanie logicznego operatora ||.
*/

public class LogicalOr
{
   public static void main(String[] args)
   {
      double salary;       // Roczne wynagrodzenie.
     double yearsOnJob; // Lata w obecnej pracy.

     // Tworzenie obiektu klasy Scanner do wczytywania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

     // Pobieranie rocznego wynagrodzenia.
     System.out.print("Wprowadź roczne wynagrodzenie: ");
      salary = keyboard.nextDouble();

      // Pobieranie liczby lat w obecnej pracy.
     System.out.print("Wprowadź liczbę lat " +
                      "w obecnej pracy: ");
      yearsOnJob = keyboard.nextDouble();

      // Określanie, czy użytkownik spełnia warunki otrzymania pożyczki.
      if (salary >= 50000 || yearsOnJob >= 2)
      {
          System.out.println("Spełniasz warunki uzyskania pożyczki.");
      }
      else
      {
         System.out.println("Pożyczka nie zostanie przyznana.");
      }
   }
}
