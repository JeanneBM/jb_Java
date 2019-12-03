import java.util.Scanner;

/**
   Ten program zapisuje w tablicy liczbę godzin przepracowanych
   przez pięciu pracowników. Każdy z nich ma tę samą stawkę godzinową.
   Nadgodziny są wypłacane, gdy liczba przepracowanych godzin przekracza 40.
*/

public class Overtime
{
   public static void main(String[] args)
   {
      final int EMPLOYEES = 5;  // Liczba pracowników.
      double payRate;           // Stawka godzinowa.
      double grossPay;          // Pensja brutto.
      double overtime;          // Koszt nadgodzin.

      // Tworzenie tablicy do przechowywania liczby przepracowanych godzin.
      int[] hours = new int[EMPLOYEES];

      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

      // Pobieranie liczby godzin przepracowanych przez każdego pracownika.
      System.out.println("Podaj liczbę godzin przepracowanych przez " +
                         EMPLOYEES + " pracowników, z których każdy " +
                         "ma tę samą stawkę godzinową.");

      for (int index = 0; index < EMPLOYEES; index++)
      {
         System.out.print( "Pracownik nr " + (index + 1) + ": ");
         hours[index] = keyboard.nextInt();
      }

      // Pobieranie stawki godzinowej.
      System.out.print("Podaj stawkę godzinową pracowników: ");
      payRate = keyboard.nextDouble();

      // Wyświetlanie pensji brutto każdego pracownika.
      System.out.println( "Pensja brutto każdego pracownika: ");
      for (int index = 0; index < EMPLOYEES; index++)
      {
         if (hours[index] > 40)
         {
            // Obliczanie pensji podstawowej.
            grossPay = 40 * payRate;

            // Obliczanie dodatku za nadgodziny.
            overtime = (hours[index] - 40) * (1.5 * payRate);

            // Sumowanie pensji podstawowej i dodatku za nadgodziny.
            grossPay += overtime;
         }
         else
            grossPay = hours[index] * payRate;

         System.out.println("Pracownik nr " + (index + 1) +
                            ": " + grossPay + " zł.");
      }
   }
}
