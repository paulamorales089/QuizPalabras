package model;

import Model.Figures;
import processing.core.PApplet;

public class Square extends Figures{
	
	//private int color;
		public Square(int size, int x, int y,  int numberInside) {
			super(int x, int y, int size);
			
		}
		
		public void pintarCuadrado(PApplet app) {
		
				app.fill(178,102,255);
			
			
			app.rect(x, y, size, size);
			app.fill(255);
			app.textSize(size/2);
			app.text(numberInside +"", x,y);
		} 

}
