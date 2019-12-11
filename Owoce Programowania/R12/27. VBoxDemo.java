import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

/**
 *  Program VBoxDemo.
 */

public class VBoxDemo extends Application
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
      
      // Tworzenie kontenera typu VBox.
      VBox vbox = new VBox(10, button1, button2, button3);
      vbox.setPadding(new Insets(10));
      vbox.setAlignment(Pos.CENTER);
      
      // Tworzenie sceny z kontenerem typu VBox jako węzłem korzenia.
      Scene scene = new Scene(vbox);
      
      // Dodawanie sceny do płótna.
      primaryStage.setScene(scene);
      
      // Ustawianie tytułu płótna.
      primaryStage.setTitle("VBoxDemo");
      
      // Wyświetlanie okna.
      primaryStage.show();
   }
}
