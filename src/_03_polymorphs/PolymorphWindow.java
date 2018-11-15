package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    Polymorph bluePoly;
    Polymorph redPoly;
    Polymorph movingPoly;
    Polymorph circlePoly;
    Polymorph mousePoly;
    Polymorph imagePoly;
    Polymorph clickPoly;
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
    	bluePoly = new BluePolymorph(50, 50);
    	redPoly = new RedPolymorph(100,100);
    	movingPoly = new MovingPolymorph(150,150);
    	circlePoly = new CirclePolymorph(200,300);
    	mousePoly = new MousePolymorph(400,400);
    	imagePoly = new ImagePolymorph(400,400);
    	clickPoly = new ClickPolymorph(300,300);
    	
    	window = new JFrame("IT'S MORPHIN' TIME!");
    	window.add(this);
    	window.getContentPane().setPreferredSize(new Dimension(500, 500));
    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	window.pack();
    	window.setVisible(true);
   	 	window.addMouseMotionListener((MousePolymorph) mousePoly);
   	 	window.addMouseListener((ClickPolymorph) clickPoly);
   	 
   	 
   	 	timer = new Timer(1000 / 30, this);
   	 	timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 bluePoly.draw(g);
   	 redPoly.draw(g);
   	 movingPoly.draw(g);
   	 circlePoly.draw(g);
   	 mousePoly.draw(g);
   	 imagePoly.draw(g);
   	 clickPoly.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 bluePoly.update();
   	 redPoly.update();
   	 movingPoly.update();
   	 circlePoly.update();
   	 mousePoly.update();
   	 imagePoly.update();
    }

	
}
