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
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  Aplikacja MetricConverter.
 */

public class MetricConverter extends Application
{
   // Pola.
   private TextField kiloTextField;
   private Label resultLabel;
   private RadioButton milesButton;
   private RadioButton feetButton;
   private RadioButton inchesButton;
   
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie kontrolki typu Label do wyświetlania informacji.
      Label promptLabel = new Label("Podaj odległość w kilometrach:");

      // Tworzenie kontrolki typu TextField na dane wejściowe.
      kiloTextField = new TextField();
      
      // Tworzenie kontrolek typu RadioButton.
      milesButton = new RadioButton("Przeliczanie na mile");
      feetButton = new RadioButton("Przeliczanie na stopy");
      inchesButton = new RadioButton("Przeliczanie na cale");

      // Zaznaczanie kontrolki milesButton.
      milesButton.setSelected(true);
      
      // Dodawanie kontrolek typu RadioButton do kontrolki typu ToggleGroup.
      ToggleGroup radioGroup = new ToggleGroup();
      milesButton.setToggleGroup(radioGroup);
      feetButton.setToggleGroup(radioGroup);
      inchesButton.setToggleGroup(radioGroup);
      
      // Tworzenie przycisku do uruchamiania przeliczeń.
      Button calcButton = new Button("Przelicz");

      // Rejestrowanie obiektu do obsługi zdarzeń.
      calcButton.setOnAction(new CalcButtonHandler());
            
      // Tworzenie pustej kontrolki typu Label do wyświetlania wyników.
      resultLabel = new Label();

      // Dodawanie kontrolek promptLabel i kiloTextField do kontenera typu HBox.
      HBox promptHBox = new HBox(10, promptLabel, kiloTextField);
      
      // Dodawanie kontrolek typu RadioButton do kontenera typu HBox.
      HBox radioHBox = new HBox(20, milesButton, feetButton,
                                inchesButton);
      
      // Dodawanie wszystkich kontrolek do kontenera typu VBox.
      VBox mainVBox = new VBox(10, promptHBox, radioHBox, calcButton,
                               resultLabel);
      
      // Wyśrodkowanie zawartości kontenera typu VBox.
      mainVBox.setAlignment(Pos.CENTER);

      // Ustawianie marginesu kontenera typu VBox na 10 pikseli.
      mainVBox.setPadding(new Insets(10));
      
      // Tworzenie sceny.
      Scene scene = new Scene(mainVBox);
 
      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);
      
      // Ustawianie tytułu płótna.
      primaryStage.setTitle("Przeliczanie miar");

      // Wyświetlanie okna.
      primaryStage.show();   
   }
   
   /*
    * Klasa obsługi zdarzeń dla kontrolki calcButton.
    */
    
   class CalcButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Stałe używane do przeliczania miar.
         final double MILES_CONVERSION = 0.6214;
         final double FEET_CONVERSION = 3281.0;
         final double INCHES_CONVERSION = 39370.0;
         
         // Zmienna do przechowywania wyniku.
         double result = 0;

         // Pobieranie liczby kilometrów.
         double kilometers = Double.parseDouble(kiloTextField.getText());
         
         // Wykonywanie wybranej konwersji.
         if (milesButton.isSelected())
            result = kilometers * MILES_CONVERSION;
         
         if (feetButton.isSelected())
            result = kilometers * FEET_CONVERSION;
         
         if (inchesButton.isSelected())
            result = kilometers * INCHES_CONVERSION;
         
         // Wyświetlanie wyników.
         resultLabel.setText(String.format("%,.2f", result));
      }
   }
}
