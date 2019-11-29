/**
   Ten program pokazuje, że do metody jest 
   przekazywana tylko kopia argumentu.
*/

public class PassByValue
{
   public static void main(String[] args)
   {
      int number = 99; // Początkowa wartość zmiennej number to 99.
 
      // Wyświetlanie wartości zmiennej number.
      System.out.println("Wartość zmiennej number to " + number + ".");
 
      // Wywołanie metody changeMe; jako argument przekazywana jest
      // wartość zmiennej number.
      changeMe(number);
      
      // Ponowne wyświetlanie wartości zmiennej number.
      System.out.println("Wartość zmiennej number to " + number + ".");
   }
   
   /**
      Metoda changeMe przyjmuje argument, a następnie
      zmienia wartość parametru.
   */
   
   public static void changeMe(int myValue)
   {
      System.out.println("Zmieniam wartość.");

      // Zmiana wartości parametru myValue na 0.
      myValue = 0;
 
      // Wyświetlanie wartości zmiennej myValue.
      System.out.println("Teraz wartość wynosi " + myValue + ".");
   }
}
