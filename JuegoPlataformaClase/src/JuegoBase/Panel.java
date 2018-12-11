package JuegoBase;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import stados.Manager;

public class Panel extends JPanel implements Runnable, KeyListener{
	private static final long serialVersionUID=10;
	private int FPS = 60;
	private long targetTime= 1000 / FPS;
	public static final int WIDTH=1000;
	public static final int HEIGHT=500;
	public Thread hilo;
	private boolean Corriendo= false;
	
	public Manager Man;
	public Panel(String center) {
			setPreferredSize(new Dimension(WIDTH,HEIGHT));
			addKeyListener(Panel.this);
			setFocusable(true);
			start();
	}
	private void start() {
		Corriendo =true;
		hilo=new Thread(this);
		hilo.start();
	}
	public void run() {
		Man= new Manager();
		
		long start ,eliped ,esperar;
		while(Corriendo) {
			start= System.nanoTime();
			//System.out.println("Corriendo");

			tick();
			repaint();
			
			eliped= System.nanoTime()- start;
			esperar =targetTime - eliped /1000000;
			
			if (esperar < 0) {
				esperar = 5;
			}
			try {
				Thread.sleep(esperar);
			}catch(Exception e){
					e.printStackTrace();
			}
		}
	}
		
	public void tick () {
		//System.out.println("jugnado");
		Man.tick();
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//System.out.println("paint");
		g.clearRect(0,0,WIDTH,HEIGHT);
		Man.draw(g);
	}
	public void keyPressed(KeyEvent j) {
		Man.keyPressed(j.getKeyCode());
	}
	public void keyReleased(KeyEvent j) {
		Man.keyReleased(j.getKeyCode());
		
	}
	public void keyTyped(KeyEvent j) {
		
	}
	}
