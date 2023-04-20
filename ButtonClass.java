package guiclass;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
//500
	public class ButtonClass {
		

		// creating a list of available currencies to make a Java Combo Box 
		String[] currList = {"INR","USD","EUR","SGD","RUB","JPY","AED","AUD","CAD"};

		//creating a two combo boxes for displaying at amount field and result field
		public JComboBox amountList = new JComboBox(currList);
		public JComboBox resultList = new JComboBox(currList);
		
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		
		public void addCurrency(JFrame frame) {
	
			// sets relative position for the amount list combo box 
			amountList.setBounds(50,200,60,30);

			// sets focusablity property to false
			amountList.setFocusable(false);

			// sets the border for the amount list 
			amountList.setBorder(border);

			// adds the amount list to the frame
			frame.add(amountList);	
			
			// sets the rrealtive position for the result list pof currencies
			resultList.setBounds(50,300,60,30);
				resultList.setFocusable(false);
				resultList.setBorder(border);

				// adds the result list to the frame
				frame.add(resultList);
		}

		// create a button and returns the instance of it
		public JButton createButton(int x,int y,int width,int height,String s) {

			// creating a button with given string
			JButton button = new JButton(s);

			// sets the relative position for button
			button.setBounds(x,y,width,height);

			// sets the focusability property to the false
			button.setFocusable(false);

			//sets border to the button
			button.setBorder(border);

			// return the instance of it
			return button;
		}

		void clickAmount(JFrame frame,JButton button,JTextField amount,JTextField res) {
				// TODO Auto-generated method stub
				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub

						// to hold amount when converted from varaible 'value'
						double currency = 0;

						// variable to hold to amount extracted from amount text field
						String value = amount.getText();
						try {

							// parsing from Stirng to double type
							currency = Double.parseDouble(value);

						// handling any exceptions if needed
						}catch(Exception e1) {
							// value = value.replace(" ","");
							if(value.equals("Amount")){

								// generate warning message if clicked on convert without entering amount
								JOptionPane.showMessageDialog(frame, "Enter amount first", "WARNING", JOptionPane.WARNING_MESSAGE);
								amount.setEditable(false);
							}
							else{

							// generate error message when user entered invalid data
							JOptionPane.showMessageDialog(frame,"Invalid Data","Error",JOptionPane.ERROR_MESSAGE);
							}

							// resest the amount and result text field
							amount.setText("Amount");
							res.setText("Result");
							amount.setEditable(false);
					
							return ;
						}
						
						// detecting currency type selected by user in source list
						int sourceCountry = amountList.getSelectedIndex();

						// detecting currency type to be converted
						int resultCountry = resultList.getSelectedIndex();
						

						HelpAndConversion conv = new HelpAndConversion();

						// calling method convMoney with source currency type and curreny type to be converted
						double result = conv.convertMoney(currency,sourceCountry,resultCountry);

						// sets the result on result text field after converting to Stirng
						res.setText(String.valueOf(result));
						
					}	
						
					});
				
			}
		
			// adds the action listener to the reset button 
		void clickReset(JButton button,JTextField amount,JTextField res) {
				// TODO Auto-generated method stub
				button.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						if(!amount.getText().equals("Amount")) {

							// if reset button clicked when no amount is entered or even amount is converted, 
							// sets the text to 'Amount' only
							amount.setText("Amount");

							// makes the amount field non-editable until user clicks on it again
							amount.setEditable(false);
						}

						// if result field is replaced by conbverted amount,
						// replace text with 'Result'
						if(!res.getText().equals("Result")) {
							res.setText("Result");
						}
						
					}
					
				});
			}

			// adds the action listener to the exit button
		public void clickExit(JButton button, JFrame frame,JFrame frame1) {
			// TODO Auto-generated method stub
			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					// disposing the main frame and help frame it is opened
					frame.setVisible(false);
					frame.dispose();			
					frame1.dispose();
				}
				
			});
			
		}
		
	}
