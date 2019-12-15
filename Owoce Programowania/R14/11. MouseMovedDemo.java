import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

public class MouseMovedDemo extends Application
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
      
      // Tworzenie etykiety.
      Label label = new Label("Przesuń kursor myszy.");

      // Dodawanie etykiety do kontenera typu Pane.
      HBox hbox = new HBox(label);
      hbox.setAlignment(Pos.CENTER);
      
      // Tworzenie sceny.
      Scene scene = new Scene(hbox, SCENE_WIDTH, SCENE_HEIGHT);
      
      // Rejestrowanie dla sceny obiektu obsługi zdarzeń 
      // typu MOUSE_MOVED.
      scene.setOnMouseMoved(event ->
      {
         // Pobieranie współrzędnych kursora myszy.
         double x = event.getSceneX();
         double y = event.getSceneY();
         
         // Wyświetlanie lokalizacji kursora myszy.
         label.setText(String.format("%.0f, %.0f", x, y));
      });

      // Przypisywanie sceny do płótna i jej wyświetlanie.
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
