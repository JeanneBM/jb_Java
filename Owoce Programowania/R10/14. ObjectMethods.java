/**
   Ten program ilustruje działanie metod toString i equals
   odziedziczonych po klasie Object.
*/

public class ObjectMethods
{
   public static void main(String[] args)
   {
      // Tworzenie dwóch obiektów.
      PassFailExam exam1 = 
                   new PassFailExam(0, 0, 0);
      PassFailExam exam2 =
                   new PassFailExam(0, 0, 0);

      // Przekazywanie obiektów do metody println 
      // (wywołuje ona metodę toString).
      System.out.println(exam1);
      System.out.println(exam2);

      // Testowanie metody equals.
      if (exam1.equals(exam2))
        System.out.println("Obiekty są takie same.");
      else
        System.out.println("Obiekty nie są takie same.");
   }
}

