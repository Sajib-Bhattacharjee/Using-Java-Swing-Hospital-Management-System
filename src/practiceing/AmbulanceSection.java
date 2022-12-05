 
package practiceing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class AmbulanceSection extends JFrame{  
    
    
    private Container c;
    private ImageIcon icon; 
    private Font f1,f2,f3; 
    private JLabel ambulanceSection;
    
    
    
    AmbulanceSection(){
        
        // This is Default Working ...... 
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(java.awt.Color.ORANGE);

        // Setting Icon Image .... 
        icon = new ImageIcon(getClass().getResource("Sbc.png"));
        this.setIconImage(icon.getImage());
                
       
        
        // Here is Creating Font......  
        f1 = new Font("Arial", Font.BOLD, 49);
        f2 = new Font("Serif", Font.BOLD, 19);
        f3 = new Font("Arial", Font.BOLD, 29);
        
        
        
        // Heading Ceration....
        
        ambulanceSection = new JLabel(" Wellcome To Our Ambulance Section ");
        ambulanceSection.setBounds(70, 25, 550, 60);
        ambulanceSection.setFont(f3);
        ambulanceSection.setOpaque(true);
        ambulanceSection.setBackground(Color.black);
        ambulanceSection.setForeground(Color.white);
        ambulanceSection.setHorizontalAlignment(JLabel.CENTER);
        ambulanceSection.setToolTipText(" This is Heading For Ambulance Section....");
        c.add(ambulanceSection);
        
        
        
        
        ambulanceSection = new JLabel(" This Feature Will Abailable Soon ");
        ambulanceSection.setBounds(50, 450, 550, 60);
        ambulanceSection.setFont(f3);
        ambulanceSection.setOpaque(true);
        ambulanceSection.setBackground(Color.red);
        ambulanceSection.setForeground(Color.white);
        ambulanceSection.setHorizontalAlignment(JLabel.CENTER);
        ambulanceSection.setToolTipText(" This is Heading For Ambulance Section....");
        c.add(ambulanceSection);


        
        
     
        
                
        
        
    }
    
    
    public static void main(String[] args){
        
        AmbulanceSection frame = new AmbulanceSection(); 
        
        
        frame.setVisible(true);
        frame.setBounds(1200, 19, 700, 1100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("                                            Ambulance Section ");
        frame.setResizable(false); 
        
        
        
    }
    
}
