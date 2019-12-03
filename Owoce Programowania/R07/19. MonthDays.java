/**
   Ten program ilustruje używanie tablicy obiektów typu String.
*/

public class MonthDays
{
   public static void main(String[] args)
   {
      String[] months = { "Styczeń", "Luty", "Marzec",
                          "Kwiecień", "Maj", "Czerwiec", "Lipiec",
                          "Sierpień", "Wrzesień", "Październik",
                          "Listopad", "Grudzień" };

      int[] days = { 31, 28, 31, 30, 31, 30, 31,
                     31, 30, 31, 30, 31 };

      for (int index = 0; index < months.length; index++)
      {
         System.out.println(months[index] + " ma " +
                            days[index] + " dni.");
      }
   }
}
