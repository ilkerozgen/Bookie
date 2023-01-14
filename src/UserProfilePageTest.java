import javax.swing.JFrame;

/**
 * Test class for UserProfilePage
 * @author Bora Yilmaz
 * @version 02.05.2021
 */
public class UserProfilePageTest 
{
    public static void main(String[] args)
	{	
		User user = new User("user01@ug.bilkent.edu.tr", "user01", 2, "user01", 6);
		JFrame frame = new JFrame();
		
		user.addNewListing("Math102 Book", 140, new Course("MATH", 102), "A math book");
		user.addNewListing("Physics102 Book", 160, new Course("PHYS", 102), "A physics book");
		user.addNewListing("Math102 Book", 140, new Course("Math", 102), "A math book");
		
		UserProfilePage profilePage = new UserProfilePage(user, true);
		UserProfilePageController userProfilePageController = new UserProfilePageController(profilePage);
		userProfilePageController.initControllers(true, frame);
		
		frame.setSize(1060, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setTitle("UserProfilePage");
		frame.add(profilePage);
	}
}
