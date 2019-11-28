/**
   Ten program wyświetla różne liczby
    wyrównywane w kolumnach do lewej.
*/

public class LeftJustified
{
   public static void main(String[] args)
   {
      // Deklarowanie różnych zmiennych typu int.
      int num1 = 123;
      int num2 = 12;
      int num3 = 45678;
      int num4 = 456;
      int num5 = 1234567;
      int num6 = 1234;
      
      // Wyświetlanie każdej zmiennej wyrównanej do lewej
     // w polu o szerokości ośmiu znaków.
      System.out.printf("%-8d%-8d\n", num1, num2);
      System.out.printf("%-8d%-8d\n", num3, num4);
      System.out.printf("%-8d%-8d\n", num5, num6);
   }
}
