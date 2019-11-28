/**
   Ten program wyświetla liczby dopełnione początkowymi zerami.
*/

public class LeadingZeros
{
   public static void main(String[] args)
   {
      // Deklarowanie różnych zmiennych typu double.
      double number1 = 1.234;
      double number2 = 12.345;
      double number3 = 123.456;
      
      // Wyświetlanie każdej zmiennej z początkowymi zerami
      // w polu o szerokości 9 znaków 
      // i z zaokrągleniem do dwóch miejsc po przecinku.
      System.out.printf("%09.2f\n", number1);
      System.out.printf("%09.2f\n", number2);
      System.out.printf("%09.2f\n", number3);
   }
}
