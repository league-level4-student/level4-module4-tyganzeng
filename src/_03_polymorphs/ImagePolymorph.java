package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;


import javax.imageio.ImageIO;

public class ImagePolymorph extends Polymorph{

	
	BufferedImage img;
	
	
	ImagePolymorph(int x, int y) {
		super(x, y);
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream("Java.png"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void draw(Graphics g) {
		g.drawImage(img, getX(), getY(),100,100, null);	
	}
	
}
