package guiclass;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class TextField {

	// creating  a new customized border for the text field
	Border border = BorderFactory.createLineBorder(Color.BLACK, 2);

	JTextField createField(JTextField entryField, int x,int y,int width,int height,String s) {
		
	// creating a text field with obtained String as parameter
	 entryField = new JTextField(s);

	 // sets the String 'Amount' and 'Result' to the right of the text field
	 entryField.setHorizontalAlignment(JTextField.RIGHT);

	 // sets the relative position for the text fields 
	 entryField.setBounds(x,y,width,height);

	 // sets the border to the text fields
	 entryField.setBorder(border);

	//  //sets focusability to false
	//  entryField.setFocusable(false);

	 //sets font to the text field
	 entryField.setFont(new Font("Times New Roman",Font.BOLD,20));

	 //sets visibility to true to make text field true
	 entryField.setVisible(true);

	 //return the instance of it
	 return entryField;
	 }
}
