import java.util.ArrayList; 

/**
   Ten program ilustruje działanie metody toString klasy ArrayList.
*/

public class ArrayListToString
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu ArrayList przechowującego imiona.
      ArrayList<String> nameList = new ArrayList<String>();
      
      // Dodawanie imion do obiektu typu ArrayList.
      nameList.add("Jacek");
      nameList.add("Celina");
      nameList.add("Borys");
      
      // Wyświetlanie każdego elementu z obiektu nameList.
      System.out.println(nameList);
   }
}
