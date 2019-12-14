import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class HorizontalListView extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a horizontal ListView.
      ListView<String> listView = new ListView<>();
      listView.getItems().addAll("Poniedziałek", "Wtorek", "Środa",
                           "Czwartek", "Piątek", "Sobota",
                           "Niedziela");
      listView.setOrientation(Orientation.HORIZONTAL);
      listView.setPrefSize(200, 50);
      
      // Dodawanie kontrolek do kontenera typu HBox.
      HBox hbox = new HBox(listView);
      hbox.setPadding(new Insets(10));
      hbox.setAlignment(Pos.CENTER);
               
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(hbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
