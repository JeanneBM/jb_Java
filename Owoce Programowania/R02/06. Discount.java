// Ten program oblicza cenę wyprzedażową
// (po odjęciu rabatu 20%)
// produktu o pełnej cenie 59 złotych.

public class Discount
{
   public static void main(String[] args)
   {
      // Zmienne przechowujące pełną cenę, wartość
      // rabatu i cenę wyprzedażową.
      double regularPrice = 59.0;
      double discount;
      double salePrice;
      
      // Obliczanie wartości 20% rabatu.
      discount = regularPrice * 0.2;
      
      // Obliczanie ceny wyprzedażowej przez odjęcie
      // rabatu od pełnej ceny.
      salePrice = regularPrice - discount;
      
      // Wyświetlanie wyników.
      System.out.println("Pełna cena: " + regularPrice);
      System.out.println("Wartość rabatu: " + discount);
      System.out.println("Cena wyprzedażowa: " + salePrice);
   }
}

