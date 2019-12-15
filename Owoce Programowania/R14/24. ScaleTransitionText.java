import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.animation.ScaleTransition;

public class ScaleTransitionText extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające wielkość sceny.
      final double SCENE_WIDTH = 350.0;
      final double SCENE_HEIGHT = 200.0;
      
      // Stałe do tworzenia przejścia.
      final double FIVE_SEC = 5000.0;
      final double START_SCALE = 1.0;
      final double END_SCALE = 5.0;
      
      // Tworzenie obiektu typu Text.
      Text text = new Text("Witaj, świecie!");

      // Tworzenie obiektu typu Transition.
      ScaleTransition strans =
         new ScaleTransition(new Duration(FIVE_SEC), text);
      strans.setFromX(START_SCALE);
      strans.setFromY(START_SCALE);
      strans.setToX(END_SCALE);
      strans.setToY(END_SCALE);
      
      // Dodawanie tekstu do kontenera typu HBox.
      HBox hbox = new HBox(text);
      hbox.setAlignment(Pos.CENTER);
      
      // Tworzenie sceny i jej wyświetlanie.
      Scene scene = new Scene(hbox, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();

      // Odtwarzanie animacji. 
      strans.play();
   }
}
