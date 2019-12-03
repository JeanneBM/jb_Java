import java.util.Scanner;

/**
   Ten program przeprowadza prosty
    test klasy CellPhone.
*/

public class CellPhoneTest
{
   public static void main(String[] args)
   {
      String testMan;   // Przechowywanie nazwy producenta.
     String testMod;   // Przechowywanie numeru modelu.
     double testPrice; // Przechowywanie ceny.

     // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      // Pobieranie nazwy producenta.
      System.out.print("Podaj nazwę producenta: ");
      testMan = keyboard.nextLine();
      
      // Pobieranie numeru modelu.
      System.out.print("Podaj numer modelu: ");
      testMod = keyboard.nextLine();

      // Pobieranie ceny detalicznej.
      System.out.print("Podaj cenę detaliczną: ");
      testPrice = keyboard.nextDouble();
      
     // Tworzenie instancji klasy CellPhone 
     // z użyciem danych przekazanych jako
     // argumenty do konstruktora.
     CellPhone phone = new CellPhone(testMan, testMod, testPrice);

     // Pobieranie danych o telefonie i ich wyświetlanie.
     System.out.println();
     System.out.println("Oto wprowadzone dane:");
     System.out.println("Producent: " + phone.getManufact());
     System.out.println("Numer modelu: " + phone.getModel());
     System.out.println("Cena detaliczna: " + phone.getRetailPrice());
   }
}
