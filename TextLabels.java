package guiclass;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class TextLabels {
	
	//declaring 3 labels for title, From and To
	JLabel title,fromLabel,toLabel;
	
	// customized border
	 Border border = BorderFactory.createLineBorder(Color.BLACK, 2);

	public void addLables(JFrame frame) {
		// TODO Auto-generated method stub
		title = new JLabel("Currency Convertor");  // sets the text ( used as title)

		title.setLayout(null); // sset layout manager to null

		title.setBackground(new Color(100,200,150)); //setting background to title

		title.setOpaque(true); // to set background visible

		title.setBorder(border); // sets the border to the label

		title.setFocusable(false); // sets focusablity false 

		title.setBounds(0,0,500,100); // sets the relative position to the title label

		title.setFont(new Font("Times New Roman",Font.BOLD,50)); //sets customized font to the label

		title.setVerticalAlignment(JLabel.CENTER); // sets text to center in vertical allignment
		
		title.setHorizontalAlignment(JLabel.CENTER); // sets text to center in horizantal allignment

		title.setVisible(true); //makes title visible

		frame.add(title); // adds the title label to the frame

		addLabel(frame,fromLabel,50,170,100,25,"From"); // adds the from label to the frame

		addLabel(frame,toLabel,50,270,100,25,"To"); // adds the To label to the frame
		
	}
	void addLabel(JFrame frame,JLabel label,int x,int y,int width,int height,String s) {
		label = new JLabel(s);   // creating  a new label for From and To

		label.setLayout(null); // sets layout manager to null

		label.setBounds(x,y,width,height); // sets relative position to From and To labels

		label.setFont(new Font("Times New Roman",Font.BOLD,25)); // sets the font to the two labels 

		label.setVisible(true); // makes two labels visible

		frame.add(label); //adds From and Toi label to the frame
		
	}
	
}
