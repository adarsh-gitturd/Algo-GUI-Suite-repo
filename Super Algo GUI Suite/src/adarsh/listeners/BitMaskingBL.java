package adarsh.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;

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
	}
	
}
