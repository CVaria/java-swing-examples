package iprog2;

public class MyThread extends Thread {
	
	public final Canvas canvas;
	private int sleepingTime=5000;
	private int oldcount = 0;
	private int newcount = 0;
	
	public MyThread(Canvas canvas) {
		this.canvas=canvas;
		this.setDaemon(true);
	}

	public void run() {
		while(true) {
			try {
				sleep(sleepingTime);
			} catch (InterruptedException e){
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			System.out.println("woke up");
			newcount = canvas.getCount() + 1;
			for(int i = oldcount; i < newcount; ++i){
				int x = canvas.getX(i);
				int y = canvas.getY(i);
				String color = canvas.getColor(i);
				System.out.println("(" + x + "," + y + ") -> " + color);
			}
			oldcount = newcount;
		}
	}

	public int getSleepingTime() {
		return sleepingTime;
	}

	public void setSleepingTime(int sleepingTime) {
		this.sleepingTime = sleepingTime;
	}
}
