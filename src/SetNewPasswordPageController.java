import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * A controller class for Set New Password Page.
 * @author İlker Özgen
 * @version v1.0, 03.05.2021
 */
public class SetNewPasswordPageController
{
    // Properties
    private SetNewPasswordPage setNewPasswordPage;
    
    // Constructors
    /**
     * Initializes the controller.
     * @param setNewPasswordPage the page to be controlled
     */
    public SetNewPasswordPageController(SetNewPasswordPage setNewPasswordPage)
    {
        this.setNewPasswordPage = setNewPasswordPage;
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
        frame.getContentPane().add(setNewPasswordPage);
        frame.getContentPane().revalidate();
        frame.repaint();
    }
    
    /**
     * Initializes the specified button.
     * @param loginPageController a controller instance
     * @param frame the main frame
     */
    public void initConfirmButton(LoginPageController loginPageController, JFrame frame)
    {
        setNewPasswordPage.jButton2.addActionListener(e -> confirm(loginPageController, frame));
    }
    
    /**
     * A method for confirm button. Gets new password from the user twice and check if they are the same.
     * If they are, it sets the password as the new password of the specified user.
     * @param loginPageController a controller instance
     * @param frame the main frame
     */
    public void confirm(LoginPageController loginPageController, JFrame frame)
    {
        String password;
        String passwordAgain;
        
        password = String.valueOf(setNewPasswordPage.jPasswordField1.getPassword());
        passwordAgain =  String.valueOf(setNewPasswordPage.jPasswordField2.getPassword());

        // Check if the two passwords match.
        // If they match, set the password as the new password of the specified user. Give warning otherwise.
        if (password.equals(passwordAgain))
        {
            loginPageController.mainUser.setPassword(password);
            loginPageController.initView(frame);
            frame.setTitle("Login Page");
            JOptionPane.showMessageDialog(null, "Password change successful.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(new JFrame(), "Passwords do not match, please try again.", "Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
