import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class PolygonDemo extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające wielkość sceny.
      final double SCENE_WIDTH = 320.0;
      final double SCENE_HEIGHT = 240.0;
      
      // Tworzenie wielokąta.
      Polygon diamond = new Polygon(160.0, 20.0,  // Góra.
                                    300.0, 120.0, // Prawa strona.
                                    160.0, 220.0, // Dół.
                                    20.0, 120.0); // Lewa strona.

      // Dodawanie wielokąta do kontenera typu Pane.
      Pane pane = new Pane(diamond);
      
      // Tworzenie sceny i jej wyświetlanie.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
