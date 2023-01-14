import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * A controller class for Forgot Password Page.
 * @author İlker Özgen
 * @version v1.0, 03.05.2021
 */
public class ForgotPasswordPageController 
{
    // Properties
    ForgotPasswordPage forgotPasswordPage;
    
    // Constructors
    /**
     * Initializes the controller instance.
     * @param forgotPasswordPage the specified page to control
     */
    public ForgotPasswordPageController(ForgotPasswordPage forgotPasswordPage)
    {
        this.forgotPasswordPage = forgotPasswordPage;
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
        frame.getContentPane().add(forgotPasswordPage);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    /**
     * Initializes the specified button.
     * @param loginPageController an instance of Login Page Controller
     * @param signUpPage an instance of Sign Up Page
     * @param setNewPasswordPageController an instance of Set New Password Page Controller
     * @param frame the main frame
     */
    public void initNextButton(LoginPageController loginPageController, SignUpPage signUpPage, SetNewPasswordPageController setNewPasswordPageController, JFrame frame)
    {
        forgotPasswordPage.jButton3.addActionListener(e -> next(loginPageController, signUpPage, setNewPasswordPageController, frame));
    }
    
    /**
     * The method for next button.
     * @param loginPageController an instance of Login Page Controller
     * @param signUpPage an instance of Sign Up Page
     * @param setNewPasswordPageController the set new password page controller instance
     * @param frame the main frame
     */
    public void next(LoginPageController loginPageController, SignUpPage signUpPage, SetNewPasswordPageController setNewPasswordPageController, JFrame frame)
    {
        int securityQuestionNo;
        String securityQuestion;
        String answer;
        
        securityQuestionNo = loginPageController.mainUser.getSecurityQuestionNo();
        securityQuestion = signUpPage.questions[securityQuestionNo];
        
        forgotPasswordPage.jLabel1.setText(securityQuestion);
        
        answer = forgotPasswordPage.jTextField2.getText();
        
        if (answer.equals(loginPageController.mainUser.getSecurityQuestionAnswer()))
        {
            setNewPasswordPageController.initView(frame);
            frame.setTitle("Set New Password Page");
        }
        else
        {
            JOptionPane.showMessageDialog(new JFrame(), "Incorrect answer, please try again.", "Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }

    /**
     *  Initializes the specified button.
     * @param loginPageController an instance of Login Page Controller
     * @param frame the main frame
     */
    public void initBackButton(LoginPageController loginPageController, JFrame frame)
    {
        forgotPasswordPage.jButton1.addActionListener(e -> back( loginPageController, frame));
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
