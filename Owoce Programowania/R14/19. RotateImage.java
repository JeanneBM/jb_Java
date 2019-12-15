import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.animation.RotateTransition;
import javafx.util.Duration;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  Demonstracja animacji.
 */

public class RotateImage extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające wielkość sceny.
      final double SCENE_WIDTH = 250.0;
      final double SCENE_HEIGHT = 350.0;
      
      // Stałe do tworzenia animacji.
      final double HALF_SEC = 500.0;
      final double FROM_ANGLE = 0.0;
      final double TO_ANGLE = 360.0;
      
      // Stała określająca wielkość marginesu.
      final double PADDING_SPACE = 20.0;

      // Tworzenie kontenera typu BorderPane.
      BorderPane borderPane = new BorderPane();

      // Tworzenie obiektów typów Image i ImageView.
      Image image = new Image("file:Ace_Diamonds.png");
      ImageView imageView = new ImageView(image);

      // Tworzenie obiektu typu RotateTransition dla obiektu typu ImageView.
      RotateTransition rtrans =
         new RotateTransition(new Duration(HALF_SEC), imageView);
      rtrans.setFromAngle(FROM_ANGLE);
      rtrans.setToAngle(TO_ANGLE);
      
      // Umieszczanie kontrolki typu ImageView pośrodku kontenera typu BorderPane.
      borderPane.setCenter(imageView);
      
      // Tworzenie przycisku uruchamiającego animację.
      Button spinButton = new Button("Obróć");
      
      // Tworzenie obiektu obsługi zdarzeń dla przycisku.
      spinButton.setOnAction(event ->
      {
         rtrans.play();
      });
      
      // Umieszczanie przycisku w kontenerze typu HBox.
      HBox hbox = new HBox(spinButton);
      hbox.setAlignment(Pos.CENTER);
      hbox.setPadding(new Insets(PADDING_SPACE));
      
      // Umieszczanie kontenera typu HBox w dolnym obszarze kontenera typu BorderPane.
      borderPane.setBottom(hbox);
      
      // Tworzenie sceny i jej wyświetlanie.
      Scene scene = new Scene(borderPane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
