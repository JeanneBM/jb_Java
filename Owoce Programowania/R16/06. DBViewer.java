import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import java.sql.*;

public class DBViewer extends Application
{
   // Adres URL bazy danych.
   final String DB_URL = "jdbc:derby:CoffeeDB";
   
   // Kontrolki do pobierania i wyświetlania danych.
   TextArea queryTextArea;
   TextArea resultsTextArea;
      
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      final int COL_SIZE = 50;
      final int ROW_SIZE = 10;
      final double SPACING = 10.0;
      
      // Tworzenie obszaru do wprowadzania danych.
      queryTextArea = new TextArea();
      queryTextArea.setPrefColumnCount(COL_SIZE);
      queryTextArea.setPrefRowCount(ROW_SIZE);
      
      // Tworzenie obszaru na wyniki zapytania.
      resultsTextArea = new TextArea();
      resultsTextArea.setPrefColumnCount(COL_SIZE);
      resultsTextArea.setPrefRowCount(ROW_SIZE);
      
      // Tworzenie przycisku Prześlij.
      Button submitButton = new Button("Prześlij");
      submitButton.setOnAction(new SubmitButtonHandler());
      
      // Umieszczanie kontrolek w kontenerze typu VBox.
      VBox vbox = new VBox(SPACING, queryTextArea,
                           submitButton, resultsTextArea);
      vbox.setAlignment(Pos.CENTER);
      vbox.setPadding(new Insets(SPACING));
      
      // Podawanie nagłówka.
      primaryStage.setTitle("Podawanie zapytania SELECT");

      // Tworzenie sceny i przypisywanie jej do płótna.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      
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
            // Usuwanie wcześniejszych wyników.
            resultsTextArea.setText("");
            
            // Nawiązywanie połączenia z bazą danych.
            Connection conn = DriverManager.getConnection(DB_URL);
            
            // Tworzenie obiektu typu Statement.
            Statement stmt = conn.createStatement();
            
            // Wykonywanie zapytania.
            ResultSet resultSet = 
                    stmt.executeQuery(queryTextArea.getText());
            
            // Pobieranie metadanych zbioru wyników.
            ResultSetMetaData meta = resultSet.getMetaData();
            
            // Tworzenie łańcucha znaków przeznaczonego na wyniki.
            String output = "";
            
            // Pobieranie wyników.
            while (resultSet.next())
            {               
               // Pobieranie wszystkich kolumn wiersza.
               for (int i = 1; i <= meta.getColumnCount(); i++)
               {
                  output += resultSet.getString(i);
                  output += '\t';
               }
               output += '\n';
            }
            
            // Wyświetlanie wyników.
            resultsTextArea.setText(output);
   
            // Zamykanie obiektu stmt i połączenia.
            stmt.close();
            conn.close();
 
         }
         catch (SQLException e)
         {
            e.printStackTrace();
            System.exit(0);
         }
      }
   }
}
