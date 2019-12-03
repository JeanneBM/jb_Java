import java.util.ArrayList; 

/**
   Ten program ilustruje wstawianie elementów.
*/

public class ArrayListDemo4
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu ArrayList do przechowywania imion.
      ArrayList<String> nameList = new ArrayList<String>();
      
      // Dodawanie imion do obiektu typu ArrayList.
      nameList.add("Jacek");
      nameList.add("Celina");
      nameList.add("Borys ");

      // Wyświetlanie elementów z obiektu nameList i ich indeksów.
      for (int index = 0; index < nameList.size(); index++)
      {
         System.out.println("Indeks: " + index + " Imię: " +
                            nameList.get(index));
      }
      
      // Wstawianie elementu o indeksie 1.
      nameList.add(1, "Maria");

      System.out.println("Dodano imię Maria o indeksie 1. " +
                         "Teraz dostępne są następujące elementy.");

      // Wyświetlanie elementów z obiektu nameList i ich indeksów.
      for (int index = 0; index < nameList.size(); index++)
      {
         System.out.println("Indeks: " + index + " Imię: " +
                            nameList.get(index));
      }
   }
}
