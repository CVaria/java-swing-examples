package sep_2014_2;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements KeyListener, MouseListener{
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
		addMouseListener(this);
		getContentPane().add(panel, BorderLayout.NORTH);
		new MyThread(canvas).start();
		pack();
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(canvas.movingCircle==1){
			if (arg0.getKeyChar()=='l') {
				canvas.circ1.setDir(1);
			}
			else if (arg0.getKeyChar()=='r') {
				canvas.circ1.setDir(2);
			}
			else if (arg0.getKeyChar()=='u') {
				canvas.circ1.setDir(4);
			}
			else if (arg0.getKeyChar()=='d') {
				canvas.circ1.setDir(3);
			}
		}else{
			if (arg0.getKeyChar()=='l') {
				canvas.circ2.setDir(1);
			}
			else if (arg0.getKeyChar()=='r') {
				canvas.circ2.setDir(2);
			}
			else if (arg0.getKeyChar()=='u') {
				canvas.circ2.setDir(4);
			}
			else if (arg0.getKeyChar()=='d') {
				canvas.circ2.setDir(3);
			}
			
		}
		System.out.println(canvas.circ1.getDir());
		System.out.println(canvas.circ2.getDir());
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(canvas.movingCircle==1){
			canvas.movingCircle=2;
			canvas.circ2.setMov(true);
			canvas.circ2.setDir(canvas.circ1.getDir());
			canvas.circ1.setMov(false);
		}
		else{
			canvas.movingCircle=1;
			canvas.circ1.setMov(true);
			canvas.circ2.setMov(false);
			canvas.circ1.setDir(canvas.circ2.getDir());
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	
}