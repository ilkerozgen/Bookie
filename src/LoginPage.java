import javax.swing.JPanel;

/**
 * A class that represents a Login Page.
 * @author İlker Özgen
 * @version v1.0, 03.05.2021
*/
public class LoginPage extends JPanel 
{
    // Properties                 
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JPasswordField jPasswordField1;
    javax.swing.JTextField jTextField1;
    
    // Constructors
    /**
     * Creates new form of LoginPage.
     */
    public LoginPage() 
    {
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Bookie!");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Password Icon.png"))); 
        
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Profile Icon.png")));
        
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jTextField1.setText("");
        
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField1.setText("");
        
        jButton1 = new javax.swing.JButton();
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jButton1.setText("Login");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        
        jButton2 = new javax.swing.JButton();
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 15));
        jButton2.setText("Don't have an account?");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        
        jButton3 = new javax.swing.JButton();
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 15));
        jButton3.setText("Forgot your password?");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        
        add(jButton1);
        add(jButton2);
        add(jButton3);
        add(jLabel1);
        add(jLabel2);
        add(jLabel3);
        add(jPasswordField1);
        add(jTextField1);
        
        jButton1.setLocation(462, 427);
        jButton1.setSize(110, 51);
        
        jButton1.setLocation(462, 427);
        jButton1.setSize(110, 51);
 
        jButton2.setLocation(51, 496);
        jButton2.setSize(200, 25);
        
        jButton3.setLocation(782, 496);
        jButton3.setSize(200, 25);
        
        jLabel1.setLocation(309, 154);
        jLabel1.setSize(420, 58);
        
        jLabel2.setLocation(348, 314);
        jLabel2.setSize(30, 56);
        
        jLabel3.setLocation(348, 245);
        jLabel3.setSize(30, 56);
        
        jPasswordField1.setLocation(390, 314);
        jPasswordField1.setSize(294, 56);
        
        jTextField1.setLocation(390, 245);
        jTextField1.setSize(294, 56);
        
        setVisible(true);
        setLayout(null);
        setBackground(java.awt.Color.white);
        
    }
        
}