package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cutnesstv implements ActionListener { 
	JFrame frame;
	JPanel panel;
	JButton button;
	
	public static void main(String[] args) {
		
		new cutnesstv().createUI();	
	}
	private void createUI() {
	frame = new Jframe();
	panel= new Jfanel();
	button= new Jfutton();
		
	}

	public void actionPerformed(ActionEvent arg0) {
		
		
	}
}
