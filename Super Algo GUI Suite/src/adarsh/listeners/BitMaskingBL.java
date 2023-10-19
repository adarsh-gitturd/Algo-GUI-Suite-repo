package adarsh.listeners;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

import adarsh.main.App;

public class BitMaskingBL implements ActionListener{
	private App app;
	private ArrayList<JButton> buttons;

	public BitMaskingBL(App app) {
		this.app = app;
		buttons = app.getMenuButtonListener().getBitMasking().getButtons();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if(b == buttons.get(0)) {
			String ans;
			String input = JOptionPane.showInputDialog(null, "Enter a number : ");                         
			ans = app.getMenuButtonListener().getBitMasking().bma.oddOrEven(Integer.parseInt(input));
			JOptionPane.showMessageDialog(null, ans);
		}
		if(b == buttons.get(1)) {
			String ans;
			JPanel panel = new JPanel();	
			panel.setLayout(new GridLayout(6,2));
//			panel.add(Box.createVerticalStrut(100));
			panel.add(new JLabel("Enter a number : "));
			panel.add(new JTextArea("enter smth"));
			panel.add(new JLabel("Enter an index : "));
			panel.add(new JTextArea("index smth"));	
			int input = JOptionPane.showConfirmDialog(null, panel, 
		               "Get Ith Bit of a number", JOptionPane.OK_CANCEL_OPTION);
//			String inpust = JOptionPane.showInputDialog(null, "Enter a number : ");  
//			String inpusdt = JOptionPane.showInputDialog(null, "Enter an index : ");  
			//ans = app.getMenuButtonListener().getBitMasking().bma.getIthBit(Integer.parseInt(input));
			JOptionPane.showMessageDialog(null, "");
		}
	}
	
}
