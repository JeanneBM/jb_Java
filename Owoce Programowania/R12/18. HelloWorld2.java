import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

/**
 *  Aplikacja HelloWorld oparta na bibliotece JavaFX.
 */

public class HelloWorld2 extends Application
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
      
      //Tworzenie obiektu typu Scene z kontrolką typu HBox jako węzłem korzenia.
      Scene scene = new Scene(hbox, 300, 100);

      // Ustawianie wyrównania kontrolek w kontenerze typu HBox na centralne.
      hbox.setAlignment(Pos.CENTER);

      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);
      
      // Określanie tytułu płótna.
      primaryStage.setTitle("Pierwsza scena");

      // Wyświetlanie okna.
      primaryStage.show();
   }
}
