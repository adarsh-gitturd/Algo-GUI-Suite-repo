package adarsh.algorithms;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JButton;

import adarsh.main.App;
import adarsh.main.ButtonListener;

public class BitMasking {
	private App app;
	private ArrayList<JButton> features;
	
	public BitMasking(App app) {
		this.app = app;
		features = new ArrayList<JButton>();
		initButtons();
		renderButtons();
	}
	
	private void initButtons() {
		features.add(new JButton("Odd or Even"));
		features.add(new JButton("Get Ith Bit"));
		features.add(new JButton("Clear Ith Bit"));
		features.add(new JButton("Set Ith Bit"));
		features.add(new JButton("Clear Last I Bits"));
		features.add(new JButton("Clear Range of Bits"));
		features.add(new JButton("Replace Bits"));
		features.add(new JButton("Count Set Bits"));
		features.add(new JButton("Decimal to Binary"));
		features.add(new JButton("Number of Bits"));
	}
	
	private void renderButtons() {
		for(int i = 0; i < features.size(); i++) {
			JButton b = features.get(i);
			b.setForeground(Color.RED);
			b.setBackground(new Color(255, 138, 138));
			b.setSize(new Dimension(140, 50));
			if(i%3==0) {
				b.setLocation(30, 150 + (i*60));				
			}else {
				b.setLocation(features.get(i-1).getX() + 150, features.get(i-1).getY());
			}
			b.addActionListener(new ButtonListener(app));
			app.getFrame().add(b);
		}
	}
}
