import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class BullsEye extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające wymiary sceny.
      final double SCENE_WIDTH = 640.0;
      final double SCENE_HEIGHT = 480.0;
      
      // Stałe określające punkt środkowy i promienie kół tarczy.
      final double CENTER_X = 320.0;
      final double CENTER_Y = 240.0;
      final double RING1_RADIUS = 240.0;
      final double RING2_RADIUS = 150.0;
      final double RING3_RADIUS = 75.0;
      final double RING4_RADIUS = 25.0;
      
      // Tworzenie kół.
      Circle ring1 = new Circle(CENTER_X, CENTER_Y,
                                RING1_RADIUS, Color.BLACK);
                                
      Circle ring2 = new Circle(CENTER_X, CENTER_Y,
                                RING2_RADIUS, Color.RED);
                                
      Circle ring3 = new Circle(CENTER_X, CENTER_Y,
                                RING3_RADIUS, Color.BLACK);
                                
      Circle ring4 = new Circle(CENTER_X, CENTER_Y,
                                RING4_RADIUS, Color.RED);

      // Dodawanie kół do kontenera typu Pane.
      Pane pane = new Pane(ring1, ring2, ring3, ring4);
      
      // Tworzenie sceny i jej wyświetlanie.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
