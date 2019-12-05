/**
   Klasa DvdMovie.
*/

public class DvdMovie implements RetailItem
{
   private String title;       // Tytuł płyty DVD.
   private int runningTime;    // Czas filmu w minutach.
   private double retailPrice; // Cena płyty DVD.

   /**
     Konstruktor.
     @param dvdTitle Tytuł płyty DVD.
     @param runTime Czas filmu w minutach.
     @param dvdPrice Cena płyty DVD.
   */

   public DvdMovie(String dvdTitle, int runTime,
                                double dvdPrice)
   {
      title = dvdTitle;
      runningTime = runTime;
      retailPrice = dvdPrice;
   }
   
   /**
      Metoda getTitle.
      @return Tytuł płyty DVD.
   */

   public String getTitle()
   {
      return title;
   }
   
   /**
      Metoda getRunningTime.
      @return Czas trwania filmu w minutach.
   */

   public int getRunningTime()
   {
      return runningTime;
   }

   /**
      Metoda getRetailPrice (wymagana w 
      interfejsie RetailItem).
      @return Cena detaliczna płyty DVD.
   */

   public double getRetailPrice()
   {
      return retailPrice;
   }
}

