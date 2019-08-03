package prog2_2015;

public class  Rect extends Thread{
	int x;
	int y;
	int len;
	public final Canvas canvas;
	
	public Rect(int a, int b, int c, Canvas canvas){
		this.x=a;
		this.y=b;
		this.len = c;
		this.canvas=canvas;
		this.setDaemon(true);
	}

	public void run(){
		while (true){
			try {
				System.out.println("going to sleep..");
				sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("sleep interrupted");
				
				e.printStackTrace();
			}
			System.out.println("woke up");
			if (this.len == 20)
				this.len=40;
			else
				this.len=20;
			
			canvas.repaint();
		}
	}
	
	public void setX(int a){
		this.x=a;
	}
	
	public void setY(int b){
		this.y=b;
	}
	
	public void setLength(int c){
		this.len=c;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public int getLen(){
		return this.len;
	}
	
	
	

}