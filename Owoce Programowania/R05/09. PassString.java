/**
   Ten program pokazuje, że argumentów typu String 
   nie można modyfikować.
*/

public class PassString
{
   public static void main(String[] args)
   {
      // Tworzenie obiektu typu String o zawartości "Szekspir".
      // Zmienna name wskazuje ten obiekt.
      String name = "Szekspir";

      // Wyświetlanie obiektu typu String wskazywanego przez zmienną name.
      System.out.println("W metodzie main zmienna name wskazuje tekst " +
                         name + ".");

      // Wywołanie metody changeName; jako argument
      // przekazywana jest zawartość zmiennej name.
      changeName(name);
 
      // Wyświetlanie obiektu typu String wskazywanego przez zmienną name.
      System.out.println("Ponownie w main. Zmienna name wskazuje tekst " +
                         name + ".");
   }
   
   /**
      Metoda changeName przyjmuje argument typu String
      i przypisuje do parametru str nowy obiekt typu String.
   */
 
    public static void changeName(String str)
    {
      // Ten kod tworzy obiekt typu String z tekstem "Dickens"
      // i przypisuje adres tego obiektu do zmiennej str.
      str = "Dickens";
 
      // Wyświetlanie obiektu typu String wskazywanego przez zmienną str.
      System.out.println("W metodzie changeName zmienna name " +
                         "wskazuje tekst " + str + ".");
   }
}
