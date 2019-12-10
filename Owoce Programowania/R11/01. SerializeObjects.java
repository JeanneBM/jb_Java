import java.io.*;
import java.util.Scanner;

/**
   Ten program serializuje elementy tablicy
   obiektów typu BankAccount2.
*/

public class SerializeObjects
{
   public static void main(String[] args)
                      throws IOException
   {
      double balance;            // Stan konta.
      final int NUM_ITEMS = 3; // Liczba kont.

      // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
      Scanner keyboard = new Scanner(System.in);
            
      // Tworzenie tablicy elementów typu BankAccount2.
      BankAccount2[] accounts =
                    new BankAccount2[NUM_ITEMS];
      
      // Zapełnianie tablicy.
     for (int i = 0; i < accounts.length; i++)
     {
       // Pobieranie stanu konta.
       System.out.print("Podaj stan konta " +
                        "numer " + (i + 1) + ": ");
       balance = keyboard.nextDouble();

       // Tworzenie obiektu w tablicy.
         accounts[i] = new BankAccount2(balance);
      }
      
      // Tworzenie obiektów strumieni.
      FileOutputStream outStream = 
                new FileOutputStream("Objects.dat");
      ObjectOutputStream objectOutputFile = 
                new ObjectOutputStream(outStream);
      
      // Zapisywanie zserializowanych obiektów w pliku.
      for (int i = 0; i < accounts.length; i++)
      {
         objectOutputFile.writeObject(accounts[i]);
      }
      
      // Zamykanie pliku.
      objectOutputFile.close();

      System.out.println("Zserializowane obiekty " +
           "zostały zapisane w pliku Objects.dat.");
   }
}
