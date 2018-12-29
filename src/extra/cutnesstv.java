package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutnesstv implements ActionListener { 
	JFrame frame;
	JPanel panel;
	JButton button;
	
	public static void main(String[] args) {
		
		new cutnesstv().CreateUI();	
	}
	void CreateUI(){
		button= new JButton();
		frame = new JFrame();
		frame.setVisible(true);
		
		panel =new JPanel();
		frame.add(panel);
		
		button.addActionListener(this);
		frame.pack();
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== button) {
			showDucks();
		}
		else {
			showFrog();
		}
		
	}


	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}
	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}














}

