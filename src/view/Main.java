package view;
import processing.core.PApplet;
public class Main extends PApplet{

	public static void main(String[] args) {	
		PApplet.main("principal");
	}
	
	
	@Override
	public void settings() {
		size(500,500);
	}
	
	String [] text;
	
	@Override
	public void setup() {
		text = loadStrings("figuresText");
		}
	
	@Override
	public void draw() {
		background(255);
		
		System.out.println(mouseX + ","+ mouseY);
		
		
		

	
		
		
		
		
		}
	
}
