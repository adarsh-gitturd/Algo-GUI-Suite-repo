import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class ButtonListener implements ActionListener {
	private App app;
	private ArrayList<JButton> buttons;

	public ButtonListener(App app) {
		this.app = app;
		buttons = app.getButtons();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		if(b == buttons.get(0)) {
			app.setTitle("Bit Masking Algorithms");
			for(JButton bb : buttons) {
				bb.setVisible(false);
			}
		}
	}

}
