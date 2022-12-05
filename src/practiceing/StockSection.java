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

public class StockSection extends JFrame {

    private Container c;
    private ImageIcon icon;
    private Font f1, f2, f3;
    private JLabel StockSection, selectOne;
    private JButton blood, oxygen;
   // private JButton next;
   //    private ButtonGroup buttonGroup;

    StockSection() {

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
        StockSection = new JLabel(" Stock Section ");
        StockSection.setBounds(159, 49, 399, 80);
        StockSection.setFont(f1);
        StockSection.setOpaque(true);
        StockSection.setBackground(Color.black);
        StockSection.setForeground(Color.white);
        StockSection.setHorizontalAlignment(JLabel.CENTER);
        StockSection.setToolTipText("This is Stock Section");
        c.add(StockSection);

        // Jlabel Creating( Please Select One)......   
        selectOne = new JLabel(" Please Select One ==> ");
        selectOne.setBounds(100, 249, 499, 59);
        selectOne.setFont(f2);
        selectOne.setOpaque(true);
        selectOne.setBackground(Color.darkGray);
        selectOne.setForeground(Color.white);
        selectOne.setHorizontalAlignment(JLabel.CENTER);
        selectOne.setToolTipText("Please!!! Select One.....");
        c.add(selectOne);

        // Here is Creation ButtonGroup...... 
        //    buttonGroup = new ButtonGroup();

        // Creating JButton(For Blood)..... 
        blood = new JButton(" Blood Stock ");
        blood.setBounds(20, 349, 310, 119);
        blood.setFont(f3);
        blood.setOpaque(true);
        blood.setBackground(Color.green);
        blood.setForeground(Color.black);
        blood.setHorizontalAlignment(JLabel.CENTER);
        blood.setToolTipText(" This is Blood Stock Section.....");

        c.add(blood);

        // Creating JButton(For Oxygen)..... 
        oxygen = new JButton(" Oxygen Stock ");
        oxygen.setBounds(359, 349, 310, 119);
        oxygen.setFont(f3);
        oxygen.setOpaque(true);
        oxygen.setBackground(Color.green);
        oxygen.setForeground(Color.black);
        oxygen.setHorizontalAlignment(JLabel.CENTER);
        oxygen.setToolTipText("This is Oxygen Stock Section......");

        c.add(oxygen);
        
        /*
        
        // Here is Adding JRadioButton in ButtonGroup..... 
        buttonGroup.add(blood);
        buttonGroup.add(oxygen);
        
        
        //Creating JButton(Next Button)..... 
        next = new JButton("Next->");
        next.setBounds(441, 509, 169, 79);
        next.setFont(f3);
        next.setOpaque(true);
        next.setBackground(Color.red);
        next.setForeground(Color.white);
        next.setToolTipText("Please !!! Top to go Next Section.....");
        c.add(next); 

        
        */   
        
        
        
        
        
        /// adding actionsistere with Bolld stock.......
        
        blood.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                BloodStock bs = new BloodStock(); 
                
                bs.setVisible(true);
                bs.setBounds(1200, 19, 700, 1100);
                 
                bs.setTitle("                                                    Blood Stock ");
                bs.setResizable(false);
            }
        
        });   
        
        //Adding actionlistener with oxygen stock.... 
        
        oxygen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                 
                
                
        OxygenStock os = new OxygenStock();

        os.setVisible(true);
        os.setBounds(1200, 19, 700, 1100);
      
        os.setTitle("                                                    Oxygen Stock ");
        os.setResizable(false);
             
                
            }
          
        });
         

    }

    public static void main(String[] args) {

        StockSection frame = new StockSection();

        frame.setVisible(true);
        frame.setBounds(1200, 19, 700, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("                                                          Stock ");
        frame.setResizable(false);

    }

}
