import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.control.Button;
import java.io.File;

public class SoundPlayer extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Wczytywanie pliku dźwiękowego i tworzenie obiektu typu MediaPlayer.
      File soundFile = new File("guitar.wav");
      Media media = new Media(soundFile.toURI().toString());
      MediaPlayer player = new MediaPlayer(media);
      
      // Obiekt obsługi zdarzeń OnEndOfMedia.
      player.setOnEndOfMedia(() ->
      {
         player.stop();
      });
      
      // Tworzenie przycisków.
      Button playButton = new Button("Odtwórz");
      Button pauseButton = new Button("Wstrzymaj");
      Button stopButton = new Button("Zatrzymaj");
      
      // Obiekt obsługi zdarzeń dla przycisku Odtwórz.
      playButton.setOnAction(event ->
      {
         player.play();
      });

      // Obiekt obsługi zdarzeń dla przycisku Wstrzymaj.
      pauseButton.setOnAction(event ->
      {
         player.pause();
      });

      // Obiekt obsługi zdarzeń dla przycisku Zatrzymaj.
      stopButton.setOnAction(event ->
      {
         player.stop();
      });
      
      // Umieszczanie przycisków w kontenerze typu HBox.
      HBox hbox = new HBox(10, playButton, pauseButton, stopButton);
      hbox.setAlignment(Pos.CENTER);
      hbox.setPadding(new Insets(10));
      
      // Tworzenie sceny z kontenerem typu HBox jako węzłem korzenia.
      Scene scene = new Scene(hbox);
      
      // Dodawanie sceny do płótna i wyświetlanie okna.
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
