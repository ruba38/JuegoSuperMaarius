package fisicas;

import java.awt.Point;

import Objetos.Bloke;

public class Colisiones {
	public static boolean JugadorBloke(Point P, Bloke B){
		return B.contains(P);
	}

}
