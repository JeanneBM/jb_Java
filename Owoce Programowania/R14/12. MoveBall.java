import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;

public class MoveBall extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające wielkość sceny.
      final double SCENE_WIDTH = 200.0;
      final double SCENE_HEIGHT = 200.0;
      
      // Stałe dotyczące koła.
      final double START_X = 100.0, START_Y = 40.0;
      final double RADIUS = 40.0;
      final double STEP = 10.0;
      
      // Tworzenie koła.
      Circle ball = new Circle(START_X, START_Y, RADIUS);
      ball.setFill(Color.RED);
      
      // Dodawanie koła do kontenera typu Pane.
      Pane pane = new Pane(ball);
      
      // Tworzenie sceny i jej wyświetlanie.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      
      // Rejestrowanie dla sceny obiektu obsługi zdarzeń typu KEY_PRESSED.
      scene.setOnKeyPressed(event ->
      {
         // Pobieranie współrzędnych koła.
         double x = ball.getCenterX();
         double y = ball.getCenterY();
         
         // Sprawdzanie, czy wciśnięto strzałkę w dół.
         if (event.getCode() == KeyCode.DOWN && 
             y < (SCENE_HEIGHT - RADIUS))
         {
            ball.setCenterY(y + STEP);
         }
         
         // Sprawdzanie, czy wciśnięto strzałkę w górę.
         if (event.getCode() == KeyCode.UP && 
             y > RADIUS)
         {
            ball.setCenterY(y - STEP);
         }
         
         // Sprawdzanie, czy wciśnięto strzałkę w prawo.
         if (event.getCode() == KeyCode.RIGHT && 
             x < (SCENE_WIDTH - RADIUS))
         {
            ball.setCenterX(x + STEP);
         }
         
         // Sprawdzanie, czy wciśnięto strzałkę w lewo.
         if (event.getCode() == KeyCode.LEFT && 
             x > RADIUS)
         {
            ball.setCenterX(x - STEP);
         }
      });

      // Przypisywanie sceny do płótna i jej wyświetlanie.
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
