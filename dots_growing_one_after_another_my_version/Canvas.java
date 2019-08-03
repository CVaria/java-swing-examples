package prog2_2015_B;

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

	public ArrayList<Circle> arr = new ArrayList<Circle>();
	public int created = 0;



	public Canvas() {
		setPreferredSize(new Dimension(500,500));
		addMouseMotionListener(this);
		setBackground(Color.white);
	}

	public void paint(Graphics g) {
		for (Circle temp: arr) {
			g.setColor(Color.black);
			g.fillOval(temp.x-temp.r, temp.y-temp.r, 2 * temp.r, 2 * temp.r);
		}
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		
			
		Circle d = new Circle( x, y, 5);
		arr.add(d);	
		if(created==0){
			new MyThread(this).start();
		}
		created =created+1;
		this.repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}
}
