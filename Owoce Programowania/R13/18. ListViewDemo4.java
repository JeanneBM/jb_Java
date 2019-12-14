import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ListViewDemo4 extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające wielkość kontrolek typu ListView.
      final double WIDTH = 120, HEIGHT = 140;

      // Tworzenie kontrolki typu ListView z nazwami miesięcy.
      ListView<String> listView1 = new ListView<>();
      listView1.setPrefSize(WIDTH, HEIGHT);
      listView1.getSelectionModel().setSelectionMode(
           SelectionMode.MULTIPLE);
      listView1.getItems().addAll(
           "Styczeń", "Luty", "Marzec", "Kwiecień", "Maj",
           "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik",
           "Listopad", "Grudzień");

      // Tworzenie pustej kontrolki typu ListView do wyświetlania zaznaczonych elementów.
      ListView<String> listView2 = new ListView<>();
      listView2.setPrefSize(WIDTH, HEIGHT);
      
      // Tworzenie przycisku do pobierania zaznaczonych elementów.
      Button getButton = new Button("Pobierz zaznaczone elementy");

      // Rejestrowanie obiektu obsługi zdarzeń dla przycisku.
      getButton.setOnAction(event ->
      {
         // Tworzenie obiektu typu ObservableList z zaznaczonymi elementami.
         ObservableList<String> selections =
            listView1.getSelectionModel().getSelectedItems();
         
         // Dodawanie zaznaczonych elementów do drugiej kontrolki typu ListView.
         listView2.getItems().setAll(selections);
      });
      
      // Dodawanie kontrolek do kontenera typu VBox.
      VBox vbox = new VBox(10, listView1, 
                           listView2, getButton);
      vbox.setPadding(new Insets(10));
      vbox.setAlignment(Pos.CENTER);
               
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
