package Objetos;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Bloke extends Rectangle {
	public static final double BlokeTamaņo = 50;
	public Bloke(double x ,double y) {
		setBounds((int)x,(int)y,(int)BlokeTamaņo,(int)BlokeTamaņo);
	}
		public static double getBloketamaņo() {
		return BlokeTamaņo/2.5d;
	}
		public void draw(Graphics g) {
			g.drawRect(x, y, width, height);
			
		}

			
		}
			
