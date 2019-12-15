import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class Circles extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające wielkość sceny.
      final double SCENE_WIDTH = 440.0;
      final double SCENE_HEIGHT = 440.0;
      
      // Stałe określające wartości początkowe.
      final double CENTER_X = 220.0;
      final double CENTER_Y = 220.0;
      final double RAD = 20.0;
      final int NUM_CIRCLES = 10;

      // Tworzenie pustego kontenera typu Pane.
      Pane pane = new Pane();
      
      // Rekurencyjne dodawanie 10 kół do kontenera typu Pane.
      drawCircles(pane, NUM_CIRCLES, CENTER_X, CENTER_Y, RAD);
      
      // Tworzenie sceny i jej wyświetlanie.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   /**
    * Metoda drawCircles wyświetla koncentryczne koła.
    * Metoda ta przyjmuje następujące argumenty:
    * p -- Kontener typu Pane, do którego dodawane są koła.
    * n -- Liczba rysowanych kół.
    * x -- Współrzędna x punktu środkowego koła.
    * y -- Współrzędna y punktu środkowego koła.
    * rad -- Promień koła.
    */
   
   private void drawCircles(Pane p, int n, double x, double y, double rad)
   {
      if (n > 0)
      {
         Circle circle = new Circle(x, y, rad);  // Tworzenie koła.
         circle.setStroke(Color.BLACK);         // Kolor linii to czarny.
         circle.setFill(null);                  // Brak wypełnienia.
         p.getChildren().addAll(circle);        // Dodawanie koła do kontenera typu Pane.
         drawCircles(p, n - 1, x, y, rad + 20); // Rysowanie następnego koła.
      }
   }
}
