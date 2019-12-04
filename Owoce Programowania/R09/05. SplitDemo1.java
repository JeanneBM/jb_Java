/**
   Ten program ilustruje działanie metody split 
   z klasy String.
*/

public class SplitDemo1
{
   public static void main(String[] args)
   {
      // Tworzenie łańcucha znaków dzielonego na tokeny.
      String str = "jeden dwa trzy cztery";

      // Pobieranie tokenów z użyciem separatora w postaci spacji.
      String[] tokens = str.split(" ");

      // Wyświetlanie tokenów.
      for (String s : tokens)
         System.out.println(s);
   }
}
