package model;

public class Figures {
	
	private int posX; 
	private int posY;
	private float direction;
	private String value;
	boolean isActive;
	private int r, g, b;
	private int innerPosition;
	
	public Figures (int posX, int posY, int r, int g, int b) 
	{
		this.posX = posX;
        this.posY = posY;
        this.value = value;

        this.isActive = false;
        
        this.r = 0;
        this.g = 0;
        this.b = 0;
	}
}
