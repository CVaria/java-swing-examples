package prog2_2015_B;

public class MyThread extends Thread {

		public final Canvas canvas;
		public int temp;

		public MyThread(Canvas canvas) {
			this.canvas = canvas;
			temp=1;
			this.setDaemon(true);
		}
		
		public void run(){
			while (true){
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("sleep interrupted");

					e.printStackTrace();
				}
				
				
				canvas.arr.get(temp).r=10;
				if(temp>1)
					canvas.arr.get(temp-1).r=5;
				
				canvas.repaint();
				
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("sleep interrupted");

					e.printStackTrace();
				}
				
				while(temp>=canvas.arr.size()-1)
					try {
						sleep(100);
					} catch (InterruptedException e) {};
					
				System.out.println(canvas.arr.size());
				canvas.arr.get(temp).r=5;
				temp=temp+1;
				
			}
		}

}
