import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Controller class of the PostItemPage.
 * @author Onurcan Ataç
 * @version 1.00, 02.05.2021
 */
public class PostItemController {

    private PostItemPage postItemPage;

    /**
     * Constructor of the controller.
     * @param postItemPage page that the controller is assigned to.
     */
    public PostItemController(PostItemPage postItemPage)
    {
        this.postItemPage = postItemPage;
    }

    /**
     * Method that initializes the view of postItemPage.
     * @param frame frame that is going to be used to show the page.
     */
    public void initView(JFrame frame)
    {
        frame.getContentPane().removeAll();
        frame.getContentPane().invalidate();
        frame.getContentPane().add(postItemPage);
        frame.getContentPane().revalidate();
        frame.repaint();
    }

    /**
     * Initializes the controller and lets the interactions happen.
     * @param mainPageController controller of the main page in order to let user go back after posting.
     * @param frame frame that is going to be used to show the page.
     */
    public void initController(MainPageController mainPageController, JFrame frame)
    {
        //postItemPage.getUploadImageButton()
        postItemPage.getPostItemButton().addActionListener(e -> postItem(mainPageController, frame));
    }

    /**
     * Does the actions when the "PostItem" button is pressed.
     * @param mainPageController controller of the main page in order to let user go back after posting.
     * @param frame frame that is going to be used to show the page.
     */
    public void postItem(MainPageController mainPageController, JFrame frame)
    {
        boolean posted = false;
        String textBookName = postItemPage.getNameOfTheBookField().getText();
        String courseName = postItemPage.getCourseCodeField1().getText();
        
        if(textBookName.equals("") || courseName.equals(""))
        {
            JOptionPane.showMessageDialog(new JFrame(), "You have to enter the name of the textbook and the course!", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else 
        {
            try 
            {
                double price = Double.parseDouble(postItemPage.getPriceField().getText());
                int courseNumber = Integer.parseInt(postItemPage.getCourseCodeField2().getText());
                Course courseOfItem = new Course(courseName, courseNumber);
                String extraInformation = postItemPage.getExtraInfoArea().getText();
                User user = postItemPage.getUser();
                
                user.addNewListing(textBookName, price, courseOfItem, extraInformation);
                
                JOptionPane.showMessageDialog(new JFrame(), "Listing has been posted!", "Successful",JOptionPane.INFORMATION_MESSAGE);
                posted = true;  
            } 
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(new JFrame(), "You have to enter numbers for the price or the course code!", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        if(posted)
        {
            returnToMainPage(mainPageController, frame);
        }

    }

    /**
     * Method that returns to main page.
     * @param mainPageController controller of the main page in order to let user go back after posting.
     * @param frame frame that is going to be used to show the page.
     */
    public void returnToMainPage(MainPageController mainPageController, JFrame frame)
    {
        mainPageController.initView(frame);
    }

    /**
     * Method that initializes the back button.
     * @param mainPageController controller of the main page in order to let user go back.
     * @param frame frame that is going to be used to show the page.
     */
    public void initBackButton(MainPageController mainPageController, JFrame frame)
    {
        postItemPage.jButton1.addActionListener(e -> back( mainPageController, frame));
    }

    /**
     * Method that performs the action of back button.
     * @param mainPageController controller of the main page in order to let user go back.
     * @param frame frame that is going to be used to show the page.
     */
    public void back(MainPageController mainPageController, JFrame frame)
    {
        frame.getContentPane().removeAll();
        mainPageController.initView(frame);
        frame.setTitle("Main Page");
    }
}
