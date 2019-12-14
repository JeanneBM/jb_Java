import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class CSSDemo2 extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie kontrolki typu Label i kilku przycisków.
      Label label = new Label("Kontrolka typu Label.");
      Button button1 = new Button("Przycisk numer 1");
      Button button2 = new Button("Przycisk numer 2");

      // Umieszczanie kontrolek w kontenerze typu HBox.
      HBox hbox = new HBox(10, label, button1, button2);
      hbox.setAlignment(Pos.CENTER);
      hbox.setPadding(new Insets(10));
      
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(hbox);
      scene.getStylesheets().add("demo2.css");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
