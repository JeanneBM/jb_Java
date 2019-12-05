public class SubClass3 extends SuperClass3
{
   /**
      Ta metoda przesłania jedną z metod klasy bazowej.
      @param arg Liczba całkowita.
   */

   @Override
   public void showValue(int arg)
   {
      System.out.println("KLASA POCHODNA: " +
                        "Argument typu int to: " + arg);
   }

   /**
     Ta metoda przeciąża metody z klasy bazowej.
     @param arg Liczba zmiennoprzecinkowa.
   */

   public void showValue(double arg)
   {
      System.out.println("KLASA POCHODNA: " +
                         "Argument typu double: " + arg);
   }
}
