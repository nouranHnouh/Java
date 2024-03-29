//draw x, y coordinates onto the screen

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel; 

public class DrawPanel extends JPanel

{
	//draw an x from the corners of the panel
	
	public void paintComponent(Graphics g) {
		
		//call paintComponent to ensure the panel display correctly 
		super.paintComponent(g); 
		
		//get the x=width and y=height
		int width=getWidth();
		int height=getHeight();
	     g.setColor(Color.RED); 
		
		//draw line from upper-left to
		//lower-right
		g.drawLine(0,0,width,height);
		
		//draw line from lower-left to 
		//upper-right
		g.drawLine(0, height, width, 0);
		
	}

}//end class DrawPanel 
