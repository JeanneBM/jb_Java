/**
   Ta klasa przechowuje dane na temat wykładowcy.
*/

public class Instructor
{
   private String lastName;     // Nazwisko.
   private String firstName;     // Imię.
   private String officeNumber;  // Numer gabinetu.

   /**
     Ten konstruktor inicjuje nazwisko,
     imię i numer gabinetu wykładowcy.
     @param lname Nazwisko wykładowcy.
     @param fname Imię wykładowcy.
     @param office Numer gabinetu.
   */

   public Instructor(String lname, String fname,
                     String office)
   {
      lastName = lname;
      firstName = fname;
      officeNumber = office;
   }

   /**
      Konstruktor kopiujący inicjuje obiekt 
      jako kopię innego obiektu typu Instructor.
      @param object2 Kopiowany obiekt.
   */
   
   public Instructor(Instructor object2)
   {
      lastName = object2.lastName;
      firstName = object2.firstName;
      officeNumber = object2.officeNumber;
   }

   /**
      Metoda set ustawia wartość każdego pola.
      @param lname Nazwisko wykładowcy.
      @param fname Imię wykładowcy.
      @param office Numer gabinetu.
   */
   
   public void set(String lname, String fname,
                   String office)
   {
      lastName = lname;
      firstName = fname;
      officeNumber = office;
   }
   
   /**
      Metoda toString.
      @return Łańcuch znaków zawierający
            informacje o wykładowcy.
    */

    public String toString()
    {
      // Tworzenie łańcucha znaków reprezentującego dany obiekt.
      String str = "Nazwisko: " + lastName +
                   "\nImię: " + firstName +
                   "\nNumer gabinetu: " + officeNumber;

      // Zwracanie łańcucha znaków.
      return str;
   }
}
