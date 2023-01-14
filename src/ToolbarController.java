import javax.swing.*;

/**
 * A controller class for toolbar.
 * @author Onurcan Ataç
 * @version v1.0, 03.05.2021
 */
public class ToolbarController 
{
    // Properties
    private Toolbar toolbar;

    // Constructors
    /**
     * A constructor for a default toolbar controller.
     */
    public ToolbarController(Toolbar toolbar)
    {
        this.toolbar = toolbar;
    }

    /**
     * Initializes the controller.
     * @param loginPageController an instance of controller
     * @param mainPageController an instance of controller
     * @param settingsController an instance of controller
     * @param userPageController an instance of controller
     * @param frame the main frame
     */
    public void initController(LoginPageController loginPageController, MainPageController mainPageController, SettingsController settingsController, UserProfilePageController userProfilePageController, JFrame frame)
    {
        toolbar.jButton2.addActionListener(e -> goToMainPage(mainPageController, frame));
        toolbar.jButton5.addActionListener(e -> goToProfilePage(userProfilePageController, frame)); 
        toolbar.jButton6.addActionListener(e -> goToSettingsPage(settingsController, frame));
        toolbar.jButton3.addActionListener(e -> goToLoginPage(loginPageController, frame));   
    }

    /**
     * Directs the user Main Page.
     * @param mainPageController an instance of controller
     * @param frame the main frame
     */
    public void goToMainPage(MainPageController mainPageController, JFrame frame)
    {
        mainPageController.initView(frame);
        frame.setTitle("Main Page");
    }

    /**
     * Directs the user to Profile Page.
     * @param userProfilePageController an instance of controller
     * @param frame the main frame
     */
    public void goToProfilePage(UserProfilePageController userProfilePageController, JFrame frame)
    {
        userProfilePageController.initView(frame);
        frame.setTitle("Profile Page");
    }
    
    /**
     * Directs the user to Settings Page.
     * @param settingsController an instance of controller
     * @param frame the main frame
     */
    public void goToSettingsPage(SettingsController settingsController, JFrame frame)
    {
        settingsController.initView(frame);
        frame.setTitle("Settings Page");
    }

    /**
     * Directs the user to login page.
     * @param loginPageController an instance of controller
     * @param frame the main frame
     */
    public void goToLoginPage(LoginPageController loginPageController, JFrame frame)
    {
        loginPageController.initView(frame);
        frame.setTitle("Login Page");
    }
    
}
