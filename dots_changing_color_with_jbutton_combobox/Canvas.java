package epi_ptyxio_2014;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JLabel;


public class Canvas extends JLabel implements MouseMotionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int x = -1;
	private int y = -1;
	public ArrayList<Circle> arr = new ArrayList<Circle>();
	public int created = 0;
	public Color col = Color.black;
	public boolean swap;


	public Canvas() {
		setPreferredSize(new Dimension(500,500));
		addMouseMotionListener(this);
	}

	public void paint(Graphics g) {
		if(this.col==Color.black){
			g.setColor(Color.white);
			g.fillRect(0, 0, 500, 500);
		}
		else{
			g.setColor(Color.black);
			g.fillRect(0, 0, 500, 500);
		}
		for (int i = 0; i < arr.size(); i++) {
			Circle temp = arr.get(i);
			g.setColor(col);
			g.fillOval(temp.x-temp.r, temp.y-temp.r, 2 * temp.r, 2 * temp.r);
		}
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		Circle d = new Circle(this.col, x,y,5);
		arr.add(d);	
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}
}
