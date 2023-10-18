package adarsh.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
	public static final int HEIGHT = 500;
	public static final int WIDTH = 700;
	
	private JFrame frame;
	private JLabel title;
	
	private ArrayList<JButton> buttons;
	
	public App(JFrame frame) {
		this.frame = frame;
		title = new JLabel("Algo Suite");	
		buttons = new ArrayList<JButton>();
		initGUI();
	}
	
	private void initGUI() {
		frame.getContentPane().setBackground(Color.BLACK);
		title.setForeground(Color.red);
		title.setBounds(250 + title.getWidth()/2, 0, 400, 80);
//		title.setPreferredSize(new Dimension(903, 90));
		title.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		
		addButtons();
		frame.add(title);
	}
	
	private void addButtons() {
		buttons.add(new JButton("Bit Masking"));
		buttons.add(new JButton("Big Integers"));
		buttons.add(new JButton("Linear Reccurences and Matrix Exponentiation"));
		
		for(int i = 0; i < buttons.size(); i++) {
			buttons.get(i).setForeground(Color.BLUE);
			buttons.get(i).setBackground(new Color(173, 216, 230));
			buttons.get(i).setSize(new Dimension(140, 50));
			if(i%3==0) {
				buttons.get(i).setLocation(30, 150 + (i*30));				
			}else {
				buttons.get(i).setLocation(buttons.get(i-1).getX() + 150, buttons.get(i-1).getY());
			}
			buttons.get(i).addActionListener(new ButtonListener(this));
			frame.add(buttons.get(i));
		}
	}
	
	public ArrayList<JButton> getButtons(){
		return buttons;
	}
	
	public JLabel getTitle() {
		return title;
	}
	
	public void setTitle(String text) {
		title.setText(text);
	}
	
	public JFrame getFrame() {
		return frame;
	}
}
