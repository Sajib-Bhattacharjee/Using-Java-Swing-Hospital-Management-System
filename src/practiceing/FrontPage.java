package practiceing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FrontPage extends JFrame {

    private final Container c;
    private final ImageIcon icon;
    private Font f1, f2;
    private JButton stock, donate, ambulance, services, about;

    FrontPage() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(java.awt.Color.yellow);

        // Setting Icon Image .... 
        icon = new ImageIcon(getClass().getResource("Sbc.png"));
        this.setIconImage(icon.getImage());

        // Create FOnt .....
        f1 = new Font("Arial", Font.BOLD, 39);
        f2 = new Font("Arial", Font.ITALIC, 35);

        stock = new JButton("Stock");
        stock.setBounds(80, 100, 250, 100);
        stock.setHorizontalAlignment(JButton.CENTER);
        stock.setFont(f1);
        stock.setOpaque(true);
        stock.setBackground(Color.GREEN);
        stock.setForeground(Color.black);
        stock.setToolTipText("Click Here to See Our Stockss");
        c.add(stock);

        donate = new JButton("Donate");
        donate.setBounds(369, 100, 250, 100);
        donate.setHorizontalAlignment(JButton.CENTER);
        donate.setFont(f1);
        donate.setOpaque(true);
        donate.setBackground(Color.GREEN);
        donate.setForeground(Color.black);
        donate.setToolTipText("Click Here to See Our Donate Details");
        c.add(donate);

        ambulance = new JButton("Ambulance");
        ambulance.setBounds(80, 229, 250, 100);
        ambulance.setHorizontalAlignment(JButton.CENTER);
        ambulance.setFont(f1);
        ambulance.setOpaque(true);
        ambulance.setBackground(Color.GREEN);
        ambulance.setForeground(Color.black);
        ambulance.setToolTipText("Click Here to See Our Donate Details");
        c.add(ambulance);

        services = new JButton("Services");
        services.setBounds(369, 229, 250, 100);
        services.setHorizontalAlignment(JButton.CENTER);
        services.setFont(f1);
        services.setOpaque(true);
        services.setBackground(Color.GREEN);
        services.setForeground(Color.black);
        services.setToolTipText("Click Here to See Our Services Details");
        c.add(services);

        about = new JButton("About");

        about.setBounds(479, 410, 130, 69);
        about.setFont(f2);
        about.setOpaque(true);
        about.setBackground(Color.blue);
        about.setForeground(Color.white);
        about.setToolTipText("See About Us Here,,, Details....");
        c.add(about);

        // Here is All Action Listener Adding ....... 
        // Here is adding Action Listener for Stock Section....... \
        stock.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                StockSection sc = new StockSection();

                sc.setVisible(true);
                sc.setBounds(1200, 19, 700, 1000);
                sc.setTitle("                                                          Stock ");
                sc.setResizable(false);

            }

        });

        // Here is adding Action Listener For About Section ............
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                About as = new About();
                as.setVisible(true);
                as.setBounds(1200, 19, 700, 1000);
                as.setTitle("                                                        About Us ");
                as.setResizable(false);

            }

        });  
        
        
        // Addding actinlistener with donate Section.... 
        
        donate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                       
        DonateSection ds = new DonateSection();
        
        
        ds.setVisible(true);
        ds.setBounds(1200, 19, 700, 1000);
        
        ds.setTitle("                                                          Donate ");
        ds.setResizable(false);
                
             
            }
         
        });   
        
        
        
        
        /// Adding aCTIONLISTENER WITH ambulance section...... 
        
        
        ambulance.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
             
                
        AmbulanceSection as = new AmbulanceSection(); 
        
                
        as.setVisible(true);
        as.setBounds(1200, 19, 700, 1100);
         
        as.setTitle("                                            Ambulance Section ");
        as.setResizable(false);  
                
                
            }
        
        });
        
        
        // Adding Actionlistener with Service Button..... 
        
        services.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
              
                
       ServiceSection ss = new ServiceSection();
        
        ss.setVisible(true);
        ss.setBounds(1200, 19, 700, 1100);
       
        ss.setTitle("                                            Service Section ");
        ss.setResizable(false); 
                
            }
          
        });

    }

    public static void main(String[] args) {

        FrontPage frame = new FrontPage();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 200, 700, 600);
        frame.setTitle("                                       Our Services ");
        frame.setResizable(false);

    }

}
