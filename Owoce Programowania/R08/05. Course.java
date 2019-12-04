/**
   Ta klasa przechowuje dane na temat kursu.
*/

public class Course
{
   private String courseName;      // Nazwa kursu.
   private Instructor instructor; // Wykładowca.
   private TextBook textBook;     // Podręcznik.

   /**
     Ten konstruktor inicjuje pola courseName,
     instructor i textBook.
     @param name Nazwa kursu.
     @param instructor Obiekt typu Instructor.
     @param text Obiekt typu TextBook.
   */

   public Course(String name, Instructor instr,
                 TextBook text)
   {
      // Przypisywanie wartości do pola courseName.
      courseName = name;

      // Tworzenie nowego obiektu typu Instructor. Jako argument
      // konstruktora kopiującego przekazywany jest parametr instr.
      instructor = new Instructor(instr);

      // Tworzenie obiektu typu TextBook. Jako argument
      // konstruktora kopiującego przekazywany jest parametr text.
      textBook = new TextBook(text);
   }

   /**
      Metoda getName.
      @return Nazwa kursu.
   */

   public String getName()
   {
      return courseName;
   }

   /**
      Metoda getInstructor.
      @return Referencja do kopii obiektu typu Instructor
              powiązanego z danym kursem.
   */

   public Instructor getInstructor()
   {
      // Zwracanie kopii obiektu instructor.
      return new Instructor(instructor);
   }

   /**
      Metoda getTextBook.
      @return Referencja do kopii obiektu textBook
              z danego kursu.
   */

   public TextBook getTextBook()
   {
      // Zwracanie kopii obiektu textBook.
      return new TextBook(textBook);
   }

   /**
      Metoda toString.
      @return Łańcuch znaków zawierający informacje o kursie.
   */

   public String toString()
   {
      // Tworzenie łańcucha znaków reprezentującego dany obiekt.
      String str = "Nazwa kursu: " + courseName +
                   "\nInformacje o wykładowcy:\n" +
                   instructor +
                   "\nInformacje o podręczniku:\n" +
                   textBook;

      // Zwracanie łańcucha znaków.
      return str;
   }
}
