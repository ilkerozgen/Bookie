import javax.swing.JFrame;

/**
 * A class to test MainPage
 * @author İlker Özgen
 * @version v1.0, 03.05.2021
*/
public class ToolbarTest
{
    public static void main(String[] args)
    {
		JFrame frame = new JFrame();
		Toolbar toolbar = new Toolbar();
		frame.setSize(1060, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setTitle("Main Page");
		frame.setBackground(new java.awt.Color(255, 255, 255)); 
		frame.getContentPane().add(toolbar);
    }
    
}
