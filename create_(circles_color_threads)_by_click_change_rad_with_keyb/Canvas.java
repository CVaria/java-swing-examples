package prog2_2015_DD;


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

public class Canvas extends JLabel implements MouseListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int radius=10;
	public ArrayList<Circle> myCircles;

	public Canvas() {
		setPreferredSize(new Dimension(500,500));
		setOpaque(true);
		addMouseListener(this);
		this.setBackground(Color.white);
		myCircles= new ArrayList<Circle>();
		
	}

	public void paint(Graphics g){
		g.setColor(Color.white);
		g.fillRect(0, 0, 500, 500);
		for(Circle c: myCircles){
			g.setColor(c.getColor());
			g.drawOval(c.getX()-c.getRad(), c.getY()-c.getRad(), 2*c.getRad(), 2*c.getRad());
		}
	}

	public void changeRad(int a){
		this.radius=a;
		for(Circle c: myCircles){
			c.setRad(radius);
		}
		this.repaint();
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int x = arg0.getX();
		int y= arg0.getY();
		Circle temp = new Circle(x, y, this.radius, Color.black, this);
		temp.start();
		myCircles.add(temp);
		this.repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}