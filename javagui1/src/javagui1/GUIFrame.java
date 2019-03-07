package javagui1;

import java.awt.*;

import javax.swing.*;
//import javax.swing.JLabel;

//import java.awt.Container;
import java.awt.event.*;

public class GUIFrame extends JFrame implements ActionListener {
	Container background;
	JLabel label;
	JTextField field ;
	JLabel label2;
	JTextField field2;
	JButton button;
	public void prepareGUI() {

		setTitle("Kilometer to Miles Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		background = getContentPane();
		background.setLayout(new FlowLayout());
		background.setBackground(Color.green);

		setSize(600, 400);

	    label = new JLabel();
		label.setText("Km : ");
		background.add(label);

	    field = new JTextField(10);
		background.add(field);

		label2 = new JLabel();
		label2.setText("Miles : ");
		background.add(label2);

		field2 = new JTextField(10);
		field2.setText("Result Here");
		background.add(field2);

		button = new JButton();
		button.setText("convert");
		background.add(button);
		button.addActionListener(this);

		setVisible(true);

	}

	public static void main(String[] args) {
		GUIFrame box = new GUIFrame();
		box.prepareGUI();

	}

	public void actionPerformed(ActionEvent press) {

		 {
			
			if(press.getSource()==button) {
				
			double dis =Double.parseDouble(field.getText());
			double mil = (dis/1.6);
			field2.setText(""+mil);
			}

		}

	}

	

}
