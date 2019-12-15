import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class VideoDemo extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające wielkość klatek filmu.
      final double WIDTH = 640.0, HEIGHT = 480.0;
      
      // Wczytywanie pliku z filmem.
      File videoFile = new File("TakeOff.mp4");
      Media media = new Media(videoFile.toURI().toString());
      
      // Tworzenie obiektu typu MediaPlayer i włączanie automatycznego odtwarzania.
      MediaPlayer player = new MediaPlayer(media);
      player.setAutoPlay(true);
      
      // Tworzenie obiektu typu MediaView.
      MediaView view = new MediaView(player);
      
      // Ustawianie wymiarów okna.
      view.setFitWidth(WIDTH);
      view.setFitHeight(HEIGHT);
      
      // Dodawanie obiektu typu MediaView do kontenera typu HBox.
      HBox hbox = new HBox(view);
      
      // Tworzenie sceny, dodawanie jej do płótna i jej wyświetlanie.
      Scene scene = new Scene(hbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
