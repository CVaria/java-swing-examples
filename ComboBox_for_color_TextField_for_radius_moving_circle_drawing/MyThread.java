package prog2_B_2015;

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
				sleep(4000);
			} catch (InterruptedException e) {
				System.out.println("sleep interrupted");
				
				e.printStackTrace();
			}
			System.out.println("woke up");
		//	for (Circle circ : canvas.allMyCircles) {
		//		circ.x += 10;
		//	}	
			canvas.repaint();
		}
	}
	
	
}
