package Objetos;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Bloke extends Rectangle {
	public static final double BlokeTamaño = 50;
	public Bloke(double x ,double y) {
		setBounds((int)x,(int)y,(int)BlokeTamaño,(int)BlokeTamaño);
	}
		public static double getBloketamaño() {
		return BlokeTamaño/2.5d;
	}
		public void draw(Graphics g) {
			g.drawRect(x, y, width, height);
			
		}

			
		}
			
