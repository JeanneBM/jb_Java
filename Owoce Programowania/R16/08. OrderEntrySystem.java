import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.sql.SQLException;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class OrderEntrySystem extends Application
{
   // Pola na dane wejściowe.
   private ListView<String> customerListView;
   private ListView<String> coffeeListView;
   private TextField qtyTextField;
   private TextField orderDateTextField;
   
   // Stałe.
   final int LV_WIDTH = 150;
   final int LV_HEIGHT = 75;
   final double SPACING = 10.0;
   
   private void buildGUI(Stage stage)
   {
      // Tworzenie obszaru do wyboru klienta.
      Label customerPrompt = new Label("Wybieranie klienta");
      customerListView = new ListView<String>();
      customerListView.setPrefSize(LV_WIDTH, LV_HEIGHT);
      VBox customerVBox = new VBox(SPACING, customerPrompt,
                                   customerListView);
      customerVBox.setAlignment(Pos.CENTER);
      customerVBox.setPadding(new Insets(SPACING));
      
      // Tworzenie obszaru do wyboru kawy.
      Label coffeePrompt = new Label("Wybieranie kawy");
      coffeeListView = new ListView<String>();
      coffeeListView.setPrefSize(LV_WIDTH, LV_HEIGHT);
      VBox coffeeVBox = new VBox(10, coffeePrompt,
                                 coffeeListView);
      coffeeVBox.setAlignment(Pos.CENTER);
      coffeeVBox.setPadding(new Insets(SPACING));
      
      // Tworzenie obszaru do podawania ilości kawy i daty.
      Label qtyPrompt = new Label("Ilość");
      qtyTextField = new TextField();
      
      Label datePrompt = new Label("Data zamówienia");
      orderDateTextField = new TextField();
      VBox orderVBox = new VBox(SPACING, qtyPrompt, qtyTextField,
                                datePrompt, orderDateTextField);
      orderVBox.setAlignment(Pos.CENTER);
      orderVBox.setPadding(new Insets(SPACING));
      
      // Tworzenie obszaru z przyciskami.
      Button submitButton = new Button("Prześlij");
      Button exitButton = new Button("Zamknij");
      HBox buttonHBox = new HBox(SPACING, submitButton, exitButton);
      buttonHBox.setAlignment(Pos.CENTER);
      buttonHBox.setPadding(new Insets(SPACING));
      
      // Rejestrowanie obiektów obsługi zdarzeń dla przycisków.
      submitButton.setOnAction(new SubmitButtonHandler());
      exitButton.setOnAction(e ->
      {
         // Zamykanie płótna i kończenie pracy aplikacji.
         stage.close();
      });
      
      // Umieszczanie wszystkich elementów w kontenerze typu BorderPane.
      BorderPane borderPane = new BorderPane();
      borderPane.setLeft(customerVBox);
      borderPane.setCenter(coffeeVBox);
      borderPane.setRight(orderVBox);
      borderPane.setBottom(buttonHBox);
      
      // Podawanie tekstu paska tytułu.
      stage.setTitle("System wprowadzania zamówień");
 
      // Tworzenie sceny i dodawanie jej do płótna.
      Scene scene = new Scene(borderPane);
      stage.setScene(scene);
   }
   
   /**
    * Metoda loadData wczytuje nazwy klientów
    * i nazwy kaw do kontrolek typu ListView.
    */
    
   private void loadData()
   {
      try
      {
         // Wczytywanie nazw klientów do kontrolki typu ListView.
         customerListView.getItems().setAll(
                 CoffeeDBManager.getCustomerNames());
         
         // Wczytywanie nazw kaw do kontrolki typu ListView.
         coffeeListView.getItems().setAll(
                 CoffeeDBManager.getCoffeeNames());
      }
      catch (SQLException e)
      {
         e.printStackTrace();
         System.exit(0);
      }
   }
   
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie interfejsu GUI.
      buildGUI(primaryStage);
         
      // Wczytywanie danych z bazy.
      loadData();

      // Wyświetlanie płótna.
      primaryStage.show();
   }
   
   /**
    * Klasa obsługi zdarzeń przycisku submitButton.
    */
 
   class SubmitButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         try
         {
            // Pobieranie nazwy klienta z kontrolki typu ListView.
            String customerName =
               customerListView.getSelectionModel().getSelectedItem();
            
            // Pobieranie nazwy kawy z kontrolki typu ListView.
            String coffeeName =
               coffeeListView.getSelectionModel().getSelectedItem();
            
            // Pobieranie ilości kawy.
            int qty = Integer.parseInt(qtyTextField.getText());
            
            // Pobieranie daty złożenia zamówienia.
            String orderDate = orderDateTextField.getText();
            
            // Pobieranie z bazy numeru klienta.
            String customerNum =
               CoffeeDBManager.getCustomerNum(customerName);
            
            // Pobieranie z bazy numeru produktu.
            String prodNum = CoffeeDBManager.getProdNum(coffeeName);
            
            // Pobieranie z bazy ceny za 100 g danej kawy.
            double price = CoffeeDBManager.getCoffeePrice(prodNum);
            
            // Przesyłanie zamówienia do bazy.
            CoffeeDBManager.submitOrder(customerNum, prodNum, qty,
                                        price, orderDate);
                                  
            // Opróżnianie pól tekstowych.
            qtyTextField.clear();
            orderDateTextField.clear();
         }
         catch (SQLException e)
         {
            e.printStackTrace();
            System.exit(0);
         }
      }
   }
}
