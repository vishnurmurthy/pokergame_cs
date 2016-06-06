import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.ListCellRenderer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class DisplayShoePanel extends JPanel
{
   private JLabel type;
   private JLabel brand;
   private JComboBox<String> typebr;
   private JComboBox<String> typecb;
   private JLabel color;
   private JLabel size;
   private JLabel price;
   private JButton[] typecl;
   private JSlider priceslider;
   private JSpinner sizespinner;
   public DisplayShoePanel()
   {
      setLayout(new GridLayout(10,2));
      type = new JLabel("Type: ");
      type.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      add(type);
      String[] choices = {"Basketball Shoes", "Soccer Shoes", "Tennis Shoes", "Running Shoes"};
      typecb = new JComboBox<String>(choices);
      typecb.addActionListener(new ListenerCb());
      add(typecb);
      
      brand = new JLabel("Brand: ");
      brand.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      add(brand);
      
      String[] choices2 = {"Nike", "Adidas", "Puma", "Under Armour", "Asics", "New Balance"};
      typebr = new JComboBox<String>(choices2);
      typebr.addActionListener(new ListenerBr());
      add(typebr);
   
      color = new JLabel("Color: ");
      color.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      add(color);
      
      String[] choices3 = {"Red", "Orange", "Yellow", "Green", "Blue", "Pink", "Magenta"};
      JComboBox typecl = new JComboBox(choices3);
      typecl.addActionListener(new ListenerCl());
      add(typecl);
      
      price = new JLabel("Maximum Price ($): ");
      price.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      add(price);
      
      priceslider = new JSlider(JSlider.HORIZONTAL, 50, 750, 200);
      priceslider.addChangeListener(new ListenerPrSl());
      priceslider.setMajorTickSpacing(50);
      priceslider.setMinorTickSpacing(10);
      priceslider.setPaintTicks(true);
      priceslider.setPaintLabels(true);
      add(priceslider);
      
      size = new JLabel("Size(Mens): ");
      size.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      add(size);
      
      String[] choicesizes = {"3.5", "4", "4.5", "5", "5.5", "6", "6.5", "7", "7.5",
                              "8", "8.5", "9", "10.5", "11.5", "12.5", "14"};
      SpinnerListModel spin = new SpinnerListModel(choicesizes);
      sizespinner = new JSpinner(spin);
      sizespinner.addChangeListener(new ListenerSzSp());
      add(sizespinner);
   }
   public class ListenerCb implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
                  
      }
   }
   public class ListenerBr implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
                  
      }
   }
   public class ListenerCl implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
                  
      }
   }
   public class ListenerLaovel implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
                  
      }
   }
   public class ListenerPrSl implements ChangeListener
   {
      public void stateChanged(ChangeEvent e)
      {
      
      }
   }
   public class ListenerSzSp implements ChangeListener
   {
      public void stateChanged(ChangeEvent e)
      {
      
      }
   }

}