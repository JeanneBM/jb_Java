import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

/**
 *  Program GridPaneButtonDemo.
 */

public class GridPaneButtonDemo extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie sześciu przycisków.
      Button button1 = new Button("Przycisk nr 1");
      Button button2 = new Button("Przycisk nr 2");
      Button button3 = new Button("Przycisk nr 3");
      Button button4 = new Button("Przycisk nr 4");
      Button button5 = new Button("Przycisk nr 5");
      Button button6 = new Button("Przycisk nr 6");

      // Tworzenie kontenera typu GridPane.
      GridPane gridpane = new GridPane();
      gridpane.setHgap(10);
      gridpane.setVgap(10);
      
      // Dodawanie przycisków do kontenera typu GridPane.
      gridpane.add(button1, 0, 0);
      gridpane.add(button2, 1, 0);
      gridpane.add(button3, 0, 1);
      gridpane.add(button4, 1, 1);
      gridpane.add(button5, 2, 0);
      gridpane.add(button6, 2, 1);
            
      // Tworzenie sceny z kontenerem typu VBox jako węzłem korzenia.
      // Scena ma tu 300 pikseli szerokości i 100 pikseli wysokości.
      Scene scene = new Scene(gridpane, 300, 100);
      
      // Dodawanie sceny do płótna.
      primaryStage.setScene(scene);
      
      // Ustawianie tytułu płótna.
      primaryStage.setTitle("GridPane");
      
      // Wyświetlanie okna.
      primaryStage.show();
   }
}
