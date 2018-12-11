package JuegoBase;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Main  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main (String[]args) {
	JFrame frame = new JFrame("SuperMarius");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setLayout(new BorderLayout());
	frame.add(new Panel(BorderLayout.CENTER));
	frame.pack();
	frame.setLocationRelativeTo(null);
	frame.setVisible(true);
	}

}
