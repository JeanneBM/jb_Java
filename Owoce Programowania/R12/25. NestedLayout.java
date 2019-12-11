import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;

/**
 *  Ilustracja zagnieżdżonych kontenerów.
 */

public class NestedLayout extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie obiektów typu Image.
      Image finlandImage = new Image("file:Finland.png");
      Image germanyImage = new Image("file:Germany.png");
      
      // Tworzenie obiektów typu ImageView.
      ImageView finlandIView = new ImageView(finlandImage);
      ImageView germanyIView = new ImageView(germanyImage);
      
      // Tworzenie etykiet.
      Label messageLabel = new Label("Flagi Finlandii i Niemiec");
      
      // Tworzenie kontenera typu VBox przeznaczonego na obrazy.
      VBox vbox = new VBox(10, finlandIView, germanyIView);
      
      // Tworzenie kontenera typu GridPane.
      GridPane gridpane = new GridPane();
      
      // Dodawanie etykiety i kontenera typu VBox do kontenera typu GridPane.
      gridpane.add(messageLabel, 0, 0);    // Kolumna nr 0, wiersz nr 0.
      gridpane.add(vbox, 1, 0);            // Kolumna nr 1, wiersz nr 0.
      
      // Dodawanie odstępów między kolumnami kontenera typu GridPane.
      gridpane.setHgap(10);
      
      // Ustawianie marginesu w kontenerze typu GridPane.
      gridpane.setPadding(new Insets(20));
      
      // Tworzenie sceny z kontenerem typu GridPane jako węzłem korzenia.
      Scene scene = new Scene(gridpane);
      
      // Dodawanie sceny do płótna.
      primaryStage.setScene(scene);
      
      // Wyświetlanie okna.
      primaryStage.show();
   }
}
