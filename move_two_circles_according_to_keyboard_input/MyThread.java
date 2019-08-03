package sep_2014_2;


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
			System.out.println("Position of Cycle1 x = "+ canvas.circ1.getX()+" y = "+ canvas.circ1.getY());
			System.out.println("Position of Cycle2 x = "+ canvas.circ2.getX()+" y = "+ canvas.circ2.getY());
			
		}
	}
	
	
}