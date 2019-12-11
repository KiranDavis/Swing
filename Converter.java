import java.awt.event.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Converter {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter window = new Converter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Converter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox c1 = new JCheckBox(" C++");
		c1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		c1.setBounds(50, 28, 97, 35);
		frame.getContentPane().add(c1);
				
		JCheckBox c2 = new JCheckBox(" Java");
		c2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		c2.setBounds(50, 101, 97, 23);
		frame.getContentPane().add(c2);
		
		JLabel l1 = new JLabel("");
		l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l1.setBounds(171, 123, 236, 48);
		frame.getContentPane().add(l1);
		
		c1.addItemListener(new ItemListener() 
		{
		public void itemStateChanged(ItemEvent e)
		{
			l1.setText("C++ " +(e.getStateChange()==1 ? "Checked" : "Unchecked"));
		}
	});
		
		c2.addItemListener(new ItemListener() 
		{
		public void itemStateChanged(ItemEvent e)
		{
			l1.setText("Java " +(e.getStateChange()==1 ? "Checked" : "Unchecked"));
		}
	});
}
}