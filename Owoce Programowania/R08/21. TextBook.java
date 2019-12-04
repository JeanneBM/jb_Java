/**
   Ta klasa przechowuje dane na temat podręcznika.
*/

public class TextBook
{
   private String title;     // Tytuł podręcznika.
   private String author;     // Nazwisko autora.
   private String publisher;  // Nazwa wydawnictwa.

   /**
     Ten konstruktor inicjuje pola title,
     author i publisher.
     @param textTitle Tytuł książki.
     @param auth Nazwisko autora.
     @param pub Nazwa wydawnictwa.
   */

   public TextBook(String textTitle, String auth,
                   String pub)
   {
      title = textTitle;
      author = auth;
      publisher = pub;
   }

   /**
      Konstruktor kopiujący inicjuje obiekt 
      jako kopię innego obiektu typu TextBook.
      @param object2 Kopiowany obiekt.
   */

   public TextBook(TextBook object2)
   {
      title = object2.title;
      author = object2.author;
      publisher = object2.publisher;
   }

   /**
      Metoda set ustawia wartość każdego pola.
      @param textTitle Tytuł podręcznika.
      @param auth Nazwisko autora.
      @param pub Nazwa wydawnictwa.
   */

   public void set(String textTitle, String auth,
                   String pub)
   {
      title = textTitle;
      author = auth;
      publisher = pub;
   }

   /**
      Metoda toString.
      @return Łańcuch znaków zawierający
            informacje o podręczniku.
   */

    public String toString()
    {
      // Tworzenie łańcucha znaków reprezentującego dany obiekt.
      String str = "Tytuł: " + title +
                   "\nAutor: " + author +
                   "\nWydawnictwo: " + publisher;

      // Zwracanie łańcucha znaków.
      return str;
   }
}
