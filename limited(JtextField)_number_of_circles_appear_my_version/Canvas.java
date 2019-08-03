package progK2_2012;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JLabel;

public class Canvas extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ArrayList<Circle> allCircles;
	int num=0;
	int prefNum=5;
	

	public Canvas() {
		setPreferredSize(new Dimension(500,500));
		this.setBackground(Color.white);
		allCircles = new ArrayList<Circle>();
		
	}

	public void paint(Graphics g){
		g.setColor(Color.white);
		g.fillRect(0, 0, 500, 500);
		for(int i=num; i<allCircles.size();i++){
			g.setColor(Color.black);
			Circle temp = allCircles.get(i);
			g.drawOval(temp.getX(), temp.getY(), temp.getRad()*2, temp.getRad()*2);
			
		}
	}
	
	public void newCircle(){
		int x = (int)Math.floor(Math.random()*500);
		int y = (int)Math.floor(Math.random()*500);
		Circle temp = new Circle(x,y,20);
		allCircles.add(temp);
		/*if(allCircles.size()-num > prefNum){
			num = allCircles.size()-prefNum;
		}*/
		while(allCircles.size()-prefNum>0){
			allCircles.remove(0);
		}
		this.repaint();
	}
	
	public void checkNum(){
		while(allCircles.size()-prefNum>0){
			//num = allCircles.size()-prefNum;
			allCircles.remove(0);
		}
		this.repaint();
	}

}