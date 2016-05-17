import javax.swing.JFrame;
public class CandyLandDriver
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("CandyLand!");
      frame.setSize(800, 800);
      frame.setLocation(200, 1);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(new CandyLandPanel());
      frame.setVisible(true);
   }
}
