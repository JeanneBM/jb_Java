import java.util.Scanner; // Potrzebne, by móc używać klasy Scanner.
import java.util.Random;   // Potrzebne, by móc używać klasy Random.

/**
   Ten program ilustruje używanie klasy Random.
*/

public class MathTutor
{
   public static void main(String[] args)
   {
      int number1;      // Liczba.
     int number2;     // Inna liczba.
     int sum;         // Suma liczb.
     int userAnswer;  // Odpowiedź użytkownika.

     // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
     Scanner keyboard = new Scanner(System.in);

     // Tworzenie obiektu klasy Random.
      Random randomNumbers = new Random();

      // Pobieranie dwóch liczb losowych.
      number1 = randomNumbers.nextInt(100);
      number2 = randomNumbers.nextInt(100);

      // Wyświetlanie zadania z zakresu dodawania.
     System.out.println("Podaj odpowiedź do następującego " +
                        "zadania:");
      System.out.print(number1 + " + " +
                       number2 + " = ? ");

      // Obliczanie odpowiedzi.
      sum = number1 + number2;

      // Pobieranie odpowiedzi od użytkownika.
      userAnswer = keyboard.nextInt();

      // Informowanie, czy użytkownik odpowiedział poprawnie.
     if (userAnswer == sum)
       System.out.println("Poprawna odpowiedź!");
     else
     {
       System.out.println("Niestety błędna  odpowiedź. " +
                          "Poprawna odpowiedź to " + 
                          sum + ".");
      }
   }
}
