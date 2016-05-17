   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   public class CandyLandPanel extends JPanel
   {
      private JButton[][] board;
      private String[][] matrix;
      private JPanel center;
      public CandyLandPanel()
      {
      	      
         center = new JPanel();
         center.setLayout(new GridLayout(10,10));
         add(center, BorderLayout.CENTER);
      	
         setLayout(new BorderLayout());     
         board = new JButton[10][10];
         matrix = new String[10][10];
         center.setLayout(new GridLayout(10,10));
         add(center, BorderLayout.CENTER);
         int x; 
         for(int r = 0; r < 10; r++)
         {
            for(int c = 0; c < 10; c++)
            {
               board[r][c] = new JButton();
					board[r][c].setBackground(new Color((int) (Math.random() * 155)+ 100,(int) (Math.random() * 55),(int) (Math.random() * 55)+20));      
               if (r%2==1 && c != 0 && c != 9)
                  board[r][c].setBackground(Color.black);
               if (c==0 && r%4 == 1)
						board[r][c].setBackground(Color.black);
					if (c==9 && r%4 == 3)
						board[r][c].setBackground(Color.black);						
               board[r][c].addActionListener( new Handler1(r, c) );
               board[r][c].setEnabled(false);
               center.add(board[r][c]);
            }
         }
      }
   
      private class Handler1 implements ActionListener
      {
         private int myRow, myCol;
         public Handler1(int r, int c)
         {
            myRow = r;
            myCol = c;
         }
         public void actionPerformed(ActionEvent e)
         {
         	
         }
      }
   }

