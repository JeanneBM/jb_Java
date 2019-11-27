/** 
   Ten program pobiera od użytkownika pierwsze imię,
   drugie imię i nazwisko.
*/

import java.io.*;

public class ReadKeyboard
{
   public static void main(String[] args) throws IOException
   {
      String firstName,    // Pierwsze imię użytkownika.
             middleName,   // Drugie imię użytkownika.
             lastName;     // Nazwisko użytkownika.
      
      // Tworzenie obiektów potrzebnych do wczytywania danych wejściowych z klawiatury.
      InputStreamReader reader = 
                     new InputStreamReader(System.in);
      BufferedReader keyboard = 
                     new BufferedReader(reader);
      
      // Pobieranie pierwszego imienia.
      System.out.print("Podaj pierwsze imię: ");
      firstName = keyboard.readLine();
      
      // Pobieranie drugiego imienia.
      System.out.print("Podaj drugie imię: ");
      middleName = keyboard.readLine();

      // Pobieranie nazwiska.
      System.out.print("Podaj nazwisko: ");
      lastName = keyboard.readLine();

      // Wyświetlanie powitania.
      System.out.println("Witaj, " + firstName + " " +
                         middleName + " " + lastName + ".");
   }
}

