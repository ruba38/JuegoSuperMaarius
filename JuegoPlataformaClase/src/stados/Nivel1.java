package stados;

import java.awt.Graphics;

import Entidades.Jugador;

public class Nivel1 extends State{
	private Jugador jugador;
	
	public  Nivel1(Manager Man) {
		super(Man);
	}
	public void init() {

		jugador = new Jugador(20,20);
	}
	public void tick() {
		 jugador.tick();
		  
	 }
	 public void draw(Graphics g){
		 jugador.draw(g);
	 }
	 public void keyPressed(int j) {
		 jugador.keyPressed(j);
	 }
	 public void keyReleased(int j) {
		 jugador.keyPressed(j);
	 }
	
}
