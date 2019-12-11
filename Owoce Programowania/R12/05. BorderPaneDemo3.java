import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

/**
 *  Aplikacja BorderPaneDemo3.
 */

public class BorderPaneDemo3 extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie przycisków.
      Button centerButton = new Button("Środkowy obszar");
      Button topButton = new Button("Górny obszar");
      Button bottomButton = new Button("Dolny obszar");
      Button leftButton = new Button("Lewy obszar");
      Button rightButton = new Button("Prawy obszar");
      
      // Dodawanie każdego przycisku do odrębnego kontenera.
      HBox centerHBox = new HBox(centerButton);
      HBox topHBox = new HBox(topButton);
      HBox bottomHBox = new HBox(bottomButton);
      VBox leftVBox = new VBox(leftButton);
      VBox rightVBox = new VBox(rightButton);

      // Wyrównywanie kontrolek w kontenerach górnym i dolnym.
      topHBox.setAlignment(Pos.CENTER);
      bottomHBox.setAlignment(Pos.CENTER);
      
      // Tworzenie kontenera typu BorderPane.
      BorderPane borderPane = 
         new BorderPane(centerHBox, topHBox, rightVBox,
                        bottomHBox, leftVBox);
      
      // Tworzenie obiektu typu Scene z kontenerem typu BorderPane jako węzłem korzenia.
      Scene scene = new Scene(borderPane);

      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);

      // Wyświetlanie okna.
      primaryStage.show();
   }
}
