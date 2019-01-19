package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutnesstv implements ActionListener { 
	JFrame frame;
    JPanel panel;
    JButton pink;
    JButton yellow;
    JButton blue;
    
    
    public static void main(String[] args) {
        
        new cutnesstv().CreateUI();    
    }
    void CreateUI(){
        yellow= new JButton();
        pink=new JButton();
        blue=new JButton();
        frame = new JFrame();
        
        
        
        panel =new JPanel();
        frame.add(panel);
        
        panel.add(blue);
        panel.add(pink);
        panel.add(yellow);
        
        
        blue.addActionListener(this);
        pink.addActionListener(this);
        yellow.addActionListener(this);
        frame.pack();
    frame.setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== blue) {
            showDucks();
        }
        else if(e.getSource()==yellow){
            showFrog();
        }
        else if(e.getSource()==pink) {
            showFluffyUnicorns();
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

