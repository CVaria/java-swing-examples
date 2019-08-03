package prog2_2015;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Random;

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
	//	new MyThread(canvas).start();
		pack();
	}
	

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyChar()=='A') {
			int x = (int) Math.floor(Math.random()*460);
			int y = (int) Math.floor(Math.random()*460);
			Rect rect = new Rect(x,y,20, canvas);
			canvas.addRect(rect);
			rect.start();
			canvas.repaint();
		}
		else if (arg0.getKeyChar()=='R') {
			canvas.remove();
			canvas.repaint();
		}
		
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

