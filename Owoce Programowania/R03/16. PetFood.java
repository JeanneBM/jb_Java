import java.util.Scanner; 

/**
   Ten program ilustruje działanie instrukcji switch.
*/

public class PetFood
{
   public static void main(String[] args)
   {
      String input;     // Przechowywanie danych wejściowych od użytkownika.
     char foodGrade; // Poziom jakości karmy.

      // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      // Prośba do użytkownika o wybór jakości karmy.
     System.out.println("Oferujemy trzy kategorie " +
                        "karmy dla zwierząt:");
     System.out.print("A, B i C. Z której kategorii " +
                      "chcesz poznać ceny? ");
      input = keyboard.nextLine();
      foodGrade = input.charAt(0);

      // Wyświetlanie ceny dla wybranej kategorii. 
      switch(foodGrade)
      {
         case 'a':
         case 'A':
            System.out.println("3 złote za l kg");
            break;
         case 'b':
         case 'B':
            System.out.println("2 złote za l kg");
            break;
         case 'c':
         case 'C':
            System.out.println("1 złoty za l kg");
            break;
         default:
            System.out.println("Błędny wybór.");
      }
   }
}
