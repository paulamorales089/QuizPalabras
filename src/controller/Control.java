package controller;
import model.Logic;

import processing.core.PApplet;
public class Control {
	
	private PApplet app;
	private Logic logic;
	
	public Control (PApplet app) {
		this.app = app;
		logic = new Logic(app);
	
}
	public void draw() {
		logic.draw();
	}
	
	public void stopMove() {
		logic.stopMoveCircle();
		logic.stopMoveSquare();
		logic.stopMoveTriangle();

	}
	
	public void newShape() {
		logic.newShape();

	}

}
}