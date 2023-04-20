package guiclass;
import guiclass.*;

import java.awt.*;

import javax.swing.*;
public class MainFrame {
	JFrame frame; // Main frame for the project
	
	//textfields to receive data from the user and display the result after the calculation
	JTextField amountOneField = null,result = null;
	
  public MainFrame(String s){
	 
	 MouseListenerClass obj1 = new MouseListenerClass();
	 TextLabels labelObj = new TextLabels();
	 ButtonClass button = new ButtonClass();
	 HelpAndConversion help = new HelpAndConversion();

	 
	  frame = new JFrame(s);  // instantize the frame
	  
	  frame.setLayout(null); //setting layout manager to null as we externally configure it
	
	  frame.setResizable(false); // makes frame not to maximize or minimize
	  
	 frame.setSize(500,600); //sets the size to teh frame
	 
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets to exit when user click on 'X' symbol

	 frame.getContentPane().setBackground(Color.lightGray); //sets background color to white
	
	 ImageIcon icon = new ImageIcon("logo.png");
	frame.setIconImage(icon.getImage());
	
	 addEntryFields(); //adding Entry fields to enter the data and to display the results
	 
	 obj1.addClick(amountOneField,"Amount"); // adds the Mouse listener to the amountOnefield
	 
	 // adds the two combo boxes of available currency list to the main frame to enable user to select onr from it
	 button.addCurrency(frame);  
	 

	 //adds the convert, reset, help, exit button to the main frame
	 JButton convertButton = button.createButton(100,400,100,30,"Convert");
	 
	 JButton resetButton = button.createButton(300, 400, 100, 30, "Reset");
	 
	 JButton helpButton = button.createButton(100, 450, 100, 30, "Help");
	 
	 JButton exitButton = button.createButton(300, 450, 100, 30, "Exit");
	 

	 //adds the convert, reset, help, exit button to the frame
	 frame.add(convertButton);
	 frame.add(resetButton);
	 frame.add(helpButton);
	 frame.add(exitButton);
	 
	 //adds action listener to the convert and reset buttons with instance of it 
	 // as both were defined in button class
	 button.clickReset(resetButton,amountOneField,result);
	 button.clickAmount(frame,convertButton,amountOneField,result);


	 //holding  a reference to help frame to operate on it later
	 //i.e to dispose help frame also when main frane is disposed

	// addind action listener to help button with instance of 
	//HelpAndConversion class
	 JFrame f = help.clickHelp(helpButton,frame);  
	
	//adds action listener to exit button
	 button.clickExit(exitButton,frame,f);
	 
	 // adds title, From and To label to the frame
	 labelObj.addLables(frame);
	 
	 frame.setVisible(true); // set visuibility to true
 }
  public void addEntryFields() {
	 
	 //sets the properties to the amount text field with createField method
	 amountOneField = new TextField().createField(amountOneField,105,200,350,30,"Amount");

	 ///adds amount text field to the frame
	 frame.add(amountOneField);

	 //sets editable property false by deafult until user clicks on it
	 amountOneField.setEditable(false);

	//sets the properties to the result  text field with createField method
	 result = new TextField().createField(result,105,300,350,30,"Result");

	 //result text filed cannot be edited or recveive data as used only to dispaly converted amount
	 result.setEditable(false);

	 // adds the result text field to the main frame
	 frame.add(result);
	 
 }
}
