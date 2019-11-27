//  Ten program ilustruje używanie kilku metod klasy String.

public class StringMethods
{
   public static void main(String[] args)
   {
      String message = "Java to świetna zabawa!";
      String upper = message.toUpperCase();
      String lower = message.toLowerCase();
      char letter = message.charAt(2);
      int stringSize = message.length();

      System.out.println(message);
      System.out.println(upper);
      System.out.println(lower);
      System.out.println(letter);
      System.out.println(stringSize);
   }
}


