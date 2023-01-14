import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;


/**
 * View class that represents User profile with his/her Listing objects
 * @author Bora Yilmaz
 * @version 02.05.2021
 */
public class UserProfilePage extends JPanel
{
	BufferedImage image;
	JLabel lblPicture;
	JLabel lblEmail;
	JLabel lblPhone;
    JLabel lblUsername;
    JLabel lblLocation;
	JComponent lblCurrentListings;
    JComponent btnRequest;
    JComponent listingsPanel;
	JScrollPane listingsScrollPane;
	BufferedImage profilePicture;
	javax.swing.JButton jButton1;
	
	User user;
	ArrayList<ListingPage> listingPages;
	
	/**
	 * Sets User's profile page by getting the User and a boolean value.
	 * @param user User to initiate the profile page
	 * @param isThisUser boolean to determine the editing version of the profile.
	 * If isThisUser is true, it opens an editable version in which users can edit each listing.
	 * Else,it opens the non-editable version.
	 */
	public UserProfilePage(User user, boolean isThisUser)
	{
		jButton1 = new javax.swing.JButton();
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Back Icon.png")));
		jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jButton1.setLocation(12, 13);
		jButton1.setSize(50, 42);
		this.add(jButton1);

		setLayout(null);
		setBackground(new java.awt.Color(255, 255, 255));
		
		this.user = user;
		try
        {
			profilePicture = ImageIO.read(new File("pictures/ProfilePicture.png"));
			lblPicture = new JLabel(new ImageIcon(profilePicture));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
		
		lblUsername = new JLabel(user.getUsername());
		lblLocation = new JLabel(user.getLocation().toString());
        lblEmail = new JLabel("E-mail: " + user.getMailAdress());
		lblPhone = new JLabel("Phone: " + user.getPhoneNumber());
		lblCurrentListings = new JLabel("Current Listings:");
		
		listingsPanel = new JPanel();
		listingsScrollPane = new JScrollPane(listingsPanel);
		listingPages = new ArrayList<>();
		addItemPages((JScrollPane) listingsScrollPane, (JPanel) listingsPanel, user, isThisUser);
		
		setComponents();
	}
	
	/**
	 * Sets each copmonents place, font, etc. and adds them to the profile page
	 */
	private void setComponents()
	{
		lblPicture.setBounds(100, 110, 155, 155);
		this.add(lblPicture);
		
		lblUsername.setFont(new Font("Dialog", Font.PLAIN, 24));
		lblUsername.setBounds(277, 110, 254, 30);
		this.add(lblUsername);
		
		lblLocation.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblLocation.setBounds(277, 150, 254, 24);
        this.add(lblLocation);
        
        lblEmail.setFont(new Font("Dialog", Font.PLAIN, 18));
        lblEmail.setBounds(277, 180, 400, 24);
        this.add(lblEmail);
        
        lblPhone.setFont(new Font("Dialog", Font.PLAIN, 18));
        lblPhone.setBounds(277, 210, 254, 24);
        this.add(lblPhone);
		
		lblCurrentListings.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblCurrentListings.setBounds(100, 275, 150, 24);
		this.add(lblCurrentListings);
		
        listingsScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        listingsScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        listingsScrollPane.setBounds(100, 300, 750, 320);
        this.add(listingsScrollPane);
	}
	
	/**
	 * Adds Listing pages to a JScrollPane according to the boolean value that the profile page takes
	 * @param scrollPane scroll pane to add panel
	 * @param panel panel to add each ListingPage
	 * @param user User to determine listings
	 * @param isThisUser boolean value to determine initiating the editable or non editable version
	 * of ListingPage objects
	 */
	private void addItemPages(JScrollPane scrollPane, JPanel panel, User user, boolean isThisUser)
	{
		try
		{
			int noOfListings = user.getListings().size();
			panel.setLayout(new GridLayout(1, noOfListings));
		
			// Add each listing 
			for (int i = 0; i < noOfListings; i++) {
				listingPages.add(new ListingPage(user.getListings().get(i), isThisUser));
	        	listingPages.get(i).setPreferredSize(new Dimension(750, 450));
	        	panel.add(listingPages.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Returns User of UserProfilePage
	 * @return User of UserProfilePage
	 */
	public User getUser()
	{
		return user;
	}
	
	/**
	 * Returns ArrayList of ListingPage of UserProfilePage
	 * @return ArrayList of ListingPage of UserProfilePage
	 */
	public ArrayList<ListingPage> getListingPages()
	{
		return listingPages;
	}
	
	/**
	 * Returns scroll pane of UserProfilePage
	 * @return scroll pane of UserProfilePage
	 */
	public JScrollPane getScrollPane()
	{
		return listingsScrollPane;
	}
}