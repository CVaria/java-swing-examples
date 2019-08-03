package sep_2014_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;

public class Canvas extends JLabel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int radius=20;
	public int direction = 1;
	public Circle circ1;
	public Circle circ2;
	int movingCircle =1;
	
	public Canvas() {
		setPreferredSize(new Dimension(500,500));
		setOpaque(true);
		this.setBackground(Color.black);
		circ1=new Circle(250,250,20,1,this,true);
		circ1.start();
		circ2=new Circle(250,250,20,1,this,false);
		circ2.start();
	}

	public void paint(Graphics g){
		g.setColor(Color.black);
		g.fillRect(0, 0, 500, 500);
		g.setColor(Color.red);
		g.fillOval(circ1.getX()-circ1.getRad(), circ1.getY()-circ1.getRad(), 2*circ1.getRad(), 2*circ1.getRad());
		g.setColor(Color.blue);
		g.fillOval(circ2.getX()-circ2.getRad(), circ2.getY()-circ2.getRad(), 2*circ2.getRad(), 2*circ2.getRad());
	}


}