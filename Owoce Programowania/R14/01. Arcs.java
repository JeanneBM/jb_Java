import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Arcs extends Application
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
      
      // Wspólne ustawienia łuków.
      final double X = 160.0; // Współrzędna X punktu środkowego.
      final double Y = 120.0; // Współrzędna Y punktu środkowego.
      final double X_RAD = 100.00; // Promień na osi X.
      final double Y_RAD = 100.0;  // Promień na osi Y.

      // Stałe do podawania kątów łuków.
      final double PIE1_START = 0.0;
      final double PIE1_LENGTH = 45.0;
      final double PIE2_START = 45.0;
      final double PIE2_LENGTH = 90.0;
      final double PIE3_START = 135.0;
      final double PIE3_LENGTH = 120.0;
      
      // Rysowanie obrysu koła.
      Circle outline = new Circle(X, Y, X_RAD, Color.WHITE);
      outline.setStroke(Color.BLACK);
      
      // Rysowanie pierwszego wycinka diagramu kołowego.
      Arc pieSlice1 = new Arc(X,Y, X_RAD, Y_RAD,
                              PIE1_START, PIE1_LENGTH);
      pieSlice1.setFill(Color.RED);
      pieSlice1.setType(ArcType.ROUND);
      
      // Rysowanie drugiego wycinka diagramu kołowego.
      Arc pieSlice2 = new Arc(X,Y, X_RAD, Y_RAD,
                              PIE2_START, PIE2_LENGTH);
      pieSlice2.setFill(Color.LIGHTGREEN);
      pieSlice2.setType(ArcType.ROUND);

      // Rysowanie trzeciego wycinka diagramu kołowego.
      Arc pieSlice3 = new Arc(X,Y, X_RAD, Y_RAD,
                              PIE3_START, PIE3_LENGTH);
      pieSlice3.setFill(Color.BLACK);
      pieSlice3.setType(ArcType.ROUND);

      // Dodawanie obiektów do kontenera typu Pane.
      Pane pane = new Pane(outline, pieSlice1, pieSlice2,
                           pieSlice3);
      
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
