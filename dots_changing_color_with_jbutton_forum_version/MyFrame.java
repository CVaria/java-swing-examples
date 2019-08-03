package iprog2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;

	Canvas canvas = new Canvas();
	MyThread timer;

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
		timer=new MyThread(canvas);
		timer.start();
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.add(new JLabel("Swap Colors: "));
		JButton button=new JButton("Swap");
		button.addActionListener(this);
		panel.add(button);
		String options[] = {"black", "white"};
		JComboBox<String> combo = new JComboBox<String>(options);
		combo.addActionListener(this);
		panel.add(combo);
		getContentPane().add(panel, BorderLayout.NORTH);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource() instanceof JButton) {
			canvas.colorSwap();
			System.out.println("Colors Swapped");
		} else if(ev.getSource() instanceof JComboBox<?>) {
	        @SuppressWarnings("unchecked")
			JComboBox<String> source = (JComboBox<String>) ev.getSource();
	        String colorName = (String)source.getSelectedItem();
	        canvas.setColor(colorName);		
	        //System.out.println("Color is " + colorName);
		}
	}
		
	
}
