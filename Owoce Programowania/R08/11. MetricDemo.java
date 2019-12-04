import javax.swing.JOptionPane;

/**
   Ten program ilustruje działanie klasy Metric.
*/

public class MetricDemo
{
   public static void main(String[] args)
   {
      String input; // Przechowywanie danych wejściowych.
      double miles;  // Odległość w milach.
      double kilos;  // Odległość w kilometrach.

      // Pobieranie odległości w milach.
      input = JOptionPane.showInputDialog("Podaj " +
                             "odległość w milach: ");
      miles = Double.parseDouble(input);

      // Przekształcanie odległości na kilometry.
      kilos = Metric.milesToKilometers(miles);
      JOptionPane.showMessageDialog(null,
        String.format("%,.2f w milach to %,.2f w kilometrach.",
                      miles, kilos));

      // Pobieranie odległości w kilometrach.
      input = JOptionPane.showInputDialog("Podaj " +
                       "odległość w kilometrach: ");
      kilos = Double.parseDouble(input);

      // Przekształcanie odległości na kilometry.
      miles = Metric.kilometersToMiles(kilos);
      JOptionPane.showMessageDialog(null,
        String.format("%,.2f w kilometrach to %,.2f w milach.",
                      kilos, miles));
      
      System.exit(0);
   }
}
