import java.util.Scanner;
import java.util.Random;

/**
   Ten program symuluje rzuty kostkami.
*/

public class RollDice
{
   public static void main(String[] args)
   {
      String again = "t";  // Służy do sterowania pętlą.
     int die1;           // Przechowywanie wartości kostki 1.
     int die2;           // Przechowywanie wartości kostki 2.

     // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      // Tworzenie obiektu typu Random do generowania liczb losowych.
     Random rand = new Random();

     // Symulowanie rzutów kostką.
      while (again.equalsIgnoreCase("t"))
      {
         System.out.println("Rzut kostkami . . . ");
         die1 = rand.nextInt(6) + 1;
         die2 = rand.nextInt(6) + 1;
         System.out.println("Liczba oczek to:");
       System.out.println(die1 + " " + die2);

       System.out.print("Rzucić ponownie (t = tak)? ");
         again = keyboard.nextLine();
      }
   }
}
