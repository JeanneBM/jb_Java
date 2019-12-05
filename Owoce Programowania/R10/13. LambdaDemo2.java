/**
   Ten program ilustruje działanie wyrażenia lambda
   używającego zmiennej lokalnej z modyfikatorem final.
*/

import java.util.Scanner;

public class LambdaDemo2
{
   public static void main(String[] args)
   {
      final int factor = 10;
      int num;
      
     // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
     Scanner keyboard = new Scanner(System.in);

     // Tworzenie obiektu z implementacją interfejsu IntCalculator.
     IntCalculator multiplier = x -> x * factor;

     // Pobieranie liczby od użytkownika.
     System.out.print("Podaj liczbę całkowitą: ");
     num = keyboard.nextInt();

     // Wyświetlanie liczby pomnożonej przez 10.
     System.out.println("Po pomnożeniu przez 10 wartość liczby wynosi " + 
                         multiplier.calculate(num));      
   }
}

