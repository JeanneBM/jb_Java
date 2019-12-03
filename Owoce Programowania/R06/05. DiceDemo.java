/**
   Ten program symuluje rzut kostką.
*/

public class DiceDemo
{
   public static void main(String[] args)
   {
      final int DIE1_SIDES = 6;  // Liczba ścianek kostki nr 1.
      final int DIE2_SIDES = 12;  // Liczba ścianek kostki nr 2.
      final int MAX_ROLLS = 5;    // Liczba rzutów.

      // Tworzenie dwóch instancji klasy Die.
      Die die1 = new Die(DIE1_SIDES);
      Die die2 = new Die(DIE2_SIDES);
      
      // Wyświetlanie początkowego stanu kostek.
      System.out.println("Symulowanie rzutów kostkami o " +
                         DIE1_SIDES + " i " +
                         DIE2_SIDES + " ściankach.");

      System.out.println("Początkowe wartości kostek:");
      System.out.println(die1.getValue() + " " + die2.getValue());
      
      // Pięć rzutów kostką.
      System.out.println("Liczba rzutów kostkami: " + MAX_ROLLS + ".");
                         
      for (int i = 0; i < MAX_ROLLS; i++)
      {
         // Rzut kostkami.
         die1.roll();
         die2.roll();
         
         // Wyświetlanie wyrzuconych wartości.
         System.out.println(die1.getValue() + " " + die2.getValue());
      }
   }
}
