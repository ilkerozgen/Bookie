import javax.swing.JFrame;

/**
 * A class to test Login Page.
 * @author İlker Özgen
 * @version v1.0, 03.05.2021
*/
public class LoginPageTest
{
    public static void main(String[] args)
    {
		JFrame frame = new JFrame();
		LoginPage loginPage = new LoginPage();
		frame.setSize(1060, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setTitle("Login Page");
		frame.setBackground(new java.awt.Color(255, 255, 255)); 
		frame.getContentPane().add(loginPage);
    }
    
}