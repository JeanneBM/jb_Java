import java.sql.*;

/**
 *  Ten program ilustruje, jak utworzyć nową         *
 *  bazę za pomocą systemu Java DB lub Apache Derby. *
 */
public class BuildEntertainmentDB
{
   public static void main(String[] args)
                      throws Exception
   {
      final String DB_URL =
            "jdbc:derby:EntertainmentDB;create=true";
            
      try
      {    
         // Nawiązywanie połączenia z bazą danych.
         Connection conn = 
                    DriverManager.getConnection(DB_URL);
            
         // Tworzenie obiektu typu Statement.
         Statement stmt = conn.createStatement();
            
         // Tworzenie tabeli Dvd.
         System.out.println("Tworzenie tabeli Dvd...");
         stmt.execute("CREATE TABLE Dvd ("    +
                      "Title CHAR(25), "   +
                      "Minutes INTEGER, " +
                      "Price DOUBLE)");
      
         // Zamykanie zasobów.
         stmt.close();     
         conn.close();
         System.out.println("Gotowe");
      }
      catch(Exception ex)
      {
         System.out.println("BŁĄD: " + ex.getMessage());
      }
   } 
}
