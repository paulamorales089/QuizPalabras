package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {
	
	private ArrayList<Circle> circles;
	private ArrayList<Square> squares;	
	private ArrayList<Triangle> triangles;
	private ArrayList <String> words;
	private String[] text;
	private String[] row;
	
	public Logic () {
		
		circles = new ArrayList<>();
		squares = new ArrayList<>();
		triangles = new ArrayList<>();
		
	}
	
	public void imrpoteText (PApplet app) {
		text = app.loadStrings("figuresText");
		
	}
public void initList(PApplet app) {
		
		for (int i = 0; i < text.length; i++) {
			
		row = PApplet.split(text[i], " ");
		}
		for (int j = 0; j < row.length; j++) {
			words.add(row[j]);
			
			}
		}
		
	public void initFigures() {
		
		
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).equals("Cuadrado")) {
				int index = i;
				int size = Integer.parseInt(words.get(index+1));
				int x = Integer.parseInt(words.get(index+2));
				int y = Integer.parseInt(words.get(index+3));
				int acceleration =Integer.parseInt(words.get(index+4));
				int numberInside = Integer.parseInt(words.get(index+5));
				Square newSquares = new Square( x,  y, size, numberInside);
				squares.add(newSquares);
				
			}
		
			if (words.get(i).equals("Circulo")) {	
				int index = i;
				int size = Integer.parseInt(words.get(index+1));
				int x = Integer.parseInt(words.get(index+2));
				int y = Integer.parseInt(words.get(index+3));
				int acceleration = Integer.parseInt(words.get(index+4));
				int numberInside = Integer.parseInt(words.get(index+5));
				Circle newCircle = new Circle( x, y, size, numberInside);
				circles.add(newCircle);
				
		
	}
	

}
}
}