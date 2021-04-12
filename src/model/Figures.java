package model;

import processing.core.PApplet;
import processing.core.PConstants;

public class Figures {
	
	int x; 
	int y;
	int size;
	int direction;
	int numbreInside;
	int r; 
	int g;
	int b;
	String value;
	boolean moving;
	int acceleration;
	
	public Figures (int x, int y, int size,int numberInside) 
	{
		this.x = x;
        this.y= y;
        this.size = size;
        this.acceleration = 2;
        this.r = (int) (Math.random()*255+50);
		this.b = (int) (Math.random()*255+50);
		this.g = (int) (Math.random()*255+50);
 
        this.moving = true;
    }
	public void drawSquare(PApplet app) {
		app.fill(r, g, b);
		app.stroke(80);
		app.strokeWeight(2);
		app.textAlign(PConstants.CENTER);
		app.textSize(16);
		moveSquare(app);
		
	}public void drawCircle (PApplet app) {
		app.fill(r, g, b);
		app.stroke(80);
		app.strokeWeight(2);
		app.textAlign(PConstants.CENTER);
		app.textSize(16);
		moveCircle(app);
	}
	public void moveSquare (PApplet app) {
		if (moving = true) {
			
				y+= acceleration; 
				if (y>app.height-(size/2)) {
					y=app.height-(size/2);
					acceleration-=2;
			}			
		}
	}
	
	public void moveCircle (PApplet app) {
		x+= acceleration; 
		if (y>app.height-(size/2)) {
			y=app.height-(size/2);
			acceleration-=2;
	}
	
	/*	public void stopMoveSquare() {
	 
		}
	*/
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSize() {
		return size;
	}
	public int getAcceleration() {
		return acceleration;
	}
	public int getNumbreInside() {
		return numbreInside;
	}
}
