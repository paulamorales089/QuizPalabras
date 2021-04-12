package model;

import java.util.ArrayList;


import Model.Cricle;

import Model.Square;

import processing.core.PApplet;

public class Logic {
	PApplet app;
	private ArrayList<Circle> circles;
	private ArrayList<Square> squares;	
	private ArrayList<Triangle> triangles;
	private ArrayList <String> words;
	private String[] text;
	private String[] row;
	
	public Logic (PApplet app) {
		this.app=app;
		circles = new ArrayList<>();
		squares = new ArrayList<>();
		triangles = new ArrayList<>();
		
	}
	
	public void imrpoteText () {
		text = app.loadStrings("figuresText");
		
	}
public void initList(PApplet app) {
		
		for (int i = 0; i < text.length; i++) {
			
		row = PApplet.split(text[i], " ");
		
		for (int j = 0; j < row.length; j++) {
			words.add(row[j]);
			
			}
		}
	}
	
	public void initFigures() {
		
		
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).equals("Cuadrado")) {
				int index = i;
				int tam = Integer.parseInt(words.get(index+1));
				int posX = Integer.parseInt(words.get(index+2));
				int posY = Integer.parseInt(words.get(index+3));
				int dir = Integer.parseInt(words.get(index+4));
				int valor = Integer.parseInt(words.get(index+5));
				Square newSquares = new Square(tam, posX, posY, dir, valor);
				squares.add(newSquares);
				
			}
		
			if (words.get(i).equals("Circulo")) {	
				int index = i;
				int tam = Integer.parseInt(words.get(index+1));
				int posX = Integer.parseInt(words.get(index+2));
				int posY = Integer.parseInt(words.get(index+3));
				int dir = Integer.parseInt(words.get(index+4));
				int valor = Integer.parseInt(words.get(index+5));
				Circle newCircle = new Circle(tam, posX, posY, dir, valor);
				circles.add(newCircle);
				
		
	}
	
public void draw() {
	//Drawing the figures from objects's list
	for (int i = 0; i < squares.size(); i++) {
		squares.get(i).draw(app);
	}
	
	for (int i = 0; i < circles.size(); i++) {
		circles.get(i).draw(app);
	}
	
	for (int i = 0; i < triangles.size(); i++) {
		triangles.get(i).draw();
	}
	
}
