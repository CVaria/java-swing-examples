package prog2_B_2015;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	Canvas canvas = new Canvas();
	JComboBox combo;
	JTextField txtf;
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
		panel.add(new JLabel("Select color: "));
		String [] options = {"yellow", "green"};
		combo = new JComboBox(options);
		combo.addActionListener(this);
		panel.add(combo);
		
		panel.add(new JLabel("Select radius: "));
		txtf = new JTextField(10);
		txtf.addActionListener(this);
		panel.add(txtf);
		
		getContentPane().add(panel, BorderLayout.NORTH);
		new MyThread(canvas).start();
		pack();
	}
	
	@Override
	public void actionPerformed(ActionEvent ev) {
		if (ev.getSource() == combo ) {
			if (combo.getSelectedItem().equals("yellow"))
				canvas.circleColor = Color.orange; //gia na fainetai kalytera to ekana portokali
			else canvas.circleColor = Color.green;
			//canvas.repaint();
		}
		else {
			if (! txtf.getText().equals(""))
				canvas.radius =  Integer.parseInt(txtf.getText());
		}
	}
}
