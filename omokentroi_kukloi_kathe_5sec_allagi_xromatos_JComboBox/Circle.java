package prog2_2015_A;

import java.awt.Color;

public class Circle extends Thread {
	public int rad;
	public int x;
	public int y;
	public Color color;
	boolean isCenter;
	public int num;
	public final Canvas canvas;
	
	
	public Circle (int x, int y, int rad,Color color, Canvas canvas, boolean f, int n) {
		this.x=x;
		this.y=y;
		this.rad=rad;
		this.color = color;
		this.canvas = canvas;
		this.num=n;
		this.isCenter=f;
		this.setDaemon(true);
	}
	
	
	public void run(){
		while (true){
			try {
				//System.out.println("going to sleep..");
				sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("sleep interrupted");
				
				e.printStackTrace();
			}
			//System.out.println("woke up");
			
			if(num<5 && isCenter){
				num=num+1;
				Circle c = new Circle(this.x, this.y, this.num*10, canvas.circleColor , this.canvas, false, num);
				canvas.allMyCircles.add(c);
				canvas.repaint();
			}else{
				break;
			}
		}
	}
}
