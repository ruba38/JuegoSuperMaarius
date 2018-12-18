package stados;

import java.awt.Graphics;

import Entidades.Jugador;
import Objetos.Bloke;

public class Nivel1 extends State{
	private Jugador jugador;
	
	private Bloke[] b ;
	
	public  Nivel1(Manager Man) {
		super(Man);
	}
	public void init() {
		jugador = new Jugador(20,20);
		
		b = new Bloke [3];
		b[0] = new Bloke (500,150);
		b[1] = new Bloke (20,260);
		b[2]= new Bloke (800,250);
	}
	public void tick() {
		//for(int i =0 ; i < b.length; i++){
			//b[i].tick(b);
	//}
		jugador.tick(b);		 
	 }
	 public void draw(Graphics g){
		 jugador.draw(g);
		 for (int i = 0 ; i < b.length; i++) {
			  b[i].draw(g);
		  }
	 }
	 public void keyPressed(int j) {
		 jugador.keyPressed(j);
	 }
	 public void keyReleased(int j) {
		 jugador.keyPressed(j);
	 }
	
}
