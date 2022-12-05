package practiceing;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Learning extends JFrame {

    private Container c;
    private Font f1, f2;
    private ImageIcon icon;
    private JLabel name;
    private JButton wellcomeBtn;
    private Cursor cursor;

    Learning() {
        allWorks();
    }

    public void allWorks() {

        //Set Background color and setting layout....
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(java.awt.Color.ORANGE);

        // Setting Icon Image .... 
        icon = new ImageIcon(getClass().getResource("Sbc.png"));
        this.setIconImage(icon.getImage());

        // Create FOnt .....
        f1 = new Font("Arial", Font.BOLD, 39);
        f2 = new Font("Arial", Font.BOLD, 25);

        // Here is Creating Curosr....
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Create Jlabel...
        name = new JLabel("Wellcome To Our Service");
        name.setBounds(100, 169, 500, 69);
        name.setHorizontalAlignment(JLabel.CENTER);
        name.setOpaque(true);
        name.setFont(f1);
        name.setBackground(java.awt.Color.BLACK);
        name.setForeground(java.awt.Color.white);
        c.add(name);

        //Adding Wellcome Button....
        wellcomeBtn = new JButton("Tap To Continue....");
        wellcomeBtn.setBounds(199, 280, 269, 49);
        wellcomeBtn.setFont(f2);
        wellcomeBtn.setOpaque(true);
        wellcomeBtn.setBackground(java.awt.Color.green);
        wellcomeBtn.setForeground(java.awt.Color.black);
        wellcomeBtn.setToolTipText("Life is Waitting for You, Please Tap !!!! ");
        wellcomeBtn.setCursor(cursor);
        c.add(wellcomeBtn);

        // Here is adding Action Listener ......   
        
        wellcomeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                FrontPage fp = new FrontPage();
                fp.setVisible(true);
                fp.setResizable(false);
                fp.setBounds(500, 200, 700, 600);
                fp.setTitle("                                                    Our Services ");
                dispose();

            }

        });

        /*
        wellcomeBtn.addActionListener((ActionEvent ae) -> { 
            
             Main frame = new Main();
             
             frame.setVisible(true);
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             frame.setBounds(400,200,700,600);
             frame.setTitle("                                           Our Services ");
             frame.setResizable(false);
             
             dispose(); 
        }); 

         */
    }

    public static void main(String[] args) {

        Learning frame = new Learning();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("                                     Wellcoome to Our DocPage");
        frame.setBounds(500, 200, 700, 600);
        frame.setResizable(false);

    }

}
