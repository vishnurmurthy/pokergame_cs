import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class ShoePanel extends JPanel
{
   private JLabel search;
   private JLabel description;
   private JButton next;
   public ShoePanel()
   {
      setLayout(new BorderLayout());
      search = new JLabel("Search for a Shoe!", SwingConstants.CENTER);
      search.setFont(new Font("Times New Roman", Font.PLAIN, 30));
      add(search, BorderLayout.NORTH);
      add(new DisplayShoePanel(), BorderLayout.CENTER);
      next = new JButton("Next");
      add(next, BorderLayout.SOUTH);
      
   }
   private class NextListener implements ActionListener
   {
      public void actionPerformed (ActionEvent e)
      {
      
      }
   }
}

