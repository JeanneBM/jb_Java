import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.control.Label;

/**
 *  Program GridPaneDemo.
 */

public class GridPaneDemo extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie kilku kontrolek typu Label.
      Label label1 = new Label("To kontrolka label1");
      Label label2 = new Label("To kontrolka label2");
      Label label3 = new Label("To kontrolka label3");
      Label label4 = new Label("To kontrolka label4");

      // Tworzenie kontenera typu GridPane.
      GridPane gridpane = new GridPane();
      
      // Dodawanie kontrolek typu Label do kontenera typu GridPane.
      gridpane.add(label1, 0, 0);
      gridpane.add(label2, 1, 0);
      gridpane.add(label3, 0, 1);
      gridpane.add(label4, 1, 1);

      // Tworzenie obiektu typu Scene z kontenerem typu GridPane jako węzłem korzenia.
      // Ten obiekt typu Scene ma 200 pikseli szerokości i 100 pikseli wysokości.
      Scene scene = new Scene(gridpane, 200, 100);

      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);

      // Wyświetlanie okna.
      primaryStage.show();
   }
}
