package iprog2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;

public class Canvas extends JLabel implements MouseListener, MouseMotionListener {
	private static final long serialVersionUID = 1L;

	private int x = -1;
	private int y = -1;
	private int rad = 5;
	private Color currColor = Color.black;
	private int[] xdim = new int[25000];
	private int[] ydim = new int[25000];
	private Color[] pixelColor = new Color[25000];
	private int count = 0;
	//private boolean pressed = false;

	public int getCount() {
		return count;
	}
	
	public int getX(int i) {
		return xdim[i];
	}
	
	public int getY(int i) {
		return ydim[i];
	}
	
	public String getColor(int i) {
		if(pixelColor[i] == Color.black) {
			return "black";
		} else {
			return "white";
		}
	}

	public void setColor(String newColor) {
		if(newColor.equals("white")) {
			this.currColor = Color.white;
		} else {
			this.currColor = Color.black;
		}
	}

	public Canvas() {
		setPreferredSize(new Dimension(500, 500));
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void paint(Graphics g) {
		for (int i = 1; i <=count; i++) {
			g.setColor(pixelColor[i]);
			g.fillOval(xdim[i] - rad, ydim[i] - rad, rad, rad);
		}
	}

	public void colorSwap() {
		for (int i = 1; i <=count; i++) {
			if(pixelColor[i] == Color.black) {
				pixelColor[i] = Color.white;
			} else {
				pixelColor[i] = Color.black;
			}
		}
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent ev) {
		if (count < 24999) {
			count++;
			x = ev.getX();
			y = ev.getY();
			xdim[count] = x;
			ydim[count] = y;
			pixelColor[count] = currColor;
			//System.out.println("x=" + x + ", y=" + y);
		}
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

	@Override
	public void mouseDragged(MouseEvent ev) {
		if (count < 24999) {
			count++;
			x = ev.getX();
			y = ev.getY();
			xdim[count] = x;
			ydim[count] = y;
			pixelColor[count] = currColor;
			//System.out.println("x=" + x + ", y=" + y);
		}
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub	
	}
}