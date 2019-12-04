/**
   Ten program przedstawia działanie typu wyliczeniowego.
*/

public class EnumDemo
{
   // Deklarowanie typu wyliczeniowego Day.
   enum Day { NIEDZIELA, PONIEDZIALEK, WTOREK, SRODA,
              CZWARTEK, PIATEK, SOBOTA }

   public static void main(String[] args)
   {
      // Deklarowanie zmiennej Day i przypisywanie do niej wartości.
      Day workDay = Day.SRODA;

      // Poniższa instrukcja wyświetla słowo SRODA.
      System.out.println(workDay);
 
      // Ta instrukcja wyświetla numer porządkowy
      // wartości Day.NIEDZIELA, czyli 0.
      System.out.println("Numer porządkowy wartości " +
                         Day.NIEDZIELA + " to " +
                         Day.NIEDZIELA.ordinal() + ".");
      
      // Poniższa instrukcja wyświetla numer porządkowy
      // wartości Day.SOBOTA, czyli 6.
      System.out.println("Numer porządkowy wartości " +
                         Day.SOBOTA + " to " +
                         Day.SOBOTA.ordinal() + ".");

      // Ta instrukcja porównuje dwie stałe wyliczenia.
      if (Day.PIATEK.compareTo(Day.PONIEDZIALEK) > 0)
        System.out.println(Day.PIATEK + " ma numer większy niż " +
                           Day.PONIEDZIALEK + ".");
      else
        System.out.println(Day.PIATEK + " ma numer NIE większy niż " +
                           Day.PONIEDZIALEK + ".");
   }
}
