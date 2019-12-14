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
 *  Aplikacja do przeliczania kilometrów z debugowaniem z użyciem konsoli.
 */

public class ConsoleDebugging extends Application
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
      // Tworzenie obiektu typu Label do wyświetlania informacji.
      Label promptLabel = new Label("Wpisz odległość w kilometrach:");

      // Tworzenie kontrolki typu TextField na dane wejściowe.
      kiloTextField = new TextField();

      // Tworzenie przycisku do uruchamiania przeliczeń.
      Button calcButton = new Button("Przelicz");

      // Tworzenie obiektu obsługi zdarzeń.
      calcButton.setOnAction(event ->
      {
         // Na potrzeby debugowania wyświetlany jest wpisany tekst i
         // jego wartość przekształcona na typ double.
         System.out.printf("Wczytano %s z pola tekstowego. \n",
                           kiloTextField.getText());
         System.out.printf("Wartość po przekształceniu: %f.\n",
                           Double.parseDouble(kiloTextField.getText()));

         // Pobieranie liczby kilometrów.
         Double kilometers = Double.parseDouble(kiloTextField.getText());
         
         // Przeliczanie kilometrów na mile.
         Double miles = kilometers * 0.6214;
         
         // Wyświetlanie wyników.
         resultLabel.setText(String.format("%,.2f w milach", miles));
  
         // Na potrzeby debugowania wyświetlany jest komunikat z informacją,
         // że aplikacja jest gotowa na pobranie następnych danych wejściowych.
         System.out.println("Można wpisać kolejne dane wejściowe.");
       });

      // Tworzenie pustej kontrolki typu Label do wyświetlania wyników.
      resultLabel = new Label();
      
      // Umieszczanie kontrolek promptLabel i kiloTextField w kontenerze typu HBox.
      HBox hbox = new HBox(10, promptLabel, kiloTextField);

      // Umieszczanie kontenera typu HBox i kontrolek calcButton oraz resultLabel do kontenera typu VBox.
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
