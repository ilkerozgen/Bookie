import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * View class that represents a Listing object with its properties
 * @author Bora Yilmaz
 * @version 03.05.2021
 */
public class ListingPage extends JPanel 
{	
	JLabel lblCourse;
	JLabel lblInformation;
	JLabel lblStatus;
	JLabel lblSeller;
	JLabel lblPrice;
	JLabel lblPicture;
	JButton btnSaveListing;
	JButton btnRemoveListing;
	JButton btnSeller;
	JTextArea infoArea;
	JTextField txtfCourseName;
	JTextField txtfCourseCode;
	JComponent compTextbookName;
	JTextField txtfPrice;
	JComboBox<String> cboxStatus;
	
	Listing listing;
	String itemName;
	Course course;
	String courseName;
	int    courseCode;
	String itemInformation;
	String price;
	Status status;
	String seller;
	BufferedImage bookImage;
	
	/**
	 * Sets Lisitng by getting the Listing and a boolean value.
	 * @param listing listing to initiate the listing page
	 * @param isThisUser boolean to determine the editing version of the listing page.
	 * If isThisUser is true, it opens an editable version which the user can edit.
	 * Else,it opens the non-editable version.
	 */
	public ListingPage(Listing listing, boolean isThisUser) throws IOException
	{
		this.setLayout(null);
		this.listing   = listing;
		lblInformation = new JLabel("Information:");
		bookImage      = listing.getImage();
		infoArea       = new JTextArea(listing.getExtraInformation());
		infoArea.setLineWrap(true);
		infoArea.setEditable(isThisUser);
		
		// If isThisUser is false, initiate the non-editable version
		// Else, initiate the editable version of the listing page
		if (!isThisUser)
		{
			lblSeller = new JLabel("Seller: ");
			lblPrice  = new JLabel("Price: " + listing.getPrice());
			lblCourse = new JLabel("Course: " + listing.getCourse());
			compTextbookName = new JLabel(listing.getTextbookName());
			lblStatus = new JLabel("Status: " + listing.getStatus().toString());
			btnSeller = new JButton(listing.getSeller().getUsername());
		}
		else
		{
			lblStatus = new JLabel("Status: ");
			lblCourse = new JLabel("Course: ");
			lblPrice  = new JLabel("Price: ");
			compTextbookName = new JTextField(listing.getTextbookName());
			txtfPrice    = new JTextField(listing.getPrice() + "");
			cboxStatus   = new JComboBox<String>(listing.getStatus().getStatusCodes());
			cboxStatus.setSelectedIndex(listing.getStatus().getStatusNumber());
			btnSaveListing   = new JButton("Save Listing");
			btnRemoveListing = new JButton("Remove Listing");
			txtfCourseName = new JTextField(listing.getCourse().getCourseName());
			txtfCourseCode = new JTextField(listing.getCourse().getCourseCode() + "");
		}
		setComponents(isThisUser);
	}
	
	/**
	 * Sets the components according to ListingPage panel's isThisUser boolean parameter.
	 * Independent from isThisUser, it sets static components. If isThisUser has the value 
	 * true, it sets editable components and adds them to ListingPage, else it sets seller
	 * label.
	 * @param isThisUser boolean to determine setting dependent components of Listing page's
	 * editable or non-editable version.
	 */
	private void setComponents(boolean isThisUser)
	{
		compTextbookName.setBounds(250, 90, 480, 32);
		compTextbookName.setFont(new Font("Dialog", Font.PLAIN, 24));
		this.add(compTextbookName);
		
		lblCourse.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblCourse.setBounds(250, 150, 195, 24);
		this.add(lblCourse);
		
		lblPrice.setBounds(250, 185, 100, 24);
		lblPrice.setFont(new Font("Dialog", Font.PLAIN, 18));
		this.add(lblPrice);
		
		lblInformation.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblInformation.setBounds(60, 260, 145, 24);
		this.add(lblInformation);
		
		infoArea.setFont(new Font("Dialog", Font.PLAIN, 14));
		infoArea.setBounds(60, 295, 670, 125);
		this.add(infoArea);
		
		lblStatus.setBounds(550, 150, 140, 24);
		lblStatus.setFont(new Font("Dialog", Font.PLAIN, 18));
		this.add(lblStatus);
		
		lblPicture = new JLabel(new ImageIcon(bookImage));
		lblPicture.setBounds(60, 70, 170, 170);
		this.add(lblPicture);
		
		if (isThisUser)
		{
			txtfPrice.setBounds(306, 187, 86, 20);
			this.add(txtfPrice);
			
			cboxStatus.setBounds(620, 150, 110, 24);
			add(cboxStatus);
		
			btnSaveListing.setBounds(248, 220, 106, 24);
			add(btnSaveListing);
			
			btnRemoveListing.setBounds(608, 261, 122, 24);
			add(btnRemoveListing);
			
			txtfCourseName.setBounds(323, 155, 37, 20);
			add(txtfCourseName);
			
			txtfCourseCode.setBounds(370, 155, 37, 20);
			add(txtfCourseCode);
		}
		else
		{
			lblSeller.setBounds(550, 190, 180, 24);
			lblSeller.setFont(new Font("Dialog", Font.PLAIN, 18));
			this.add(lblSeller);
			
			btnSeller.setFont(new Font("Dialog", Font.PLAIN, 18));
			btnSeller.setBounds(605, 185, 140, 33);
			add(btnSeller);
		}
	}
	
	/**
	 * Returns Listing of ListingPage
	 * @return Listing of ListingPage
	 */
	public Listing getListing()
	{
		return listing;
	}
	
	/**
	 * Returns "Save Listing" JButton of ListingPage
	 * @return "Save Listing" JButton of ListingPage
	 */
	public JButton getSaveListingButton()
	{
		return btnSaveListing;
	}
	
	/**
	 * Returns "Remove Listing" JButton of ListingPage
	 * @return "Remove Listing" JButton of ListingPage
	 */
	public JButton getRemoveListingButton()
	{
		return btnRemoveListing;
	}
	
	/**
	 * Returns textbook name JTextField of ListingPage
	 * @return textbook name JTextField of ListingPage
	 */
	public JTextField getTextbookName()
	{
		return (JTextField) compTextbookName;
	}
	
	/**
	 * Returns Course name JTextField of ListingPage
	 * @return Course name JTextField of ListingPage
	 */
	public JTextField getCourseNameComp()
	{
		return txtfCourseName;
	}
	
	/**
	 * Returns Course code JTextField of ListingPage
	 * @return Course code JTextField of ListingPage
	 */
	public JTextField getCourseCodeComp()
	{
		return txtfCourseCode;
	}
	
	/**
	 * Returns price TextField of ListingPage
	 * @return price TextField of ListingPage
	 */
	public JTextField getPriceComp()
	{
		return txtfPrice;
	}
	
	/**
	 * Returns status JComboBox of ListingPage
	 * @return status JComboBox of ListingPage
	 */
	public JComboBox<String> getComboBoxStatus()
	{
		return cboxStatus;
	}
	
	/**
	 * Returns information TextArea of ListingPage
	 * @return information TextArea of ListingPage
	 */
	public JTextArea getInfoAreaComp()
	{
		return infoArea;
	}
	
	/**
	 * Returns seller label of ListingPage
	 * @return seller label of ListingPage
	 */
	public JLabel getLabelSeller()
	{
		return lblSeller;
	}
	
	/**
	 * Returns seller button of ListingPage
	 * @return seller button of ListingPage
	 */
	public JButton getSellerButton()
	{
		return btnSeller;
	}
}