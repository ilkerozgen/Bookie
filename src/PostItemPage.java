import java.awt.*;
import javax.swing.*;

/**
 * A class that represents a page where an item can be posted.
 * @author Onurcan Ataç
 * @version 1.00, 30.04.2021
*/
public class PostItemPage extends javax.swing.JPanel {

    private java.awt.Button button1;
    javax.swing.JButton jButton1;
    private java.awt.Button button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;

    private User user;

    /**
     * Creates a new post item page.
     * @param user to be able to add the item to the user's items
     */
    public PostItemPage(User user) {
        
        this.user = user;
        initComponents();
    }

    /**
     * Method that initialize and handle the shapes of components.
     */
    private void initComponents() {

        label1 = new java.awt.Label();
        button1 = new java.awt.Button();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        button3 = new java.awt.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1060, 690));

        label1.setFont(new java.awt.Font("Dialog", 1, 36));
        label1.setName(""); 
        label1.setText("Post Item");

        button1.setBackground(new java.awt.Color(51, 255, 51));
        button1.setFont(new java.awt.Font("Dialog", 1, 12)); 
        button1.setLabel("Post Item");

        label2.setFont(new java.awt.Font("Dialog", 1, 18)); 
        label2.setText("Course Code:");

        label3.setFont(new java.awt.Font("Dialog", 1, 18)); 
        label3.setText("Name of the Book:");

        label4.setFont(new java.awt.Font("Dialog", 1, 18)); 
        label4.setText("Set Price (TL):");

        label5.setFont(new java.awt.Font("Dialog", 1, 18)); 
        label5.setText("Extra Info:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); 

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); 

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14));

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setIcon(new javax.swing.ImageIcon("pictures/ItemPicture5.png"));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        //This button is planned to work in future versions.
        button3.setBackground(new java.awt.Color(51, 153, 255));
        button3.setFont(new java.awt.Font("Dialog", 1, 12)); 
        button3.setLabel("Upload Image");

        this.add(label1);
        label1.setSize(165,51);
        label1.setLocation(447,62);

        this.add(button1);
        button1.setSize(160,42);
        button1.setLocation(441,580);

        this.add(label2);
        label2.setSize(125,28);
        label2.setLocation(169,316);

        this.add(label3);
        label3.setSize(167,28);
        label3.setLocation(127,421);

        this.add(label4);
        label4.setSize(131,28);
        label4.setLocation(600,316);

        this.add(label5);
        label5.setSize(95,28);
        label5.setLocation(636,421);

        this.add(jTextField1);
        jTextField1.setSize(28,28);
        jTextField1.setLocation(304,316);

        this.add(jTextField2);
        jTextField2.setSize(50,28);
        jTextField2.setLocation(338,316);

        this.add(jTextField3);
        jTextField3.setSize(100,28);
        jTextField3.setLocation(746,316);

        this.add(jTextField4);
        jTextField4.setSize(150,28);
        jTextField4.setLocation(304,421);

        this.add(jTextArea1);
        jTextArea1.setSize(258,199);
        jTextArea1.setLocation(741,421);
        jTextArea1.setBorder(BorderFactory.createLineBorder(Color.black));

        this.add(jLabel1);
        jLabel1.setSize(110,140);
        jLabel1.setLocation(473,123);

        this.add(button3);
        button3.setSize(160,42);
        button3.setLocation(447,273);

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
     * Returns "Post Item" button.
     * @return button1 "Post Item" button.
     */
    public Button getPostItemButton()
    {
        return button1;
    }

    //Will be used to return "Upload Image" button when it's functional.
/*      public Button getUploadImageButton()
        {
            return button3;
        } */

    /**
     * Returns the first part of course code field.
     * @return jTextField1 first part of course code field.
     */
    public JTextField getCourseCodeField1()
    {
        return jTextField1;
    }
    
    /**
     * Returns the second part of course code field.
     * @return jTextField2 second part of course code field.
     */
    public JTextField getCourseCodeField2()
    {
        return jTextField2;
    }

    /**
     * Returns the price field.
     * @return jTextField3 the price field
     */
    public JTextField getPriceField()
    {
        return jTextField3;
    }

    /**
     * Returns name of the book field.
     * @return jTextField4 name of the book field.
     */
    public JTextField getNameOfTheBookField()
    {
        return jTextField4;
    }

    /**
     * Returns extra info area.
     * @return jTextArea1 extra info area.
     */
    public JTextArea getExtraInfoArea()
    {
        return jTextArea1;
    }

    /**
     * Returns the user which adds the item to his/her listings.
     * @return user the user which adds the item to his/her listings.
     */
    public User getUser()
    {
        return user;
    }

}