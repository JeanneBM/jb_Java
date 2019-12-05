/**
   Ten program ilustruje proste
   wyrażenie lambda.
*/

import java.util.Scanner;

public class LambdaDemo
{
   public static void main(String[] args)
   {
      int num;
      
      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      // Tworzenie obiektu z implementacją interfejsu IntCalculator.
      IntCalculator square = x -> x * x;

      // Pobieranie liczby od użytkownika.
      System.out.print("Podaj liczbę całkowitą: ");
      num = keyboard.nextInt();

      // Wyświetlanie kwadratu argumentu.
      System.out.println("Kwadrat wynosi " + square.calculate(num));
   }
}

