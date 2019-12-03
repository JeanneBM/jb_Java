import java.util.ArrayList; 

/**
   Ten program pokazuje, jak zastosować 
   pętlę for dla kolekcji do obiektów typu ArrayList.
*/

public class ArrayListDemo2
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
      for (String name : nameList)
         System.out.println(name);
   }
}
