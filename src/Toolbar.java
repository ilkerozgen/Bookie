import javax.swing.JPanel;

/**
 * A class that represents the toolabr of the app.
 * @author İlker Özgen
 * @author Onurcan Ataç
 * @author Bora Yılmaz
 * @version v1.0, 03.05.2021
 */
public class Toolbar extends JPanel
{
                             
    javax.swing.JButton jButton1;
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton3;
    javax.swing.JButton jButton5;
    javax.swing.JButton jButton6;
    javax.swing.JTextField jTextField1;
    javax.swing.JSeparator jSeparator1;
            
    /**
     * Creates new form of Toolbar.
     */
    public Toolbar() 
    {
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator1.setLocation(0, 60);
        jSeparator1.setSize(1060, 5);
        add(jSeparator1);
        
        jButton2 = new javax.swing.JButton();
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Home Icon.png"))); 
        jButton2.setBorder(null);
        jButton2.setLocation(129, 13);
        jButton2.setSize(50, 31);
        add(jButton2);
        
        jButton5 = new javax.swing.JButton();
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Profile Icon.png"))); 
        jButton5.setBorder(null);
        jButton5.setLocation(197, 13);
        jButton5.setSize(50, 31);
        add(jButton5);
        
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setText("Search...");
        jTextField1.setToolTipText("Search...");
        jTextField1.setLocation(265, 13);
        jTextField1.setSize(313, 31);
        add(jTextField1);
        
        jButton6 = new javax.swing.JButton();
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Settings Icon.png")));
        jButton6.setBorder(null);
        jButton6.setLocation(901, 13);
        jButton6.setSize(50, 31);
        add(jButton6);
        
        jButton3 = new javax.swing.JButton();
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 15));
        jButton3.setText("Log out");
        jButton3.setBorder(null);
        jButton3.setLocation(970, 13);
        jButton3.setSize(60, 31);
        add(jButton3);
        
        setVisible(true);
        setSize(1060, 90);
        setLayout(null);
        setBackground(new java.awt.Color(255, 255, 255));

    }

}
