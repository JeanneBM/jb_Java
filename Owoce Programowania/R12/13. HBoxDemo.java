import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

/**
 *  Program HBoxDemo.
 */

public class HBoxDemo extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie trzech przycisków.
      Button button1 = new Button("Przycisk nr 1");
      Button button2 = new Button("Przycisk nr 2");
      Button button3 = new Button("Przycisk nr 3");
      
      // Tworzenie kontenera typu HBox.
      HBox hbox = new HBox(10, button1, button2, button3);
      hbox.setPadding(new Insets(10));
      
      // Tworzenie sceny z kontenerem typu HBox jako węzłem korzenia.
      // Scena ma wielkość 300 pikseli na 100 pikseli.
      Scene scene = new Scene(hbox, 300, 100);
      
      // Dodawanie sceny do płótna.
      primaryStage.setScene(scene);
      
      // Określanie tytułu płótna.
      primaryStage.setTitle("HBoxDemo");
      
      // Wyświetlanie okna.
      primaryStage.show();
   }
}
