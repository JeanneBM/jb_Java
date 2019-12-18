import java.sql.*;   // Potrzebne do tego, by móc używać klas JDBC.

/**
 * Ten program ilustruje, jak skierować do bazy danych SQL-ową 
 * instrukcję SELECT przy użyciu technologii JDBC.
 */
public class ShowCoffees
{
   public static void main(String[] args)
   {
      // Tworzenie stałej z adresem URL.
      // UWAGA: Ta wartość jest specyficzna dla systemów Java DB i Apache Derby.
      final String DB_URL = "jdbc:derby:CoffeeDB";
      
      try
      {
         // Nawiązywanie połączenia z bazą danych.
         Connection conn = DriverManager.getConnection(DB_URL);
         
         // Tworzenie obiektu typu Statement.
         Statement stmt = conn.createStatement();
         
         // Tworzenie łańcucha znaków z instrukcją SELECT.
         String sqlStatement = 
            "SELECT * FROM Coffee WHERE Price > 10.00";
         
         // Przesyłanie instrukcji do systemu DBMS.
         ResultSet result = stmt.executeQuery(sqlStatement);
         
         // Wyświetlanie nagłówka listy.
         System.out.println("Kawy z ceną powyżej 10.00 zł za 100 g");
         System.out.println("-------------------------------------");
         
         // Wyświetlanie zawartości zbioru wyników.
         // Zbiór wyników obejmuje trzy kolumny.
         while (result.next())
         {
            System.out.println(result.getString("Description") + 
                               result.getString("ProdNum") + 
                               result.getDouble("Price"));
         }
         
         // Zamykanie połączenia.
         conn.close();
      }
      catch(Exception ex)
      {
         System.out.println("BŁĄD: " + ex.getMessage());
      }
   }
}
