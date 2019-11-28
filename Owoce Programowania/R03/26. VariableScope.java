import java.util.Scanner;

/*
   Ten program pokazuje, że zmienne można deklarować 
   w różnych miejscach programu.
*/

public class VariableScope
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu Scanner do wprowadzania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      // Pobieranie imienia użytkownika.
     System.out.print("Wprowadź imię: ");
     String firstName;
     firstName = keyboard.nextLine();

     // Pobieranie nazwiska użytkownika.
     System.out.print("Wprowadź nazwisko: ");
      String lastName;
      lastName = keyboard.nextLine();

      // Wyświetlanie komunikatu.
     System.out.println("Witaj, " + firstName + " " + lastName + "."); 
   }
}
