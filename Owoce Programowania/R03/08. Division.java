import java.util.Scanner; // Potrzebne do tego, by móc używać klasy Scanner.

/**
   Ten program ilustruje stosowanie instrukcji if-else.
*/

public class Division
{
   public static void main(String[] args)
   {
      double number1, number2; // Operandy dzielenia.
      double quotient;         // Wynik dzielenia.

     // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      // Pobieranie pierwszej liczby.
     System.out.print("Wprowadź liczbę: ");
     number1 = keyboard.nextDouble();

     // Pobieranie drugiej liczby.
     System.out.print("Wprowadź drugą liczbę: ");
      number2 = keyboard.nextDouble();

      if (number2 == 0)
      {
         System.out.println("Dzielenie przez zero nie jest możliwe.");
         System.out.println("Uruchom program ponownie ");
         System.out.println("i wprowadź liczbę różną od zera.");
      }
      else
      {
         quotient = number1 / number2;
         System.out.print("Wynik dzielenia " + number1);
         System.out.print(" przez " + number2);
         System.out.println(" wynosi " + quotient + "."); 
      }
   }
}
