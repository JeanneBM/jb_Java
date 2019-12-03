/**
	Ten program symuluje rzuty kostkami.
*/

public class SixSidedDiceDemo
{
	public static void main(String[] args)
	{
		final int DICE_SIDES = 6; // Liczba ścianek.
		final int MAX_ROLLS = 5;  // Liczba rzutów.
		
		// Tworzenie dwóch instancji klasy Die.
		Die die1 = new Die(DICE_SIDES);
		Die die2 = new Die(DICE_SIDES);
		
		// Wyświetlanie początkowego stanu kostek.
		System.out.println("Początkowa wartość kostek:");
		System.out.println(die1.getValue() + " " + die2.getValue());
		
		// Rzucanie kostkami pięć razy.
		System.out.println("Program rzuci kostkami " + 
		                   MAX_ROLLS + " razy.");
								 
		for (int i = 0; i < MAX_ROLLS; i++)
		{
			// Rzucanie kostkami.
			die1.roll();
			die2.roll();
			
			// Wyświetlanie wartości kostek.
			System.out.println(die1.getValue() + " " + die2.getValue());
		}
	}
}
