import java.util.ArrayList;
import javax.swing.*;

/**
 * A controller class for Sign Up Page.
 * @author İlker Özgen
 * @version v1.0, 03.05.2021
 */
public class SignUpPageController
{
    // Properties
    private SignUpPage signUpPage;
    
    // Constructors
    /**
     * Initializes the controller.
     * @param signUpPage the specified page to be controlled
     */
    public SignUpPageController(SignUpPage signUpPage)
    {
        this.signUpPage = signUpPage;
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
        frame.getContentPane().add(signUpPage);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    /**
     * Initializes the specified button.
     * @param users the arraylist of users
     * @param loginPageController an instance of Login Page Controller
     * @param frame the main frame
     */
    public void initSignUpButton(ArrayList<User> users, LoginPageController loginPageController, JFrame frame)
    {
        signUpPage.jButton3.addActionListener(e -> signUp(users, loginPageController, frame));
    }
    
    /**
     * Signs up the user to the app. Creates a new user instance.
     * @param users the arraylist of users
     * @param loginPageController an instance of Login Page Controller
     * @param frame the main frame
     */
    public void signUp(ArrayList<User> users, LoginPageController loginPageController, JFrame frame)
    {
        User user;
        String email;
        String password;
        String passwordAgain;
        int securityQuestionNo;
        String securityQuestionAnswer;
        int cityNo;

        email = signUpPage.jTextField1.getText();
        password = String.valueOf(signUpPage.jPasswordField1.getPassword());
        passwordAgain = String.valueOf(signUpPage.jPasswordField2.getPassword());
        securityQuestionNo = signUpPage.jComboBox1.getSelectedIndex();
        securityQuestionAnswer = signUpPage.jTextField4.getText();
        cityNo = signUpPage.jComboBox2.getSelectedIndex();

        // Check if two passwords match.
        // If they match, sign up the user. Give warning otherwise.
        if ( !password.equals(passwordAgain) )
        {
            JOptionPane.showMessageDialog(new JFrame(), "Passwords do not match, please try again.", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            user = new User(email, password, securityQuestionNo, securityQuestionAnswer, cityNo);
            users.add(user);
            JOptionPane.showMessageDialog(null, "Sign up successful.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    /**
     * Initializes the specified button.
     * @param loginPageController an instance of Login Page Controller.
     * @param frame the main frame
     */
    public void initBackButton(LoginPageController loginPageController, JFrame frame)
    {
        signUpPage.jButton1.addActionListener(e -> back( loginPageController, frame));
    }

    /**
     * Directs the user to previous page.
     * @param loginPageController an instance of Login Page Controller.
     * @param frame the main frame
     */
    public void back(LoginPageController loginPageController, JFrame frame)
    {
        frame.getContentPane().removeAll();
        loginPageController.initView(frame);
        frame.setTitle("Login Page");
    }

}

