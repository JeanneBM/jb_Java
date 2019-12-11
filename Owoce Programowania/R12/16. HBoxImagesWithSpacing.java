import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *  Ten program wyświetla obrazy w kontenerze typu Hbox.
 */

public class HBoxImagesWithSpacing extends Application
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
      
      // Zmiana wielkości obrazu moon z zachowaniem proporcji.
      moonIView.setFitWidth(200);
      moonIView.setPreserveRatio(true);
      
      // Zmiana wielkości obrazu ship z zachowaniem proporcji.
      shipIView.setFitWidth(200);
      shipIView.setPreserveRatio(true);

      // Zmiana wielkości obrazu sunset z zachowaniem proporcji.
      sunsetIView.setFitWidth(200);
      sunsetIView.setPreserveRatio(true);  
      
      // Umieszczanie obiektów typu ImageView w kontenerze typu HBox.
      HBox hbox = new HBox(10, moonIView, shipIView, sunsetIView);
      
      // Tworzenie obiektu typu Scene z kontenerem typu HBox jako węzłem korzenia.
      Scene scene = new Scene(hbox);
      
      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);
      
      // Określanie tytułu płótna.
      primaryStage.setTitle("Obrazy");

      // Wyświetlanie okna.
      primaryStage.show();
   }
}
