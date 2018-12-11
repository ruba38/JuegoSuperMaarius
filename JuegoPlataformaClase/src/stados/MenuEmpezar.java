package stados;

import java.awt.Color;
import java.awt.Graphics;

import JuegoBase.Panel;

public class MenuEmpezar extends State{
	private String[] opciones = {"Empezar","Salir"};
	private int seleccionado=0;
	public MenuEmpezar(Manager Man) {
		super(Man);
	}

	@Override
	public void init() {
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		for(int k = 0;k < opciones.length; k++ ) {
			if(k==seleccionado) {
				g.setColor(Color.GREEN);
			}
			else {
				g.setColor(Color.BLACK);
			}
			 g.drawString(opciones[k],Panel.WIDTH / 2 , 100 + k * 100 );
			}
		}
	@Override
	public void keyPressed(int j) {
		
	}

	@Override
	public void keyReleased(int j) {
		
	}

}
