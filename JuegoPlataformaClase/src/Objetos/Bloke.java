package Objetos;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Bloke extends Rectangle {
	public static final double BlokeTama�o = 50;
	public Bloke(double x ,double y) {
		setBounds((int)x,(int)y,(int)BlokeTama�o,(int)BlokeTama�o);
	}
		public static double getBloketama�o() {
		return BlokeTama�o/2.5d;
	}
		public void draw(Graphics g) {
			g.drawRect(x, y, width, height);
			
		}

			
		}
			
