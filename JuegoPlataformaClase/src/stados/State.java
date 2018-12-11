package stados;

import java.awt.Graphics;

public abstract class State {
	public Manager Man;
	public State(Manager Man){
		this.Man = Man;
		init();
}	
	public abstract void init();
	public abstract void tick() ;
	public abstract void draw(Graphics g);
	public abstract void keyPressed(int j);
	public abstract void keyReleased(int j);
}
