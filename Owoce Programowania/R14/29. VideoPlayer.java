import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.control.Button;

public class VideoPlayer extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające wymiary klatki filmu.
      final double WIDTH = 640.0, HEIGHT = 480.0;
      
      // Wczytywanie pliku z filmem.
      File videoFile = new File("TakeOff.mp4");
      Media media = new Media(videoFile.toURI().toString());
      
      // Tworzenie obiektu typu MediaPlayer.
      MediaPlayer player = new MediaPlayer(media);

      // Obiekt obsługi zdarzeń typu OnEndOfMedia.
      player.setOnEndOfMedia(() ->
      {
         player.stop();
      });
      
      // Tworzenie obiektu typu MediaView.
      MediaView view = new MediaView(player);
      
      // Ustawianie wymiarów okna.
      view.setFitWidth(WIDTH);
      view.setFitHeight(HEIGHT);
      
      // Tworzenie przycisków.
      Button playButton = new Button("Odtwórz");
      Button pauseButton = new Button("Wstrzymaj");
      Button stopButton = new Button("Zatrzymaj");
      
      // Obiekt obsługi zdarzeń dla przycisku odtwarzania.
      playButton.setOnAction(event ->
      {
         player.play();
      });

      // Obiekt obsługi zdarzeń dla przycisku wstrzymywania.
      pauseButton.setOnAction(event ->
      {
         player.pause();
      });

      // Obiekt obsługi zdarzeń dla przycisku zatrzymywania.
      stopButton.setOnAction(event ->
      {
         player.stop();
      });
      
      // Dodawanie przycisków do kontenera typu HBox.
      HBox hbox = new HBox(10, playButton, pauseButton, stopButton);
      hbox.setAlignment(Pos.CENTER);
      hbox.setPadding(new Insets(10));

      // Umieszczanie wszystkich elementów w kontenerze typu BorderPane.
      BorderPane borderPane = new BorderPane();
      borderPane.setCenter(view);
      borderPane.setBottom(hbox);
      
      // Tworzenie sceny, dodawanie jej do płótna i wyświetlanie.
      Scene scene = new Scene(borderPane);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
