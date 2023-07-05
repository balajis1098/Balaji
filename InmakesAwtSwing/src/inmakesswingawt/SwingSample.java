package inmakesswingawt;

import javax.swing.*;
import java.awt.*;

public class SwingSample extends JFrame
{
	public SwingSample(String title) 
	{
		setTitle(title);
		Image icon = Toolkit.getDefaultToolkit().getImage("Natural.JPG");
		setIconImage(icon);
	}
	
	public void paint(Graphics g)
	{
		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("Natural.JPG");
		g.drawImage(i, 5, 5, this);
	}
	
	public static void main(String[] args) 
	{
		SwingSample swing = new SwingSample("Sample Swing");
		swing.setSize(10, 20);
		swing.setVisible(true);
		swing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//swing.paint(null);
	}
}
