import java.util.Scanner;

/**
   Ten program ilustruje przekazywanie argumentów 
   do konstruktora klasy bazowej.
*/

public class CubeDemo
{
   public static void main(String[] args)
   {
      double length;  // Długość prostopadłościanu.
      double width;  // Szerokość prostopadłościanu.
      double height; // Wysokość prostopadłościanu.

      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);

      // Pobieranie długości prostopadłościanu.
      System.out.println("Podaj następujące " +
                         "wymiary prostopadłościanu:");
      System.out.print("Długość: ");
      length = keyboard.nextDouble();
      
      // Pobieranie szerokości prostopadłościanu.
      System.out.print("Szerokość: ");
      width = keyboard.nextDouble();

      // Pobieranie wysokości prostopadłościanu.
      System.out.print("Wysokość: ");
      height = keyboard.nextDouble();

      // Tworzenie prostopadłościanu i przekazywanie
      // jego wymiarów do konstruktora.
      Cube myCube =
             new Cube(length, width, height);

      // Wyświetlanie cech prostopadłościanu.
      System.out.println("Oto cechy" +
                         "prostopadłościanu.");
      System.out.println("Długość: " +
                         myCube.getLength());
      System.out.println("Szerokość: " +
                         myCube.getWidth());
      System.out.println("Wysokość: " +
                         myCube.getHeight());
      System.out.println("Powierzchnia podstawy: " +
                         myCube.getArea());
      System.out.println("Pole całkowite: " +
                         myCube.getSurfaceArea());
      System.out.println("Objętość: " +
                         myCube.getVolume());
   }
}

