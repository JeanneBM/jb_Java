import java.util.Scanner;

/**
   Ten program ilustruje porównywanie łańcuchów bez uwzględniania wielkości znaków.
*/

public class SecretWord
{
   public static void main(String[] args)
   {
      String input;     // Przechowywanie danych wejś  ciowych od użytkownika.

     // Tworzenie obiektu typu Scanner na dane wprowadzane z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      // Proszenie użytkownika o wpisanie tajnego słowa.
     System.out.print("Wprowadź tajne słowo: ");
      input = keyboard.nextLine();

      // Sprawdzanie, czy użytkownik wpisał tajne słowo.
      if (input.equalsIgnoreCase("PROSPERO"))
      {
         System.out.println("Gratulacje! Znasz " +
                          "tajne słowo!");
     }
     else
     {
       System.out.println("Niestety to  NIE jest " +
                          "tajne słowo!");
      }
   }
}
