import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ListViewDemo5 extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające szerokość i wysokość kontrolki typu ListView.
      final double WIDTH = 120.0, HEIGHT = 100.0;

      // Tworzenie kontrolki typu ListView zawierającej liczby całkowite.
      ListView<Integer> listView = new ListView<>();
      listView.setPrefSize(WIDTH, HEIGHT);
      listView.getItems().addAll(1, 2, 3, 4, 5);
      listView.getSelectionModel().setSelectionMode(
           SelectionMode.MULTIPLE);
      
      // Tworzenie kontrolki typu Label do wyświetlania wyniku.
      Label outputLabel = new Label("Zaznacz wybrane liczby");

      // Tworzenie przycisku do obliczania sumy.
      Button totalButton = new Button("Oblicz sumę");

      // Tworzenie obiektu obsługi zdarzeń dla przycisku.
      totalButton.setOnAction(event ->
      {
         // Sprawdzanie, czy choć jeden element jest zaznaczony.
         if (listView.getSelectionModel().getSelectedIndex() != -1)
         {
            // Pobieranie listy typu ObservableList z zaznaczonymi elementami.
            ObservableList<Integer> selections =
               listView.getSelectionModel().getSelectedItems();
            
            // Zmienna akumulatora.
            int total = 0;

            // Obliczanie sumy liczb.
            for (int num : selections)
               total += num;
               
            // Wyświetlanie sumy w kontrolce typu Label.
            outputLabel.setText(Integer.toString(total));
         }
         else
         {
            outputLabel.setText("Nie zaznaczono żadnych elementów");
         }
      });
      
      // Dodawanie kontrolek do kontenera typu VBox.
      VBox vbox = new VBox(10, listView, outputLabel, totalButton);
      vbox.setPadding(new Insets(10));
      vbox.setAlignment(Pos.CENTER);
               
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
