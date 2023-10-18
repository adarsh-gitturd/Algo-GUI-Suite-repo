package adarsh.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import adarsh.algorithms.BitMasking;

public class ButtonListener implements ActionListener {
	private App app;
	private ArrayList<JButton> menuButtons;

	public ButtonListener(App app) {
		this.app = app;
		menuButtons = app.getButtons();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if(b == menuButtons.get(0)) {
			app.setTitle("Bit Masking Algorithms");
			for(JButton bb : menuButtons) {
				bb.setVisible(false);
				new BitMasking(app);
			}
		}
	}

}
