import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * A class that represents Main Page.
 * @author Bora Yılmaz
 * @author Onurcan Ataç
 * @author İlker Özgen
 * @version v1.0, 03.05.2021
 */
public class MainPage extends JPanel
{
    JPanel toolbar;
    JScrollPane listingsScrollPane;
    JPanel listingsPanel;
    JButton jButton1;
    ArrayList<ListingPage> listingPages;
    
    /**
     * Creates new form of Main Pageç
     * @param users the list of users
     */
    public MainPage(ArrayList<User> users) 
    {      
        toolbar = new Toolbar();
        this.add(toolbar);
        
        listingPages = new ArrayList<>();
        listingsScrollPane = new JScrollPane();
        listingsPanel = new JPanel();
        listingsScrollPane = new JScrollPane(listingsPanel);
        jButton1 = new JButton("Post Listing");//added
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("pictures/Camera Icon.png")));
        jButton1.setSize(150,34);
        jButton1.setLocation(860,150);
        this.add(jButton1);
        listingsScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        listingsScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        listingsScrollPane.setBounds(100, 100, 750, 500);
        addItemPages(listingsScrollPane, listingsPanel, users);
        this.add(listingsScrollPane);
        
        setVisible(true);
        setLayout(null);
        setBackground(new java.awt.Color(255, 255, 255));

    }
    
    /**
     * Adds item pages.
     * @param scrollPane the pane to be added to
     * @param panel the panel of the page
     * @param users the list of users
     */
    private void addItemPages(JScrollPane scrollPane, JPanel panel, ArrayList<User> users)
	{ 
        ListingPage listingPage;
		panel.setLayout(new GridLayout(users.size(), 2));
		
		try 
		{
            for (User u : users)
            {
                for (Listing listing : u.getListings()) 
                {
                    listingPage = new ListingPage(listing, false);
                    listingPages.add(listingPage);
                    listingPage.setPreferredSize(new Dimension(750, 450));
                    panel.add(listingPage);
                }
            }
        }
		catch (Exception e)
		{
			e.printStackTrace();
        }
	}

    /**
     * A getter method to get Listing Button.
     * @return listing button
     */
    public JButton getPostListingButton()
    {
        return jButton1;
    }
    
    /**
     * A getter method to get listing pages.
     * @return listing pages
     */
    public ArrayList<ListingPage> getListingPages()
    {
        return listingPages;
    }
    
}