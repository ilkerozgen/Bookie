import java.io.IOException;
import javax.swing.JFrame;

/**
 * Test class for ListingPage
 * @author Bora Yilmaz
 */
public class ListingPageTest 
{
    public static void main(String[] args) throws IOException
	{
		User user = new User("user01@ug.bilkent.edu.tr", "user01", 2, "user01", 6);
		user.addNewListing("Math102 Book", 140, new Course("Math", 102), "A math book");
		user.addNewListing("CS102 Book", 140, new Course("CS", 102), "A CS book");
		user.addNewListing("Phys102 Book", 140, new Course("PHYS", 102), "A physics book");
		
		JFrame frame = new JFrame();
		ListingPage listingPage = new ListingPage(user.getListings().get(0), true);
		frame.setSize(1060, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setTitle("ItemFrame");
		frame.add(listingPage);
		
		ListingPageController listingController = new ListingPageController(listingPage);
		listingController.initControllers(true, frame);
		// listingPage.getSaveListingButton().addActionListener(e -> listingController.initView(frame, true));
		// listingPage.getRemoveListingButton().addActionListener(e -> listingController.initView(frame, true));
	}
}
