import java.util.Scanner; 

/**
   Ten program ilustruje przetwarzanie tablicy za pomocą pętli.
*/

public class ArrayDemo2
{
   public static void main(String[] args)
   {
      final int EMPLOYEES = 3;           // Liczba pracowników.
      int[] hours = new int[EMPLOYEES];  // Tablica przepracowanych godzin.

      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Podaj liczbę godzin przepracowanych przez " +
                         EMPLOYEES + " pracowników.");

      // Pobieranie liczby godzin przepracowanych przez każdego pracownika.
      for (int index = 0; index < EMPLOYEES; index++)
      {
         System.out.print("Pracownik numer " + (index + 1) + ": ");
         hours[index] = keyboard.nextInt();
      }

      System.out.println("Wpisana liczba godzin to:");

      // Wyświetlanie podanych wartości.
      for (int index = 0; index < EMPLOYEES; index++)
         System.out.println(hours[index]);
   }
}     
