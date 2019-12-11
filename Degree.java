import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Degree 
{

	private JFrame frame;
	private JTextField t1;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Degree window = new Degree();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Degree() 
	{
		initialize();
	}

	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDegrees = new JLabel("Degrees :");
		lblDegrees.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDegrees.setBounds(34, 27, 76, 35);
		frame.getContentPane().add(lblDegrees);
		
		t1 = new JTextField();
		t1.setBounds(115, 25, 160, 35);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lb = new JLabel("");
		lb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lb.setBounds(229, 114, 46, 14);
		frame.getContentPane().add(lb);
		
		JButton bc = new JButton("To Celsius");
		bc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				float trans= Float.parseFloat(t1.getText());
				float temp= (float)(trans-273.15);
				String str= String.valueOf(temp);
				lb.setText(str);
				
				
				
				
			}
		});
		bc.setFont(new Font("Tahoma", Font.BOLD, 14));
		bc.setBounds(41, 199, 120, 35);
		frame.getContentPane().add(bc);
		
		JButton bf = new JButton("To Farenheit");
		bf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				float trans= Float.parseFloat(t1.getText());
				float temp= (float)((trans-273.15)*9/5+32);
				String str= String.valueOf(temp);
				lb.setText(str);
				
			}
		});
		bf.setFont(new Font("Tahoma", Font.BOLD, 14));
		bf.setBounds(226, 199, 143, 35);
		frame.getContentPane().add(bf);
		
		JLabel lblNewLabel = new JLabel("Result:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(160, 102, 59, 35);
		frame.getContentPane().add(lblNewLabel);
		
		
	}

}