import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

/**
 *  Przycisk z obsługą zdarzeń z użyciem wyrażeń lambda.
 */

public class LambdaDemo extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie etykiety.
      Label myLabel = new Label("Kliknij przycisk, aby zobaczyć komunikat.");
      
      // Tworzenie przycisku.
      Button myButton = new Button("Kliknij mnie");
      myButton.setOnAction(event ->
      {
         myLabel.setText("Dziękujemy za kliknięcie przycisku.");
      });
      
      // Dodawanie etykiety i przycisku do kontenera typu VBox z odstępami wielkości 10 pikseli.
      VBox vbox = new VBox(10, myLabel, myButton);
      
      // Tworzenie sceny z kontenerem typu VBox jako węzłem korzenia.
      Scene scene = new Scene(vbox, 300, 100);
      
      // Wyśrodkowanie zawartości sceny.
      vbox.setAlignment(Pos.CENTER);
      
      // Dodawanie sceny do płótna.
      primaryStage.setScene(scene);
      
      // Ustawianie tytułu płótna.
      primaryStage.setTitle("LambdaDemo");
      
      // Wyświetlanie okna.
      primaryStage.show();
   }
}
