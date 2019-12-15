import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class RotateBox extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające wielkość sceny.
      final double SCENE_WIDTH = 160.0;
      final double SCENE_HEIGHT = 160.0;
      
      // Stałe do tworzenia prostokąta.
      final double X = 30.0, Y = 40.0;
      final double WIDTH = 100.00, HEIGHT = 75.0;
      final double ANGLE = 45.0;
      
      // Tworzenie prostokąta.
      Rectangle box = new Rectangle(X, Y, WIDTH, HEIGHT);
      box.setRotate(ANGLE);
       
      // Dodawanie prostokąta do kontenera typu Pane.
      Pane pane = new Pane(box);
      
      // Tworzenie sceny i jej wyświetlanie.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
