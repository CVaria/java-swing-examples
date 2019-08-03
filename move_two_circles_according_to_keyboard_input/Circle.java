package sep_2014_2;


public class  Circle extends Thread{
	int x;
	int y;
	int rad;
	int direction=1;
	boolean moving;
	public final Canvas canvas;
	
	public Circle(int a, int b, int c, int d, Canvas canvas, boolean f){
		this.x=a;
		this.y=b;
		this.rad = c;
		this.direction=d;
		this.canvas=canvas;
		this.moving=f;
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
			if(this.moving){
			if (this.direction==1){
				if(x+rad>500)
					x=0;
				else
					x=x+rad;
			}
			else if(this.direction==2){
				if(x-rad<0)
					x=500;
				else
					x=x-rad;
			}
			else if(this.direction==3)
			{
				if(y+rad>500)
					y=0;
				else
					y=y+rad;
			}
			else
			{
				if(y-rad<0)
					y=500;
				else
					y=y-rad;
			}
			
			canvas.repaint();
			}
		}
	}
	
	public void setDir(int a){
		this.direction=a;
	}
	
	public void setMov(boolean a){
		this.moving=a;
	}
	
	public int getDir(){
		return this.direction;
	}
	
	public void setX(int a){
		this.x=a;
	}
	
	public void setY(int b){
		this.y=b;
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