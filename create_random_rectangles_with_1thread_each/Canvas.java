package prog2_2015;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;

public class Canvas extends JLabel{
		public int len=20;
		public List<Rect> allMyRectangles;
		
		public Canvas() {
			setPreferredSize(new Dimension(500,500));
			setOpaque(true);
			this.setBackground(Color.white);
			allMyRectangles = new ArrayList<Rect>();
		}

		public void paint(Graphics g){
			g.setColor(Color.white);
			g.fillRect(0, 0, 500, 500);
			for(Rect rect: allMyRectangles){
				g.setColor(Color.black);
				g.drawRect(rect.getX(), rect.getY(), rect.getLen(), rect.getLen());
			}
		}
		
		public  void addRect(Rect Rect){
			allMyRectangles.add(Rect);
		}
		
		public  void remove(){
			allMyRectangles.remove(allMyRectangles.size()-1);
		}
		
	

}
