import javax.swing.JFrame;
public class ShoeDriver
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Shoe Database ");
      frame.setSize(800, 800);
      frame.setLocation(200, -6);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(new ShoePanel());
      frame.setVisible(true);
      frame.repaint();
   }
}