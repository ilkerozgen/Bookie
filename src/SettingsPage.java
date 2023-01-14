import java.awt.*;
import javax.swing.*;

/**
 * A class that represents a page where user can adjust his/her settings.
 * @author Onurcan Ataç
 * @version 1.00, 30.04.2021
*/
public class SettingsPage extends javax.swing.JPanel {

    javax.swing.JButton jButton1;
    private java.awt.Button button1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private JComboBox<String> jComboBox1;

    User user;


    /**
     * Creates new form SettingsPage.
     * @param user user that is going to make adjustments.
     */
    public SettingsPage(User user) {
        
        this.user = user;
        initComponents(user);
    }

    /**
     * Method that initializes components of the page.
     * @param user user that is going to make adjustments.
     */
    private void initComponents(User user) {

        label1 = new java.awt.Label();
        button1 = new java.awt.Button();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();

        
        jComboBox1 = new JComboBox<String>();
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 15)); 
        jComboBox1.setModel(new DefaultComboBoxModel<>(user.getLocation().CITY_NAMES));
        jComboBox1.setSelectedIndex(user.getLocation().getCityNo());
        jComboBox1.setLocation(485, 340);
        jComboBox1.setSize(180, 30);
        this.add(jComboBox1);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1060, 690));

        label1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label1.setText("Settings");

        button1.setBackground(new java.awt.Color(153, 255, 153));
        button1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        button1.setLabel("Save Changes");

        label2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label2.setText("New Phone Number:");

        label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label3.setText("New Location:");

        label4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label4.setText("New Password:");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        this.add(label1);
        label1.setSize(143,51);
        label1.setLocation(454,112);

        this.add(button1);
        button1.setSize(161,38);
        button1.setLocation(848,604);

        this.add(label2);
        label2.setSize(186,28);
        label2.setLocation(289,247);

        this.add(label3);
        label3.setSize(130,28);
        label3.setLocation(345,342);

        this.add(label4);
        label4.setSize(141,28);
        label4.setLocation(334,437);

        this.add(jTextField2);
        jTextField2.setSize(251,29);
        jTextField2.setLocation(485,247);

        this.add(jTextField5);
        jTextField5.setSize(251,29);
        jTextField5.setLocation(485,437);

        jButton1 = new javax.swing.JButton();
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Back Icon.png")));
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setLocation(12, 13);
        jButton1.setSize(50, 42);
        this.add(jButton1);

        setLayout(null);
        setVisible(true);
    }

    /**
     * Getter method for "Save Changes" button.
     * @return button1
     */
    public Button getSaveChangesButton()
    {
        return button1;
    }

    /**
     * Getter method for phone number field.
     * @return jTextField2
     */
    public JTextField getPhoneNumberField()
    {
        return jTextField2;
    }

    /**
     * Getter method for password field.
     * @return jTextField5
     */
    public JTextField getNewPasswordField()
    {
        return jTextField5;
    }

    /**
     * Getter method for location combobox.
     * @return jComboBox1
     */
    public JComboBox<String> getLocationBox()
    {
        return jComboBox1;
    }
    
    /**
     * Getter method for user.
     * @return user
     */
    public User getUser()
    {
        return user;
    }


}