package prog2_2015_DD;

import java.awt.Color;


public class  Circle extends Thread{
	int x;
	int y;
	int rad;
	Color col;
	public final Canvas canvas;
	
	public Circle(int a, int b, int c, Color d, Canvas canvas){
		this.x=a;
		this.y=b;
		this.rad = c;
		this.col=d;
		this.canvas=canvas;
		this.setDaemon(true);
	}

	public void run(){
		while (true){
			try {
				//System.out.println("going to sleep..");
				sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("sleep interrupted");
				
				e.printStackTrace();
			}
			//System.out.println("woke up");
			if(col==Color.black){
				this.col=Color.red;
			}
			else{
				this.col=Color.black;
			}
			
			canvas.repaint();
		}
	}
	
	public void setRad(int a){
		this.rad=a;
	}
	

	public void setX(int a){
		this.x=a;
	}
	
	public void setY(int b){
		this.y=b;
	}
	
	
	public Color getColor(){
		return this.col;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public int getRad(){
		return this.rad;
	}
}