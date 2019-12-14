import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class CSSDemo9 extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie przycisków.
      Button button1 = new Button("Przycisk numer 1");
      button1.getStyleClass().add("button-black");

      Button button2 = new Button("Przycisk numer 2");
      button2.getStyleClass().add("button-white");

      // Umieszczanie przycisków w kontenerze typu HBox.
      HBox hbox = new HBox(10, button1, button2);
      hbox.setAlignment(Pos.CENTER);
      hbox.setPadding(new Insets(10));
      
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(hbox);
      scene.getStylesheets().add("demo9.css");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
