import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.effect.InnerShadow;

public class InnerShadowDemo extends Application
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
      
      // Stałe do tworzenia obiektu typu Rectangle.
      final double X = 50.0, Y = 50.0;
      final double WIDTH = 100.0, HEIGHT = 100;
            
      // Tworzenie obiektu typu InnerShadow.
      InnerShadow innerShadow = new InnerShadow();
      innerShadow.setOffsetX(10);
      innerShadow.setOffsetY(10);
      
      // Tworzenie obiektu typu Rectangle.
      Rectangle box = new Rectangle(X, Y, WIDTH, HEIGHT);
      box.setFill(Color.RED);
      box.setEffect(innerShadow);
       
      // Dodawanie kwadratu do kontenera typu Pane.
      Pane pane = new Pane(box);
      
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
