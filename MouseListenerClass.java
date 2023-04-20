package guiclass;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextField;
import javax.swing.event.MouseInputAdapter;


// implementing mouse listener interfacae to perform action when user click mouse
class MouseListenerClass implements MouseListener{
	void addClick(JTextField field,String s) {

		field.addMouseListener(new MouseInputAdapter() {
			public void mouseClicked(MouseEvent e) {

				//when user clicks on amount text field,
				//makes text field editable to enable user to enter amount in it
				if(field.getText().equals(s)) {
					field.setText(""); // sets the deafult text as empty string and display it
					field.setEditable(true);
				}
			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
