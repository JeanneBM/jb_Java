public class SuperClass3
{
   /**
      Ta metoda wyświetla liczbę całkowitą.
      @param arg Liczba całkowita.
   */

   public void showValue(int arg)
   {
      System.out.println("KLASA BAZOWA: " +
                         "Argument typu int to: " + arg);
   }

   /**
     Ta metoda wyświetla łańcuch znaków.
     @param arg Łańcuch znaków.
   */

   public void showValue(String arg)
   {
      System.out.println("KLASA BAZOWA: " +
                         "Argument typu String to: " + arg);
   }
}
