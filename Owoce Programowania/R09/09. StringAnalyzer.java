import java.util.Scanner;

/**
   Ten program wyświetla liczbę liter,
   cyfr i spacji w łańcuchu znaków.
*/

public class StringAnalyzer
{
   public static void main(String [] args)
   {
      String input;        // Przechowuje dane wejściowe.
      char[] array;        // Tablica na dane wejściowe.
      int letters = 0;     // Liczba liter.
      int digits = 0;      // Liczba cyfr.
      int whitespaces = 0; // Liczba spacji.

      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

      // Wyświetlanie prośby o podanie wiersza danych wejściowych.
      System.out.print("Podaj łańcuch znaków: ");
      input = keyboard.nextLine();

      // Przekształcanie łańcucha znaków na tablicę typu char.
      array = input.toCharArray();

      // Analizowanie znaków.
      for (int i = 0; i < array.length; i++)
      {
         if (Character.isLetter(array[i]))
            letters++;
         else if (Character.isDigit(array[i]))
            digits++;
         else if (Character.isWhitespace(array[i]))
            whitespaces++;
      }

      // Wyświetlanie wyników.
      System.out.println("Liczba liter: " +
                         letters + ", liczba cyfr: " +
                         digits + ", liczba spacji: " +
                         whitespaces + 
                         ".");
   }
}
