import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;

/**
 *  Aplikacja HelloWorld oparta na bibliotece JavaFX.
 */

public class HelloWorld extends Application
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
      Label messageLabel = new Label("Witaj, świecie!");

      // Umieszczanie kontrolki typu Label w kontenerze typu HBox.
      HBox hbox = new HBox(messageLabel);
      
      // Tworzenie obiektu typu Scene z kontenerem typu HBox jako węzłem korzenia.
      Scene scene = new Scene(hbox);

      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);
      
      // Określanie tytułu płótna.
      primaryStage.setTitle("Pierwsza scena");

      // Wyświetlanie okna.
      primaryStage.show();
   }
}
