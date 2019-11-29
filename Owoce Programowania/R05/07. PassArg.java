/**
   Ten program ilustruje metodę z parametrami.
*/

public class PassArg
{
   public static void main(String[] args)
   {
      int x = 10;

      System.out.println("Przekazywanie wartości do metody displayValue.");
      displayValue(5);                       // Przekazywanie 5.
      displayValue(x);                        // Przekazywanie 10.
      displayValue(x * 4);                    // Przekazywanie 40.
      displayValue(Integer.parseInt("700"));  // Przekazywanie 700.
      System.out.println("To wszystko!");
   }
   
   /**
      Metoda displayValue wyświetla wartość jej
      całkowitoliczbowego parametru.
   */
   
   public static void displayValue(int num)
   {
      System.out.println("Wartość to " + num + ".");
   }
}
