import java.util.Scanner; 

/**
   Ten program zapisuje w tablicy liczbę godzin przepracowanych
   przez pięciu pracowników mających tę samą stawkę godzinową.
*/

public class PayArray
{
   public static void main(String[] args)
   {
      final int EMPLOYEES = 5;  // Liczba pracowników.
      double payRate;           // Stawka godzinowa.
      double grossPay;          // Pensja brutto.

      // Tworzenie tablicy do przechowywania liczby przepracowanych godzin.
      int[] hours = new int[EMPLOYEES];

      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

      // Pobieranie liczby godzin przepracowanych przez każdego pracownika.
      System.out.println("Podaj liczbę godzin przepracowanych przez " +
                         EMPLOYEES + " pracowników mających " +
                         "tę samą stawkę godzinową.");

      for (int index = 0; index < EMPLOYEES; index++)
      {
         System.out.print( "Pracownik numer " + (index + 1) + ": ");
         hours[index] = keyboard.nextInt();
      }

      // Pobieranie stawki godzinowej.
      System.out.print("Podaj stawkę godzinową wszystkich pracowników: ");
      payRate = keyboard.nextDouble();

      // Wyświetlanie pensji brutto każdego pracownika.
      System.out.println( "Pensje brutto wszystkich pracowników:");
      for (int index = 0; index < EMPLOYEES; index++)
      {
         grossPay = hours[index] * payRate;
         System.out.println("Pracownik numer " + (index + 1) +
                            ": " + grossPay + " złotych.");
      }
   }
}
