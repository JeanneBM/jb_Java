import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;

public class BallDrop extends Application
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
      
      // Stałe do tworzenia koła.
      final double START_X = 100.0, START_Y = 40.0;
      final double END_X = 100.0, END_Y = 160.0;
      final double RADIUS = 40.0;
      
      // Stała określająca czas trwania animacji.
      final double ONE_SEC = 1000.0;
      
      // Tworzenie koła.
      Circle ball = new Circle(RADIUS);
      
      // Tworzenie obiektu odpowiedzialnego za animację.
      TranslateTransition ttrans = 
         new TranslateTransition(new Duration(ONE_SEC), ball);
      ttrans.setFromX(START_X);
      ttrans.setFromY(START_Y);
      ttrans.setToX(END_X);
      ttrans.setToY(END_Y);

      // Dodawanie koła do kontenera typu Pane.
      Pane pane = new Pane(ball);
      
      // Tworzenie sceny i jej wyświetlanie.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
      
      // Uruchamianie animacji.
      ttrans.play();
   }
}
