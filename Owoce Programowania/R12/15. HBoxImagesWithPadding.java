import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *  Ten program ilustruje marginesy i odstępy.
 */

public class HBoxImagesWithPadding extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie komponentów typu Image.
      Image moonImage = new Image("file:Moon.jpg");
      Image shipImage = new Image("file:Ship.jpg");
      Image sunsetImage = new Image("file:Sunset.jpg");
      
      // Tworzenie komponentów typu ImageView.
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
      
      // Umieszczanie obiektów typu ImageView w obiekcie typu HBox z odstępami 10 pikseli.
      HBox hbox = new HBox(10, moonIView, shipIView, sunsetIView);
      
      // Dodawanie 30 pikseli marginesu wokół kontenera typu HBox.
      hbox.setPadding(new Insets(30));
      
      // Tworzenie obiektu typu Scene z kontenerem typu HBox jako węzłem korzenia.
      Scene scene = new Scene(hbox);
      
      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);
      
      // Ustawianie tytułu płótna.
      primaryStage.setTitle("Obrazy");

      // Wyświetlanie okna.
      primaryStage.show();
   }
}
