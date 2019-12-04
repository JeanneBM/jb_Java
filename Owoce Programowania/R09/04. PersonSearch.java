import java.util.Scanner;

/**
   Ten program używa metody startsWith do
   wyszukiwania podłańcuchów.
*/

public class PersonSearch
{
   public static void main(String[] args)
   {
      String lookUp;  // Przechowuje szukany łańcuch znaków.

      // Tworzenie tablicy imion i nazwisk.
      String[] people = { "Cywka, Waldemar", "Dymek, Grzegorz",
                          "Dymek, Joanna", "Rabin, Piotr",
                          "Rasiak, Celina", "Sagan, Cezary",
                          "Surynt, Halina", "Szwoch, Borys",
                          "Szwoch, Chrystian", "Wilk, Jacek" };
 
      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      // Pobieranie fragmentu szukanego nazwiska.
      System.out.print("Podaj kilka pierwszych liter " +
                       "szukanego nazwiska: ");
      lookUp = keyboard.nextLine();

      // Wyświetlanie wszystkich nazwisk rozpoczynających się
      // od łańcucha podanego przez użytkownika.
      System.out.println("Oto pasujące nazwiska:");
      for (String person : people)
      {
         if (person.startsWith(lookUp))
            System.out.println(person);
      }
   }
}
