 
package practiceing; 

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
 
import javax.swing.JFrame;

public class DonateSection extends JFrame{    
    
    private Container c;
    private ImageIcon icon;
    private Font f1, f2, f3;
    private JLabel StockSection, selectOne;
    private JButton blood, oxygen;
    
    
    DonateSection(){
        
       
        
         // Default Work......
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(java.awt.Color.ORANGE);

        // Setting Icon Image .... 
        icon = new ImageIcon(getClass().getResource("Sbc.png"));
        this.setIconImage(icon.getImage());

        // Create FOnt .....
        f1 = new Font("Arial", Font.BOLD, 49);
        f2 = new Font("Serif", Font.BOLD, 19);
        f3 = new Font("Arial", Font.ITALIC, 39);

        // JLabel Creating..... 
        StockSection = new JLabel(" Donate Section ");
        StockSection.setBounds(159, 49, 399, 80);
        StockSection.setFont(f1);
        StockSection.setOpaque(true);
        StockSection.setBackground(Color.black);
        StockSection.setForeground(Color.white);
        StockSection.setHorizontalAlignment(JLabel.CENTER);
        StockSection.setToolTipText("This is Donate Section");
        c.add(StockSection);

        // Jlabel Creating( Please Select One)......   
        selectOne = new JLabel(" Tap to Donate Your Blood ==> ");
        selectOne.setBounds(100, 249, 499, 59);
        selectOne.setFont(f2);
        selectOne.setOpaque(true);
        selectOne.setBackground(Color.darkGray);
        selectOne.setForeground(Color.white);
        selectOne.setHorizontalAlignment(JLabel.CENTER);
        selectOne.setToolTipText("Please!!! Select One.....");
        c.add(selectOne);
        
        
        
        // This is blood donate Section....... 
        
        
        oxygen = new JButton(" Donate Your Blood ");
        oxygen.setBounds(119, 349, 459, 119);
        oxygen.setFont(f3);
        oxygen.setOpaque(true);
        oxygen.setBackground(Color.red);
        oxygen.setForeground(Color.white);
        oxygen.setHorizontalAlignment(JLabel.CENTER);
        oxygen.setToolTipText("Tap to donate your Blood......");

        c.add(oxygen);
        
        
        
        // Adding action listener...... 
        
        oxygen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
              
        BloodDonate bd = new BloodDonate();
        
        bd.setVisible(true);
        bd.setBounds(1200, 19, 700, 1100);
         
        bd.setTitle("                                                    Blood Donate ");
        bd.setResizable(false);
        
                
                
            }
        
          
        });
        
        
        
        
        
    }
    
    
    
    
    public static void main(String[] args){
        
        
        DonateSection frame = new DonateSection();
        
        
        frame.setVisible(true);
        frame.setBounds(1200, 19, 700, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("                                                          Donate ");
        frame.setResizable(false);
        
    }
    
}
