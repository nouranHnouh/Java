import java.awt.Color;

import javax.swing.JFrame;
public class DrawPanelTest {
	

	public static void main(String[] args) {
		
		DrawPanel panel=new DrawPanel();
		
		//create Frame to hold the panel 
		JFrame application= new JFrame();
		
		//close frame when exit the application
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);// add panel to frame
		application.setSize(250,250);//set size of the frame
		application.setVisible(true); // make the frame visible 
		application.setBackground(Color.blue); 
		panel.setBackground(Color.gray );
		
		
		

	}

}
