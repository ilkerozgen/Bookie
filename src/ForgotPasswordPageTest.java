import javax.swing.JFrame;

/**
 * A class to test Forgot Password Page.
 * @author İlker Özgen
 * @version v1.0, 03.05.2021
*/
public class ForgotPasswordPageTest
{
    public static void main(String[] args)
    {
		JFrame frame = new JFrame();
		ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
		frame.setSize(1060, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setTitle("Forgot Password Page");
		frame.setBackground(new java.awt.Color(255, 255, 255)); 
		frame.getContentPane().add(forgotPasswordPage);
    }
    
}
