import javax.swing.*;
public class choices {
	
	String input = "";
	
	public void leftOrRight() {
		input = JOptionPane.showInputDialog("Enter left of right");
	}
	public String getLeftOrRight(){
		return input;	
	}
}

