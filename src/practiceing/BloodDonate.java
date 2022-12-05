 
package practiceing; 


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

 
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BloodDonate extends JFrame{   
    
    
    private Container c;
    private ImageIcon icon;
    private JLabel bloodStock, name, age, gender, bloodGroup, phone , payment , bkashHead, number,amount,password , nHead , nNumber,nAmount,nPass;
   
    private JTextField forName, forAge, forGender,forPhone, bkashNumber ,bkashAmount , NNumber,NAmount;
    private JPasswordField bkashPass ,NPass;
    private JCheckBox male,female,others;
    private JButton submit;
    private ButtonGroup btnGroup;
    private JComboBox forBloodGroup; 
    private String[] allBloodGroup = {"A+","B+","A-","B-","O+","O-","AB+","AB-"};  
    
    
    private JTabbedPane tabPane;
    private JPanel bkash,nagad,rocket;
    private Font f1, f2, f3;   
    
    
    
    BloodDonate(){
        
        
      
        
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
        bloodStock = new JLabel(" Blood Donate ");
        bloodStock.setBounds(149, 25, 410, 60);
        bloodStock.setFont(f1);
        bloodStock.setOpaque(true);
        bloodStock.setBackground(Color.black);
        bloodStock.setForeground(Color.white);
        bloodStock.setHorizontalAlignment(JLabel.CENTER);
        bloodStock.setToolTipText("This is Blood Donate Section");
        c.add(bloodStock);

        // JLabel For (Name).....  
        name = new JLabel(" 1.Name: ");
        name.setBounds(10, 149, 159, 40);
        name.setFont(f3);
        name.setOpaque(true);
        name.setBackground(Color.cyan);
        name.setForeground(Color.black);
        name.setHorizontalAlignment(JLabel.LEFT);
        name.setToolTipText("Name Requireing.... ");
        c.add(name);

        // JTextField For Input Name..... 
        forName = new JTextField();
        forName.setBounds(220, 149, 330, 40);
        forName.setFont(f2);
        forName.setOpaque(true);
        forName.setBackground(Color.LIGHT_GRAY);
        forName.setForeground(Color.black);
        forName.setToolTipText("Enter Your Full Name");
        forName.setHorizontalAlignment(JTextField.CENTER);
        c.add(forName);

        // JLabel For (Age).....  
        age = new JLabel(" 2.Age: ");
        age.setBounds(10, 219, 159, 40);
        age.setFont(f3);
        age.setOpaque(true);
        age.setBackground(Color.cyan);
        age.setForeground(Color.black);
        age.setHorizontalAlignment(JLabel.LEFT);
        age.setToolTipText("Age Requireing.... ");
        c.add(age);

        // JTextField For Age.... 
        forAge = new JTextField();
        forAge.setBounds(220, 219, 330, 40);
        forAge.setFont(f2);
        forAge.setOpaque(true);
        forAge.setBackground(Color.lightGray);
        forAge.setForeground(Color.black);
        forAge.setToolTipText("Enter Your Age");
        forAge.setHorizontalAlignment(JTextField.CENTER);
        c.add(forAge);      
        
        
        
        
        
        // JLabel For (Genger).....  
        gender = new JLabel(" 3.Gender: ");
        gender.setBounds(10, 290, 159, 40);
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
        
        male.setBounds(220, 290, 120, 40);
        male.setFont(f3);
        male.setOpaque(true);
        male.setBackground(Color.lightGray);
        male.setForeground(Color.black);
        male.setHorizontalAlignment(JLabel.LEFT);
        male.setToolTipText(" R u Male.....?");
        c.add(male);   
        
        
        // Female......... 
        
        female = new JCheckBox("Female");
        female.setBounds(350,290,160,40); 
        female.setFont(f3); 
        female.setOpaque(true);
        female.setBackground(Color.lightGray);
        female.setForeground(Color.black);
        female.setHorizontalAlignment(JLabel.LEFT);
        female.setToolTipText(" R u FeMale.....?");
        
        c.add(female);
        
 
        
        
        // JCheckBox For Others.../...... 
        
        others = new JCheckBox("Others");
        
        others.setBounds(520, 289, 159, 40);
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
        bloodGroup.setBounds(10, 360, 249, 40);
        bloodGroup.setFont(f3);
        bloodGroup.setOpaque(true);
        bloodGroup.setBackground(Color.cyan);
        bloodGroup.setForeground(Color.black);
        bloodGroup.setHorizontalAlignment(JLabel.LEFT);
        bloodGroup.setToolTipText(" Select Your Blood Group...Please !!!!  ");
        c.add(bloodGroup);
        
        // Here is adding JComboBox......For Blood Group..... 
        
        forBloodGroup = new JComboBox(allBloodGroup);  
       
        forBloodGroup.setBounds(310, 360, 149, 40);
        forBloodGroup.setFont(f3);
        forBloodGroup.setOpaque(true);
        forBloodGroup.setBackground(Color.lightGray);
        forBloodGroup.setForeground(Color.black);
    
        forBloodGroup.setToolTipText(" Select Your Blood Group...Please !!!!  ");
        c.add(forBloodGroup);   
        
        
        // Here is adding JLabel (Phone Number)...
        
        phone = new JLabel(" 5.Phone/mail: "); 
        phone.setBounds(10, 430, 210, 40);
        phone.setFont(f3);
        phone.setOpaque(true);
        phone.setBackground(Color.cyan);
        phone.setForeground(Color.black);
        phone.setToolTipText(" Phone Number Here......  ");
        c.add(phone);   
        
        // Here is JTextField For Phone/ Mail ..........................
        
        forPhone = new JTextField();
        forPhone.setBounds(260, 430, 349, 40);
        forPhone.setFont(f3);
        forPhone.setOpaque(true);
        forPhone.setBackground(Color.lightGray);
        forPhone.setForeground(Color.black);
        forPhone.setHorizontalAlignment(JTextField.CENTER);
        forPhone.setToolTipText(" Enter your Phone/Mail Here......  ");
        c.add(forPhone); 
        
        
        submit = new JButton("Submit Your Information");
        submit.setBounds(250,540,380,60);
        submit.setFont(f3);
        submit.setOpaque(true);
        submit.setBackground(Color.red);
        submit.setForeground(Color.white);
        submit.setHorizontalAlignment(JButton.CENTER);
        submit.setToolTipText("Tap to submit Your Information...");
        c.add(submit);
        
        
        
        // Actionlistener with submit Button..... 
        
        
        submit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                 
                
                
                String name = forName.getText();  
                
                if(!"".equals(name)){
                    
                     forName.setText("");
                forAge.setText(""); 
                forPhone.setText("");
                
                JOptionPane.showMessageDialog(null,"Your Information is Submitted, Well will Contact you Soon...");
                
           
                } 
                
                else{  
                    
                    
                      JOptionPane.showMessageDialog(null,"Please !!!! Feel All Information....... ");
                    
                }
                
             
                
                
                
            }
         
        });  
        
        
        
        
        
        
        
    }
    
    
    
    public static void main(String[] args){
        
        
        BloodDonate frame = new BloodDonate();
        
        frame.setVisible(true);
        frame.setBounds(1200, 19, 700, 1100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("                                                    Blood Donate ");
        frame.setResizable(false);
        
        
        
        
    }
    
}
