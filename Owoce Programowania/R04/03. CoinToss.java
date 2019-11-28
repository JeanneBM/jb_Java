import java.util.Random;

/**
   Ten program symuluje 10 rzutów monetą.
*/

public class CoinToss
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu Random do generowania liczb losowych.
     Random rand = new Random();

     // Symulowanie rzutów monetą.
		for (int count = 0; count < 10; count++)
		{
			if (rand.nextInt(2) == 0)
				System.out.println("Reszka");
			else
				System.out.println("Orzeł");
		}
	}
}
