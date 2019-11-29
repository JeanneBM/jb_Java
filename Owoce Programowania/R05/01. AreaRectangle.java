/**
   Uzupełnij ten program, aby
   obliczał i wyświetlał powierzchnię prostokąta. 
*/

// W tym miejscu dodaj potrzebne instrukcje import.

public class AreaRectangle
{
   public static void main(String[] args)
   {
      double length,    // Długość prostokąta.
             width,     // Szerokość prostokąta.
             area;      // Powierzchnia prostokąta.
   
      // Pobieranie długości prostokąta od użytkownika.
      length = getLength();
   
      // Pobieranie szerokości prostokąta od użytkownika.
      width = getWidth();

      // Obliczanie powierzchnik.
      area = getArea(length, width);

      // Wyświetlanie informacji o prostokącie.
      displayData(length, width, area);
   }
}

