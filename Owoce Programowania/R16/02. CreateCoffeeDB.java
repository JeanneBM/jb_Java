import java.sql.*;   // Potrzebne ze względu na klasy JDBC.

/**
 * Ten program tworzy bazę danych CoffeeDB.
 */
public class CreateCoffeeDB
{
   public static void main(String[] args)
   {
      // Tworzenie stałej z adresem URL.
      // UWAGA: jest to wartość specyficzna dla bazy w Javie.
      final String DB_URL = "jdbc:derby:CoffeeDB;create=true";
      
      try
      {
         // Nawiązywanie połączenia z bazą.
         Connection conn =
                DriverManager.getConnection(DB_URL);
					 
			// Jeśli baza już istnieje, tabele są usuwane.
			dropTables(conn);
			
			// Tworzenie tabeli Coffee.
			buildCoffeeTable(conn);
			
			// Tworzenie tabeli Customer.
			buildCustomerTable(conn);
			
			// Tworzenie tabeli UnpaidInvoice.
			buildUnpaidOrderTable(conn);

         // Zamykanie połączenia.
         conn.close();
      }
      catch (Exception ex)
      {
         System.out.println("BŁĄD: " + ex.getMessage());
      }
   }
	
	/**
	 * Metoda dropTables usuwa tabele,
	 * jeśli baza już istnieje.
	 */
	public static void dropTables(Connection conn)
	{
		System.out.println("Sprawdzanie, czy tabele istnieją.");
		
		try
		{
			// Pobieranie obiektu typu Statement.
			Statement stmt  = conn.createStatement();;

			try
			{
	         // Usuwanie tabeli UnpaidOrder.
	         stmt.execute("DROP TABLE Unpaidorder");
				System.out.println("Tabela UnpaidOrder została usunięta.");
			}
			catch(SQLException ex)
			{
				// Nie trzeba zgłaszać błędu.
				// Tabela nie istnieje.
			}

			try
			{
	         // Drop the Customer table.
	         stmt.execute("DROP TABLE Customer");
				System.out.println("Tabela Customer została usunięta.");				
			}
			catch(SQLException ex)
			{
				// Nie trzeba zgłaszać błędu.
				// Tabela nie istnieje.
			}

			try
			{
	         // Drop the Coffee table.
	         stmt.execute("DROP TABLE Coffee");
				System.out.println("Tabela Coffee została usunięta.");
			}
			catch(SQLException ex)
			{
				// Nie trzeba zgłaszać błędu.
				// Tabela nie istnieje.
			}
		}
  		catch(SQLException ex)
		{
	      System.out.println("BŁĄD: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	/**
	 * Metoda buildCoffeeTable tworzy tabelę
	 * Coffee i dodaje do niej wiersze.
	 */
	public static void buildCoffeeTable(Connection conn)
	{
		try
		{
         // Tworzenie obiektu typu Statement.
         Statement stmt = conn.createStatement();
         
			// Tworzenie tabeli.
			stmt.execute("CREATE TABLE Coffee (" +
   				       "Description CHAR(35), " +
                      "ProdNum CHAR(10) NOT NULL PRIMARY KEY, " +
                      "Price DOUBLE " +
                      ")");
							 
			// Wstawianie wiersza nr 1.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Boliwijska ciemno palona', " +
                      "'14-001', " +
                      "8.95 )" );

			// Wstawianie wiersza nr 2.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Boliwijska średnio palona', " +
                      "'14-002', " +
                      "8.95 )");

			// Wstawianie wiersza nr 3.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Brazylijska ciemno palona', " +
                      "'15-001', " +
                      "7.95 )");

			// Wstawianie wiersza nr 4.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Brazylijska średnio palona', " +
                      "'15-002', " +
                      "7.95 )");

			// Wstawianie wiersza nr 5.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Brazylijska bezkofeinowa', " +
                      "'15-003', " +
                      "8.55 )" );

			// Wstawianie wiersza nr 6.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Ciemno palona z Ameryki Środ.', " +
                      "'16-001', " +
                      "9.95 )");

			// Wstawianie wiersza nr 7.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Średnio palona z Ameryki Środ.', " +
                      "'16-002', " +
                      "9.95 )");

			// Wstawianie wiersza nr 8.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Ciemno palona z Sumatry', " +
                      "'17-001', " +
                      "7.95 )");

			// Wstawianie wiersza nr 9.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Bezkofeinowa z Sumatry', " +
                      "'17-002', " +
                      "8.95 )");

			// Wstawianie wiersza nr 10.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Średnio palona z Sumatry', " +
                      "'17-003', " +
                      "7.95 )");

			// Wstawianie wiersza nr 11.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Organiczna ciemno palona z Sumatry', " +
                      "'17-004', " +
                      "11.95 )");

			// Wstawianie wiersza nr 12.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
						    "'Kona średnio palona', " +
						    "'18-001', " +
						    "18.45 )");

			// Wstawianie wiersza nr 13.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
						    "'Kona ciemno palona', " +
						    "'18-002', " +
						    "18.45 )");

			// Wstawianie wiersza nr 14.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Bardzo ciemno palona', " +
                      "'19-001', " +
                      "9.65 )");

			// Wstawianie wiersza nr 15.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Średnio palona z Galapagos', " +
                      "'20-001', " +
                      "6.85 )");

			// Wstawianie wiersza nr 16.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Gwatemalska ciemno palona', " +
                      "'21-001', " +
                      "9.95 )");

			// Wstawianie wiersza nr 17.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Gwatemalska bezkofeinowa', " +
                      "'21-002', " +
                      "10.45 )");

			// Wstawianie wiersza nr 18.
			stmt.execute("INSERT INTO Coffee VALUES ( " +
                      "'Gwatemalska średnio palona', " +
                      "'21-003', " +
                      "9.95 )");
							 
			System.out.println("Utworzono tabelę Coffee.");
		}
		catch (SQLException ex)
      {
         System.out.println("BŁĄD: " + ex.getMessage());
      }
	}

	/**
	 * Metoda buildCustomerTable tworzy tabelę
	 * Customer i dodaje do niej wiersz.
	 */
	public static void buildCustomerTable(Connection conn)
	{
      try
      {
         // Tworzenie obiektu typu Statement.
         Statement stmt = conn.createStatement();
         
         // Tworzenie tabeli.
         stmt.execute("CREATE TABLE Customer" +
            "( CustomerNumber CHAR(10) NOT NULL PRIMARY KEY, " +
            "  Name CHAR(25),"    +
            "  Address CHAR(25)," +
            "  City CHAR(12),"    +
            "  State CHAR(2),"    +
            "  Zip CHAR(5) )");

         // Dodawanie wierszy do nowej tabeli.
         stmt.executeUpdate("INSERT INTO Customer VALUES" +
               "('101', 'Kawiarnia Centrum', 'Ul. Morska 12'," +
               " 'Ustka', 'PM', '55515')");
         
         stmt.executeUpdate("INSERT INTO Customer VALUES" +
               "('102', 'Sklep Kawusie Barbary'," +
               " 'Ul. Zarzeczna 17'," +
               " 'Rabka', 'MP', '55555')");

         stmt.executeUpdate("INSERT INTO Customer VALUES" +
               "('103', 'Kawiarnia Staropolska', 'Ul. Podzamcze 2'," +
               " 'Malbork', 'PM', '55516')");
					
			System.out.println("Utworzono tabelę Customer.");
		}
		catch (SQLException ex)
      {
         System.out.println("BŁĄD: " + ex.getMessage());
      }
	}

	/**
	 * Metoda buildUnpaidOrderTable tworzy
	 * tabelę UnpaidOrder.
	 */

	public static void buildUnpaidOrderTable(Connection conn)
	{
      try
      {
         // Tworzenie obiektu typu Statement.
         Statement stmt = conn.createStatement();
			
         // Tworzenie tabeli.
         stmt.execute("CREATE TABLE UnpaidOrder " +
				"( CustomerNumber CHAR(10) NOT NULL REFERENCES Customer(CustomerNumber), "+
				"  ProdNum CHAR(10) NOT NULL REFERENCES Coffee(ProdNum),"+
				"  OrderDate CHAR(10),"+
				"  Quantity DOUBLE,"+
				"  Cost DOUBLE )");
				
			System.out.println("Utworzono tabelę UnpaidOrder.");
		}
		catch (SQLException ex)
      {
         System.out.println("BŁĄD: " + ex.getMessage());
      }
	}
}
