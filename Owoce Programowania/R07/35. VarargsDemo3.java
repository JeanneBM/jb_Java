/**
	Ten program ilustruje działanie metody, która 
	przyjmuje zwykłe argumenty i listę argumentów
	o zmiennej długości.
*/

public class VarargsDemo3
{
   public static void main(String[] args)
   {
      // Wyświetlanie średniej z pierwszego kursu.
      courseAverage("Wprowadzenie do Javy", 89.0, 92.4, 86.8);
      
      // Display the average for the second course.
      courseAverage("Progamowanie stron internetowych", 91.7, 82.4);
   }
   
   /**
   	Metoda courseAverage przyjmuje jako argumenty 
   	nazwę kursu i zmienną liczbę wyników testów. 
   	Parametr o zmiennej długości,
   	scores, musi zostać zadeklarowany na liście
   	parameterów jako ostatni.
		@param course Nazwa kursu.
		@param scores Zmienna liczba wyników testów.
   */
   
   public static void courseAverage(String course, 
                                    double... scores)
   {
      double total = 0.0;     // Akumulator
      double average;         // Średnia wyników.
      
      // Wyświetlanie nazwy kursu.
      System.out.println("Nazwa kursu: " + course);
      
      // Obliczanie sumy wyników.
      for (double s : scores)
         total += s;
      
      // Pobieranie średniej wyników.
      average = total / scores.length;
      
      // Wyświetlanie średniej.
      System.out.println("Średni wynik: " + average);
   }
}

