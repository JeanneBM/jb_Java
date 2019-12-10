import java.io.*;

/**
   Ten program deserializuje obiekty z 
   pliku Objects.dat i zapisuje je w tablicy.                    
*/

public class DeserializeObjects
{
   public static void main(String[] args)
                      throws Exception
   {
      double balance;            // Stan konta.
      final int NUM_ITEMS = 3; // Liczba kont.

      // Tworzenie obiektów strumieni.
      FileInputStream inStream = 
                 new FileInputStream("Objects.dat");
      ObjectInputStream objectInputFile = 
                 new ObjectInputStream(inStream);

      // Tworzenie tablicy typu BankAccount2.
      BankAccount2[] accounts =
                    new BankAccount2[NUM_ITEMS];
      
      // Wczytywanie zserializowanych obiektów z pliku.
      for (int i = 0; i < accounts.length; i++)
      {
         accounts[i] =
           (BankAccount2) objectInputFile.readObject();
      }
      
      // Zamykanie pliku.
      objectInputFile.close();
      
      // Wyświetlanie obiektów.
     for (int i = 0; i < accounts.length; i++)
     {
       System.out.println("Konto numer " + (i + 1) +
             ": " + accounts[i].getBalance());
      }
   }
}
