/**
   Ten program ilustruje działanie klasy CompSciStudent.
*/

public class CompSciStudentDemo
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu CompSciStudent.
      CompSciStudent csStudent =
           new CompSciStudent("Julia Haciak",
                              "167W98337", 2015);

      // Zapisywanie wartości dotyczących godzin matematyki, informatyki i edukacji ogólnej.
      csStudent.setMathHours(12);
      csStudent.setCsHours(20);
      csStudent.setGenEdHours(40);

      // Wyświetlanie danych na temat studenta.
      System.out.println(csStudent);

      // Wyświetlanie liczby godzin pozostałych do zaliczenia.
      System.out.println("Godziny do zaliczenia: " +
                   csStudent.getRemainingHours());       
   }
}

