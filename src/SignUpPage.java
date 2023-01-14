import javax.swing.JPanel;

/**
 * A class that represents the Sign Up Page.
 * @author İlker Özgen
 * @version v1.0, 03.05.2021
*/
public class SignUpPage extends JPanel
{
    // Properties
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton3;
    javax.swing.JComboBox<String> jComboBox1;
    javax.swing.JComboBox<String> jComboBox2;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JLabel jLabel8;
    javax.swing.JPasswordField jPasswordField1;
    javax.swing.JPasswordField jPasswordField2;
    javax.swing.JTextField jTextField1;
    javax.swing.JTextField jTextField3;
    javax.swing.JTextField jTextField4;
    Location location;
    String[] questions; 
    
    // Constructors
    /**
     * Creates new form LoginPage
     */
    public SignUpPage()
    {
        questions = new String[]{"What were the last four digits of your childhood telephone number?", 
                                 "What primary school did you attend?", 
                                 "What is your grandmother's (on your mother's side) maiden name?", 
                                 "In what town or city did your parents meet?", 
                                 "What was your first pet's name?"};
        
        location = new Location(34);
        
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); 
        jLabel1.setText("Sign Up Now!");
        jLabel1.setLocation(387, 60);
        jLabel1.setSize(290, 58);
        
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/E-Mail Icon.png")));
        jLabel2.setLocation(113, 174);
        jLabel2.setSize(30, 49);
        
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Phone Icon.png")));
        jLabel3.setLocation(113, 241);
        jLabel3.setSize(30, 49);
        
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Password Icon.png")));
        jLabel4.setLocation(113, 308);
        jLabel4.setSize(30, 49);
        
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Password Icon.png")));
        jLabel5.setLocation(113, 375);
        jLabel5.setSize(30, 49);
        
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jTextField1.setText("");
        jTextField1.setLocation(155, 174);
        jTextField1.setSize(254, 49);
        
        jTextField3 = new javax.swing.JTextField();
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jTextField3.setText("");
        jTextField3.setLocation(155, 241);
        jTextField3.setSize(254, 49);
        
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField1.setText("");
        jPasswordField1.setLocation(155, 308);
        jPasswordField1.setSize(254, 49);
        
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField2.setText("");
        jPasswordField2.setLocation(155, 377);
        jPasswordField2.setSize(254, 49);
        
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); 
        jLabel6.setText("Security Question");
        jLabel6.setLocation(485, 170);
        jLabel6.setSize(120, 19);
        
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 15)); 
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(questions));
        jComboBox1.setLocation(485, 196);
        jComboBox1.setSize(502, 49);
        
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 15)); 
        jLabel7.setText("Security Question Answer");
        jLabel7.setLocation(485, 264);
        jLabel7.setSize(175, 19);
        
        jTextField4 = new javax.swing.JTextField();
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 15)); 
        jTextField4.setLocation(485, 290);
        jTextField4.setSize(502, 49);
        
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); 
        jLabel8.setText("Location");
        jLabel8.setLocation(485, 351);
        jLabel8.setSize(60, 19);
        
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 15)); 
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(location.CITY_NAMES));
        jComboBox2.setSelectedIndex(34);
        jComboBox2.setLocation(485, 375);
        jComboBox2.setSize(138, 50);
        
        jButton3 = new javax.swing.JButton();
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jButton3.setText("Sign Up");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setLocation(462, 479);
        jButton3.setSize(144, 74);

        jButton1 = new javax.swing.JButton();
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Back Icon.png")));
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setLocation(12, 13);
        jButton1.setSize(50, 42);

        add(jButton1);
        add(jButton3);
        add(jComboBox1);
        add(jComboBox2);
        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
        add(jLabel4);
        add(jLabel5);
        add(jLabel6);
        add(jLabel7);
        add(jLabel8);
        add(jPasswordField1);
        add(jPasswordField2);
        add(jTextField1);
        add(jTextField3);
        add(jTextField4);
        
        setVisible(true);
        setLayout(null);
        setBackground(new java.awt.Color(255, 255, 255));
        
    }
    
}

