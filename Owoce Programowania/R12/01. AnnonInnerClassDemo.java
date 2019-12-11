import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  Obsługa przycisku za pomocą anonimowej klasy wewnętrznej.
 */

public class AnnonInnerClassDemo extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie kontrolki typu Label.
      Label myLabel = new Label("Kliknij przycisk, aby zobaczyć komunikat.");
      
      // Tworzenie kontrolki typu Button.
      Button myButton = new Button("Kliknij mnie");
      myButton.setOnAction(new EventHandler<ActionEvent>()
      {
         @Override
         public void handle(ActionEvent event)
         {
            myLabel.setText("Dziękujemy za kliknięcie przycisku.");
         }
      });
      
      // Umieszczanie etykiety i przycisku w kontenerze typu VBox z odstępami 10 pikseli.
      VBox vbox = new VBox(10, myLabel, myButton);
      
      // Tworzenie sceny z kontenerem typu VBox jako węzłem korzenia.
      Scene scene = new Scene(vbox, 300, 100);
      
      // Wyśrodkowanie zawartości sceny.
      vbox.setAlignment(Pos.CENTER);
      
      // Dodawanie sceny do płótna.
      primaryStage.setScene(scene);
      
      // Określanie tytułu płótna.
      primaryStage.setTitle("Demonstracja działania przycisku");
      
      // Wyświetlanie okna.
      primaryStage.show();
   }
}
