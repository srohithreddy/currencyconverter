package guiclass;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpAndConversion{

	//creating a hashmap for faster retrival and conversion of amount
	HashMap<Integer,Double> dollarEqualValues = new HashMap<Integer,Double>();	

	// creating 'OK' button
	JButton okButton = new JButton("OK");

	// creating  a  new frame to display info about abbbrevations used and their full forms(CURRENCY full forms)
	JFrame helpFrame =  new JFrame("Help");
	
	// creating a customized border
	Border border = BorderFactory.createLineBorder(Color.BLACK, 2);

	// go to 'CONVERSION PROCESS' at top of file to understand conversion process
	void setValues() {
		dollarEqualValues.put(0,80.0);
		dollarEqualValues.put(1,1.0);
		dollarEqualValues.put(2,4.0);
		dollarEqualValues.put(3, 2.0);
		dollarEqualValues.put(4,3.0);
		dollarEqualValues.put(5, 150.0);
		dollarEqualValues.put(6,5.0);
		dollarEqualValues.put(7,10.0);
		dollarEqualValues.put(8,3.0);
		
	}
	public double convertMoney(double amount,int src,int des) {

		// calls setValues to instantize the HashMap
		setValues();
		
		// 
		double srcRate = dollarEqualValues.get(src);
		double dollarAmount = amount/srcRate;
		double desRate = dollarEqualValues.get(des);
		double finalResult = (double)desRate*dollarAmount;
		
		
		return finalResult;
	}
	 JFrame clickHelp(JButton button,JFrame frame) {
		 button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JLabel titleHelp = new JLabel("Symbol - Currency");
				
				JLabel india = new JLabel("1. INR - Indian Rupee");
				JLabel america = new JLabel("2. USD - American Dollar");
				JLabel euro = new JLabel("3. EUD - Euro");
				JLabel singapore = new JLabel("4. SGD - Singapore Dollar");
				JLabel ruby = new JLabel("5. RUB - Russian Ruby");
				JLabel yenn = new JLabel("6. JPY - Japanese Yenn");
				JLabel dinar = new JLabel("7. AED - Arab Emirates Dinar");
				JLabel australia = new JLabel("8. AUD - Australian Dollar");
				JLabel canada = new JLabel("9. CAD - Canadain Dollar");
				
				titleHelp.setFont(new Font("Times New Roman",Font.BOLD,25));
				helpFrame.setLayout(null);
				helpFrame.setFocusable(false);
				helpFrame.setResizable(false);
				helpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				helpFrame.setBounds(50,50,400,500);
				titleHelp.setBounds(75,10,250,50);
				
				setProperties(india,75,75,300,30,helpFrame);
				setProperties(america,75,110,300,30,helpFrame);
				setProperties(euro,75,145,300,30,helpFrame);
				setProperties(singapore,75,180,300,30,helpFrame);
				setProperties(ruby,75,215,300,30,helpFrame);
				setProperties(yenn,75,250,300,30,helpFrame);
				setProperties(dinar,75,285,300,30,helpFrame);
				setProperties(australia,75,320,300,30,helpFrame);
				setProperties(canada,75,355,300,30,helpFrame);
				
				okButton.setFocusable(false);
				okButton.setBounds(150,400,65,30);
				okButton.setVisible(true);
				okButton.setBorder(border);
				okButton.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,15));
				okButton.setBackground(new Color(30,170,10));
				okButton.setForeground(Color.WHITE);
				clickOk();
				helpFrame.add(okButton);
				helpFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				helpFrame.getContentPane().setBackground(new Color(204,255,100));
				helpFrame.add(titleHelp);
				helpFrame.setVisible(true);
				
				
			}
			 
		 });
		 return helpFrame;
	 }
	 void setProperties(JLabel label,int x,int y,int width,int height,JFrame frame) {
		 label.setBounds(x,y,width,height);
		 label.setFont(new Font("Constantia",Font.PLAIN,20));
		 label.setFocusable(false);
		 label.setVisible(true);
		 frame.add(label);
		 
	 }
	 
	 void clickOk() {
		 okButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				helpFrame.dispose();
			}
			 
		 });
	 }
}
