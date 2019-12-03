/**
   Ten program ilustruje metodę zwracającą wartość.
*/

public class ValueReturn
{
   public static void main(String[] args)
   {
      int total, value1 = 20, value2 = 40;
      
      // Wywołanie metody sum. Jako jej argumenty przekazywana
      // jest wartość zmiennych value1 i value2. Zwracana wartość
      // jest przypisywana do zmiennej total.
      total = sum(value1, value2);

      // Wyświetlanie zawartości zmiennych.
      System.out.println("Suma liczb " + value1 +
                         " i " + value2 + " wynosi " +
                         total + ".");
   }
   
   /**
      Metoda sum zwraca sumę dwóch parametrów.
      @param num1 Pierwsza z dodawanych liczb.
      @param num2 Druga z dodawanych liczb.
      @return Suma parametrów num1 i num2.
   */
   
   public static int sum(int num1, int num2)
   {
      int result;  // result to zmienna lokalna.

      // Przypisywanie wyniku działania num1 + num2 do zmiennej result.
      result = num1 + num2;

      // Zwracanie wartości ze zmiennej result.
      return result;
   }  
}
