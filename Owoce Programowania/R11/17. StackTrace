/**
   Ten program ilustruje ślad stosu generowany
   w wyniku zgłoszenia wyjątku.
*/

public class StackTrace
{
   public static void main(String[] args)
   {
      System.out.println("Wywołanie metody myMethod...");
      myMethod();
      System.out.println("Metoda main zakończyła pracę.");
   }

   /**
      Metoda MyMethod.
   */

   public static void myMethod()
   {
      System.out.println("Wywołanie metody produceError...");
      produceError();
      System.out.println("Metoda myMethod zakończyła pracę.");
   }

   /**
      Metoda produceError.
   */

   public static void produceError()
   {
       String str = "abc";

       // Poniższa instrukcja spowoduje błąd.
       System.out.println(str.charAt(3));
       System.out.println("Metoda produceError zakończyła pracę.");
   }
}
