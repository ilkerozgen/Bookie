import javax.swing.JFrame;

/**
 * Controller class for ListingPage
 * @author Bora Yilmaz
 * @version 03.05.2021
 */
public class ListingPageController 
{
    private ListingPage listingPage;
    
    /**
     * Sets ListingPageController for the specified ListingPage
     * @param listingPage the specified ListingPage to set the controller
     */
    public ListingPageController(ListingPage listingPage)
    {
        this.listingPage = listingPage;
    }
    
    /**
     * Initializes UserProfilePage of the User to which Listing of ListingPageController
     * belongs
     * @param frame frame in which to initiate the view
     * @param isThisUser boolean value to determine initiating the editable or the non-editable
     * version of UserProfilePage
     */
    public void initView(JFrame frame, boolean isThisUser)
    {
        User user = listingPage.getListing().getSeller();
        UserProfilePage userProfilePage = new UserProfilePage(user, isThisUser);
        
        frame.getContentPane().removeAll();
        frame.getContentPane().invalidate();

        frame.getContentPane().add(userProfilePage);
        frame.getContentPane().revalidate();
        frame.getContentPane().repaint();
    }
    
    /**
     * Initializes the controllers of ListingPage by adding ActionListener objects 
     * to spesific ListingPage components after determining wheter ListingPage is
     * editable or not
     * @param isThisUser a boolean value to determine wheter ListingPage is editable or not
     * @param frame frame in which to initiate the view
     */
    public void initControllers(boolean isThisUser, JFrame frame)
    {
        User user = listingPage.getListing().getSeller();
        UserProfilePage userProfilePage = new UserProfilePage(user, isThisUser);
        
        // if ListingPage is editable, add ActionListener objects to "Save Liting"
        //    and "Delete Listing" buttons of ListingPage
        // else, ActionListener object to the seller button of the ListingPage
        if (isThisUser)
        {
            listingPage.getSaveListingButton().addActionListener(e -> editListing(frame));
            listingPage.getRemoveListingButton().addActionListener(e -> deleteListing(frame));
        }
        else
        {
            UserProfilePageController userProfilePageController = new UserProfilePageController(userProfilePage);
            listingPage.getSellerButton().addActionListener(e -> userProfilePageController.initView(frame));
        }
    }
    
    /**
     * Edits the Listing in terms of what has been updated by getting information
     * from each editable component in ListingPage
     * @param frame frame in which to initiate the view
     */
    public void editListing(JFrame frame) 
    {
        Listing listing = listingPage.getListing();
        
		listing.setTextbookName(listingPage.getTextbookName().getText());
        listing.setCourse(new Course(listingPage.getCourseNameComp().getText(), 
                Integer.parseInt(listingPage.getCourseCodeComp().getText())));
		listing.setPrice(Double.parseDouble(listingPage.getPriceComp().getText()));
		listing.setStatus(new Status(listingPage.getComboBoxStatus().getSelectedIndex()));
        listing.setExtraInformation(listingPage.getInfoAreaComp().getText());
        
        // if Status of Listing is set to "Sold", remove Listing
        if (listing.getStatus().toString().equals("Sold"))
        {
            deleteListing(frame);
        }
        
        initView(frame, true);
    }
    
    /**
     * Edits the Listing from User's Listing ArrayList
     * @param frame frame in which to initiate the view
     */
    public void deleteListing(JFrame frame)
    {
        Listing listing = listingPage.getListing();

        listing.getSeller().getListings().remove(listing);

        initView(frame, true);
    }
}
