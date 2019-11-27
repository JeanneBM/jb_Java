import java.util.Scanner;  // Potrzebne, by móc używać klasy Scanner.

/**
   Ten program ilustruje stosowanie klasy Scanner.
*/

public class Payroll
{
   public static void main(String[] args)
   {
     String name; // Przechowywanie nazwiska.
     int hours; // Przepracowane godziny.
     double payRate; // Stawka godzinowa.
     double grossPay; // Pensja brutto.
      
      // Tworzenie obiektu typu Scanner do wczytywania danych wyjściowych.
      Scanner keyboard = new Scanner(System.in);
      
     // Pobieranie nazwiska użytkownika.
     System.out.print("Jak się nazywasz? ");
      name = keyboard.nextLine();
      
     // Pobieranie liczby godzin przepracowanych w tym tygodniu.
     System.out.print("Ile godzin przepracowałeś w tym tygodniu? ");
      hours = keyboard.nextInt();
      
     // Pobieranie stawki godzinowej użytkownika.
     System.out.print("Ile wynosi stawka godzinowa? ");
      payRate = keyboard.nextDouble();
      
      // Obliczanie pensji brutto.
      grossPay = hours * payRate;
      
     // Wyświetlanie wynikowych informacji.
     System.out.println("Witaj, " + name + ".");
     System.out.println("Twoja pensja brutto wynosi " + grossPay + "złotych.");
   }
}

