import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class SimpleMenu extends Application
{
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Stałe określające wymiary sceny.
      final double WIDTH = 300.0, HEIGHT = 200.0;
      
      // Tworzenie paska menu.
      MenuBar menuBar = new MenuBar();
 
      // Tworzenie menu Plik.
      Menu fileMenu = new Menu("Plik");
      MenuItem exitItem = new MenuItem("Zamknij");
      fileMenu.getItems().add(exitItem);
      
      // Rejestrowanie obiektu obsługi zdarzeń dla opcji Zamknij.
      exitItem.setOnAction(event ->
      {
         primaryStage.close();
      });

      // Dodawanie menu Plik do paska menu.
      menuBar.getMenus().addAll(fileMenu);
         
      // Dodawanie paska menu do kontrolki typu BorderPane.
      BorderPane borderPane = new BorderPane();
      borderPane.setTop(menuBar);
               
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(borderPane, WIDTH, HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
