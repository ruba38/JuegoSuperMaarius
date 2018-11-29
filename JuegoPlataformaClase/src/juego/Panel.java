package juego;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Panel extends JPanel implements Runnable, KeyListener{
	private static final long serialVersionUID=10;
	
	private int FPS = 60;
	private long targetTime= 1000 / FPS;
	public static final int WIDTH=1000;
	public static final int HEIGHT=2000;
	
	public Thread thread;
	private boolean isRunnign= false;
	
	public Panel(String center) {
			setPreferredSize(new Dimension(WIDTH,HEIGHT));
	
	start();
	}
	private void start() {
		isRunnign =true;
		thread=new Thread(this);
		thread.start();
	}
	public void run() {
		long start ,eliped ,wait;
		while(isRunnign) {
			start= System.nanoTime();
			
			tick();
			repaint();
			
			eliped= System.nanoTime()- start;
			wait =targetTime - eliped /1000000;
			
			if (wait < 0) {
				wait = 5;
			}
			try {
				Thread.sleep(wait);
			}catch(Exception e){
					e.printStackTrace();
			}
		}
	}
		
	public void tick () {
		System.out.println("jugnado");
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
