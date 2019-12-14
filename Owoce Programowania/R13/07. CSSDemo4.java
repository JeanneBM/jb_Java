import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class CSSDemo4 extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie kontrolek typów Label i Button.
      Label myLabel = new Label("Witaj, świecie!");
      Button myButton = new Button("Kliknij mnie");

      // Umieszczanie kontrolek w kontenerze typu VBox.
      VBox vbox = new VBox(10, myLabel, myButton);
      vbox.setAlignment(Pos.CENTER);
      vbox.setPadding(new Insets(10));
      
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(vbox);
      scene.getStylesheets().add("demo4.css");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
