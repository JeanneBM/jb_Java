/**
   Klasa CellPhone przechowuje dane o telefonie komórkowym.
*/

public class CellPhone
{
   // Pola.
   private String manufact;    // Producent.
   private String model;       // Model
   private double retailPrice; // Cena detaliczna.
   
   /**
      Konstruktor
     @param man Producent telefonu.
     @param mod Numer modelu telefonu.
     @param price Cena detaliczna telefonu.
   */
   
   public CellPhone(String man, String mod, double price)
   {
      manufact = man;
      model = mod;
      retailPrice = price;
   }
   
   /**
      Metoda setManufact pozwala zmienić
     nazwę producenta.
     @param man Nazwa producenta telefonu.
   */
   
   public void setManufact(String man)
   {
      manufact = man;
   }

   /**
      Metoda setModel pozwala zmienić
     numer modelu telefonu.
     @param mod Numer modelu telefonu.
   */
   
   public void setMod(String mod)
   {
      model = mod;
   }
   
   /**
      Metoda setRetailPrice pozwala zmienić
     cenę detaliczną telefonu.
     @param price Cena detaliczna telefonu.
   */
   
   public void setRetailPrice(double price)
   {
      retailPrice = price;
   }

   /**
      Metoda getManufact 
     @return Nazwa producenta telefonu.
   */
   
   public String getManufact()
   {
      return manufact;
   }
   
   /**
      Metoda getModel
     @return Numer modelu telefonu.
   */
   
   public String getModel()
   {
      return model;
   }
   
   /**
      Metoda getRetailPrice
     @return Cena detaliczna telefonu.
   */
   
   public double getRetailPrice()
   {
      return retailPrice;
   }
}
