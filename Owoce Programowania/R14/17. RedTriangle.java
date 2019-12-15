import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;

public class RedTriangle extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Rysowanie pierwszej linii od punktu (160,20) do punktu (310, 220).
      Line line1 = new Line(160, 20, 310, 220);
      
      // Rysowanie drugiej linii od punktu (160,20) do punktu (20,220).
      Line line2 = new Line(160, 20, 20, 220);
      
      // Rysowanie trzeciej linii od punktu (20,220) do punktu (310, 220).
      Line line3 = new Line(20, 220, 310, 220);
      
      // Ustawianie koloru pędzla dla każdej linii na czerwony.
      line1.setStroke(Color.RED);
      line2.setStroke(Color.RED);
      line3.setStroke(Color.RED);
      
      // Dodawanie linii do kontenera typu Pane.
      Pane pane = new Pane(line1, line2, line3);
      
      // Tworzenie sceny i jej wyświetlanie.
      Scene scene = new Scene(pane, 320, 240);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
