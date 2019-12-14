import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.control.Slider;

/**
 *  Demonstracja używania klasy Image.
 */

public class ColorAdjustDemo extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe dotyczące suwaków.
      final double MIN = -1.0, MAX = 1.0, INITIAL = 0.0;
      
      // Tworzenie efektu typu ColorAdjust.
      ColorAdjust colorAdjust = new ColorAdjust();
      
      // Tworzenie obiektów typów Image i ImageView.
      Image image = new Image("file:flower.jpg");
      ImageView imageView = new ImageView(image);
      imageView.setEffect(colorAdjust);
      
      // Tworzenie suwaka do zmiany odcieni.
      Slider hueSlider = new Slider(MIN, MAX, INITIAL);
      hueSlider.setShowTickMarks(true);
      hueSlider.setShowTickLabels(true);
      hueSlider.setMajorTickUnit(0.25f);
      hueSlider.setBlockIncrement(0.1f);
      
      // Tworzenie obiektu obsługi zdarzeń.
      hueSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> 
      {
         colorAdjust.setHue(newvalue.doubleValue()); 
      });
      
      // Tworzenie suwaka do zmiany nasycenia.
      Slider satSlider = new Slider(MIN, MAX, INITIAL);
      satSlider.setShowTickMarks(true);
      satSlider.setShowTickLabels(true);
      satSlider.setMajorTickUnit(0.25f);
      satSlider.setBlockIncrement(0.1f);
      
      // Tworzenie obiektu obsługi zdarzeń.
      satSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> 
      {
         colorAdjust.setSaturation(newvalue.doubleValue()); 
      });
      
      // Tworzenie suwaka do zmiany jasności.
      Slider brightSlider = new Slider(MIN, MAX, INITIAL);
      brightSlider.setShowTickMarks(true);
      brightSlider.setShowTickLabels(true);
      brightSlider.setMajorTickUnit(0.25f);
      brightSlider.setBlockIncrement(0.1f);
      
      // Tworzenie obiektu obsługi zdarzeń.
      brightSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> 
      {
         colorAdjust.setBrightness(newvalue.doubleValue()); 
      });
      
      // Tworzenie suwaka do zmiany kontrastu.
      Slider contrastSlider = new Slider(MIN, MAX, INITIAL);
      contrastSlider.setShowTickMarks(true);
      contrastSlider.setShowTickLabels(true);
      contrastSlider.setMajorTickUnit(0.25f);
      contrastSlider.setBlockIncrement(0.1f);
      
      // Tworzenie obiektu obsługi zdarzeń.
      contrastSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> 
      {
         colorAdjust.setContrast(newvalue.doubleValue()); 
      });
            
      // Umieszczanie obiektu typu ImageView w kontenerze typu HBox.
      HBox hbox = new HBox(imageView);
      
      // Umieszczanie suwaków w kontenerze typu VBox.
      VBox vbox = new VBox(10, hueSlider, satSlider, brightSlider, contrastSlider);
      vbox.setAlignment(Pos.CENTER);
      vbox.setPadding(new Insets(10));
      
      // Umieszczanie kontenerów typów HBox i VBox w kontenerze typu BorderPane.
      BorderPane borderPane = new BorderPane();
      borderPane.setCenter(hbox);
      borderPane.setBottom(vbox);
      
      // Tworzenie sceny z kontenerem typu BorderPane jako węzłem korzenia.
      Scene scene = new Scene(borderPane);
      
      // Dodawanie sceny do płótna.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Modyfikowanie obrazu");
      
      // Wyświetlanie okna.
      primaryStage.show();
   }
}
