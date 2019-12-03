import java.util.Scanner; 

/**
   Ten program pokazuje, w jaki sposób użytkownik 
   może określić wielkość tablicy.
*/

public class DisplayTestScores
{
   public static void main(String[] args)
   {
      int numTests;     // Liczba testów.
      int[] tests;   // Tablica z wynikami testów.

      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

      // Pobieranie liczby wyników testów.
      System.out.print("Ile testów przeprowadzono? ");
      numTests = keyboard.nextInt();

      // Tworzenie tablicy przechowującej podaną liczbę testów.
      tests = new int[numTests];

      // Pobieranie wyników poszczególnych testów.
      for (int index = 0; index < tests.length; index++)
      {
         System.out.print("Podaj wynik testu numer " +
                          (index + 1) + ": ");
         tests[index] = keyboard.nextInt();
      }

      // Wyświetlanie wyników testów.
      System.out.println();
      System.out.println("Oto wprowadzone wyniki testów:");
      for (int index = 0; index < tests.length; index++)
         System.out.print(tests[index] + " ");
   }
}
