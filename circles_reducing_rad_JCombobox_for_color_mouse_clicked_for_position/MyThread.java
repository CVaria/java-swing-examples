package exam_2014_2;

public class MyThread extends Thread {

	public final Canvas canvas;

	public MyThread(Canvas canvas) {
		this.canvas = canvas;
		this.setDaemon(true);
	}
	public void run(){
		while (true){
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("sleep interrupted");

				e.printStackTrace();
			}
			for (int i=0; i<canvas.arr.size();i++){
				if(canvas.arr.get(i).rad>0)
					System.out.println("X="+canvas.arr.get(i).x+"\tY="+canvas.arr.get(i).x);
			}
		}
	}


}
