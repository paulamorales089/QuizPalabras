package model;

import processing.core.PApplet;

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
	
	public Figures (int x, int y, int size, int r, int g, int b) 
	{
		this.x = x;
        this.y= y;
        this.size = size;
        this.acceleration = 2;
        this.r = 0;
        this.g = 0;
        this.b = 0;
        
        this.moving = true;
        
	}
	public void moveSquare (PApplet app) {
		if (moving = true) {
			
				y+= acceleration; 
				if (y>app.height-(size/2)) {
					y=app.height-(size/2);
					acceleration-=4;
					
				}			
		}
	}
	
	public void moveCircle(PApplet app) {
		x+= acceleration; 
		if (y>app.height-(size/2)) {
			y=app.height-(size/2);
			acceleration-=4;
			
			
	}
	
	}
}
