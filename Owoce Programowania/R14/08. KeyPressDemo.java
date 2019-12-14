import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.event.EventHandler;

public class KeyPressDemo extends Application
{
   private int count = 0;    // Przechowywanie liczby wciśnięć klawiszy.
   
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie etykiety.
      Label label = new Label("0");
      
      // Dodawanie etykiety do kontenera typu HBox.
      HBox hbox = new HBox(10, label);
      hbox.setAlignment(Pos.CENTER);
      hbox.setPadding(new Insets(10));

      // Tworzenie sceny z kontenerem typu HBox jako węzłem korzenia.
      Scene scene = new Scene(hbox);

      // Rejestrowanie dla sceny obiektu obsługi zdarzeń typu KEY_PRESSED.
      scene.setOnKeyPressed(event ->
      {
         count++;
         label.setText(String.format("%d", count));
      });

      // Przypisywanie sceny do płótna i jej wyświetlanie.
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
