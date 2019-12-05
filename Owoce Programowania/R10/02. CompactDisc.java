/**
   Klasa CompactDisc.
*/

public class CompactDisc implements RetailItem
{
   private String title;       // Tytuł płyty CD.
   private String artist;      // Wykonawca.
   private double retailPrice; // Cena detaliczna płyty CD.
   
   /**
      Konstruktor.
      @param cdTitle Tytuł płyty CD.
      @param cdArtist Wykonawca.
      @param cdPrice Cena płyty CD.
   */

   public CompactDisc(String cdTitle, String cdArtist, 
              double cdPrice)
   {
      title = cdTitle;
      artist = cdArtist;
      retailPrice = cdPrice;
   }
   
   /**
      Metoda getTitle.
      @return Tytuł płyty CD.
   */

   public String getTitle()
   {
      return title;
   }
   
   /**
      Metoda getArtist.
      @return Nazwisko wykonawcy.
   */

   public String getArtist()
   {
      return artist;
   }

   /**
      Metoda getRetailPrice (wymagana w 
      interfejsie RetailItem).
      @return Cena detaliczna płyty CD.
   */

   public double getRetailPrice()
   {
      return retailPrice;
   }
}

