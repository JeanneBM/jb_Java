import java.util.Scanner;  // Potrzebne do użytkowania klasy Scanner.

/*
   Ten program poprawnie wczytuje liczbowe i tekstowe dane wejściowe.
*/

public class CorrectedInputProblem
{
   public static void main(String[] args)
   {
      String name;   // Przechowywanie nazwy użytkownika.
      int age;       // Przechowywanie wieku użytkownika.
      double income; // Przechowywanie dochodu użytkownika.
      
      // Tworzenie obiektu klasy Scanner w celu wczytywania danych wejściowych.
      Scanner keyboard = new Scanner(System.in);
      
      // Pobieranie wieku użytkownika.
      System.out.print("Ile masz lat? ");
      age = keyboard.nextInt();
      
      // Pobieranie dochodu użytkownika.
      System.out.print("Ile wynosi Twój roczny dochód? ");
      income = keyboard.nextDouble();
      
      // Pobieranie pozostałego znaku nowego wiersza.
      keyboard.nextLine();
      
      // Pobieranie nazwiska użytkownika.
      System.out.print("Jak się nazywasz? ");
      name = keyboard.nextLine();
      
      // Display the information back to the user.
      System.out.println("Witaj, " + name + ". Twój wiek to " +
                         age + ", a Twój dochód wynosi " +
                         income + " złotych.");
   }
}
