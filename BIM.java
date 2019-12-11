import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BIM 
{

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BIM window = new BIM();
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
	public BIM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 454, 612);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("Height(m) :");
		lb1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb1.setBounds(41, 98, 95, 32);
		frame.getContentPane().add(lb1);
		
		t1 = new JTextField();
		t1.setBounds(185, 106, 119, 32);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lb2 = new JLabel("Weight(kg) :");
		lb2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb2.setBounds(41, 152, 106, 32);
		frame.getContentPane().add(lb2);
		
		t2 = new JTextField();
		t2.setBounds(185, 152, 119, 28);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lb3 = new JLabel("BMI :");
		lb3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb3.setBounds(55, 220, 67, 28);
		frame.getContentPane().add(lb3);
		JLabel l4 = new JLabel("");
		l4.setBounds(306, 274, 86, 39);
		frame.getContentPane().add(l4);
		
		
		t3 = new JTextField();
		t3.setBounds(185, 209, 86, 55);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton b1 = new JButton("Calculate");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				float a= Float.parseFloat(t1.getText());
				float b= Float.parseFloat(t2.getText());
				float bmi = (b/(a*a));
				t3.setText(String.valueOf(bmi));
				if(bmi<18.5)
				{
					l4.setText("Under Weight");
				
				}
				else if(bmi>18.5&& bmi<24.9)
				{
					l4.setText("Normal Weight");
					
				}
				else if(bmi>=25 && bmi<29.9)
				{
				l4.setText("Over Wieght");
			}
				else if(bmi>29.9)
				{
					l4.setText("Obese");
				}
				}
		});
		b1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		b1.setBounds(33, 341, 103, 23);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("Clear");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				l4.setText("");
				
				
			}
		});
		b2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		b2.setBounds(158, 341, 89, 23);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("Exit");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		b3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		b3.setBounds(283, 341, 89, 23);
		frame.getContentPane().add(b3);
		
		JLabel lblNewLabel_1 = new JLabel("Body Mass Index");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lblNewLabel_1.setBounds(10, 23, 418, 64);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(10, 23, 418, 64);
		frame.getContentPane().add(panel_2);
		
		table = new JTable();
		table.setBounds(33, 502, 359, 32);
		frame.getContentPane().add(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Underweight", "Normal Weight", "Overweight", "Obese"},
				{"<18.5", "18.5 to 24.9", "25 to 29.9", ">30"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(20, 98, 393, 222);
		frame.getContentPane().add(panel);
	}
}


//ButtonGroup g1= new ButtonGroup();
//g1.add(r1);
//g1.add(r2);
//g1.add(r3);

//ButtonGroup g2= new ButtonGroup();
//g2.add(r4);
//g2.add(r5);
//g2.add(r6);	