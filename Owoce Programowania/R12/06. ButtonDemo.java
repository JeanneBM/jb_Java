import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

/**
 *  Ilustracja działania przycisków.
 */

public class ButtonDemo extends Application
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

      // Umieszczanie kontrolek typu Label i Button w obiekcie typu VBox z odstępami 10 pikseli.
      VBox vbox = new VBox(10, myLabel, myButton);
      
      // Tworzenie obiektu typu Scene z kontenerem typu VBox jako węzłem korzenia.
      Scene scene = new Scene(vbox, 300, 100);

      // Wyśrodkowanie sceny.
      vbox.setAlignment(Pos.CENTER);

      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);
      
      // Podawanie tytułu płótna.
      primaryStage.setTitle("Przycisk");

      // Wyświetlanie okna.
      primaryStage.show();
   }
}
