package adarsh.listeners;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
			int ans;
			JPanel panel = new JPanel();	
			panel.setLayout(new GridLayout(6,5));
			JLabel answer = new JLabel("fff");
			
		    panel.add(new JLabel("Enter a number : "));
			JTextArea ta1 = new JTextArea(" ", 2, 1);
			panel.add(ta1);
			panel.add(new JLabel("Enter an index : "));
			JTextArea ta2 = new JTextArea(" ", 2, 1);
			panel.add(ta2);
			panel.add(answer);
		
			JOptionPane.showConfirmDialog(null, panel, 
		               "Get Ith Bit of a number", JOptionPane.DEFAULT_OPTION);
			System.out.println(ta1.getText());
			ans = app.getMenuButtonListener().getBitMasking().bma.getIthBit
					(10, 2);
			answer.setText(ta1.getText());
			//JOptionPane.showMessageDialog(null, "");
		}
	}
	
}
