import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ComboBoxDemo2 extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie kontrolki typu ComboBox.
      ComboBox<String> comboBox = new ComboBox<>();
      comboBox.getItems().addAll("Anglia", "Szkocja",
                                 "Irlandia", "Walia");

      // Tworzenie kontrolki typu Label.
      Label outputLabel = new Label("Wybierz państwo");

      // Rejestrowanie obiektu obsługi zdarzeń dla kontrolki typu ComboBox.
      comboBox.setOnAction(event ->
      {
         outputLabel.setText(comboBox.getValue());
      });
   
      // Dodawanie kontrolek do kontenera typu VBox.
      VBox vbox = new VBox(10, comboBox, outputLabel);
      vbox.setPadding(new Insets(10));
      vbox.setAlignment(Pos.CENTER);
               
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
