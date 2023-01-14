import javax.swing.JPanel;

/**
 * A class that represents the status of the textbook.
 * @author İlker Özgen
 * @version v1.0, 03.05.2021
*/
public class SetNewPasswordPage extends JPanel
{
    // Properties                  
    javax.swing.JButton jButton2;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel4;
    javax.swing.JLabel jLabel5;
    javax.swing.JPasswordField jPasswordField1;
    javax.swing.JPasswordField jPasswordField2;  
    
    // Constructors
    /**
     * Creates new form of Set New Password Page.
     */
    public SetNewPasswordPage()
    {
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); 
        jLabel1.setText("Set New Password");
        jLabel1.setLocation(383, 169);
        jLabel1.setSize(294, 44);
        
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Password Icon.png"))); 
        jLabel4.setLocation(383, 244);
        jLabel4.setSize(30, 30);
        
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setLocation(425, 244);
        jPasswordField1.setSize(252, 49);
        
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Password Icon.png"))); 
        jLabel5.setLocation(383, 311);
        jLabel5.setSize(30, 30);
        
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jPasswordField2.setText("jPasswordField1");
        jPasswordField2.setLocation(425, 311);
        jPasswordField2.setSize(252, 49);
        
        jButton2 = new javax.swing.JButton();
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jButton2.setText("Confirm");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setLocation(484, 378);
        jButton2.setSize(101, 55);
        
        add(jButton2);
        add(jLabel1);
        add(jLabel4);
        add(jLabel5);
        add(jPasswordField1);
        add(jPasswordField2);
        
        setVisible(true);
        setLayout(null);
        setBackground(new java.awt.Color(255, 255, 255));
        
    }
    
}
