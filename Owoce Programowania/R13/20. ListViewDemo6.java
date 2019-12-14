import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;

public class ListViewDemo6 extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające wymiary kontrolki typu ListView.
      final double WIDTH = 425.0, HEIGHT = 200.0;
      
      // Tworzenie obiektów typu Image.
      Image aceSpadesImage = new Image("file:Ace_Spades.png");
      Image kingSpadesImage = new Image("file:King_Spades.png");
      Image queenSpadesImage = new Image("file:Queen_Spades.png");
      
      // Tworzenie kontrolek typu ImageView.
      ImageView aceSpadesIV = new ImageView(aceSpadesImage);
      ImageView kingSpadesIV = new ImageView(kingSpadesImage);
      ImageView queenSpadesIV = new ImageView(queenSpadesImage);
      
      // Tworzenie kontrolki typu ListView z obiektami typu ImageView.
      ListView<ImageView> listView = new ListView<>();
      listView.setPrefSize(WIDTH, HEIGHT);
      listView.setOrientation(Orientation.HORIZONTAL);
      listView.getItems().addAll(aceSpadesIV, kingSpadesIV,
                                 queenSpadesIV);
      
      // Tablica z nazwami kart.
      String[] cardNames = {"As pik", "Król pik",
                            "Dama pik"};

      // Tworzenie kontrolki typu Label do wyświetlania zaznaczonej karty.
      Label outputLabel = new Label("Wybierz kartę");

      // Tworzenie obiektu obsługi zdarzeń dla kontrolki typu ListView.
      listView.getSelectionModel().selectedItemProperty().addListener(event ->
      {
         // Pobieranie indeksu zaznaczonej karty.
         int index = listView.getSelectionModel().getSelectedIndex();

         // Wyświetlanie nazwy zaznaczonej karty w kontrolce typu Label.
         outputLabel.setText(cardNames[index]);
      });
      
      // Dodawanie kontrolek do kontenera typu VBox.
      VBox vbox = new VBox(10, listView, outputLabel);
      vbox.setPadding(new Insets(10));
      vbox.setAlignment(Pos.CENTER);
               
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
