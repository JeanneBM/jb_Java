import java.util.Scanner; 

/**
   Ten program ilustruje pętlę for sterowaną przez użytkownika.
*/

public class UserSquares
{
   public static void main(String[] args)
   {
      int number;    // Zmienna sterująca pętli.
      int maxValue;  // Maksymalna wyświetlana wartość.

      System.out.println("Program wyświetla tabelę " +
                         "liczb i ich kwadratów.");

      // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

      // Pobieranie maksymalnej wyświetlanej wartości.
      System.out.print("Do jakiej wartości program ma dojść? ");
      maxValue = keyboard.nextInt();

      // Wyświetlanie tabeli.
      System.out.println("Liczba   Kwadrat liczby");
      System.out.println("-----------------------");
      for (number = 1; number <= maxValue; number++)
      {
         System.out.println(number + "\t\t" + 
                            number * number);
      }
   }
}
