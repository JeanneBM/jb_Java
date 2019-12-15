import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class MouseEventDemo extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające wielkość sceny.
      final double SCENE_WIDTH = 200.0;
      final double SCENE_HEIGHT = 200.0;
      
      // Stałe dotyczące koła.
      final double CENTER_X = 100.0, CENTER_Y = 100.0;
      final double RADIUS = 40.0;
      
      // Tworzenie koła.
      Circle ball = new Circle(CENTER_X, CENTER_Y, RADIUS);
      
      // Rejestrowanie dla koła obiektów obsługi zdarzeń związanych z myszą.
      ball.setOnMouseEntered(event -> 
      {
         ball.setFill(Color.RED);
      });
      
      ball.setOnMouseExited(event -> 
      {
         ball.setFill(Color.BLACK);
      });

      ball.setOnMousePressed(event -> 
      {
         ball.setFill(Color.GREEN);
      });
      
      // Dodawanie koła do kontenera typu Pane.
      Pane pane = new Pane(ball);

      // Tworzenie sceny i jej wyświetlanie.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
