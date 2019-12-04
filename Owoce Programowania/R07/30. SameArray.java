/**
   Ten program ilustruje dwie zmienne
   wskazujące tę samą tablicę.
*/

public class SameArray
{
   public static void main(String[] args)
   {
      int[] array1 = { 2, 4, 6, 8, 10 };
      int[] array2 = array1;

      // Modyfikowanie jednego elementu za pomocą zmiennej array1.
      array1[0] = 200;

      // Modyfikowanie jednego z elementów za pomocą tablicy array2.
      array2[4] = 1000;

      // Wyświetlanie wszystkich elementów za pomocą tablicy array1.
      System.out.println("Zawartość tablicy powiązanej ze zmienną array1:");
      for (int value : array1)
         System.out.print(value + " ");
      System.out.println();

      // Wyświetlanie wszystkich elementów za pomocą zmiennej array2.
      System.out.println("Zawartość tablicy powiązanej ze zmienną array2:");
      for (int value : array2)
         System.out.print(value + " ");
      System.out.println();
   }
}


