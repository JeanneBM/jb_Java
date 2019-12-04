/**
   Klasa Telephone udostępnia statyczne metody
   do formatowania i usuwania formatowania amerykańskich 
   numerów telefonów.
*/
 
public class Telephone
{
   // Te stałe przechowują poprawną długość łańcuchów znaków 
   // w sformatowanej i niesformatowanej postaci.
   public final static int FORMATTED_LENGTH = 13;
   public final static int UNFORMATTED_LENGTH = 10;
   
   /**
      Metoda isFormatted określa, czy łańcuch znaków 
      jest poprawnie sformatowany jako amerykański
      numer telefonu i ma postać:
      (XXX)XXX-XXXX
      @param str Sprawdzany łańcuch znaków.
      @return true, jeśli łańcuch znaków jest poprawnie sformatowany,
              i false w przeciwnym razie.
   */

   public static boolean isFormatted(String str)
   {
      boolean valid;  // Flaga informująca, czy format jest poprawny.

      // Określanie, czy łańcuch str jest poprawnie sformatowany.
      if (str.length() == FORMATTED_LENGTH && 
          str.charAt(0) == '(' &&
          str.charAt(4) == ')' &&
          str.charAt(8) == '-')
          valid = true;
      else
         valid = false;
      
      // Zwracanie wartości flagi valid.
      return valid;
   }
   
   /**
      Metoda unformat przyjmuje łańcuch znaków zawierający
      numer telefonu w formacie:
      (XXX)XXX-XXXX.
      Jeśli argument jest sformatowany w ten sposób, metoda
      zwraca niesformatowany łańcuch znaków, z usuniętym 
      nawiasem i myślnikiem. W przeciwnym razie
      zwraca niezmodyfikowany argument.
      @param str Łańcuch znaków, którego formatowanie należy usunąć.
      @return Niesformatowany łańcuch znaków.
   */
    
   public static String unformat(String str)
   {
      // Tworzenie obiektu typu StringBuilder inicjowanego parametrem str.
      StringBuilder strb = new StringBuilder(str);
      
      // Jeśli argument jest poprawnie sformatowany, należy
      // usunąć formatowanie.
      if (isFormatted(str))
      {
         // Najpierw należy usunąć lewy nawias z pozycji 0.
         strb.deleteCharAt(0);

         // Następnie usuwany jest prawy nawias. Z powodu
         // wcześniejszego usuwania znajduje
         // się on teraz na pozycji 3.
         strb.deleteCharAt(3);

         // Następnie usuwany jest myślnik. Z powodu
         // wcześniejszych operacji usuwania myślnik
         // znajduje się teraz na pozycji 6.
         strb.deleteCharAt(6);
      }
      
      // Zwracanie niesformatowanego łańcucha znaków.
      return strb.toString();
   }
   
   /**
      Metoda format formatuje łańcuch znaków do postaci:
      (XXX)XXX-XXXX.
      Jeśli długość argumentu to UNFORMATTED_LENGTH,
      metoda zwraca sformatowany łańcuch znaków. W przeciwnym
      razie zwraca niezmodyfikowany argument.
      @param str Formatowany łańcuch znaków.
      @return Łańcuch znaków sformatowany jako amerykański numer telefonu.
   */
    
   public static String format(String str)
   {
      // Tworzenie obiektu typu StringBuilder zainicjowanego parametrem str.
      StringBuilder strb = new StringBuilder(str);

      // Jeśli argument ma prawidłową długość, należy
      // go sformatować.
      if (str.length() == UNFORMATTED_LENGTH)
      {
         // Najpierw należy wstawić lewy nawias na pozycji 0.
         strb.insert(0, "(");
            
         // Najpierw należy wstawić prawy nawias na pozycji 4.
         strb.insert(4, ")");
            
         // Najpierw należy wstawić myślnik na pozycji 8.
         strb.insert(8, "-");
      }
      
      // Zwracanie sformatowanego łańcucha znaków.
      return strb.toString();
   }
}
