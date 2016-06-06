import java.util.Scanner;
import java.io.*;
public class MakeIventory
{
   public static void main (String[] args) throws Exception
   {
      System.setOut(new PrintStream(new File("inventory.txt")));
      int size = (int)(Math.random()*400) + 100;
      System.out.println(size);
      int randomtype = 0;
      int randombrand = 0;
      int randomcolor = 0;
      int randomprice = 0;
      int randomsize = 0;
      for (int i = 0; i < size; i++)
      {
         randomtype = (int)(Math.random()*4);
         if (randomtype == 0) System.out.print("Basketball, ");
         if (randomtype == 1) System.out.print("Soccer, ");
         if (randomtype == 2) System.out.print("Tennis, ");
         if (randomtype == 3) System.out.print("Running, ");
         randombrand = (int)(Math.random()*7);
         if (randombrand == 0 || randombrand == 1) System.out.print("Nike, ");
         if (randombrand == 2) System.out.print("Adidas, ");
         if (randombrand == 3) System.out.print("Puma, ");
         if (randombrand == 4) System.out.print("Asics, ");
         if (randombrand == 5) System.out.print("Under Armour, ");
         if (randombrand == 6) System.out.print("New Balance, ");
         randomcolor = (int)(Math.random()*7);
         if (randomcolor == 0) System.out.print("Red, ");
         if (randomcolor == 1) System.out.print("Orange, ");
         if (randomcolor == 2) System.out.print("Yellow, ");
         if (randomcolor == 3) System.out.print("Green, ");
         if (randomcolor == 4) System.out.print("Blue, ");
         if (randomcolor == 5) System.out.print("Pink, ");
         if (randomcolor == 6) System.out.print("Magenta, ");
         randomprice = (int)(Math.random()*699) + 50;
         System.out.print("$" + randomprice + ", ");
         randomsize = (int)(Math.random()*16);
         if (randomsize == 0) System.out.print("3.5");
         if (randomsize == 1) System.out.print("4");
         if (randomsize == 2) System.out.print("4.5");
         if (randomsize == 3) System.out.print("5");
         if (randomsize == 4) System.out.print("5.5");
         if (randomsize == 5) System.out.print("6");
         if (randomsize == 6) System.out.print("6.5");
         if (randomsize == 7) System.out.print("7");
         if (randomsize == 8) System.out.print("7.5");
         if (randomsize == 9) System.out.print("8");
         if (randomsize == 10) System.out.print("8.5");
         if (randomsize == 11) System.out.print("9");
         if (randomsize == 12) System.out.print("10.5");
         if (randomsize == 13) System.out.print("11.5");
         if (randomsize == 14) System.out.print("12.5");
         if (randomsize == 15) System.out.print("14");
         System.out.println();
      }
   
   
   }
   
   
}