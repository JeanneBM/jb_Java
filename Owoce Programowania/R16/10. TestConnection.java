import java.sql.*;   // Potrzebne do tego, by móc używać klas JDBC.

/**
 * Ten program pokazuje, jak przy użyciu technologii JDBC 
 * nawiązać połączenie z bazą z systemu Java DB lub Apache Derby.
 */
public class TestConnection
{
   public static void main(String[] args)
   {
      // Tworzenie nazwanej stałej na adres URL.
      // UWAGA: Ta wartość jest specyficzna dla systemów Java DB i Apache Derby.
      final String DB_URL = "jdbc:derby:CoffeeDB";
      
      try
      {
         // Nawiązywanie połączenia z bazą.
         Connection conn = DriverManager.getConnection(DB_URL);
         System.out.println("Nawiązano połączenie z bazą CoffeeDB.");
         
         // Zamykanie połączenia.
         conn.close();
         System.out.println("Połączenie zostało zamknięte.");
      }
      catch(Exception ex)
      {
         System.out.println("BŁĄD: " + ex.getMessage());
      }
   }
}
