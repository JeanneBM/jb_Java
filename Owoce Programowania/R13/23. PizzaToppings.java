import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  Aplikacja ilustrująca działanie kontrolek typu CheckBox.
 */

public class PizzaToppings extends Application
{
   // Pola.
   CheckBox pepperoniCheckBox;
   CheckBox cheeseCheckBox;
   CheckBox anchoviesCheckBox;
   Label totalLabel;
   
   public static void main(String[] args)
   {
      // Uruchamianie aplikacji.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Tworzenie kontrolek typu CheckBox.
      pepperoniCheckBox = new CheckBox("Pepperoni 3,00 złote");
      cheeseCheckBox = new CheckBox("Ser 2,00 złote");
      anchoviesCheckBox = new CheckBox("Anchois 1,00 złoty");

      // Tworzenie kontrolki typu Button.
      Button totalButton = new Button("Oblicz sumę");

      // Rejestrowanie obiektu obsługi zdarzeń.
      totalButton.setOnAction(new TotalButtonHandler());
      
      // Tworzenie kontrolki typu Label z łączną ceną.
      totalLabel = new Label("0,00 zł");

      // Dodawanie kontrolek typu CheckBox do kontenera typu VBox.
      VBox checkBoxVBox = new VBox(10, pepperoniCheckBox,
                                   cheeseCheckBox, anchoviesCheckBox);
      
      // Tworzenie następnego kontenera typu VBox używanego jako węzeł korzenia.
      VBox mainVBox = new VBox(10, checkBoxVBox, totalButton,
                               totalLabel);
      
      // Wyśrodkowanie zawartości głównego kontenera typu VBox.
      mainVBox.setAlignment(Pos.CENTER);
      
      // Ustawienie marginesu w głównym kontenerze typu VBox na 10 pikseli.
      mainVBox.setPadding(new Insets(10));

      // Tworzenie sceny.
      Scene scene = new Scene(mainVBox);

      // Dodawanie obiektu typu Scene do obiektu typu Stage.
      primaryStage.setScene(scene);
      
      // Wyświetlanie okna.
      primaryStage.show();   
   }
   
   /*
    * Klasa obsługi zdarzeń dla kontrolki totalButton.
    */
    
   class TotalButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Zmienna przechowująca wynik.
         double result = 0;
         
         // Dodawanie dodatków.
         if (pepperoniCheckBox.isSelected())
            result += 3.0;
         
         if (cheeseCheckBox.isSelected())
            result += 2.0;
         
         if (anchoviesCheckBox.isSelected())
            result += 1.0;
         
         // Wyświetlanie wyniku.
         totalLabel.setText(String.format("%,.2f zł", result));
      }
   }
}
