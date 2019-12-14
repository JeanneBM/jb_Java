import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class SliderDemo extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe dotyczące suwaka.
      final double MIN = 0.0, MAX = 100.0, INITIAL = 0.0;
      final double MAJOR_TICK_UNIT = 20.0;
      final int MINOR_TICK_COUNT = 5;
      final double SLIDER_WIDTH = 300.0;
      
      // Różne stałe.
      final double LABEL_WIDTH = 50.0;
      final double SPACING = 10.0;
      
      // Tworzenie kontrolek dotyczących stopni Fahrenheita.
      Label fDescriptor = new Label("Stopnie Fahrenheita: ");
      Label fLabel = new Label("32,0");
      fLabel.setStyle("-fx-border-style: solid;" +
                      "-fx-alignment: center");
      fLabel.setPrefWidth(LABEL_WIDTH);
      HBox fHBox = new HBox(SPACING, fDescriptor, fLabel);
      fHBox.setAlignment(Pos.CENTER);
      
      // Tworzenie kontrolek dotyczących stopni Celsjusza.
      Label cDescriptor = new Label("Stopnie Celsjusza: ");
      Label cLabel = new Label("0,0");
      cLabel.setStyle("-fx-border-style: solid;" +
                      "-fx-alignment: center");
      cLabel.setPrefWidth(LABEL_WIDTH);
      HBox cHBox = new HBox(SPACING, cDescriptor, cLabel);
      cHBox.setAlignment(Pos.CENTER);
        
      // Tworzenie suwaka.
      Slider slider = new Slider(MIN, MAX, INITIAL);
      slider.setShowTickMarks(true);
      slider.setMajorTickUnit(MAJOR_TICK_UNIT);
      slider.setMinorTickCount(MINOR_TICK_COUNT);
      slider.setShowTickLabels(true);
      slider.setSnapToTicks(true);
      slider.setPrefWidth(SLIDER_WIDTH);
      
      // Rejestrowanie obiektu obsługi zdarzeń dla suwaka.
      slider.valueProperty().addListener(
         (observeable, oldvalue, newvalue) ->
         {
            // Pobieranie z suwaka temperatury w stopniach Celsjusza.
            double celsius = slider.getValue();

            // Przeliczanie stopni Celsjusza na stopnie Fahrenheita.
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            
            // Wyświetlanie temperatury w stopniach Celsjusza i Fahrenheita.
            cLabel.setText(String.format("%.1f", celsius));
            fLabel.setText(String.format("%.1f", fahrenheit));
         });
      
      // Dodawanie kontrolek do kontenera typu VBox.
      VBox vbox = new VBox(10, fHBox, cHBox, slider);
      vbox.setAlignment(Pos.CENTER);
      vbox.setPadding(new Insets(SPACING));
               
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
