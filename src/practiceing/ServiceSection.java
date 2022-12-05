 
package practiceing;
 
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ServiceSection extends JFrame{  
    
    
    
    private Container c;
    private ImageIcon icon; 
    private Font f1,f2,f3; 
    private JLabel ambulanceSection,hotline;  
    
    
    ServiceSection(){
        
        
              // This is Default Working ...... 
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(java.awt.Color.ORANGE);

        // Setting Icon Image .... 
        icon = new ImageIcon(getClass().getResource("Sbc.png"));
        this.setIconImage(icon.getImage());
                
       
        
        // Here is Creating Font......  
        f1 = new Font("Arial", Font.BOLD, 49);
        f2 = new Font("Serif", Font.BOLD, 24);
        f3 = new Font("Arial", Font.BOLD, 29);
        
        
        
        // Heading Ceration....
        
        ambulanceSection = new JLabel(" Service Section ");
        ambulanceSection.setBounds(150, 25, 350, 60);
        ambulanceSection.setFont(f3);
        ambulanceSection.setOpaque(true);
        ambulanceSection.setBackground(Color.black);
        ambulanceSection.setForeground(Color.white);
        ambulanceSection.setHorizontalAlignment(JLabel.CENTER);
        ambulanceSection.setToolTipText(" This is Heading For Ambulance Section....");
        c.add(ambulanceSection);  
        
        
        
        // Cerating Hotline Service......
                
        ambulanceSection = new JLabel(" Hotline Numbers => ");
        ambulanceSection.setBounds(50, 125, 350, 60);
        ambulanceSection.setFont(f3);
        ambulanceSection.setOpaque(true);
        ambulanceSection.setBackground(Color.red);
        ambulanceSection.setForeground(Color.white);
        ambulanceSection.setHorizontalAlignment(JLabel.CENTER);
        ambulanceSection.setToolTipText(" This is All Hotline Numbers...");
        c.add(ambulanceSection);  
        
        
        
        // Cerating Hotline Service......
                
        ambulanceSection = new JLabel(" 1.(999)- National Emergency Hotline Number. ");
        ambulanceSection.setBounds(5, 200, 650, 60);
        ambulanceSection.setFont(f2);
        ambulanceSection.setOpaque(true);
        ambulanceSection.setBackground(Color.red);
        ambulanceSection.setForeground(Color.white);
        ambulanceSection.setHorizontalAlignment(JLabel.LEFT);
        ambulanceSection.setToolTipText(" This is All Hotline Numbers...");
        c.add(ambulanceSection);  
        
       
        
        // Cerating Hotline Service......
                
        ambulanceSection = new JLabel(" 2.(333)- National Hotline Number. ");
        ambulanceSection.setBounds(5, 270, 650, 60);
        ambulanceSection.setFont(f2);
        ambulanceSection.setOpaque(true);
        ambulanceSection.setBackground(Color.red);
        ambulanceSection.setForeground(Color.white);
        ambulanceSection.setHorizontalAlignment(JLabel.LEFT);
        ambulanceSection.setToolTipText(" This is All Hotline Numbers...");
        c.add(ambulanceSection);   
        
        
        
        ambulanceSection = new JLabel(" 3.(10921)- National Helpline for Violence against women.");
        ambulanceSection.setBounds(5, 340, 650, 60);
        ambulanceSection.setFont(f2);
        ambulanceSection.setOpaque(true);
        ambulanceSection.setBackground(Color.red);
        ambulanceSection.setForeground(Color.white);
        ambulanceSection.setHorizontalAlignment(JLabel.LEFT);
        ambulanceSection.setToolTipText(" This is All Hotline Numbers...");
        c.add(ambulanceSection);  
        
        
        
        ambulanceSection = new JLabel(" 4.(109)- Women and Child are abused. ");
        ambulanceSection.setBounds(5, 410, 650, 60);
        ambulanceSection.setFont(f2);
        ambulanceSection.setOpaque(true);
        ambulanceSection.setBackground(Color.red);
        ambulanceSection.setForeground(Color.white);
        ambulanceSection.setHorizontalAlignment(JLabel.LEFT);
        ambulanceSection.setToolTipText(" This is All Hotline Numbers...");
        c.add(ambulanceSection);  
    
        
        
        ambulanceSection = new JLabel(" 5.(106)- Dudok Helpline. ");
        ambulanceSection.setBounds(5, 480, 650, 60);
        ambulanceSection.setFont(f2);
        ambulanceSection.setOpaque(true);
        ambulanceSection.setBackground(Color.red);
        ambulanceSection.setForeground(Color.white);
        ambulanceSection.setHorizontalAlignment(JLabel.LEFT);
        ambulanceSection.setToolTipText(" This is All Hotline Numbers...");
        c.add(ambulanceSection);   
        
        
        
        ambulanceSection = new JLabel(" 6.(1090)- Disater Warning in advance. ");
        ambulanceSection.setBounds(5, 550, 650, 60);
        ambulanceSection.setFont(f2);
        ambulanceSection.setOpaque(true);
        ambulanceSection.setBackground(Color.red);
        ambulanceSection.setForeground(Color.white);
        ambulanceSection.setHorizontalAlignment(JLabel.LEFT);
        ambulanceSection.setToolTipText(" This is All Hotline Numbers...");
        c.add(ambulanceSection);   
        
        
        ambulanceSection = new JLabel(" 7.(100)- Bangladesh Police HelpDesk. ");
        ambulanceSection.setBounds(5, 620, 650, 60);
        ambulanceSection.setFont(f2);
        ambulanceSection.setOpaque(true);
        ambulanceSection.setBackground(Color.red);
        ambulanceSection.setForeground(Color.white);
        ambulanceSection.setHorizontalAlignment(JLabel.LEFT);
        ambulanceSection.setToolTipText(" This is All Hotline Numbers...");
        c.add(ambulanceSection);   
        
        
        
        ambulanceSection = new JLabel(" 8.(101)- RAB HelpDesk. ");
        ambulanceSection.setBounds(5, 690, 650, 60);
        ambulanceSection.setFont(f2);
        ambulanceSection.setOpaque(true);
        ambulanceSection.setBackground(Color.red);
        ambulanceSection.setForeground(Color.white);
        ambulanceSection.setHorizontalAlignment(JLabel.LEFT);
        ambulanceSection.setToolTipText(" This is All Hotline Numbers...");
        c.add(ambulanceSection);   
        
        
        
                
        ambulanceSection = new JLabel(" 9.(102)- Fire Service Hotline. ");
        ambulanceSection.setBounds(5, 760, 650, 60);
        ambulanceSection.setFont(f2);
        ambulanceSection.setOpaque(true);
        ambulanceSection.setBackground(Color.red);
        ambulanceSection.setForeground(Color.white);
        ambulanceSection.setHorizontalAlignment(JLabel.LEFT);
        ambulanceSection.setToolTipText(" This is All Hotline Numbers...");
        c.add(ambulanceSection);  
        
        
        
        ambulanceSection = new JLabel(" 10.(105)- National Identity Card. ");
        ambulanceSection.setBounds(5, 830, 650, 60);
        ambulanceSection.setFont(f2);
        ambulanceSection.setOpaque(true);
        ambulanceSection.setBackground(Color.red);
        ambulanceSection.setForeground(Color.white);
        ambulanceSection.setHorizontalAlignment(JLabel.LEFT);
        ambulanceSection.setToolTipText(" This is All Hotline Numbers...");
        c.add(ambulanceSection); 
        
        
        
    }
    
    
   
    public static void main(String[] args){
        
        
        ServiceSection frame = new ServiceSection();
        
        frame.setVisible(true);
        frame.setBounds(1200, 19, 700, 1100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("                                            Service Section ");
        frame.setResizable(false); 
        
        
        
        
    }
}
