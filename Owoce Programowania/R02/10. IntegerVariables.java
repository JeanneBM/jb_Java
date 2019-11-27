// W tym programie znajdują się zmienne kilku typów całkowitoliczbowych.

public class IntegerVariables
{
   public static void main(String[] args)
   {  
      int checking;  // Deklaracja zmiennej checking typu int.
      byte miles;    // Deklaracja zmiennej miles typu byte.
      short minutes; // Deklaracja zmiennej minutes typu short.
      long days;     // Deklaracja zmiennej days typu long.

      checking = -20;
      miles = 105;
      minutes = 120;
      days = 185000;
     System.out.println("Odbyliśmy podróż o długości " + miles +
                        " mil.");
     System.out.println("Zajęło to nam " + minutes + " minut.");
     System.out.println("Stan naszego konta w złotych wynosi " + checking + ".");
     System.out.println("Około " + days + " dni temu w tym miejscu " +
                        "stał Kolumb.");

   }
}

