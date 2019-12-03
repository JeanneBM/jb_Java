/**
   W tym programie używany jest nieprawidłowy indeks tablicy.
*/

public class InvalidSubscript
{
   public static void main(String[] args)
   {
      int[] values = new int[3];

      System.out.println("Próba zapisania czterech liczb " +
                         "w trójelementowej  tablicy.");

      for (int index = 0; index < 4; index++)
      {
        System.out.println("Przetwarzanie elementu o indeksie " + index + "."); 
          values[index] = 10;
      }
   }
}
