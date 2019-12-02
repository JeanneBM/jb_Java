/**
   Ten program ilustruje metodę, która przyjmuje 
   argument w postaci obiektu typu String.
*/

public class ShowStringLength
{
   public static void main(String[] args)
   {
      String name = "Waldek";
      showLength(name);
   }
   
   /**
      Metoda showLength przyjmuje argument w postaci obiektu typu String 
      i wyświetla liczbę znaków w tym obiekcie.
   */
   
   public static void showLength(String str)
   {
        System.out.println(str + " zawiera " + str.length() +
                           " znaków.");
   }
}
