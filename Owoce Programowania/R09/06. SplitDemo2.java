/**
	Ten program ilustruje działanie metody split 
   z klasy String. Używane są tu separatory wieloznakowe.
*/

public class SplitDemo2
{
   public static void main(String[] args)
   {
      // Tworzenie łańcucha znaków dzielonego na tokeny.
      String str = "jeden i dwa i trzy i cztery";

      // Pobieranie tokenów z użyciem " i " jako separatora.
      String[] tokens = str.split(" i ");

      // Wyświetlanie tokenów.
      for (String s : tokens)
         System.out.println(s);
   }
}
