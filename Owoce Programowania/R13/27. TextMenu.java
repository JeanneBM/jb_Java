import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

public class TextMenu extends Application
{
   // Pola odpowiadające elementom menu.
   private MenuBar menuBar;
   private Menu fileMenu;
   private Menu textMenu;
   private MenuItem exitItem;
   private RadioMenuItem blackItem;
   private RadioMenuItem redItem;
   private RadioMenuItem greenItem;
   private RadioMenuItem blueItem;
   private CheckMenuItem visibleItem;
   
   // Pole z tekstem.
   private Label outputLabel;
   
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

      // Tworzenie kontrolki typu Label.
      outputLabel = new Label("Witaj, świecie!");

      // Tworzenie paska menu.
      menuBar = new MenuBar();
 
      // Tworzenie menu Plik.
      buildFileMenu(primaryStage);

      // Tworzenie menu Tekst.
      buildTextMenu();

      // Dodawanie menu Plik i Tekst do paska menu.
      menuBar.getMenus().add(fileMenu);
      menuBar.getMenus().add(textMenu);
      
      // Dodawanie kontrolek do kontenera typu BorderPane.
      BorderPane borderPane = new BorderPane();
      borderPane.setTop(menuBar);
      borderPane.setCenter(outputLabel);
               
      // Tworzenie sceny i wyświetlanie jej.
      Scene scene = new Scene(borderPane, WIDTH, HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   /**
    * Ta metoda tworzy menu Plik.
    */
    
   private void buildFileMenu(Stage primaryStage)
   {
      // Tworzenie obiektu typu Menu dla menu Plik.
      fileMenu = new Menu("Plik");

      // Tworzenie obiektu typu MenuItem dla opcji Zamknij.
      exitItem = new MenuItem("Zamknij");

      // Rejestrowanie obiektu obsługi zdarzeń dla opcji Zamknij.
      exitItem.setOnAction(event ->
      {
         primaryStage.close();
      });
      
      // Dodawanie opcji Zamknij do menu Plik.
      fileMenu.getItems().add(exitItem);
   }

   /**
    * Ta metoda tworzy menu Tekst.
    */
   
   private void buildTextMenu()
   {
      // Tworzenie obiektu typu Menu dla menu Tekst.
      textMenu = new Menu("Tekst");

      // Tworzenie opcji dla menu Tekst.
      blackItem = new RadioMenuItem("Czarny");
      redItem = new RadioMenuItem("Czerwony");
      greenItem = new RadioMenuItem("Zielony");
      blueItem = new RadioMenuItem("Niebieski");
      visibleItem = new CheckMenuItem("Widoczny");

      // Zaznaczanie opcji Czarny i Widoczna.
      blackItem.setSelected(true);
      visibleItem.setSelected(true);
      
      // Dodawanie opcji typu RadioMenuItems do obiektu typu ToggleGroup.
      ToggleGroup textToggleGroup = new ToggleGroup();
      blackItem.setToggleGroup(textToggleGroup);
      redItem.setToggleGroup(textToggleGroup);
      greenItem.setToggleGroup(textToggleGroup);
      blueItem.setToggleGroup(textToggleGroup);
      
      // Rejestrowanie obiektów obsługi zdarzeń dla opcji menu.
      blackItem.setOnAction(event ->
      {
         outputLabel.setStyle("-fx-text-fill: black");
      });
      
      redItem.setOnAction(event ->
      {
         outputLabel.setStyle("-fx-text-fill: red");
      });
      
      greenItem.setOnAction(event ->
      {
         outputLabel.setStyle("-fx-text-fill: green");
      });
      
      blueItem.setOnAction(event ->
      {
         outputLabel.setStyle("-fx-text-fill: blue");
      });
      
      visibleItem.setOnAction(event ->
      {
         if (outputLabel.isVisible())
            outputLabel.setVisible(false);
         else
            outputLabel.setVisible(true);
      });
      
      // Dodawanie opcji do menu Tekst.
      textMenu.getItems().add(blackItem);
      textMenu.getItems().add(redItem);
      textMenu.getItems().add(greenItem);
      textMenu.getItems().add(blueItem);
      textMenu.getItems().add(new SeparatorMenuItem());
      textMenu.getItems().add(visibleItem);
   }
}
