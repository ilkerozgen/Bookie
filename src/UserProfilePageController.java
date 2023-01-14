import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * Controller class for UserProfilePage
 * @author Bora Yilmaz
 * @version 03.05.2021
 */
public class UserProfilePageController 
{
    UserProfilePage userProfilePage;
    ArrayList<ListingPage> listingPages;
    
    /**
     * Sets a controller according to userProfilePage
     * @param userProfilePage UserProfilePage to initiate the controller
     */
    public UserProfilePageController(UserProfilePage userProfilePage)
    {
        this.userProfilePage = userProfilePage;
        this.listingPages = userProfilePage.getListingPages();
    }
    
    /**
     * Updates the pre-existing UserProfilePageController to get the updates in userProfilePage
     * @param controller pre-existing UserProfilePageController
     * @param userProfilePage UserProfilePage to initiate the new controller
     */
    private void updateController(UserProfilePageController controller, UserProfilePage userProfilePage)
    {
        controller = new UserProfilePageController(userProfilePage);
    }
    
    /**
     * Initializes the view of UserProfilePage
     * @param JFrame frame in which to initiate the view
     */
    public void initView(JFrame frame)
    {
        frame.getContentPane().removeAll();
        frame.getContentPane().invalidate();

        frame.getContentPane().add(userProfilePage);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    /**
     * Initializes the controllers of UserProfilePage by adding ActionListener
     * objects to each ListingPage in UserProfilePage
     * @param isThisUser boolean value to determine initiating ActionListeners.
     * If isThisUser is true, it initializes ActionListeners for each Listing.
     * @param frame frame in which to initiate the view
     */
    public void initControllers(boolean isThisUser, JFrame frame)
    {
        ArrayList<ListingPageController> listingPageControllers = new ArrayList<>();
        if (isThisUser)
        {
            for (int i = 0; i < listingPages.size(); i++)
            {
                ListingPage l = listingPages.get(i);
                listingPageControllers.add(new ListingPageController(l));
                listingPageControllers.get(i).initControllers(true, frame);
                l.getSaveListingButton().addActionListener(e -> updateItemPages(userProfilePage.getUser(), frame));
                l.getRemoveListingButton().addActionListener(e -> updateItemPages(userProfilePage.getUser(), frame));
            }
        }
    }
    
    /**
     * Updates UserProfilePage to manipulate the updated ListingPages
     * @param User user to update UserProfilePage
     * @param frame frame in which to update the view
     */
    public void updateItemPages(User user, JFrame frame)
	{
        ArrayList<Listing> newListings = userProfilePage.getUser().getListings();
        ArrayList<ListingPage> newListingPages = new ArrayList<>();
        ArrayList<ListingPageController> listingPageControllers = new ArrayList<>();
        
        // Create a new ListingPage arrayList to get the updates
        for (int i = 0; i < newListings.size(); i++)
        {
            try {
                newListingPages.add(new ListingPage(newListings.get(i), true));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        // Set each listingPageController according to the updated listingPages
		for (int i = 0; i < newListings.size(); i++)
		{
            listingPageControllers.add(new ListingPageController(newListingPages.get(i)));
            listingPageControllers.get(i).initControllers(true, frame);
        }
        
        // Update UserProfilePage view
        updateController(this, new UserProfilePage(user, true));
        initView(frame);
        initControllers(true, frame);
	}

    /**
     * Initializes the controller for the back button 
     * @param mainPageController MainPageController to set ActionListener
     * @param frame frame in which to initiate the view
     */
    public void initBackButton(MainPageController mainPageController, JFrame frame)
    {
        userProfilePage.jButton1.addActionListener(e -> back( mainPageController, frame));
    }
    
    /**
     * Initializes MainPage in the specified JFrame
     * @param mainPageController MainPageController to turn back to MainPage
     * @param frame frame in which to initiate the view
     */
    public void back(MainPageController mainPageController, JFrame frame)
    {
        frame.getContentPane().removeAll();
        mainPageController.initView(frame);
        frame.setTitle("Main Page");
    }
}
