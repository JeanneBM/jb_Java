import java.util.ArrayList; 

/**
   Ten program ilustruje działanie klasy ArrayList.
*/

public class ArrayListDemo1
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu ArrayList do przechowywania imion.
      ArrayList<String> nameList = new ArrayList<String>();
      
      // Dodawanie imion do obiektu typu ArrayList.
      nameList.add("Jacek");
      nameList.add("Celina");
      nameList.add("Borys");

      // Wyświetlanie wielkości obiektu typu ArrayList.
      System.out.println("W tym obiekcie typu ArrayList zapisano " +
                         nameList.size() +
                         " elementy.");

      // Wyświetlanie elementów z obiektu nameList.
      for (int index = 0; index < nameList.size(); index++)
         System.out.println(nameList.get(index));
   }
}
