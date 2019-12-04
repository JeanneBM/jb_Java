/**
	Ten program ilustruje działanie metody split 
    z klasy String. Używanych jest tu kilka różnych separatorów.
*/

public class SplitDemo3
{
   public static void main(String[] args)
   {
      // Tworzenie łańcucha znaków dzielonego na tokeny.
      String str = "joe@gaddisbooks.com";

      // Pobieranie tokenów z użyciem @ i . jako separatorów.
      String[] tokens = str.split("[@.]");

      // Wyświetlanie tokenów.
      for (String s : tokens)
         System.out.println(s);   
   }
}
