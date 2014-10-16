package cisc3120.asteroids;

import java.awt.Rectangle;
import java.awt.Polygon;
import java.awt.event.KeyEvent;

public class Ship extends Asteroids implements KeyListener {
	
	private int[] shipx ={-6,-3,0,3,6,0};
	private int[] shipy ={6,7,7,7,6,-7};
	
	public Rectangle getBounds(){
		Rectangle r;
		r= new Rectangle((int)getX()-6,(int)getY() -6, 12, 12);
		return r;
	
	
	 Ship ship = new Ship(shipx, shipy);
	 ship.paint(brush);
}
}
