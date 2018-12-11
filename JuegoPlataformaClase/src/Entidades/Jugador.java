package Entidades;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import JuegoBase.Panel;
import java.awt.event.KeyListener;


public class Jugador extends Rectangle{
	
	private static final long serialVersionUID = 1L;
	private boolean derecha , izquierda, arriba, abajo;
	//bounds
	private double x,y;
	private int width,height;
	
	//velocidad de salto
	private double Vsalto=5;
	private double VAsalto=Vsalto;
	//velocidad caida
	private double MaxVcaida=5;
	private double VAcaida= 0.1;
	
 public Jugador(int width, int height) {
	 x=Panel.WIDTH / 2;
	 y=Panel.HEIGHT / 2;
	 this.width=width;
	 this.height=height;
 }
 public void tick() {
	 //System.out.println("tICKpLATER");

	 if(izquierda==true) {
		 System.out.println("izquierda");

		 x--;
	 }
	  if(derecha) {
			 System.out.println("derecha");

		 x++;
	  }
	  if(abajo) {
		  y +=VAcaida;
		   
		  if(VAcaida<MaxVcaida) {
			  VAcaida += .1;
		  }
		  System.out.println("abajo");

		 }
	  if(arriba) {
		  y -= VAsalto;
		  VAsalto -= .1;
		  
		  if(VAsalto <= 0) {
			  VAsalto=Vsalto;
			  arriba=false;
			  abajo=true;
		  }
		  System.out.println("arriba");
		  }
	  
 }
 public void draw(Graphics g){
	 g.setColor(Color.BLACK);
	 g.fillRect((int)x, (int)y, width, height);
 }
 public void keyPressed(int j) {
		System.out.println("pressed");
		

	 if(j== KeyEvent.VK_D) derecha=true;
	 if(j== KeyEvent.VK_A) izquierda=true;
	 if(j== KeyEvent.VK_S) abajo=true;
	 if(j== KeyEvent.VK_W) arriba=true;
	 

 }
 public void keyReleased(int j) {
	 if(j== KeyEvent.VK_D) derecha=false;
	 if(j== KeyEvent.VK_A) izquierda=false;
	 if(j== KeyEvent.VK_S) abajo=false;
	 if(j== KeyEvent.VK_W) arriba=false;

 }
}