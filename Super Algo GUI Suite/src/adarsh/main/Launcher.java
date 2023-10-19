/*Tokens
 1 - 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
 2 - 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

*/

package adarsh.main;

import javax.swing.JFrame;

public class Launcher {
	private JFrame frame;
	
	
	public Launcher() {
		frame = new JFrame("Algo GUI Suite");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(App.WIDTH, App.HEIGHT);
		frame.setLocationRelativeTo(null);
		new App(frame);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Launcher();
	}
	
}
