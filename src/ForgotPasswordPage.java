import javax.swing.*;

/**
 * A class that represents a Forgot Password Page user-interface.
 * @author İlker Özgen
 * @version v1.0, 03.05.2021
*/
public class ForgotPasswordPage extends JPanel
{
    // Properties
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton3;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel4;
    javax.swing.JTextField jTextField2;
    
    // Constructors
    /**
     * Creates new form of Forgot Password Page.
     */
    public ForgotPasswordPage()
    {
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLocation(40, 208);
        jLabel1.setSize(1000, 44);
        
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15));
        jLabel4.setText("Security Question Answer");
        jLabel4.setLocation(289, 308);
        jLabel4.setSize(200, 19);
        
        jTextField2 = new javax.swing.JTextField();
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18));
        jTextField2.setLocation(289,334);
        jTextField2.setSize(502, 48);
        
        jButton3 = new javax.swing.JButton();
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jButton3.setText("Next");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setLocation(485, 411);
        jButton3.setSize(101, 55);

        jButton1 = new javax.swing.JButton();
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Back Icon.png")));
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setLocation(12, 13);
        jButton1.setSize(50, 42);

        add(jButton1);
        add(jButton3);
        add(jLabel1);
        add(jLabel4);
        add(jTextField2);
        
        setVisible(true);
        setLayout(null);
        setBackground(new java.awt.Color(255, 255, 255));
        
    }
     
}
