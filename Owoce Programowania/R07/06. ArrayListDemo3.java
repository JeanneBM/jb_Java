import java.util.ArrayList; 

/**
   Ten program ilustruje działanie obiektu typu ArrayList.
*/

public class ArrayListDemo3
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu ArrayList do przechowywania imion.
      ArrayList<String> nameList = new ArrayList<String>();
      
      // Dodawanie imion do obiektu typu ArrayList.
      nameList.add("Jacek");
      nameList.add("Celina");
      nameList.add("Borys");

      // Wyświetlanie elementów z obiektu nameList i ich indeksów.
      for (int index = 0; index < nameList.size(); index++)
      {
         System.out.println("Indeks: " + index + " Imię: " +
                            nameList.get(index));
      }
      
      // Usuwanie elementu o indeksie 1.
      nameList.remove(1);

      System.out.println("Usunięto element o indeksie 1. " +
                         "Teraz dostępne są następujące elementy.");

      // Wyświetlanie elementów z obiektu nameList i ich indeksów.
      for (int index = 0; index < nameList.size(); index++)
      {
         System.out.println("Indeks: " + index + " Imię: " +
                            nameList.get(index));
      }
   }
}
