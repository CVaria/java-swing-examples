package prog2_B_2015;

import java.awt.Color;

public class Circle extends Thread {
	public int rad;
	public int x;
	public int y;
	public Color color;
	public final Canvas canvas;
	
	public Circle (int x, int y, int rad,Color color, Canvas canvas) {
		this.x=x;
		this.y=y;
		this.rad=rad;
		this.color = color;
		this.canvas = canvas;
		this.setDaemon(true);
	}
	
	
	public void run(){
		while (true){
			try {
				System.out.println("going to sleep..");
				sleep(4000);
			} catch (InterruptedException e) {
				System.out.println("sleep interrupted");
				
				e.printStackTrace();
			}
			System.out.println("woke up");
			
				this.x += 10;
				canvas.repaint();
			if(this.x-this.rad >500)
				break;
		}
	}
}
