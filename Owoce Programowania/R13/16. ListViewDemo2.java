import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ListViewDemo2 extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie kontrolki typu ListView z łańcuchami znaków.
     ListView<String> listView = new ListView<>();
     listView.setPrefSize(120, 100);
     listView.getItems().addAll("Stefan", "Beata", "Wojciech", "Katarzyna");

     // Tworzenie kontrolki typu Label, gdzie wyświetlane jest zaznaczone imię.
     Label selectedNameLabel = new Label("Zaznacz imię");

     // Tworzenie przycisku do pobierania zaznaczonego imienia.
     Button getButton = new Button("Pobierz zaznaczone imię");

     // Tworzenie obiektu obsługi zdarzeń dla przycisku.
      getButton.setOnAction(event ->
      {
         // Sprawdzanie, czy zaznaczono któryś z elementów.
         if (listView.getSelectionModel().getSelectedIndex() != -1)
         {
            // Pobieranie zaznaczonego imienia.
            String selected = 
                    listView.getSelectionModel().getSelectedItem();
         
            // Wyświetlanie zaznaczonego imienia w kontrolce typu Label.
            selectedNameLabel.setText(selected);
         }
         else
         {
            selectedNameLabel.setText("Nie zaznaczono imienia");
         }
      });
      
      // Dodawanie kontrolek do kontenera typu VBox.
      VBox vbox = new VBox(10, listView, selectedNameLabel, getButton);
      vbox.setPadding(new Insets(10));
      vbox.setAlignment(Pos.CENTER);
               
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
