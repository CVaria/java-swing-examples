package exam_feb_2015_B;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements KeyListener{
	Canvas canvas = new Canvas();
	
	public Canvas getCanvas() {
		return canvas;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}
	public static void main(String[] args) {
		new MyFrame();

	}

	public MyFrame() throws HeadlessException {
		super("This is my frame");
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().add(canvas);
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		addKeyListener(this);
		getContentPane().add(panel, BorderLayout.NORTH);
		new MyThread(canvas).start();
		pack();
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyChar()=='l') {
			canvas.circ.setDir(1);
		}
		else if (arg0.getKeyChar()=='r') {
			canvas.circ.setDir(2);
		}
		else if (arg0.getKeyChar()=='u') {
			canvas.circ.setDir(4);
		}
		else if (arg0.getKeyChar()=='d') {
			canvas.circ.setDir(3);
		}
		System.out.println(canvas.circ.getDir());
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}