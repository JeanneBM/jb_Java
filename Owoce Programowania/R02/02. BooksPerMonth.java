/**
   Ten program ilustruje, jak zastosować operator
   rzutowania, aby zapobiec dzieleniu całkowitoliczbowemu.
*/

public class BooksPerMonth
{
     public static void main(String[] args)
     {
          int books = 15,        // Liczba książek do przeczytania.
              months = 6;        // Liczba miesięcy.
          double booksPerMonth;  // Średnia liczba książek na miesiąc.

          // Wyświetlanie liczby książek, jakie 
          // planuję przeczytać, i liczby miesięcy,
          // w jakie planuję to zrobić.
          System.out.print("Planuję przeczytać ");
          System.out.print(books + " książek w ");
          System.out.println(months + " miesięcy.");
          
          // Obliczanie średniej liczby książek na miesiąc.
          booksPerMonth = (double) books / months;
          
          // Wyświetlanie średniej liczby książek na miesiąc.
          System.out.print("Średni przeczytam ");
          System.out.print(booksPerMonth);
          System.out.println(" książki na miesiąc.");
     }
}
