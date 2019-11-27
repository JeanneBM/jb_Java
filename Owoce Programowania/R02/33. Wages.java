// Ten program oblicza wypłatę podstawową plus dodatek za nadgodziny.

public class Wages
{
   public static void main(String[] args)      
   {
     double regularWages; // Wypłata podstawowa.
     double basePay = 25; // Stawka podstawowa.
     double regularHours = 40; // Przepracowane godziny bez nadgodzin.
     double overtimeWages; // Wypłata za nadgodziny.
     double overtimePay = 37.5; // Stawka godzinowa za nadgodziny.
     double overtimeHours = 10; // Liczba nadgodzin.
     double totalWages; // Wypłata w sumie.
   
      regularWages = basePay * regularHours; 
      overtimeWages = overtimePay * overtimeHours;
      totalWages = regularWages + overtimeWages;
     System.out.println("Wypłata za ten tydzień wynosi " + 
                        totalWages + " złotego.");
   }
}  

