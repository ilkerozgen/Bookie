import javax.swing.*;
import java.util.ArrayList;

/**
 * A demo class to demonstrate the features of "Bookie".
 * @author İlker Özgen
 * @author Bora Yılmaz
 * @author Onurcan Ataç
 * @version v1.0, 03.05.2021
 */
public class BookieDemo
{
    public static void main(String[] args)
    {
        // Page Instances Declaration
        LoginPage loginPage;
        SignUpPage signUpPage;
        ForgotPasswordPage forgotPasswordPage;
        SetNewPasswordPage setNewPasswordPage;
        MainPage mainPage;
        PostItemPage postItemPage;
        SettingsPage settingsPage;
        UserProfilePage userProfilePage;
        // Page Instances Declaration - end

        // Controller Instances Declaration
        LoginPageController loginPageController;
        SignUpPageController signUpPageController;
        ForgotPasswordPageController forgotPasswordPageController;
        SetNewPasswordPageController setNewPasswordPageController;
        MainPageController mainPageController;
        PostItemController postItemController;
        SettingsController settingsController;
        UserProfilePageController userProfilePageController;
        ToolbarController toolbarController;
        // Controller Instances Declaration - end

        // Variables Declaration
        ArrayList<User> users;
        User user1;
        User user2;
        User user3;
        // Variables Declaration - end

        // Frame Declaration
        JFrame mainFrame;
        // Frame Declaration - end

        // Program Code

        // Variables Initialization
        user1 = new User("user1@bilkent", "user1pass", 1, "user1answer", 34);
        user2 = new User("user2@bilkent", "user2pass", 2, "user2answer", 32);
        user3 = new User("user3@bilkent", "user3pass", 3, "user3answer", 6);

        user1.addNewListing("Math102 Book", 140, new Course("MATH", 102), "A math book");
        user2.addNewListing("Physics102 Book", 160, new Course("PHYS", 102), "A physics book");
        user3.addNewListing("Math102 Book", 140, new Course("Math", 102), "A math book");

        users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        // Variables Initialization - end

        // Frame Initialization
        mainFrame = new JFrame();
        mainFrame.setSize(1060, 690);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
        mainFrame.setTitle("Login Page");
        mainFrame.setBackground(new java.awt.Color(255, 255, 255));
        // Frame Initialization - end

        // Pages and Controllers Initialization
        loginPage = new LoginPage();
        signUpPage = new SignUpPage();
        forgotPasswordPage = new ForgotPasswordPage();
        setNewPasswordPage = new SetNewPasswordPage();
        mainPage = new MainPage(users);

        loginPageController = new LoginPageController(loginPage);

        settingsPage = new SettingsPage(loginPageController.getMainUser());
        userProfilePage = new UserProfilePage(loginPageController.getMainUser(), true);
        postItemPage = new PostItemPage(loginPageController.getMainUser());

        signUpPageController = new SignUpPageController(signUpPage);
        forgotPasswordPageController = new ForgotPasswordPageController(forgotPasswordPage);
        setNewPasswordPageController = new SetNewPasswordPageController(setNewPasswordPage);
        mainPageController = new MainPageController(mainPage);
        toolbarController = new ToolbarController((Toolbar) mainPage.toolbar);
        settingsController = new SettingsController(settingsPage);
        userProfilePageController = new UserProfilePageController(userProfilePage);
        postItemController = new PostItemController(postItemPage);

        loginPageController.initLoginButton(users, mainPageController, mainFrame);
        loginPageController.initNoAccountButton(signUpPageController, mainFrame);
        loginPageController.initForgotPasswordButton(users, forgotPasswordPageController, signUpPage, mainFrame);
        loginPageController.getMainUser().addNewListing("Java", 155, new Course("MATH", 102) , "güzell");

        mainPageController.initController(postItemController, mainFrame);

        postItemController.initController(mainPageController, mainFrame);
        postItemController.initBackButton(mainPageController, mainFrame);

        settingsController.initController(mainPageController, mainFrame);
        settingsController.initBackButton(mainPageController, mainFrame);

        userProfilePageController.initControllers(true, mainFrame);
        userProfilePageController.initBackButton(mainPageController, mainFrame);

        toolbarController.initController(loginPageController, mainPageController, settingsController, userProfilePageController, mainFrame);

        signUpPageController.initSignUpButton(users, loginPageController, mainFrame);
        signUpPageController.initBackButton(loginPageController, mainFrame);

        forgotPasswordPageController.initNextButton(loginPageController, signUpPage, setNewPasswordPageController, mainFrame);
        forgotPasswordPageController.initBackButton(loginPageController, mainFrame);

        setNewPasswordPageController.initConfirmButton(loginPageController, mainFrame);
        // Pages and Controllers Initialization - end

        // Start the program by initializing the view of login screen.
        loginPageController.initView(mainFrame);

    }
}
