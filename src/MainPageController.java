import java.util.ArrayList;
import javax.swing.JFrame;

/**
 * A controller class for Main Page.
 * @author Onurcan Ataç
 * @author Bora Yılmaz
 * @version v1.0, 03.05.2021
 */
public class MainPageController
 {
    // Properties
    private MainPage mainPage;

    // Constructors
    /**
     * Default contructor for main page controller.
     * @param mainPage the main page of the app
     */
    public MainPageController(MainPage mainPage)
    {
        this.mainPage = mainPage;
    }

    // Methods
    /**
     * Initializes the view of the panel.
     * @param frame the main frame
     */
    public void initView(JFrame frame)
    {
        frame.getContentPane().removeAll();
        frame.getContentPane().invalidate();
        frame.getContentPane().add(mainPage);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    /**
     * Initializes the controller.
     * @param postItemController an instance of controller
     * @param frame the main frame
     */
    public void initController(PostItemController postItemController, JFrame frame)
    {
        ArrayList<ListingPageController> listingPageControllers = new ArrayList<>();
        ArrayList<ListingPage> listingPages = mainPage.getListingPages();
        
        for (int i = 0; i < listingPages.size(); i++)
        {
            ListingPage l = listingPages.get(i);
            listingPageControllers.add(new ListingPageController(l));
            listingPageControllers.get(i).initControllers(false, frame);
        }
        
        mainPage.getPostListingButton().addActionListener(e -> goToPostItemPage(postItemController, frame));
    }

    /**
     * Directs the user to post item page.
     * @param postItemController an instance of controller
     * @param frame the main frame
     */
    public void goToPostItemPage(PostItemController postItemController, JFrame frame)
    {
        postItemController.initView(frame);
        frame.setTitle("Post Item Page");
    }
    
}
