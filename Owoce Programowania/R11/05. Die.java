import java.util.Random;

// /**
   // Klasa Die symuluje kostkę do gry.
// */

// public class Die
// {
   // private final int MIN_SIDES = 4;
   // private int sides;   // Liczba ścianek.
   // private int value; // Wyrzucona wartość.

   // /**
     // Konstruktor wykonuje wstępny
     // rzut kostką.
     // @param numSides Liczba ścianek danej kostki.
   // */
   
   // public Die(int numSides)
   // {
      Sprawdzanie, czy liczba ścianek jest poprawna.
     // if (numSides < MIN_SIDES)
     // {
       // throw new IllegalArgumentException(
         // "Minimalna liczba ścianek to " +
         // MIN_SIDES + ".");
     // }

     Zapisywanie liczby ścianek i wykonywanie rzutu.
      // sides = numSides;
      // roll();
   // }
   
   // /**
      // Metoda roll symuluje rzut
      // kostką.
   // */
   
   // public void roll()
   // {
      Tworzenie obiektu typu Random.
      // Random rand = new Random();

      Pobieranie losowej wartości rzutu.
      // value = rand.nextInt(sides) + 1;
   // }
   
   // /**
      // Metoda getSides.
      // @return Liczba ścianek danej kostki.
   // */
   
   // public int getSides()
   // {
      // return sides;
   // }
   
   // /**
      // Metoda getValue.
      // @return Liczba wyrzuconych oczek.
   // */
   
   // public int getValue()
   // {
      // return value;
   // }
// }

