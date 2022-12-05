package practiceing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class BloodStock extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel bloodStock, name, age, gender, bloodGroup, phone , payment , bkashHead, number,amount,password , nHead , nNumber,nAmount,nPass;
   
    private JTextField forName, forAge, forGender,forPhone, bkashNumber ,bkashAmount , NNumber,NAmount;
    private JPasswordField bkashPass ,NPass;
    private JCheckBox male,female,others;
    private JButton proceed,nProceed;
    private ButtonGroup btnGroup;
    private JComboBox forBloodGroup; 
    private String[] allBloodGroup = {"A+","B+","A-","B-","O+","O-","AB+","AB-"};  
    
    
    private JTabbedPane tabPane;
    private JPanel bkash,nagad,rocket;
    private Font f1, f2, f3;

    BloodStock() {

        // This is Default Working ...... 
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(java.awt.Color.ORANGE);

        // Setting Icon Image .... 
        icon = new ImageIcon(getClass().getResource("Sbc.png"));
        this.setIconImage(icon.getImage());

        // Here is Creating Font ..... 
        // Create FOnt .....
        f1 = new Font("Arial", Font.BOLD, 49);
        f2 = new Font("Serif", Font.BOLD, 19);
        f3 = new Font("Arial", Font.BOLD, 29);

        // Here is Creating JLabel For Stock Section..... 
        // JLabel Creating..... 
        bloodStock = new JLabel(" Blood Stock ");
        bloodStock.setBounds(200, 5, 310, 50);
        bloodStock.setFont(f3);
        bloodStock.setOpaque(true);
        bloodStock.setBackground(Color.black);
        bloodStock.setForeground(Color.white);
        bloodStock.setHorizontalAlignment(JLabel.CENTER);
        bloodStock.setToolTipText("This is About Us Section");
        c.add(bloodStock);

        // JLabel For (Name).....  
        name = new JLabel(" 1.Name: ");
        name.setBounds(10, 69, 159, 40);
        name.setFont(f3);
        name.setOpaque(true);
        name.setBackground(Color.cyan);
        name.setForeground(Color.black);
        name.setHorizontalAlignment(JLabel.LEFT);
        name.setToolTipText("Name Requireing.... ");
        c.add(name);

        // JTextField For Input Name..... 
        forName = new JTextField();
        forName.setBounds(199, 69, 300, 40);
        forName.setFont(f2);
        forName.setOpaque(true);
        forName.setBackground(Color.LIGHT_GRAY);
        forName.setForeground(Color.black);
        forName.setToolTipText("Enter Your Full Name");
        forName.setHorizontalAlignment(JTextField.CENTER);
        c.add(forName);

        // JLabel For (Age).....  
        age = new JLabel(" 2.Age: ");
        age.setBounds(10, 119, 159, 40);
        age.setFont(f3);
        age.setOpaque(true);
        age.setBackground(Color.cyan);
        age.setForeground(Color.black);
        age.setHorizontalAlignment(JLabel.LEFT);
        age.setToolTipText("Age Requireing.... ");
        c.add(age);

        // JTextField For Age.... 
        forAge = new JTextField();
        forAge.setBounds(199, 119, 300, 40);
        forAge.setFont(f2);
        forAge.setOpaque(true);
        forAge.setBackground(Color.lightGray);
        forAge.setForeground(Color.black);
        forAge.setToolTipText("Enter Your Age");
        forAge.setHorizontalAlignment(JTextField.CENTER);
        c.add(forAge);      
        
        
        
        
        
        // JLabel For (Genger).....  
        gender = new JLabel(" 3.Gender: ");
        gender.setBounds(10, 169, 159, 40);
        gender.setFont(f3);
        gender.setOpaque(true);
        gender.setBackground(Color.cyan);
        gender.setForeground(Color.black);
        gender.setHorizontalAlignment(JLabel.LEFT);
        gender.setToolTipText(" Requireing Gender...  ");
        c.add(gender);
        
        
        
        // Here is Creating ButtonGroup.... 
        btnGroup = new ButtonGroup();
        
        
        
        // JCheckBox For Male...... 
        
        male = new JCheckBox("Male");
        
        male.setBounds(199, 169, 120, 40);
        male.setFont(f3);
        male.setOpaque(true);
        male.setBackground(Color.lightGray);
        male.setForeground(Color.black);
        male.setHorizontalAlignment(JLabel.LEFT);
        male.setToolTipText(" R u Male.....?");
        c.add(male);   
        
        
        
                
        // JCheckBox For FeMale...... 
        
        female = new JCheckBox("Female");
        
        female.setBounds(339, 169, 159, 40);
        female.setFont(f3);
        female.setOpaque(true);
        female.setBackground(Color.lightGray);
        female.setForeground(Color.black);
        female.setHorizontalAlignment(JLabel.LEFT);
        female.setToolTipText(" R u Male.....?");
        c.add(female);   
        
        
        // JCheckBox For Others.../...... 
        
        others = new JCheckBox("Others");
        
        others.setBounds(510, 169, 159, 40);
        others.setFont(f3);
        others.setOpaque(true);
        others.setBackground(Color.lightGray);
        others.setForeground(Color.black);
        others.setHorizontalAlignment(JLabel.LEFT);
        others.setToolTipText(" R u Male.....?");
        c.add(others);   
        
        
        /// Here is adding BUttonGroup With Gender Fieldd..... 
        
        btnGroup.add(male);
        btnGroup.add(female);
        btnGroup.add(others);   
        
        
        
        
        // Herer is adding Blood Group.... 
        
        
                
        // JLabel For (Blood Group).....  
        bloodGroup = new JLabel(" 4.Blood Group: ");
        bloodGroup.setBounds(10, 219, 249, 40);
        bloodGroup.setFont(f3);
        bloodGroup.setOpaque(true);
        bloodGroup.setBackground(Color.cyan);
        bloodGroup.setForeground(Color.black);
        bloodGroup.setHorizontalAlignment(JLabel.LEFT);
        bloodGroup.setToolTipText(" Select Your Blood Group...Please !!!!  ");
        c.add(bloodGroup);   
        
        // Here is adding JComboBox......For Blood Group..... 
        
        forBloodGroup = new JComboBox(allBloodGroup);  
       
        forBloodGroup.setBounds(280, 219, 149, 40);
        forBloodGroup.setFont(f3);
        forBloodGroup.setOpaque(true);
        forBloodGroup.setBackground(Color.lightGray);
        forBloodGroup.setForeground(Color.black);
    
        forBloodGroup.setToolTipText(" Select Your Blood Group...Please !!!!  ");
        c.add(forBloodGroup);   
        
        
        // Here is adding JLabel (Phone Number)...
        
        phone = new JLabel(" 5.Phone/mail: "); 
        phone.setBounds(10, 269, 210, 40);
        phone.setFont(f3);
        phone.setOpaque(true);
        phone.setBackground(Color.cyan);
        phone.setForeground(Color.black);
        phone.setToolTipText(" Phone Number Here......  ");
        c.add(phone);   
        
        // Here is JTextField For Phone/ Mail ..........................
        
        forPhone = new JTextField();
        forPhone.setBounds(230, 269, 349, 40);
        forPhone.setFont(f3);
        forPhone.setOpaque(true);
        forPhone.setBackground(Color.lightGray);
        forPhone.setForeground(Color.black);
        forPhone.setHorizontalAlignment(JTextField.CENTER);
        forPhone.setToolTipText(" Enter your Phone/Mail Here......  ");
        c.add(forPhone); 
        
        
        // JLabel for aesect your payment method,....
        
        payment  = new JLabel("Select Your Payment Method"); 
        payment.setBounds(59, 349, 569, 60);
        payment.setFont(f3);
        payment.setOpaque(true);
        payment.setBackground(Color.black);
        payment.setForeground(Color.white);
        payment.setHorizontalAlignment(JLabel.CENTER);
        payment.setToolTipText(" All Payment Method Here......  ");
        c.add(payment); 
        
        
         
        
        // Here is Creating JTabbedPnane...... 
        
        tabPane = new JTabbedPane();
        tabPane.setFont(f3);
        tabPane.setBounds(29,459,639,489);
        c.add(tabPane); 
        
        // Here is Bkash Heading..... 
        
        bkashHead = new JLabel("   Bkash   ");
        bkashHead.setBounds(190,9,200,60);
        bkashHead.setFont(f3);
        bkashHead.setOpaque(true);
        bkashHead.setBackground(Color.black);
        bkashHead.setForeground(Color.white);
        bkashHead.setToolTipText("This is Bkash");
        bkashHead.setHorizontalAlignment(JLabel.CENTER);   
        
        
        // Nagad hEADING.....
        nHead = new JLabel("   Nagad   ");
        nHead.setBounds(190,9,200,60);
        nHead.setFont(f3);
        nHead.setOpaque(true);
        nHead.setBackground(Color.black);
        nHead.setForeground(Color.white);
        nHead.setToolTipText("This is Nagad.");
        nHead.setHorizontalAlignment(JLabel.CENTER);  
        
      
        
        
        //Here is Bakash Number .... 
        number = new JLabel(" Number: " );
 
        number.setBounds(10,100,150,50);
        number.setFont(f3);
        number.setOpaque(true);
        number.setBackground(Color.black);
        number.setForeground(Color.white);
        number.setToolTipText("This is Bkash");
        number.setHorizontalAlignment(JLabel.LEFT); 
        
 
        // Nagad Number ...
        nNumber = new JLabel(" Number: " );
 
        nNumber.setBounds(10,100,150,50);
        nNumber.setFont(f3);
        nNumber.setOpaque(true);
        nNumber.setBackground(Color.black);
        nNumber.setForeground(Color.white);
        nNumber.setToolTipText("This is Bkash");
        nNumber.setHorizontalAlignment(JLabel.LEFT); 
        
        
        
        // JText Field For Bkash Number.... 
        
        bkashNumber = new JTextField();
        bkashNumber.setBounds(190,100,299,50);
        bkashNumber.setFont(f3);
        bkashNumber.setOpaque(true);
        bkashNumber.setBackground(Color.DARK_GRAY);
        bkashNumber.setForeground(Color.white);
        bkashNumber.setHorizontalAlignment(JTextField.CENTER);
        bkashNumber.setToolTipText("Enter your Bkash Number");   
        
       
        
        // Text Field For nagad Number.... 
        NNumber = new JTextField();
        NNumber.setBounds(190,100,299,50);
        NNumber.setFont(f3);
        NNumber.setOpaque(true);
        NNumber.setBackground(Color.DARK_GRAY);
        NNumber.setForeground(Color.white);
        NNumber.setHorizontalAlignment(JTextField.CENTER);
        NNumber.setToolTipText("Enter your Nagad Number");   
        
        
        
        // JLabel for amout (For Bkash).... 
        
        amount  = new JLabel(" Amount: "); 
        amount.setBounds(10,160,150,50);
        amount.setFont(f3);
        amount.setOpaque(true);
        amount.setBackground(Color.black);
        amount.setForeground(Color.white);
        amount.setToolTipText("This is Bkash");
        amount.setHorizontalAlignment(JLabel.LEFT); 
        
        
        // Amount for nagad......  
        nAmount  = new JLabel(" Amount: "); 
        nAmount.setBounds(10,160,150,50);
        nAmount.setFont(f3);
        nAmount.setOpaque(true);
        nAmount.setBackground(Color.black);
        nAmount.setForeground(Color.white);
        nAmount.setToolTipText("This is Nagad Amount");
        nAmount.setHorizontalAlignment(JLabel.LEFT); 
      
        
        // JText Area for Bkash Amout;
        
        bkashAmount = new JTextField();
        
        bkashAmount.setBounds(190,160,299,50);
        bkashAmount.setFont(f3);
        bkashAmount.setOpaque(true);
        bkashAmount.setBackground(Color.DARK_GRAY);
        bkashAmount.setForeground(Color.white);
        bkashAmount.setHorizontalAlignment(JTextField.CENTER);
        bkashAmount.setToolTipText("Enter your Number Of amount "); 
        
        
        // Nagad Text area for amount..... 
        
        NAmount = new JTextField();
        
        NAmount.setBounds(190,160,299,50);
        NAmount.setFont(f3);
        NAmount.setOpaque(true);
        NAmount.setBackground(Color.DARK_GRAY);
        NAmount.setForeground(Color.white);
        NAmount.setHorizontalAlignment(JTextField.CENTER);
        NAmount.setToolTipText("Enter your Number Of amount "); 
        
        
        
        // JLabel Password (For Bkash).... 
        
        password  = new JLabel(" Password: "); 
        password.setBounds(10,220,180,50);
        password.setFont(f3);
        password.setOpaque(true);
        password.setBackground(Color.black);
        password.setForeground(Color.white);
        password.setToolTipText("This is Bkash");
        password.setHorizontalAlignment(JLabel.LEFT);  
        
        
        
        /// Nagad password label.... 
        
        nPass  = new JLabel(" Password: "); 
        nPass.setBounds(10,220,180,50);
        nPass.setFont(f3);
        nPass.setOpaque(true);
        nPass.setBackground(Color.black);
        nPass.setForeground(Color.white);
        nPass.setToolTipText("This is Nagad");
        nPass.setHorizontalAlignment(JLabel.LEFT);  
        
        
        
        // Bkash Password field.... 
        
        bkashPass = new JPasswordField();
        
        bkashPass.setBounds(210,220,299,50);
        bkashPass.setFont(f3);
        bkashPass.setOpaque(true);
        bkashPass.setBackground(Color.DARK_GRAY);
        bkashPass.setForeground(Color.white);
        bkashPass.setHorizontalAlignment(JTextField.CENTER);
        bkashPass.setToolTipText("Enter your Password Here.... ");  
        
        
        //Nagad password field.... 
        NPass = new JPasswordField();
        
        NPass.setBounds(210,220,299,50);
        NPass.setFont(f3);
        NPass.setOpaque(true);
        NPass.setBackground(Color.DARK_GRAY);
        NPass.setForeground(Color.white);
        NPass.setHorizontalAlignment(JTextField.CENTER);
        NPass.setToolTipText("Enter your Password Here.... "); 
        
        
        
        
        // Here is JButton....(For Proceed )>... 
        
        proceed = new JButton(" Proceed To Pay "); 
        
        proceed.setBounds(309,329,289,60);
        proceed.setFont(f3);
        proceed.setOpaque(true);
        proceed.setBackground(Color.red);
        proceed.setForeground(Color.white);
        proceed.setHorizontalAlignment(JTextField.CENTER);
        proceed.setToolTipText(" Procedd To Pay Your Amount.....  ");  
       
        
        // Nagad Proceed button.... 
        
        nProceed = new JButton(" Proceed To Pay "); 
        
        nProceed.setBounds(309,329,289,60);
        nProceed.setFont(f3);
        nProceed.setOpaque(true);
        nProceed.setBackground(Color.red);
        nProceed.setForeground(Color.white);
        nProceed.setHorizontalAlignment(JTextField.CENTER);
        nProceed.setToolTipText(" Procedd To Pay Your Amount.....  "); 
        
        
        
        // Here is creating JPanel.... 
        
        bkash = new JPanel(); 
        bkash.setLayout(null); 
        
        bkash.add(bkashHead);
        bkash.add(number); 
        bkash.add(bkashNumber);
        bkash.add(amount);
        bkash.add(bkashAmount);
        bkash.add(password);
        bkash.add(bkashPass);
        bkash.add(proceed);
        bkash.setBackground(Color.MAGENTA); 
        
        
        nagad = new JPanel();
        nagad.setLayout(null);
        
        nagad.add(nHead);
        nagad.add(nNumber);
        nagad.add(NNumber);
        nagad.add(nAmount);
        nagad.add(NAmount);
        nagad.add(nPass);
        nagad.add(NPass);
        nagad.add(nProceed);
        nagad.setBackground(Color.PINK); 
        
        rocket = new JPanel();
        rocket.setBackground(Color.GREEN);
        
        tabPane.addTab("BKash",bkash); 
        tabPane.addTab("Nagad",nagad);
        tabPane.addTab("Rocket",rocket);  
        
        
        
        
        
        
        

    }

    public static void main(String[] args) {

        BloodStock frame = new BloodStock();

        frame.setVisible(true);
        frame.setBounds(1200, 19, 700, 1100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("                                                    Blood Stock ");
        frame.setResizable(false);

    }

}
