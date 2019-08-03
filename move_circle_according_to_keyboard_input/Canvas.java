package exam_feb_2015_B;

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
	public Circle circ;

	public Canvas() {
		setPreferredSize(new Dimension(500,500));
		setOpaque(true);
		this.setBackground(Color.black);
		circ=new Circle(250,250,20,1,this);
		circ.start();
	}

	public void paint(Graphics g){
		g.setColor(Color.black);
		g.fillRect(0, 0, 500, 500);
		g.setColor(Color.red);
		g.drawOval(circ.getX()-circ.getRad(), circ.getY()-circ.getRad(), 2*circ.getRad(), 2*circ.getRad());
	}


}