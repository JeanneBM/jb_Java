import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  Ilustracja obsługi zdarzeń typu ActionEvent w kontrolkach typu RadioButton.
 */

public class RadioButtonEvent extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie dwóch obiektów typu Image.
      Image flowerImage = new Image("file:Flower.jpg");
      Image sunsetImage = new Image("file:Sunset.jpg");
      
      // Tworzenie obiektu typu ImageView.
      ImageView imageView = new ImageView(flowerImage);
      
      // Zmiana wielkości obiektu typu ImageView z zachowaniem proporcji.
      imageView.setFitWidth(200);
      imageView.setPreserveRatio(true);
      
      // Umieszczanie kontrolki typu ImageView w kontenerze typu HBox.
      HBox imageHBox = new HBox(imageView);
      
      // Wyśrodkowanie zawartości kontenera typu HBox.
      imageHBox.setAlignment(Pos.CENTER);
      
      // Tworzenie kontrolek typu RadioButton.
      RadioButton flowerRadio = new RadioButton("Kwiatek");
      RadioButton sunsetRadio = new RadioButton("Zachód słońca");
      
      // Zaznaczanie kontrolki flowerRadio.
      flowerRadio.setSelected(true);
      
      // Dodawanie kontrolek typu RadioButton do kontrolki typu ToggleGroup.
      ToggleGroup radioGroup = new ToggleGroup();
      flowerRadio.setToggleGroup(radioGroup);
      sunsetRadio.setToggleGroup(radioGroup);
      
      // Rejestrowanie obiektu obsługi zdarzenia ActionEvent dla kontrolki flowerRadio.
      flowerRadio.setOnAction(event ->
      {
         imageView.setImage(flowerImage);
      });
      
      // Rejestrowanie obiektu obsługi zdarzeń dla kontrolki sunsetRadio.
      sunsetRadio.setOnAction(event ->
      {
         imageView.setImage(sunsetImage);
      });
      
      // Dodawanie kontrolek typu RadioButton do kontenera typu VBox.
      VBox radioVBox = new VBox(10, flowerRadio, sunsetRadio);

      // Ustawianie marginesu w kontrolce radioVBox.
      radioVBox.setPadding(new Insets(30));

      // Dodawanie wszystkich kontrolek do kontenera typu VBox.
      VBox mainVBox = new VBox(10, imageHBox, radioVBox);
      
      // Tworzenie obiektu typu Scene z kontenerem typu HBox jako węzłem korzenia.
      Scene scene = new Scene(mainVBox);

      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);

      // Wyświetlanie okna.
      primaryStage.show();
   }
}
