import java.util.Scanner;   

/**
   Ten program ilustruje działanie instrukcji switch.
*/

public class NoBreaks
{
   public static void main(String[] args)
   {
      int number;       // Liczba wprowadzona przez użytkownika.

     // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      // Pobieranie od użytkownika jednej z liczb: 1, 2 lub 3.
     System.out.print("Wpisz 1, 2 lub 3: ");
      number = keyboard.nextInt();

      // Określanie wprowadzonej liczby.
      switch (number)
      {
         case 1:
            System.out.println("Wpisałeś 1.");
         case 2:
            System.out.println("Wpisałeś 2.");
         case 3:
            System.out.println("Wpisałeś 3.");
         default:
            System.out.println("Wartość jest inna niż 1, 2 lub 3!");
      }
   }
}
