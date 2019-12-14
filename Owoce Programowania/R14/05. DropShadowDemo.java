import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.effect.DropShadow;

public class DropShadowDemo extends Application
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
      
      // Stałe do tworzenia obiektu typu Circle.
      final double X = 100.0, Y = 100.0, RADIUS = 50.0;
            
      // Tworzenie obiektu typu DropShadow.
      DropShadow dropShadow = new DropShadow();
      
      // Tworzenie obiektu typu Circle.
      Circle myCircle = new Circle(X, Y, RADIUS, Color.RED);
      myCircle.setEffect(dropShadow);
       
      // Dodawanie obiektu typu Circle do obiektu typu Pane.
      Pane pane = new Pane(myCircle);
      
      // Tworzenie sceny i jej wyświetlanie.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
