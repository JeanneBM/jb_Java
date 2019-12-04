import java.util.Scanner;

/**
   Ten program ilustruje działanie 
   metody toUpperCase klasy Character.
*/

public class CircleArea
{
   public static void main(String[] args)
   {
      double radius; // Promień koła.
      double area;   // Powierzchnia koła.
      String input;  // Przechowuje wiersz danych wejściowych.
      char choice;   // Przechowuje jeden znak.

      // Tworzenie obiektu typu Scanner do wczytywania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      do
      {
         // Pobieranie promienia koła.
         System.out.print("Podaj promień koła: ");
         radius = keyboard.nextDouble();

         // Pobieranie pozostawionego znaku nowego wiersza.
         keyboard.nextLine();

         // Obliczanie i wyświetlanie powierzchni.
         area = Math.PI * radius * radius;
         System.out.printf("Powierzchnia wynosi %.2f.\n", area);

         // Powtarzanie operacji?
         System.out.print("Chcesz powtórzyć " +
                          "operacje? (T lub N) ");
         input = keyboard.nextLine();
         choice = input.charAt(0);

      } while (Character.toUpperCase(choice) == 'T');
   }
}
