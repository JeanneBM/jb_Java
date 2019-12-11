import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *  Ten program ilustruje działanie kontenera typu GridPane.
 */

public class GridPaneImages extends Application
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
      Image moonImage = new Image("file:Moon.jpg");
      Image shipImage = new Image("file:Ship.jpg");
      Image sunsetImage = new Image("file:Sunset.jpg");
      Image flowerImage = new Image("file:Flower.jpg");
      
      // Tworzenie obiektów typu ImageView.
      ImageView moonIView = new ImageView(moonImage);
      ImageView shipIView = new ImageView(shipImage);
      ImageView sunsetIView = new ImageView(sunsetImage);
      ImageView flowerIView = new ImageView(flowerImage);
      
      // Zmiana wielkości obrazu księżyca z zachowaniem proporcji.
      moonIView.setFitWidth(200);
      moonIView.setPreserveRatio(true);
      
      // Zmiana wielkości obrazu statku z zachowaniem proporcji.
      shipIView.setFitWidth(200);
      shipIView.setPreserveRatio(true);

      // Zmiana wielkości obrazu zachodu słońca z zachowaniem proporcji.
      sunsetIView.setFitWidth(200);
      sunsetIView.setPreserveRatio(true);
      
      // Zmiana wielkości obrazu kwiatka z zachowaniem proporcji.
      flowerIView.setFitWidth(200);
      flowerIView.setPreserveRatio(true);
      
      // Create a GridPane.
      GridPane gridpane = new GridPane();
      
      // Dodawanie obiektów typu ImageView do kontenera typu GridPane.
      gridpane.add(moonIView, 0, 0);   // Kolumna numer 0, wiersz numer 0.
      gridpane.add(shipIView, 1, 0);   // Kolumna numer 1, wiersz numer 0.
      gridpane.add(sunsetIView, 0, 1); // Kolumna numer 0, wiersz numer 1.
      gridpane.add(flowerIView, 1, 1); // Kolumna numer 1, wiersz numer 1.

      // Ustawianie wielkości odstępów.
      gridpane.setVgap(10);
      gridpane.setHgap(10);
      
      // Ustawianie marginesu kontenera typu GridPane.
      gridpane.setPadding(new Insets(30));

      // Tworzenie obiektu typu Scene z kontenerem typu GridPane jako węzłem korzenia.
      Scene scene = new Scene(gridpane);

      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);
      
      // Ustawianie tytułu płótna.
      primaryStage.setTitle("Obrazy");

      // Wyświetlanie okna.
      primaryStage.show();
   }
}
