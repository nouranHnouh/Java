import javax.swing.JOptionPane; 
public class InputDialog {
	public static void main(String[]args)
	{
		//prompt the user to enter name
		String name= JOptionPane.showInputDialog("Enter your name! "); 
		String message= String.format("Welcome, %s, to Java Programming! ", name);
		
		//display the message to welcome the user 
		JOptionPane.showMessageDialog(null,message); 
		
	}

}
