/**
   Ten program ilustruje metodę, która zwraca
   referencję do obiektu typu String.
*/

public class ReturnString
{
   public static void main(String[] args)
   {
      String customerName;
      
      customerName = fullName("Jan", "Matyja");
      System.out.println(customerName);
   }
   
   /**
     Metoda fullName przyjmuje dwa argumenty typu String
     zawierające imię i nazwisko. Metoda łączy
     je w jeden obiekt typu String.
     @param first Imię.
     @param last Nazwisko.
     @return Referencja do obiektu typu String zawierającego
           imię i nazwisko.
   */
   
   public static String fullName(String first, String last)
   {
      String name;
      
      name = first + " " + last;
      return name;
   }
}
