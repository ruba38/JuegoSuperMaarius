package Entidades;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;


import JuegoBase.Panel;
import Objetos.Bloke;
import fisicas.Colisiones;



public class Jugador extends Rectangle {
	
	private static final long serialVersionUID = 1L;
	private boolean derecha , izquierda, arriba, abajo;
	//bounds
	private double x,y;
	private int width,height;
	//velocidad de moviemento
	
	private double velocidadMovimiento= 1.5;
	
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
 public void tick(Bloke b[]) {
	 System.out.println(abajo);

	
	for(int i=0; i < b.length;i++) {
		//colision Derecha
		if(Colisiones.JugadorBloke(new Point((int)x-(width/height),(int)y),b[i])==true){
			izquierda=false;

		}
		//colision izquierda
		if(Colisiones.JugadorBloke(new Point((int)x+(int)Bloke.getBloketamaño(),(int)y),b[i])==true){
			derecha=false;
		}
		//colusuib arriba
		if(Colisiones.JugadorBloke(new Point((int)x+20,(int)y+(int) Bloke.getBloketamaño()),b[i])==true||Colisiones.JugadorBloke(new Point((int)x,(int)y+(int) Bloke.getBloketamaño()),b[i])==true){
			abajo=false;
		}
		
		//colision debajo
		if(Colisiones.JugadorBloke(new Point((int)x,(int)y-(width/height)),b[i])==true||Colisiones.JugadorBloke(new Point((int)x+(int)Bloke.getBloketamaño(),(int)y-(width/height)),b[i])==true){
			arriba=false;
			
		}
		
	 }

	 if(izquierda==true) {
		 //System.out.println("IZQUEIRDA");

		x= x - velocidadMovimiento;
	 }
	  if(derecha==true) {
			 //System.out.println("derecha");

		x= x + velocidadMovimiento;
	  }
	  if(abajo==true) {
		  y +=VAcaida;
		   
		  if(VAcaida<MaxVcaida) {
			  VAcaida += .1;
		  }
		  //System.out.println("abajo");

		 }
	  if(arriba==true) {
		  y -= VAsalto;
		  VAsalto -= .1;

		  if(VAsalto <= 0) {

			  VAsalto=Vsalto;

			 abajo=true;
			 System.out.println(abajo);

		  }
		  //System.out.println("arriba");
		  }
	  if(abajo==false){
		  VAcaida = .1;
	  }
	  abajo=true;

 }
 public void draw(Graphics g){
	 g.setColor(Color.BLACK);
	 g.fillRect((int)x, (int)y, width, height);
 }

public void keyPressed(int j) {
	

	 if(j== KeyEvent.VK_D) derecha=true;
	 if(j== KeyEvent.VK_A) izquierda=true;
	 if(j== KeyEvent.VK_S) abajo=true;
	 if(j== KeyEvent.VK_W) arriba=true;
}
public void keyReleased(int k) {
	
 if(k== KeyEvent.VK_D) derecha=false;
 if(k== KeyEvent.VK_A) izquierda=false;
 //if(k== KeyEvent.VK_S) abajo=false;
 if(k== KeyEvent.VK_W) arriba=false;
	
	
}

	
}
