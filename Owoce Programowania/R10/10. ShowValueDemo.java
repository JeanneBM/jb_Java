/**
   Ten program ilustruje działanie metod z klas
   SuperClass3 i SubClass3.
*/

public class ShowValueDemo
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu SubClass3.
     SubClass3 myObject = new SubClass3();

     myObject.showValue(10);      // Przekazywanie wartości typu int.
     myObject.showValue(1.2);     // Przekazywanie wartości typu double.
     myObject.showValue("Witaj"); // Przekazywanie wartości typu String.
   }
}
