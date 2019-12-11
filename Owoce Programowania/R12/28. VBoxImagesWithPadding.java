import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *  Ten program ilustruje działanie kontenera typu VBox.
 */

public class VBoxImagesWithPadding extends Application
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
      
      // Tworzenie obiektów typu ImageView.
      ImageView moonIView = new ImageView(moonImage);
      ImageView shipIView = new ImageView(shipImage);
      ImageView sunsetIView = new ImageView(sunsetImage);
      
      // Zmiana wielkości obrazu księżyca z zachowaniem proporcji.
      moonIView.setFitWidth(200);
      moonIView.setPreserveRatio(true);
      
      // Zmiana wielkości obrazu statku z zachowaniem proporcji.
      shipIView.setFitWidth(200);
      shipIView.setPreserveRatio(true);

      // Zmiana wielkości obrazu zachodu słońca z zachowaniem proporcji.
      sunsetIView.setFitWidth(200);
      sunsetIView.setPreserveRatio(true);  
      
      // Umieszczanie obiektów typu ImageView w obiekcie typu VBox z odstępami 10 pikseli.
      VBox vbox = new VBox(10, moonIView, shipIView, sunsetIView);
      
      // Dodawanie marginesu 30 pikseli w kontenerze typu VBox.
      vbox.setPadding(new Insets(30));

      // Tworzenie obiektu typu Scene z kontenerem typu VBox jako węzłem korzenia.
      Scene scene = new Scene(vbox);

      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);
      
      // Ustawianie tytułu płótna.
      primaryStage.setTitle("Obrazy");

      // Wyświetlanie okna.
      primaryStage.show();
   }
}
