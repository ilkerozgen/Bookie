import java.util.ArrayList;
import javax.swing.*;

/**
 * A controller class for Login Page.
 * @author İlker Özgen
 * @version v1.0, 03.05.2021
 */
public class LoginPageController 
{
    // Properties
    private LoginPage loginPage;
    public User mainUser;
    
    // Constructors
    /**
     * Initializes the controller.
     * @param loginPage the page to be controlled
     */
    public LoginPageController(LoginPage loginPage)
    {
        this.loginPage = loginPage;
        this.mainUser = new User("default@bilkent", "defaultpass", 0, "defaultanswer", 0);
    }
    
    // Methods
    /**
     * Initializes the frame.
     * @param frame the frame to be initialized
     */
    public void initView(JFrame frame)
    {
        frame.getContentPane().removeAll();
        frame.getContentPane().invalidate();
        frame.getContentPane().add(loginPage);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    /**
     * Initializes the specified button.
     * @param users the arraylist of users
     * @param  mainPageController an instance if Main Page Controller
     * @param frame the main frame
     */
    public void initLoginButton(ArrayList<User> users, MainPageController mainPageController, JFrame frame)
    {
        loginPage.jButton1.addActionListener(e -> login(users, mainPageController, frame));
    }
    
    /**
     * Logs the user in.
     * @param users the arraylist of users
     * @param  mainPageController an instance if Main Page Controller
     * @param frame the main frame
     */
    public void login(ArrayList<User> users, MainPageController mainPageController, JFrame frame)
    {
        String username;
        String password;
        boolean isLogged;
        
        isLogged = false;
        username = loginPage.jTextField1.getText();
        password = String.valueOf(loginPage.jPasswordField1.getPassword());

        // Check if the username and password match. If they do, log the user in. Give warning otherwise.
        for (User user : users) 
        {
            if (username.equals(user.getUsername()))
            {
                if ( password.equals(user.getPassword()))
                {
                    mainUser = user;
                    isLogged = true;

                    mainPageController.initView(frame);
                    frame.setTitle("Main Page");

                    break;
                }
            }
        }
        
        if ( !isLogged )
        {
            JOptionPane.showMessageDialog(new JFrame(), "Incorrect username or password, please try again.", "Error",JOptionPane.ERROR_MESSAGE);
        }

    }
    
    /**
     * Initializes the specified button.
     * @param signUpPageController an instance of Sign Up Page Controller
     * @param frame the main frame
     */
    public void initNoAccountButton(SignUpPageController signUpPageController, JFrame frame)
    {
        loginPage.jButton2.addActionListener(e -> directToSignUp(signUpPageController, frame));
    }
    
    /**
     * Directs the user to Sign Up Page.
     * @param signUpPageController an instance of Sign Up Page Controller
     * @param frame the main frame
     */
    public void directToSignUp(SignUpPageController signUpPageController, JFrame frame)
    {
        signUpPageController.initView(frame);
        frame.setTitle("Sign Up Page");
    }
    
    /**
     * Initializes the specified button.
     * @param users the arraylist of users
     * @param forgotPasswordPageController an instance of Forgot Password Page Controller
     * @param signUpPage the Sign Up Page of the app
     * @param frame the main frame
     */
    public void initForgotPasswordButton(ArrayList<User> users, ForgotPasswordPageController forgotPasswordPageController, SignUpPage signUpPage, JFrame frame)
    {
        loginPage.jButton3.addActionListener(e -> directToForgotPassword(users, forgotPasswordPageController, signUpPage, frame));
    }
    
    /**
     * Directs the user to Forgot Password Page
     * @param users the arraylist of users
     * @param forgotPasswordPageController the controller instance
     * @param signUpPage the Sign Up Page of the app
     * @param frame the main frame
     */
    public void directToForgotPassword(ArrayList<User> users, ForgotPasswordPageController forgotPasswordPageController, SignUpPage signUpPage, JFrame frame)
    {
        String username;
        boolean usernameFound;
        
        usernameFound = false;
        username = loginPage.jTextField1.getText();

        // Check if the username exists, and if it does, ask the security question. If it does not, give warning.
        for (User user : users) 
        {
            if (username.equals(user.username))
            {
                usernameFound = true;
                mainUser = user;
                forgotPasswordPageController.forgotPasswordPage.jLabel1.setText(signUpPage.questions[mainUser.getSecurityQuestionNo()]);
                forgotPasswordPageController.initView(frame);
                frame.setTitle("Forgot Password Page");
                
                break;
            }
        }
        
        if ( !usernameFound ) 
        {
            JOptionPane.showMessageDialog(new JFrame(), "Username cannot be found, please try again.", "Error",JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     * A getter method to get main user.
     * @return the main user
     */
    public User getMainUser()
    {
        return mainUser;
    }
}
