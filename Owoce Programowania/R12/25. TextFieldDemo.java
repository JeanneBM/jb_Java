import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  Program TextFieldDemo.
 */

public class TextFieldDemo extends Application
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
      Label myLabel = new Label("Wpisz tekst i kliknij przycisk:");
      
      // Tworzenie kontrolki typu TextField.
      TextField myTextField = new TextField();
      
      // Tworzenie przycisku.
      Button myButton = new Button("Kliknij mnie");
      
      // Dodawanie etykiety i pola tekstowego w kontenerze typu HBox z odstępami 10 pikseli.
      HBox hbox = new HBox(10, myLabel, myTextField);
      hbox.setPadding(new Insets(10));
      
      // Dodawanie kontenera typu HBox i przycisku do kontenera typu VBox z odstępami 10 pikseli.
      VBox vbox = new VBox(10, hbox, myButton);
      vbox.setPadding(new Insets(10));
      
      // Tworzenie sceny z kontenerem typu VBox jako węzłem korzenia.
      Scene scene = new Scene(vbox);
      
      // Wyśrodkowanie zawartości sceny.
      vbox.setAlignment(Pos.CENTER);
      
      // Dodawanie sceny do płótna.
      primaryStage.setScene(scene);
      
      // Ustawiwanie tytułu płótna.
      primaryStage.setTitle("TextFieldDemo");
      
      // Wyświetlanie okna.
      primaryStage.show();
   }
   
   class ButtonClickHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         
      }
   }
}
