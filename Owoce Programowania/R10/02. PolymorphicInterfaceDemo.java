/**
   Ten program pokazuje, że typ w postaci interfejsu
   można wykorzystać do tworzenia referencji polimorficznych.
*/

public class PolymorphicInterfaceDemo
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu CompactDisc.
      CompactDisc cd =
              new CompactDisc("Greatest Hits",
                              "Joe Looney Band",
                              18.95);
      // Tworzenie obiektu typu DvdMovie.
      DvdMovie movie =
              new DvdMovie("Wheels of Fury",
                           137, 12.95);

      // Wyświetlanie tytułu płyty CD.                   
      System.out.println("Item #1: " +
                         cd.getTitle());
                         
      // Wyświetlanie ceny płyty CD.
      showPrice(cd);
      
      // Wyświetlanie tytułu płyty DVD.
     System.out.println("Produkt numer 2: " +
                         movie.getTitle());
                         
      // Wyświetlanie ceny płyty DVD.
      showPrice(movie);
   }

   /**
      Metoda showPrice wyświetla cenę
      obiektu typu RetailItem.
      @param item Referencja do obiektu typu RetailItem.
   */
   
   private static void showPrice(RetailItem item)
   {
      System.out.printf("Cena: %,.2f złotych.\n", item.getRetailPrice());
   }
}

