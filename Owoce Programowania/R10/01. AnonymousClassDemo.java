/**
   Ten program ilustruje anonimową klasę wewnętrzną.
*/

import java.util.Scanner;

public class AnonymousClassDemo
{
   public static void main(String[] args)
   {
      int num;
      
      // Tworzenie obiektu typu Scanner do pobierania danych wejściowych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

      // Tworzenie obiektu z implementacją interfejsu IntCalculator.
      IntCalculator square = new IntCalculator() {
         public int calculate(int number)
         {
            return number * number;
         }};

      // Pobieranie liczby od użytkownika.
      System.out.print("Podaj liczbę całkowitą: ");
      num = keyboard.nextInt();

      // Wyświetlanie kwadratu podanej liczby.
      System.out.println("Kwadrat wynosi " + square.calculate(num));     
   }
}
