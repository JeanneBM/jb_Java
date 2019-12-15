import java.util.Scanner;

/**
   Ten program ilustruje rekurencyjną metodę obliczania NWD.
*/

public class GCDdemo
{ 
   public static void main(String[] args)
   {
      int num1, num2; // Dwie liczby, dla których obliczany jest NWD.

      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

      // Pobieranie pierwszej liczby od użytkownika.
      System.out.print("Podaj liczbę całkowitą: ");
      num1 = keyboard.nextInt();
      
      // Pobieranie drugiej liczby od użytkownika.
      System.out.print("Podaj inną liczbę całkowitą: ");
      num2 = keyboard.nextInt();

      // Wyświetlanie NWD.
      System.out.println("Największy wspólny dzielnik " +
                         "tych dwóch liczb to " +
                         gcd(num1, num2) + ".");
   }

   /**
      Metoda gcd oblicza największy wspólny dzielnik
      argumentów przekazanych do parametrów x i y.
      @param x Liczba.
      @param y Inna liczba.
      @returns Największy wspólny dzielnik liczb x i y.
   */
   
   public static int gcd(int x, int y)
   {
      if (x % y == 0)
         return y;
      else
         return gcd(y, x % y);
   }
}
