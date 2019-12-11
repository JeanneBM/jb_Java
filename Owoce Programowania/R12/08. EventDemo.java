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
 *  Program EventDemo.
 */

public class EventDemo extends Application
{
   // Pole przeznaczone na kontrolkę typu Label.
   private Label myLabel;
   
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie kontrolki typu Label.
      myLabel = new Label("Kliknij przycisk, aby zobaczyć komunikat.");

      // Tworzenie kontrolki typu Button.
      Button myButton = new Button("Kliknij mnie");

      // Rejestrowanie obiektu obsługi zdarzeń.
      myButton.setOnAction(new ButtonClickHandler());
      
      // Dodawanie obiektów typów Label i Button do obiektu typu VBox z odstępami 10 pikseli.
      VBox vbox = new VBox(10, myLabel, myButton);

      // Tworzenie obiektu typu Scene z kontenerem typu VBox jako węzłem korzenia.
      Scene scene = new Scene(vbox, 300, 100);
 
      // Wyśrodkowanie sceny.
      vbox.setAlignment(Pos.CENTER);
      
      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);

      // Ustawianie tytułu płótna.
      primaryStage.setTitle("Przycisk");

      // Wyświetlanie okna.
      primaryStage.show();
   }
   
   /*
    * Klasa obsługi zdarzeń dotyczących przycisku myButton.
    */
    
   class ButtonClickHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         myLabel.setText("Dziękujemy za kliknięcie przycisku!");
      }
   }
}
