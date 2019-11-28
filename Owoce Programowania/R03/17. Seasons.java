import java.util.Scanner;

/**
   Ten program tłumaczy nazwy pór roku
   z polskiego na hiszpański.
*/
 
public class Seasons
{
   public static void main(String[] args)
   {
      String input;
      
      // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
     Scanner keyboard = new Scanner(System.in);

     // Pobieranie nazwy pory roku od użytkownika.
     System.out.print("Wpisz nazwę pory roku: ");
     input = keyboard.nextLine();

     // Tłumaczenie nazwy pory roku na hiszpański.
      switch (input)
      {
         case "wiosna":
            System.out.println("la primavera");
            break;
         case "lato":
            System.out.println("el verano");
            break;         
         case "jesien":
		 
            System.out.println("el otono");
            break;
         case "zima":
            System.out.println("el invierno");
            break;
         default:
            System.out.println("Wpisz jedno z następujących słów:\n"+
                               "wiosna, lato, jesien lub zima.");
      }
   }
}
