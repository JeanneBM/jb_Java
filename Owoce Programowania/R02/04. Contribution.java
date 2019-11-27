// Ten program oblicza kwotę odkładaną w ramach
// planu emerytalnego, jeśli przeznaczyć na to 5%,
// 8% lub 10% miesięcznego wynagrodzenia.

public class Contribution
{
   public static void main(String[] args)
   {
      // Zmienne przechowujące miesięczne wynagrodzenie
      // i odkładaną kwotę.
      double monthlyPay = 6000.0;
      double contribution;
      
      // Obliczanie i wyświetlanie kwoty przy odkładaniu 5% pensji.
      contribution = monthlyPay * 0.05;
      System.out.println("Odkładanie 5% daje " +
                         contribution +
                         " złotych miesięcznie.");

      // Obliczanie i wyświetlanie kwoty przy odkładaniu 8% pensji.
      contribution = monthlyPay * 0.08;
      System.out.println("Odkładanie 8% daje " +
                         contribution +
                         " złotych miesięcznie.");

      // Obliczanie i wyświetlanie kwoty przy odkładaniu 10% pensji.
      contribution = monthlyPay * 0.1;
      System.out.println("Odkładanie 10% daje " +
                         contribution +
                         " złotych miesięcznie.");
   }
}
