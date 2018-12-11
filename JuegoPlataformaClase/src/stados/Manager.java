package stados;

import java.awt.Graphics;
import java.util.Stack;

public class Manager {
	public Stack <State> stados;
	
  public Manager(){
	  stados = new Stack <State>();
		System.out.println("stados");
	  stados.push(new Nivel1(this));
  }
  
  public void tick() {
	  stados.peek().tick();
	  
  }
  public void draw(Graphics g){
	//	System.out.println("managet draw");
	  stados.peek().draw(g);

  }
  public void keyPressed(int j) {
	  stados.peek().keyPressed(j);

  }
  public void keyReleased(int j) {
	  stados.peek().keyReleased(j);

  }
  
}
