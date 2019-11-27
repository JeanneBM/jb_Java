import java.util.Scanner;  // Potrzebne do użytkowania klasy Scanner.

/*
   W tym programie występuje problem z wczytywaniem danych wejściowych.
*/

public class InputProblem
{
   public static void main(String[] args)
   {
      String name;   // Przechowywanie nazwy użytkownika.
      int age;       // Przechowywanie wieku użytkownika.
      double income; // Przechowywanie dochodu użytkownika.
      
      // Tworzenie obiektu klasy Scanner do wczytywania danych wejściowych.
      Scanner keyboard = new Scanner(System.in);
      
      // Pobieranie wieku użytkownika.
      System.out.print("Ile masz lat? ");
      age = keyboard.nextInt();
      
      // Pobieranie dochodu użytkownika
      System.out.print("Ile wynosi Twój roczny dochód? ");
      income = keyboard.nextDouble();
      
      // Ile wynosi Twój roczny dochód
      System.out.print("Jak się nazywasz? ");
      name = keyboard.nextLine();
      
      // Wyświetlanie informacji użytkownikowi.
      System.out.println("Witaj, " + name + ". Twój wiek to " +
                         age + ", a Twój dochód wynosi " +
                         income + " złotych.");
   }
}

