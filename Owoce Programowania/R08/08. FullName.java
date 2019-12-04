/**
   Ta klasa przechowuje pierwsze imię, drugie imię i nazwisko.
   Używanie tej klasy nie jest bezpieczne, ponieważ nie zapobiega
   ona operacjom na polach z referencjami o wartości null.
*/

public class FullName
{
   private String lastName;   // Nazwisko.
   private String firstName;   // Pierwsze imię.
   private String middleName;  // Drugie imię.

   /**
     Metoda setLastName ustawia wartość pola lastName.
     @param str Obiekt typu String przypisywany do pola lastName.
   */

   public void setLastName(String str)
   {
      lastName = str;
   }

   /**
      Metoda setFirstName ustawia wartość pola firstName.
      @param str Obiekt typu String przypisywany do pola firstName.
   */

   public void setFirstName(String str)
   {
      firstName = str;
   }

   /**
      Metoda setMiddleName ustawia wartość pola middleName.
      @param str Obiekt typu String przypisywany do pola middleName.
   */

   public void setMiddleName(String str)
   {
      middleName = str;
   }

   /**
      Metoda getLength zwraca długość
      pełnego imienia i nazwiska.
      @return Długość.
   */

   public int getLength()
   {
      return lastName.length() + firstName.length()
             + middleName.length();
   }

   /**
      Metoda toString zwraca pełne imię i nazwisko.
      @return Referencja do obiektu typu String.
   */

   public String toString()
   {
      return firstName + " " + middleName + " "
             + lastName;
   }
}
