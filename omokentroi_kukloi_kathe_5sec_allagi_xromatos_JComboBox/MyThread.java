package prog2_2015_A;

public class MyThread extends Thread {

	public final Canvas canvas;

	public MyThread(Canvas canvas) {
		this.canvas = canvas;
		this.setDaemon(true);
	}
	public void run(){
		while (true){
			try {
				System.out.println("going to sleep..");
				sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("sleep interrupted");
				
				e.printStackTrace();
			}
			System.out.println("woke up");
			for (Circle circ : canvas.allMyCircles) {
				if(circ.isCenter){
					System.out.println("Circle at (x,y)=("+circ.x+","+circ.y+")");
				}
			}	
		}
	}
	
	
}