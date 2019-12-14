import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  Aplikacja do przeliczania kilometrów ze stylami CSS.
 */

public class CSSKiloConverter extends Application
{
   // Pola.
   private TextField kiloTextField;
   private Label resultLabel;
   
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie etykiety do wyświetlania instrukcji.
      Label promptLabel = new Label("Podaj odległość w kilometrach:");
      
      // Tworzenie pola tekstowego na dane wejściowe.
      kiloTextField = new TextField();
      
      // Tworzenie przycisku do uruchamiania przeliczeń.
      Button calcButton = new Button("Przelicz");
      
      // Tworzenie obiektu obsługi zdarzeń.
      calcButton.setOnAction(event ->
      {         
         // Pobieranie liczby kilometrów.
         Double kilometers = Double.parseDouble(kiloTextField.getText());
         
         // Przeliczanie kilometrów na mile.
         Double miles = kilometers * 0.6214;
         
         // Wyświetlanie wyników.
         resultLabel.setText(String.format("%,.2f w milach", miles));
      });
      
      // Tworzenie pustej etykiety do wyświetlania wyników.
      resultLabel = new Label();
      resultLabel.setStyle("-fx-font-size: 14pt; -fx-font-weight: bold");
      
      // Umieszczanie kontrolek promptLabel i kiloTextField w kontenerze typu HBox.
      HBox hbox = new HBox(10, promptLabel, kiloTextField);
      
      // Umieszczanie kontrolek HBox, calcButton i resultLabel w kontenerze typu VBox.
      VBox vbox = new VBox(10, hbox, calcButton, resultLabel);
      
      // Wyśrodkowanie zawartości kontenera typu VBox.
      vbox.setAlignment(Pos.CENTER);
      
      // Ustawianie odstępów w kontenerze typu VBox na 10 pikseli.
      vbox.setPadding(new Insets(10));
      
      // Tworzenie sceny.
      Scene scene = new Scene(vbox);

      // Dodawanie sceny do płótna.
      primaryStage.setScene(scene);
      
      // Ustawianie tytułu płótna.
      primaryStage.setTitle("Przeliczanie kilometrów");
      
      // Wyświetlanie okna.
      primaryStage.show();   
   }
}
