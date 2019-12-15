import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class MouseDraggedDemo extends Application
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
      Circle circle = new Circle(CENTER_X, CENTER_Y, RADIUS);

      // Rejestrowanie obiektu obsługi zdarzeń
      // typu MOUSE_DRAGGED.
      circle.setOnMouseDragged(event ->
      {
         // Pobieranie współrzędnych kursora myszy.
         double x = event.getSceneX();
         double y = event.getSceneY();
         
         // Przesuwanie koła.
         circle.setCenterX(x);
         circle.setCenterY(y);
      });
      
      // Dodawanie koła do kontenera typu Pane.
      Pane pane = new Pane(circle);
      
      // Tworzenie sceny i jej wyświetlanie.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
