package progK2_2012;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyFrame extends JFrame implements ActionListener{
	Canvas canvas = new Canvas();
	JTextField text;

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
		panel.add(new JLabel("Select number of circles "));
		text = new JTextField(10);
		text.addActionListener(this);
		panel.add(text);
		getContentPane().add(panel, BorderLayout.NORTH);
		new MyThread(canvas).start();
		pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent ev) {
		if (! text.getText().equals("")){
			canvas.prefNum =  Integer.parseInt(text.getText());
			canvas.checkNum();
		}
	}
}
