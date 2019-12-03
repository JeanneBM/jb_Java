/**
   Ten program wyświetla przekazane mu argumenty
   z wiersza poleceń systemu operacyjnego.
*/

public class CommandLine
{
   public static void main(String[] args)
   {
      for (int index = 0; index < args.length; index++)
         System.out.println(args[index]);
   }
}
