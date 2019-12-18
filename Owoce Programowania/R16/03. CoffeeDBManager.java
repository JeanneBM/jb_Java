import java.util.ArrayList;
import java.sql.*;

/**
 * Klasa CoffeeDBManager wykonuje operacje
 * na bazie danych CoffeeDB.
 */

public class CoffeeDBManager
{
   // Stała z adresem URL bazy.
   public final static String DB_URL = "jdbc:derby:CoffeeDB";

   /**
    * Metoda getCustomerNames zwraca obiekt typu ArrayList
    *  z elementami typu String zawierającymi nazwy wszystkich klientów.
    */ 
   public static ArrayList<String> getCustomerNames() throws SQLException
   {
      // Nawiązywanie połączenia z bazą danych.
      Connection conn = DriverManager.getConnection(DB_URL);
      
      // Nawiązywanie połączenia z bazą danych.
      conn = DriverManager.getConnection(DB_URL);
               
      // Tworzenie obiektu typu Statement zawierającego zapytanie.
      Statement stmt =
         conn.createStatement(
                 ResultSet.TYPE_SCROLL_SENSITIVE,
                 ResultSet.CONCUR_READ_ONLY);
            
      // Wykonywanie zapytania.
      ResultSet resultSet = stmt.executeQuery(
                          "SELECT Name FROM Customer");
               
      // Pobieranie liczby wierszy.
      resultSet.last();                  // Przejście do ostatniego wiersza.
      int numRows = resultSet.getRow();  // Pobranie numeru wiersza.
      resultSet.first();                 // Przejście do pierwszego wiersza.

      // Tworzenie obiektu typu ArrayList z nazwami klientów.
      ArrayList<String> listData = new ArrayList<>();
      
      // Zapełnianie obiektu typu ArrayList nazwami klientów.
      for (int index = 0; index < numRows; index++)
      {
         // Zapisywanie nazwy klienta w tablicy.
         listData.add(resultSet.getString(1));

         // Przechodzenie do następnego wiersza zbioru wyników.
         resultSet.next();
      }
      
      // Zamykanie połączenia i obiektu stmt.
      conn.close();
      stmt.close();

      // Zwracanie tablicy listData.
      return listData;
   }

   /**
    * Metoda getCoffeeNames zwraca tablicę 
    * elementów typu String zawierających nazwy wszystkich kaw.
    */
   public static ArrayList<String> getCoffeeNames() throws SQLException
   {
      // Nawiązywanie połączenia z bazą danych.
      Connection conn = DriverManager.getConnection(DB_URL);
      
      // Tworzenie obiektu typu Statement zawierającego zapytanie.
      Statement stmt =
         conn.createStatement(
                 ResultSet.TYPE_SCROLL_SENSITIVE,
                 ResultSet.CONCUR_READ_ONLY);
            
      // Wykonywanie zapytania.
      ResultSet resultSet = stmt.executeQuery(
                       "SELECT Description FROM Coffee");
               
      // Pobieranie liczby wierszy.
      resultSet.last();                 // Przejście do ostatniego wiersza.
      int numRows = resultSet.getRow(); // Pobranie numeru wiersza.
      resultSet.first();                // Przejście do pierwszego wiersza.

      // Tworzenie tablicy z nazwami kaw.
      ArrayList<String> listData = new ArrayList<>();
      
      // Zapełnianie tablicy nazwami kaw.
      for (int index = 0; index < numRows; index++)
      {
         // Zapisywanie nazwy kawy w tablicy.
         listData.add(resultSet.getString(1));

         // Przejście do następnego wiersza w zbiorze wyników.
         resultSet.next();
      }
      
      // Zamykanie połączenia i obiektu stmt.
      conn.close();
      stmt.close();

      // Zwracanie tablicy listData.
      return listData;
   }

   /**
    * Metoda getProdNum zwraca
    * numer produktu określonej kawy.
    */  
   public static String getProdNum(String coffeeName) throws SQLException
   {
      String prodNum = ""; // Numer produktu.
      
      // Nawiązywanie połączenia z bazą.
      Connection conn = DriverManager.getConnection(DB_URL);
               
      // Tworzenie obiektu typu Statement zawierającego zapytanie.
      Statement stmt = conn.createStatement();
            
      // Wykonywanie zapytania.
      ResultSet resultSet = stmt.executeQuery(
                          "SELECT ProdNum " +
                          "FROM Coffee " +
                          "WHERE Description = '" + 
                          coffeeName + "'");
               
      // Jeśli w zbiorze wyników znajduje się kolejny wiersz,
      // program przechodzi do niego i pobiera numer produktu.
      if (resultSet.next())
         prodNum = resultSet.getString(1);
   
      // Zamykanie połączenia i obiektu stmt.
      conn.close();
      stmt.close();

      // Zwracanie numeru produktu.
      return prodNum;
   }

   /**
    * Metoda getCoffeePrice zwraca
    * cenę kawy.
    */
   public static double getCoffeePrice(String prodNum) throws SQLException
   {
      double price = 0.0;  // Cena kawy.
      
      // Nawiązywanie połączenia z bazą.
      Connection conn = DriverManager.getConnection(DB_URL);
               
      // Tworzenie obiektu typu Statement zawierającego zapytanie.
      Statement stmt = conn.createStatement();
            
      // Wykonywanie zapytania.
      ResultSet resultSet = stmt.executeQuery(
                          "SELECT Price " +
                          "FROM Coffee " +
                          "WHERE ProdNum = '" + 
                          prodNum + "'");

      // Jeśli w zbiorze wyników znajduje się kolejny wiersz, 
      // program przechodzi do niego i pobiera cenę.    
      if (resultSet.next())
         price = resultSet.getDouble(1);
   
      // Zamykanie połączenia i obiektu stmt.
      conn.close();
      stmt.close();

      // Zwracanie ceny.
      return price;
   }

   /**
    * Metoda getCustomerNum zwraca numer
    * określonego klienta.
    */  
   public static String getCustomerNum(String name) throws SQLException
   {
      String customerNumber = "";
      
      // Nawiązywanie połączenia z bazą danych.
      Connection conn = DriverManager.getConnection(DB_URL);
               
      // Tworzenie obiektu typu Statement zawierającego zapytanie.
      Statement stmt = conn.createStatement();
            
      // Wykonywanie zapytania.
      ResultSet resultSet = stmt.executeQuery(
                          "SELECT CustomerNumber " +
                          "FROM Customer " +
                          "WHERE Name = '" + name + "'");
               
      if (resultSet.next())
         customerNumber = resultSet.getString(1);
   
      // Zamykanie połączenia i obiektu stmt.
      conn.close();
      stmt.close();

      // Zwracanie numeru klienta.
      return customerNumber;
   }

   /**
    * Metoda submitOrder przesyła zamówienie
    * do tabeli UnpaidOrder z bazy danych CoffeeDB.
    */
   public static void submitOrder(String custNum, String prodNum,
                                  int quantity, double price, 
                                  String orderDate) throws SQLException
   {
      // Obliczanie wartości zamówienia.
      double cost = quantity * price;

      // Nawiązywanie połączenia z bazą danych.
      Connection conn = DriverManager.getConnection(DB_URL);
               
      // Tworzenie obiektu typu Statement zawierającego zamówienie.
      Statement stmt = conn.createStatement();           

      // Wykonywanie zapytania.
      stmt.executeUpdate("INSERT INTO UnpaidOrder VALUES('" +
                         custNum + "', '" +
                         prodNum + "', '" + orderDate + "', " +
                         quantity + ", " + cost + ")");
               
      // Zamykanie połączenia i obiektu stmt.
      conn.close();
      stmt.close();
   }
}
