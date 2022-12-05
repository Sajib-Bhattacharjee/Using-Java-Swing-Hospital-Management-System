package practiceing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class About extends JFrame {

    private Container c;
    private ImageIcon icon, imageHirak, imageSajib, imageIrin;
    private JLabel aboutUs, labelHirak, labelSajib, labelIrin, opinion;
    private JTextArea hirakDetails, sajibDetails, irinDetails, typeOpinion;
    private Font f1, f2, f3;
    private JScrollPane scroll;
    private JButton sendUs;

    About() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(java.awt.Color.ORANGE);

        // Setting Icon Image .... 
        icon = new ImageIcon(getClass().getResource("Sbc.png"));
        this.setIconImage(icon.getImage());

        // Create FOnt .....
        f1 = new Font("Arial", Font.BOLD, 49);
        f2 = new Font("Serif", Font.BOLD, 19);
        f3 = new Font("Arial", Font.BOLD, 29);

        // JLabel Creating..... 
        aboutUs = new JLabel("About Us ");
        aboutUs.setBounds(200, 20, 299, 80);
        aboutUs.setFont(f1);
        aboutUs.setOpaque(true);
        aboutUs.setBackground(Color.BLACK);
        aboutUs.setForeground(Color.white);
        aboutUs.setHorizontalAlignment(JLabel.CENTER);
        aboutUs.setToolTipText("This is About Us Section");
        c.add(aboutUs);

        //Hrer is Hirak's Image...... 
        imageHirak = new ImageIcon(getClass().getResource("Hirak.jpg"));

        // Here is Hirak's Image Label......
        labelHirak = new JLabel(imageHirak);
        labelHirak.setBounds(49, 130, 120, 120);
        labelHirak.setToolTipText("This is Mr. Hirak....");
        c.add(labelHirak);

        // Here is Hirak's Details .... 
        hirakDetails = new JTextArea(" Name: Hirak Mondal.\n Student- Department Of CSE. \n North Western University, Khulna.");
        hirakDetails.setLineWrap(true);
        hirakDetails.setBounds(220, 139, 350, 80);
        hirakDetails.setWrapStyleWord(true);
        hirakDetails.setOpaque(true);
        hirakDetails.setFont(f2);
        hirakDetails.setBackground(Color.white);
        c.add(hirakDetails);

        // Here is Sajibs's Image Label......
        labelSajib = new JLabel(imageHirak);
        labelSajib.setBounds(49, 269, 120, 120);
        labelSajib.setToolTipText("This is Mr. Sajib....");
        c.add(labelSajib);

        // Here is Sajib's Details .... 
        sajibDetails = new JTextArea(" Name: Sajib Bhattacharjee .\n Student- Department Of CSE. \n North Western University, Khulna.");
        sajibDetails.setLineWrap(true);
        sajibDetails.setBounds(220, 279, 350, 80);
        sajibDetails.setWrapStyleWord(true);
        sajibDetails.setOpaque(true);
        sajibDetails.setFont(f2);
        sajibDetails.setBackground(Color.white);
        c.add(sajibDetails);

        // Here is Irin's Image Label......
        labelIrin = new JLabel(imageHirak);
        labelIrin.setBounds(49, 409, 120, 120);
        labelIrin.setToolTipText("This is Mr. Irin....");
        c.add(labelIrin);

        // Here is Irin's Details .... 
        irinDetails = new JTextArea(" Name: Irin Sultana Mitu .\n Student- Department Of CSE. \n North Western University, Khulna.");
        irinDetails.setLineWrap(true);
        irinDetails.setBounds(220, 429, 350, 80);
        irinDetails.setWrapStyleWord(true);
        irinDetails.setOpaque(true);
        irinDetails.setFont(f2);
        irinDetails.setBackground(Color.white);
        c.add(irinDetails);

        //Here is opinion Section....... 
        opinion = new JLabel("Type Your Opinion");
        opinion.setBounds(200, 560, 280, 49);
        opinion.setOpaque(true);
        opinion.setBackground(Color.gray);
        opinion.setHorizontalAlignment(JLabel.CENTER);
        opinion.setForeground(Color.white);
        opinion.setFont(f3);
        c.add(opinion);

        // Creating JTeztArea for adding Your Oppinion......
        typeOpinion = new JTextArea();
        //typeOpinion.setBounds(101,620,500,250);
        typeOpinion.setOpaque(true);
        typeOpinion.setBackground(Color.black);
        typeOpinion.setForeground(Color.white);
        typeOpinion.setFont(f2);
        typeOpinion.setWrapStyleWord(true);
        typeOpinion.setLineWrap(true);
        c.add(typeOpinion);

        // Here is adding JScrollPane..... 
        scroll = new JScrollPane(typeOpinion);
        scroll.setBounds(101, 620, 500, 250);
        c.add(scroll);

        // Send Button to Us................................
        sendUs = new JButton("Send Us");
        sendUs.setBounds(421, 880, 160, 49);
        sendUs.setFont(f3);
        sendUs.setOpaque(true);
        sendUs.setBackground(Color.red);
        sendUs.setForeground(Color.white);
        sendUs.setToolTipText("Tap to Send Your Comment/Opinion");
        c.add(sendUs);

        // Adding Action listener with send Us button......    
        sendUs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String text = typeOpinion.getText();

                if (!"".equals(text)) {

                    typeOpinion.setText("");
                    JOptionPane.showMessageDialog(null, "Thans For Your FeedBack..... #Stay Tune & #Stay Happy....");

                } else {
                    JOptionPane.showMessageDialog(null, "Please Enter Some Text And Then Press Send Us Button... Thanks !!!!!");
                }

            }
        });

    }

    public static void main(String[] args) {

        About frame = new About();

        frame.setVisible(true);
        frame.setBounds(1200, 19, 700, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("                                                      About Us ");
        frame.setResizable(false);

    }

}
