import java.io.*;  // Umożliwia używanie klasy IOException.

/**
   Ten program używa klasy TestScoreReader do
   wczytania wyników testów z pliku i uzyskania
   średnich.
*/

public class TestAverages
{
   public static void main(String[] args)
                      throws IOException
   {
      double average;         // Średnia wyników testów.
      int studentNumber = 1;  // Zmienna sterująca.

      // Tworzenie obiektu typu TestScoreReader.
      TestScoreReader scoreReader =
                  new TestScoreReader("Grades.csv");
      
      // Wyświetlanie średnich.
      while (scoreReader.readNextLine())
      {
         // Pobieranie średniej za pomocą obiektu typu TestScoreReader.
         average = scoreReader.getAverage();
         
         // Wyświetlanie średniej studenta.
         System.out.println("Średnia studenta numer " +
                            studentNumber + " to " +
                            average + ".");

         // Zwiększanie numeru studenta.
         studentNumber++;
      }
      
      // Zamykanie obiektu typu TestScoreReader.
      scoreReader.close();
      System.out.println("Pobrano wszystkie wyniki.");
   }
}
