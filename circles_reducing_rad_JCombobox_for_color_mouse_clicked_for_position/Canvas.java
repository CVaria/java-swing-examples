package exam_2014_2;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JLabel;


public class Canvas extends JLabel implements MouseListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ArrayList<Circle> arr = new ArrayList<Circle>();
	public int created = 0;
	public Color col = Color.black;
	public boolean swap;


	public Canvas() {
		setPreferredSize(new Dimension(500,500));
		addMouseListener(this);
	}

	public void paint(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0, 0, 500, 500);
		
		for (int i = 0; i < arr.size(); i++) {
			Circle temp = arr.get(i);
			if(temp.rad>0){
				g.setColor(temp.color);
				g.drawOval(temp.x-temp.rad, temp.y-temp.rad, 2 * temp.rad, 2 * temp.rad);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		int x = arg0.getX();
		int y = arg0.getY();
		Circle circ = new Circle(this.col, x,y,50,this);
		arr.add(circ);
		circ.start();
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
