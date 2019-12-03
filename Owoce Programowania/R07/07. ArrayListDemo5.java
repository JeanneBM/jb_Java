import java.util.ArrayList;

/**
   Ten program ilustruje zastępowanie elementów.
*/

public class ArrayListDemo5
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
      
      // Zastępowanie elementu o indeksie 1.
      nameList.set(1, "Jolanta");
      
      System.out.println("Imię Celina zostało zastąpione imieniem Jolanta. " +
                         "Teraz dostępne są następujące elementy.");
                         
      // Wyświetlanie elementów z obiektu nameList i ich indeksów.
      for (int index = 0; index < nameList.size(); index++)
      {
         System.out.println("Indeks: " + index + " Imię: " +
                            nameList.get(index));
      }
   }
}
