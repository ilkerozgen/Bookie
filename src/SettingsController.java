import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Controller class of the SettingsPage.
 * @author Onurcan Ataç
 * @version 1.00, 02.05.2021
 */
public class SettingsController {

    private SettingsPage settingsPage;

    /**
     * Constructor of the controller.
     * @param settingsPage page that the controller is assigned to.
     */
    public SettingsController(SettingsPage settingsPage)
    {
        this.settingsPage = settingsPage;
    }

    /**
     * Method that initializes the view of settingsPage.
     * @param frame frame that is going to be used to show the page.
     */
    public void initView(JFrame frame)
    {
        frame.getContentPane().removeAll();
        frame.getContentPane().invalidate();

        frame.getContentPane().add(settingsPage);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    /**
     * Initializes the controller and lets the interactions happen.
     * @param mainPageController controller of the main page in order to let user go back after saving changes.
     * @param frame frame that is going to be used to show the page.
     */
    public void initController(MainPageController mainPageController, JFrame frame)
    {
        settingsPage.getSaveChangesButton().addActionListener(e -> saveNewSettings(mainPageController, frame));
    }

    /**
     * Does the actions when the "Save Changes" button is pressed.
     * @param mainPageController controller of the main page in order to let user go back after saving changes.
     * @param frame frame that is going to be used to show the page.
     */
    private void saveNewSettings(MainPageController mainPageController, JFrame frame)
    {
        String newPhoneNumber = settingsPage.getPhoneNumberField().getText();
        String newPassword = settingsPage.getNewPasswordField().getText();
        
        if(!(newPhoneNumber.equals("")))
        {
            settingsPage.getUser().setPhoneNumber(newPhoneNumber);
        }
        if(!(newPassword.equals("")))
        {
            settingsPage.getUser().setPassword(newPassword);
        }
        
        Location newLocation = new Location(settingsPage.getLocationBox().getSelectedIndex());
        settingsPage.getUser().setLocation(newLocation);

        JOptionPane.showMessageDialog(new JFrame(), "Changes has been saved!", "Successful",JOptionPane.INFORMATION_MESSAGE);
        
        returnToMainPage(mainPageController, frame);
    }

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
        settingsPage.jButton1.addActionListener(e -> back( mainPageController, frame));
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
        frame.setTitle("Login Page");
    }
}
