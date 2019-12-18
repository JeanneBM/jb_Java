/**
 * Ten program tworzy tabelę UnpaidOrder
 * w bazie CoffeeDB.
 */

import java.sql.*;   // Potrzebne do używania klas JDBC.

public class CreateUnpaidOrderTable
{
		static Connection conn;
		static Statement stmt;

   public static void main(String[] args)
   {
      // Tworzenie stałych z nazwą sterownika i adresem URL.
      // UWAGA: Te wartości są specyficzne dla baz Derby i Java DB.
      final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
      final String DB_URL = "jdbc:derby:CoffeeDB";
		
      
      try
      {
         // Wczytywanie sterownika JDBC.
         Class.forName(DRIVER);

         // Nawiązywanie połączenia z bazą.
         conn = DriverManager.getConnection(DB_URL);
         
         // Tworzenie obiektu typu Statement.
         stmt = conn.createStatement();
			
			stmt.execute("DROP TABLE UnpaidOrder");
			
         // Tworzenie instrukcji SQL-owej tworzącej tabelę.
         String sql = "CREATE TABLE UnpaidOrder " +
				"( CustomerNumber CHAR(10) NOT NULL REFERENCES Customer(CustomerNumber), "+
				"  ProdNum CHAR(10) NOT NULL REFERENCES Coffee(ProdNum),"+
				"  OrderDate CHAR(10),"+
				"  Quantity DOUBLE,"+
				"  Cost DOUBLE )";

         // Wykonywanie instrukcji.
         stmt.execute(sql);
         
         // Zamykanie połączenia.
         conn.close();
      }
      catch (Exception ex)
      {
         System.out.println("BŁĄD: " + ex.getMessage());
			ex.printStackTrace();
      }
   }

	private void addRows() throws Exception
	{

         // Dodawanie wierszy do tabeli.
         String sql = "INSERT INTO UnpaidOrder VALUES" +
               "('101', '16-001', '3/15/2006', 5, 49.75)";
         stmt.executeUpdate(sql);
			
			sql = "INSERT INTO UnpaidOrder VALUES" +
               "('101', '14-001', '3/17/2006', 7, 62.65)";
         stmt.executeUpdate(sql);

         sql = "INSERT INTO UnpaidOrder VALUES" +
               "('102', '18-002', '3/20/2006', 10, 184.50)";
         stmt.executeUpdate(sql);

         sql = "INSERT INTO UnpaidOrder VALUES" +
               "('103', '17-004', '3/21/2006', 3, 35.85)";
         stmt.executeUpdate(sql);

         sql = "INSERT INTO UnpaidOrder VALUES" +
               "('103', '16-002', '3/22/2006', 6, 59.70)";
         stmt.executeUpdate(sql);
	}
}
