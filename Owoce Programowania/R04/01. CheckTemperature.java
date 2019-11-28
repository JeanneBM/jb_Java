import java.util.Scanner;

/**
   Ten program wspomaga technika w procesie 
   sprawdzania temperatury substancji.
*/
public class CheckTemperature
{
   public static void main(String[] args)
   {
      final double MAX_TEMP = 102.5;  // Temperatura maksymalna.
     double temperature;            // Przechowywanie temperatury.

     // Tworzenie obiektu klasy Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
      
      // Pobieranie aktualnej temperatury.
     System.out.print("Podaj temperaturę substancji w stopniach Celsjusza: ");
      temperature = keyboard.nextDouble();
      
      // Jak długo to potrzebne, należy instruować 
     // technika, aby dostosowywał temperaturę.
      while (temperature > MAX_TEMP)
      {
         System.out.println("Temperatura jest  za wysoka. Przykręć");
       System.out.println("termostat i odczekaj pięć minut.");
       System.out.println("Następnie ponownie sprawdź temperaturę");
       System.out.print("i podaj ją: ");
         temperature = keyboard.nextDouble();
      }
      
      // Przypominanie technikowi o ponownym
     // sprawdzeniu temperatury za 15 minut.
     System.out.println("Temperatura jest akceptowalna.");
     System.out.println("Należy ją ponownie sprawdzić za 15 minut.");
   }
}

