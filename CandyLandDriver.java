//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
//version 4.5.2003

   import javax.swing.JFrame;
   public class CandyLandDriver
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("CandyLand!");
         frame.setSize(800, 650);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.getContentPane().add(new CandyLandPanel());
         frame.setVisible(true);
      }
   }