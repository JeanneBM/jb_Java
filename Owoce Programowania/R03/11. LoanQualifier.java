import java.util.Scanner;

/*
   Ten program ilustruje zagnieżdżoną instrukcję if.
*/

public class LoanQualifier
{
   public static void main(String[] args)
   {
      double salary;       // Roczne wynagrodzenie.
     double yearsOnJob; // Lata w obecnej pracy.

     // Tworzenie obiektu klasy Scanner do wczytywania danych z klawiatury.
     Scanner keyboard = new Scanner(System.in);

     // Pobieranie rocznego wynagrodzenia.
     System.out.print("Wprowadź roczne wynagrodzenie: ");
      salary = keyboard.nextDouble();

      // Pobieranie liczby lat w obecnej pracy.
     System.out.print("Wprowadź liczbę lat " +
                      "w obecnej pracy: ");
      yearsOnJob = keyboard.nextDouble();

      // Określanie, czy użytkownik spełnia warunki otrzymania pożyczki.
      if (salary >= 50000)
      {
         if (yearsOnJob >= 2)
         {
            System.out.println("Spełniasz warunki uzyskania pożyczki.");
         }
         else
         {
            System.out.println("Musisz być zatrudniony w obecnej " +
                            "pracy przynajmniej od dwóch lat ,  " +
                            "aby uzyskać pożyczkę.");
         }
      }
      else
      {
            System.out.println("Musisz zarabiać przynajmniej " +
                "50 000 złotych rocznie, aby uzyskać pożyczkę.");
      }
   }
}
