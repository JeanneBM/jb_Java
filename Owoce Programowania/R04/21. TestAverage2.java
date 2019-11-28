import java.util.Scanner;

/**
   Ten program ilustruje pracę pętli zagnieżdżonej.
*/

public class TestAverage2
{
   public static void main(String [] args)
   {
      int numStudents,   // Liczba studentów.
          numTests,    // Liczba testów studenta.
          score,         // Wynik testu.
          total;       // Akumulator do sumowania wyników testów.
     double average;  // Średnia wyników testów.

     // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury
     Scanner keyboard = new Scanner(System.in);

     // Pobieranie liczby studentów.
     System.out.print("Podaj liczbę studentów: ");
      numStudents = keyboard.nextInt();

      // Pobieranie liczby wyników testów jednego studenta.
     System.out.print("Podaj liczbę testów zdawanych przez studentów: ");
     numTests = keyboard.nextInt();

     // Przetwarzanie wyników wszystkich studentów.
     for (int student = 1; student <= numStudents; student++)
     {
       total = 0; // Przypisywanie zera do akumulatora.

       // Pobieranie wyników testów studenta.
       System.out.println("Student numer " + student);
         System.out.println("--------------------");
         for (int test = 1; test <= numTests; test++)
         {
            System.out.print("Wprowadź wynik nr " + test + ": ");
         score = keyboard.nextInt();
         total += score; // Dodawanie score do total.
       }

       // Obliczanie i wyświetlanie średniej.
       average = total / numTests;
       System.out.printf("Średnia studenta nr %d wynosi %.1f.\n\n",
                            student, average);
      }
   }
}

