/**
   Ten program pokazuje, że klasa Die 
   zgłasza wyjątek, gdy do konstruktora 
   przekazywana jest nieprawidłowa wartość.
*/

public class DiceExceptionDemo
{
   public static void main(String[] args)
   {
      final int DIE_SIDES = 1;  // Liczba ścianek.

      // Tworzenie instancji klasy Die.
      Die die = new Die(DIE_SIDES);

      System.out.println("Początkowa liczba oczek:");
      System.out.println(die.getValue());
   }
}
