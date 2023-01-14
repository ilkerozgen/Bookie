import javax.swing.JFrame;

/**
 * A class to test Set New Password Page.
 * @author İlker Özgen
 * @version v1.0, 03.05.2021
*/
public class SetNewPasswordPageTest
{
    public static void main(String[] args)
    {
		JFrame frame = new JFrame();
		SetNewPasswordPage setNewPasswordPage = new SetNewPasswordPage();
		frame.setSize(1060, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setTitle("Set New Password Page");
		frame.setBackground(new java.awt.Color(255, 255, 255)); 
		frame.getContentPane().add(setNewPasswordPage);
    }
    
}
