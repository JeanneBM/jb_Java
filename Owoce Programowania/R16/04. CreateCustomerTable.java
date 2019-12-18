import java.sql.*;   // Potrzebne, by móc używać klas JDBC.

/**
 * Ten program tworzy tabelę Customer
 * w bazie CoffeeDB.
 */
 
public class CreateCustomerTable
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
         
         // Tworzenie SQL-owej instrukcji generującej tabelę.
         String sql = "CREATE TABLE Customer" +
            "( CustomerNumber CHAR(10) NOT NULL PRIMARY KEY, " +
            "  Name CHAR(25),"    +
            "  Address CHAR(25)," +
            "  City CHAR(12),"    +
            "  State CHAR(2),"    +
            "  Zip CHAR(5) )";

         // Wykonywanie instrukcji.
         stmt.execute(sql);
         
         // Dodawanie wierszy do nowej tabeli.
         sql = "INSERT INTO Customer VALUES" +
               "('101', 'Kawiarnia Centrum', 'Ul. Morska 12'," +
               " 'Ustka', 'PM', '55515')";
         stmt.executeUpdate(sql);

         sql = "INSERT INTO Customer VALUES" +
               "('102', 'Sklep Kawusie Barbary'," +
               " 'Ul. Zarzeczna 17'," +
               " 'Rabka', 'MP', '55555')";
         stmt.executeUpdate(sql);

         sql = "INSERT INTO Customer VALUES" +
               "('103', 'Kawiarnia Staropolska, 'Ul. Podzamcze 2'," +
               " 'Malbork', 'PM', '55516')";
         stmt.executeUpdate(sql);

         // Zamykanie połączenia.
         conn.close();
      }
      catch (Exception ex)
      {
         System.out.println("BŁĄD: " + ex.getMessage());
      }
   }
}
