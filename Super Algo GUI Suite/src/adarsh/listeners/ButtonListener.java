package adarsh.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import adarsh.algorithms.BitMasking;
import adarsh.main.App;

public class ButtonListener implements ActionListener {
	private App app;
	private ArrayList<JButton> menuButtons;
	
	private BitMasking bitMasking;

	public ButtonListener(App app) {
		this.app = app;
		menuButtons = app.getButtons();
		bitMasking = new BitMasking();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if(b == menuButtons.get(0)) {
			app.setTitle("Bit Masking Algorithms");
			for(JButton bb : menuButtons) {
				bb.setVisible(false);
				bitMasking.init(app);
			}
		}
	}

	public BitMasking getBitMasking() {
		return bitMasking;
	}
}
