import java.util.ArrayList;

import javax.swing.JFrame;

/**
 * A class to test MainPage
 * @author İlker Özgen
 * @version v1.0, 03.05.2021
*/
public class MainPageTest
{
    public static void main(String[] args)
    {
		ArrayList<User> userCollection = new ArrayList<>();
		MainPageController mainPageController;
		PostItemController postItemController;
		
		User user02 = new User("user02@ug.bilkent.edu.tr", "user02", 2, "user02", 6);
		user02.addNewListing("Math102 Book", 140, new Course("MATH", 102), "A math book");
		user02.addNewListing("Physics102 Book", 160, new Course("PHYS", 102), "A physics book");
		user02.addNewListing("Math102 Book", 140, new Course("Math", 102), "A math book");
		userCollection.add(user02);
		
		User user01 = new User("user01@ug.bilkent.edu.tr", "user01", 2, "user01", 6);
		user01.addNewListing("Math102 Book", 140, new Course("MATH", 102), "A math book");
		user01.addNewListing("Physics102 Book", 160, new Course("PHYS", 102), "A physics book");
		user01.addNewListing("Math102 Book", 140, new Course("Math", 102), "A math book");
		userCollection.add(user01);
		
		JFrame frame = new JFrame();
		MainPage mainPage = new MainPage(userCollection);
		PostItemPage postItemTest = new PostItemPage(user01);
		postItemController = new PostItemController(postItemTest);
		mainPageController = new MainPageController(mainPage);
		mainPageController.initController(postItemController, frame);
		
		frame.setSize(1060, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setTitle("Main Page");
		frame.setBackground(new java.awt.Color(255, 255, 255)); 
		frame.add(mainPage);
		
    }
    
}
