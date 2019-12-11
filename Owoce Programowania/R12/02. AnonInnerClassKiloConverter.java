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
 *  W tej wersji aplikacji do utworzenia obiektu obsługi zdarzeń
 *  używana jest anonimowa klasa wewnętrzna.
 */

public class AnonInnerClassKiloConverter extends Application
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
      // Tworzenie obiektu typu Label do wyświetlania pytania.
      Label promptLabel = new Label("Podaj odległość w kilometrach:");

      // Tworzenie kontrolki typu TextField na dane wejściowe.
      kiloTextField = new TextField();
      
      // Tworzenie przycisku do uruchamiania przeliczeń.
      Button calcButton = new Button("Przelicz");

      // Tworzenie obiektu obsługi zdarzeń.
      calcButton.setOnAction(new EventHandler<ActionEvent>()
      {
         @Override
         public void handle(ActionEvent event)
         {
            // Pobieranie liczby kilometrów.
            Double kilometers = Double.parseDouble(kiloTextField.getText());

            // Przeliczanie kilometrów na mile.
            Double miles = kilometers * 0.6214;

            // Wyświetlanie wyniku.
            resultLabel.setText(String.format("%,.2f w milach", miles));
         }
      });
      
      // Tworzenie pustej kontrolki typu Label do wyświetlania wyniku.
      resultLabel = new Label();

      // Dodawanie kontrolek promptLabel i kiloTextField do kontenera typu HBox.
      HBox hbox = new HBox(10, promptLabel, kiloTextField);
 
      // Dodawanie kontrolek HBox, calcButton i resultLabel do kontenera typu VBox.
      VBox vbox = new VBox(10, hbox, calcButton, resultLabel);

      // Wyśrodkowanie zawartości kontenera typu VBox.
      vbox.setAlignment(Pos.CENTER);
      
      // Ustawianie marginesu kontenera typu VBox na 10 pikseli.
      vbox.setPadding(new Insets(10));

      // Tworzenie obiektu typu Scene.
      Scene scene = new Scene(vbox);

      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);
      
      // Ustawianie tytułu płótna.
      primaryStage.setTitle("Przeliczanie kilometrów");

      // Wyświetlanie okna.
      primaryStage.show();   
   }
}
