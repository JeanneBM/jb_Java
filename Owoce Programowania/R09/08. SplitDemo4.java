/**
	Ten program ilustruje działanie metody split 
    z klasy String. Używanych jest tu kilka różnych separatorów.
*/

public class SplitDemo4
{
   public static void main(String[] args)
   {
      // Tworzenie łańcucha znaków dzielonego na tokeny.
      String str = "Jacek$Basia%Halina*Marta&Jarek";
      
      // Pobieranie tokenów z użyciem różnych znaków jako separatorów.
      String[] tokens = str.split("[$%*&]");
      
      // Wyświetlanie tokenów.
      for (String s : tokens)
         System.out.println(s);
   }
}
