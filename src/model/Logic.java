package model;

import java.util.ArrayList;
import processing.core.PApplet;

public class Logic {
	PApplet app;
	private ArrayList<Circle> circles;
	private ArrayList<Square> squares;	
	private ArrayList<Triangle> triangles;
	private ArrayList <String> palabras;
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
	
	public void initFiguresList () {
		for (int i = 0; i < text.length; i++) {
			//if(text[i].contains("cuadrado"))
			
			
		}
		
	}
public void crearListas(PApplet app) {
		
		for (int i = 0; i < text.length; i++) {
			
		row = PApplet.split(text[i], " ");
		
		for (int j = 0; j < row.length; j++) {
			palabras.add(row[j]);
			
			}
		}
	}
	
}
