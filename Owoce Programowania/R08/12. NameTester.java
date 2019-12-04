/**
   Ten program tworzy obiekt typu FullName, a następnie
   wywołuje metodę getLength tego obiektu przed 
   określeniem wartości pól z referencjami. Powoduje
   to awarię programu.
*/

public class NameTester
{
   public static void main(String[] args)
   {
      int len;  // Przechowywanie długości pełnego imienia i nazwiska.

      // Tworzenie obiektu typu FullName.
      FullName name = new FullName();

      // Pobieranie długości pełnego imienia i nazwiska.
      len = name.getLength();
   }
}
