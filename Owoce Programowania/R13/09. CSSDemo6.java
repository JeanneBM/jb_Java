import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class CSSDemo6 extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie etykiety.
      Label myLabel = new Label("Witaj, świecie!");
      
      // Dodawanie etykiety do kontenera typu VBox.
      VBox vbox = new VBox(myLabel);
      vbox.setAlignment(Pos.CENTER);
      vbox.setPadding(new Insets(10));
      
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(vbox);
      scene.getStylesheets().add("demo5.css");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
