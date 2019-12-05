/**
   Student to klasa abstrakcyjna przechowująca
   ogólne dane na temat studenta. Klasy reprezentujące
   studentów konkretnych kierunków dziedziczą po
   tej klasie.
*/

public abstract class Student
{
   private String name;       // Nazwisko studenta.
   private String idNumber;  // Identyfikator studenta.
   private int yearAdmitted; // Rok przyjęcia na studia.

   /**
     Konstruktor ustawia nazwisko,
     identyfikator i rok przyjęcia studenta.
     @param n Nazwisko studenta.
     @param id Identyfikator studenta.
     @param year Rok przyjęcia studenta.
   */

   public Student(String n, String id, int year)
   {
      name = n;
      idNumber = id;
      yearAdmitted = year;
   }

   /**
      Metoda toString zwraca obiekt typu String 
     zawierający dane na temat studenta.
     @return Referencja do obiektu typu String.
   */

   public String toString()
   {
      String str;

      str = "Nazwisko: " + name
           + "\nIdentyfikator: " + idNumber
           + "\nRok przyjęcia: " + yearAdmitted;
     return str;
   }

   /**
     Metoda getRemainingHours to metoda abstrakcyjna.
     Trzeba ją przesłonić w klasach pochodnych.
     @return Liczba godzin zajęć, jakie student musi jeszcze zaliczyć.
   */

   public abstract int getRemainingHours();
}
