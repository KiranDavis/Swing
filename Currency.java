import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Currency {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	String a,b;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Currency window = new Currency();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Currency() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(262, 53, 134, 31);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(262, 138, 134, 31);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "Indian Rupee", "Pakistan Rupee", "US Dollar", "Kuwait Dinar", "Saudi Riyal"}));
		c1.setToolTipText("");
		c1.setBounds(262, 11, 134, 31);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		c2.setModel(new DefaultComboBoxModel(new String[] {"Please Select", "Indian Rupee", "Pakistan Rupee", "US Dollar", "Kuwait Dinar", "Saudi Riyal"}));
		c2.setBounds(262, 96, 134, 31);
		frame.getContentPane().add(c2);
		
		JButton b1 = new JButton("Clear");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				t1.setText("");
				t2.setText("");
				
			}
		});
		b1.setFont(new Font("Stencil", Font.PLAIN, 15));
		b1.setBounds(307, 224, 89, 27);
		frame.getContentPane().add(b1);
		
		JLabel lblInput = new JLabel("Select the Input Currency    :");
		lblInput.setForeground(Color.RED);
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblInput.setBounds(10, 11, 242, 38);
		frame.getContentPane().add(lblInput);
		
		JLabel lblOutput = new JLabel("Select the Output Currency :");
		lblOutput.setForeground(Color.RED);
		lblOutput.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOutput.setBounds(10, 96, 242, 35);
		frame.getContentPane().add(lblOutput);
		
		JLabel lblNewLabel = new JLabel("Enter the Amount  :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 53, 221, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Converted Amount : ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 138, 221, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				a= (String)c1.getSelectedItem();
				b= (String)c2.getSelectedItem();
				String c= t1.getText();
				if((a.equals("Indian Rupee"))&&(b.equals("Indian Rupee")))
				{
					t2.setText(c);
				}
				else if((a.equals("Indian Rupee"))&&(b.equals("Pakistan Rupee")))
				{
					double d= Double.parseDouble(c);
					double e= d*2.17;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				else if((a.equals("Indian Rupee"))&&(b.equals("US Dollar")))
				{
					double d= Double.parseDouble(c);
					double e= 0.014*d;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				else if((a.equals("Indian Rupee"))&&(b.equals("Kuwait Dinar")))
				{
					double d= Double.parseDouble(c);
					double e= 0.0042*d;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				else if((a.equals("Indian Rupee"))&&(b.equals("Saudi Riyal")))
				{
					double d= Double.parseDouble(c);
					double e= 0.052*d;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				
				if((a.equals("Pakistan Rupee"))&&(b.equals("Pakistan Rupee")))
				{
					t2.setText(c);
				}
				
				else if((a.equals("Pakistan Rupee"))&&(b.equals("Indian Rupee")))
				{
					double d= Double.parseDouble(c);
					double e= d*2.17;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				else if((a.equals("Pakistan Rupee"))&&(b.equals("US Dollar")))
		        {		
					double d= Double.parseDouble(c);
					double e= 0.0064*d;
					String f= String.valueOf(e);
					t2.setText(f);
				}
		else if((a.equals("Pakistan Rupee"))&&(b.equals("Kuwait Dinar")))
		{
			double d= Double.parseDouble(c);
			double e= d*0.0020;
			String f= String.valueOf(e);
			t2.setText(f);
		}
		else if((a.equals("Pakistan Rupee"))&&(b.equals("Saudi Riyal")))
		{
			double d= Double.parseDouble(c);
			double e= d*0.024;
			String f= String.valueOf(e);
			t2.setText(f);
		}
				if((a.equals("US Dollar"))&&(b.equals("US Dollar")))
				{
					t2.setText(c);
				}
				else if((a.equals("US Dollar"))&&(b.equals("Indian Rupee")))
		{
			double d= Double.parseDouble(c);
			double e= d*71.84;
			String f= String.valueOf(e);
			t2.setText(f);
		}
				else if((a.equals("US Dollar"))&&(b.equals("Pakistan Rupee")))
				{
					double d= Double.parseDouble(c);
					double e= d*155.61;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				else if((a.equals("US Dollar"))&&(b.equals("Kuwait Dinar")))
				{
					double d= Double.parseDouble(c);
					double e= d*0.30;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				else if((a.equals("US Dollar"))&&(b.equals("Saudi Riyal")))
				{
					double d= Double.parseDouble(c);
					double e= d*3.75;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				
				if((a.equals("Kuwait Dinar"))&&(b.equals("Kuwait Dinar")))
				{
					t2.setText(c);
				}
				else if((a.equals("Kuwait Dinar"))&&(b.equals("Indian Rupee")))
				{
					double d= Double.parseDouble(c);
					double e=d*236.31;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				else if((a.equals("Kuwait Dinar"))&&(b.equals("Pakistan Rupee")))
				{
					double d= Double.parseDouble(c);
					double e= d*512.36;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				else if((a.equals("Kuwait Dinar"))&&(b.equals("US Dollar")))
				{
					double d= Double.parseDouble(c);
					double e= d*3.29;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				else if((a.equals("Kuwait Dinar"))&&(b.equals("Saudi Riyal")))
				{
					double d= Double.parseDouble(c);
					double e= d*12.35;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				
				if((a.equals("Saudi Riyal"))&&(b.equals("Saudi Riyal")))
				{
					t2.setText(c);
				}
				else if((a.equals("Saudi Riyal"))&&(b.equals("Indian Rupee")))
				{
					double d= Double.parseDouble(c);
					double e=d*0.052;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				else if((a.equals("Saudi RIyal"))&&(b.equals("Pakistan Rupee")))
				{
					double d= Double.parseDouble(c);
					double e= d*0.024;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				else if((a.equals("Saudi Riyal"))&&(b.equals("US Dollar")))
				{
					double d= Double.parseDouble(c);
					double e= d*3.75;
					String f= String.valueOf(e);
					t2.setText(f);
				}
				else if((a.equals("Saudi Riyal"))&&(b.equals("Kuwait Dinar")))
		{
			double d= Double.parseDouble(c);
			double e= d*0.081;
			String f= String.valueOf(e);
			t2.setText(f);
		}
			}});
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 15));
		btnNewButton.setBounds(173, 224, 106, 27);
		frame.getContentPane().add(btnNewButton);
		}}
