/**
   Ta klasa przechowuje dane na temat studenta informatyki.
*/

public class CompSciStudent extends Student
{
   // Liczba godzin wymagana do zaliczenia.
   private final int MATH_HOURS = 20;   // Godziny zajęć z matematyki.
   private final int CS_HOURS = 40;     // Godziny zajęć z informatyki.
   private final int GEN_ED_HOURS = 60; // Godziny zajęć z edukacji ogólnej.

   // Zaliczone godziny.
   private int mathHours;  // Zaliczone godziny zajęć z matematyki.
   private int csHours;    // Zaliczone godziny zajęć z informatyki.
   private int genEdHours; // Zaliczone godziny zajęć z edukacji ogólnej.

   /**
     Konstruktor ustawia imię i nazwisko, 
     identyfikator i rok przyjęcia studenta.
     @param n Imię i nazwisko studenta.
     @param id Identyfikator studenta.
     @param year Rok przyjęcia studenta.
   */

   public CompSciStudent(String n, String id, int year)
   {
      super(n, id, year);
   }

   /**
      Metoda setMathHours ustawia 
      liczbę zaliczonych zajęć z matematyki.
      @param math Liczba zaliczonych godzin z matematyki.
   */

   public void setMathHours(int math)
   {
      mathHours = math;
   }

   /**
      Metoda setCsHours ustawia liczbę
      zaliczonych godzin z informatyki.
      @param cs Liczba zaliczonych godzin z informatyki.
   */

   public void setCsHours(int cs)
   {
      csHours = cs;
   }

   /**
      Metoda setGenEdHours ustawia liczbę zaliczonych
      godzin zajęć z edukacji ogólnej.
      @param genEd Liczba zaliczonych godzin zajęć z edukacji ogólnej.
   */

   public void setGenEdHours(int genEd)
   {
      genEdHours = genEd;
   }

   /**
      Metoda getRemainingHours zwraca liczbę
      godzin, jakie student jeszcze musi zaliczyć.
      @return Liczba godzin, jakie student musi jeszcze zaliczyć.
   */

   @Override
   public int getRemainingHours()
   {
      int reqHours,        // Łączna liczba godzin potrzebnych do zaliczenia.
          remainingHours; // Liczba godzin pozostałych do zaliczenia.

      // Obliczanie łącznej liczby godzin wymaganych do zaliczenia.
      reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;

      // Obliczanie liczby godzin pozostałych do zaliczenia.
      remainingHours = reqHours - (mathHours + csHours
                         + genEdHours);
                         
      return remainingHours;
   }

   /**
      Metoda toString zwraca łańcuch znaków 
      zawierający dane na temat studenta.
      @return Referencja do obiektu typu String.
   */
   
   @Override
   public String toString()
   {
      String str;

      str = super.toString() +
         "\nKierunek: Informatyka" +
         "\nZaliczone godziny matematyki: " + mathHours +
         "\nZaliczone godziny informatyki: " + csHours +
         "\nZaliczone godziny edukacji ogólnej: " + genEdHours;

      return str;
   }
}
