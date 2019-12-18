/**
 * Ten program ilustruje używanie metadanych zbioru wyników.
 */

import java.sql.*;
import java.util.Scanner;

public class MetaDataDemo
{
   public static void main(String[] args) throws Exception
   {
      // Tworzenie stałej z adresem URL.
      // UWAGA: Ta wartość jest specyficzna dla systemów Java DB i Apache Derby.
      final String DB_URL = "jdbc:derby:CoffeeDB";
      
      try
      {
         // Tworzenie obiektu typu Scanner do pobierania danych z klawiatury.
         Scanner keyboard = new Scanner(System.in);
         
         // Pobieranie instrukcji SELECT od użytkownika.
         System.out.println("Podaj instrukcję SELECT " +
                            "kierowaną do bazy danych CoffeeDB:");
         String sql = keyboard.nextLine();
         
         // Nawiązywanie połączenia z bazą.
         Connection conn =
                DriverManager.getConnection(DB_URL);
            
         // Tworzenie obiektu typu Statement.
         Statement stmt = conn.createStatement();
            
         // Wykonywanie zapytania.
         ResultSet resultSet = stmt.executeQuery(sql);
            
         // Pobieranie metadanych zbioru wyników.
         ResultSetMetaData meta = resultSet.getMetaData();
            
         // Wyświetlanie liczby zwróconych kolumn.
         System.out.println("Liczba kolumn w zbiorze wyników: " +
                            meta.getColumnCount() +
                            ".");
                               
         // Wyświetlanie nazw i typów danych kolumn.
         for (int i = 1; i <= meta.getColumnCount(); i++)
         {
            System.out.println(meta.getColumnName(i) + ", " +
                               meta.getColumnTypeName(i));
         }
            
         // Wyświetlanie zawartości wierszy.
         System.out.println("\nOto wiersze ze zbioru wyników:");
         while (resultSet.next())
         {
            // Wyświetlanie wiersza.
            for (int i = 1; i <= meta.getColumnCount(); i++)
            {
               System.out.print(resultSet.getString(i));
            }
            System.out.println();
         }
   
         // Zamykanie obiektu stmt i połączenia.
         stmt.close();
         conn.close();
      }
      catch(Exception ex)
      {
         System.out.println("BŁĄD: " + ex.getMessage());
      }     
   }
}
