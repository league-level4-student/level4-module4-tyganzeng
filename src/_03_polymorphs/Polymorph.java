package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int width;
    private int height;
    
    

	Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
   	 this.width = 50;
   	 this.height = 50;
   	 
    }
    
    public void setX(int x) {
    		this.x = x;
    }
    
    public int getX() {
    		return x;
    }
    public void setY(int y) {
		this.y = y;
    }

    public int getY() {
		return y;
    }
    
    public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
