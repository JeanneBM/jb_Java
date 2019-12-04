/**
   Ten program ilustruje działanie klasy Course.
*/

public class CourseDemo
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu Instructor.
      Instructor myInstructor =
          new Instructor("Krawczyk", "Szymon", "RH3010");
 
      // Tworzenie obiektu typu TextBook.
      TextBook myTextBook =
        new TextBook("Java dla zupełnie początkujących",
                     "Gaddis", "Helion");
                       
      // Tworzenie obiektu typu Course.
      Course myCourse =
        new Course("Wprowadzenie do Javy", myInstructor,
                   myTextBook);

      // Wyświetlanie informacji o kursie.
      System.out.println(myCourse);
   }
}
