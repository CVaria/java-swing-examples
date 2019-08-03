package exam_2014_2;

import java.awt.Color;

public class Circle extends Thread {
	
	Color color;
	int rad,x,y;
	public final Canvas canvas;

	public Circle(Color c, int x, int y, int r, Canvas ca) {
		super();
		this.color=c;
		this.x = x;
		this.y = y;
		this.rad = r;
		this.canvas = ca;
		this.setDaemon(true);
	}
	
	public void run(){
		while (true){
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("sleep interrupted");

				e.printStackTrace();
			}
			if(this.rad-10>0){
				this.rad=this.rad-10;
				canvas.repaint();
			}
			else{
				this.rad=0;
				canvas.repaint();
				break;
			}
		}
	}


}
