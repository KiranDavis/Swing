import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class Hotel {
	String a, str1, str2, str3, str4;

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel window = new Hotel();
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
	public Hotel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 896, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hotel Management System");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Century", Font.BOLD, 35));
		lblNewLabel.setBounds(225, 11, 516, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chicken Burger");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(22, 78, 94, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Chicken Burger Meal");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(22, 113, 130, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cheese Burger");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(22, 132, 130, 44);
		frame.getContentPane().add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(22, 187, 1, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.DARK_GRAY);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(22, 174, 266, 2);
		frame.getContentPane().add(separator_1);
		
		t1 = new JTextField();
		t1.setBounds(174, 84, 114, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(174, 114, 114, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(174, 145, 114, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Drink");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(22, 187, 46, 21);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Qty");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(174, 187, 46, 21);
		frame.getContentPane().add(lblNewLabel_5);
		
		t4 = new JTextField();
		t4.setBounds(174, 221, 114, 20);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		JComboBox C1 = new JComboBox();
		C1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		C1.setModel(new DefaultComboBoxModel(new String[] {" Please Select", "Tea", "Coffee", "Black Tea"}));
		C1.setBounds(22, 221, 105, 20);
		frame.getContentPane().add(C1);
		
		JRadioButton r1 = new JRadioButton("Home Delivery");
		r1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		r1.setBounds(22, 262, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Tax");
		r2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		r2.setBounds(179, 262, 109, 23);
		frame.getContentPane().add(r2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(13, 64, 289, 238);
		frame.getContentPane().add(panel);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setForeground(Color.BLUE);
		lblCurrencyConverter.setFont(new Font("Californian FB", Font.BOLD, 20));
		lblCurrencyConverter.setBounds(331, 78, 213, 31);
		frame.getContentPane().add(lblCurrencyConverter);
		
		JComboBox C2 = new JComboBox();
		C2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		C2.setModel(new DefaultComboBoxModel(new String[] {" Please Select", "US Dollar", "Saudi Riyal", "Kuwait Dinar"}));
		C2.setBounds(331, 114, 153, 20);
		frame.getContentPane().add(C2);
		
		t5 = new JTextField();
		t5.setBounds(331, 157, 153, 20);
		frame.getContentPane().add(t5);
		t5.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				a= (String)C2.getSelectedItem();
				String c= t5.getText();
				if(a.equals("US Dollar" ))
				{
					double d= Double.parseDouble(c);
					double k= 0.014*d;
					String f= String.valueOf(k);
					t5.setText(f);					
				}
				if(a.equals("Saudi Riyal"))
				{
					double d=Double.parseDouble(c);
					double k= 0.052*d;
					String f= String.valueOf(k);
					t5.setText(f);
				}
				if(a.equals("Kuwait Dinar"))
				{
					double d= Double.parseDouble(c);
					double k= 0.0042*d;
					String f= String.valueOf(k);
					t5.setText(f);
					
				}
				
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConvert.setBounds(331, 220, 97, 23);
		frame.getContentPane().add(btnConvert);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				t5.setText("");
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClose.setBounds(438, 220, 89, 23);
		frame.getContentPane().add(btnClose);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(2, 1, 1, 2, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(312, 64, 238, 238);
		frame.getContentPane().add(panel_1);
		
		JLabel l1 = new JLabel("");
		l1.setBackground(Color.BLACK);
		l1.setBounds(140, 325, 123, 18);
		frame.getContentPane().add(l1);
		
		JLabel lblNewLabel_7 = new JLabel("Cost of Drinks");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(22, 322, 105, 21);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Cost of Meal");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(22, 354, 94, 21);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Cost of Delivery");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(22, 382, 109, 31);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel l2 = new JLabel("");
		l2.setBounds(140, 354, 114, 21);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setBounds(140, 382, 123, 29);
		frame.getContentPane().add(l3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 2, 2, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(13, 319, 289, 99);
		frame.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_10 = new JLabel("Tax");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(331, 325, 46, 21);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Sub Total");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(331, 354, 71, 19);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Total");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_12.setBounds(331, 382, 46, 24);
		frame.getContentPane().add(lblNewLabel_12);
		
		JLabel l4 = new JLabel("");
		l4.setBounds(427, 325, 87, 18);
		frame.getContentPane().add(l4);
		
		JLabel l5 = new JLabel("");
		l5.setBounds(427, 354, 87, 21);
		frame.getContentPane().add(l5);
		
		JLabel l6 = new JLabel("");
		l6.setBounds(427, 382, 87, 21);
		frame.getContentPane().add(l6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 2, 2, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(311, 320, 239, 98);
		frame.getContentPane().add(panel_3);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int b1= 100;
				int b2= 150;
				int b3= 75;
				int te= 15;
				int co= 20;
				int bk= 10;
				str1= t1.getText();
				str2= t2.getText();
				str3= t3.getText();
				str4= t4.getText();
				int s1=Integer.parseInt(str1);
				int s2=Integer.parseInt(str2);
				int s3=Integer.parseInt(str3);
				int s4=Integer.parseInt(str4);
				float s5=(float)(b1*s1+b2*s2+b3*s3);
				l2.setText(String.valueOf(s5));
				
				if(C1.getSelectedItem().equals("Tea"))
				{
				 float s6=(float)(te*s4);
				 l1.setText(String.valueOf(s6));
				}
				else if(C1.getSelectedItem().equals("Coffee"))
				{
					float s6=(float)co*s4;
					l1.setText(String.valueOf(s6));
					}
				else if(C1.getSelectedItem().equals("Black Tea"))
				{
					float s6=(float)bk*s4;
					l1.setText(String.valueOf(s6));
				}
				if(r1.isSelected())
				{
					float s7= 20;
					l3.setText(String.valueOf(s7));					
				}
				if(r1.isSelected())
				{
				float s8=Float.parseFloat(l1.getText());
				float s9=Float.parseFloat(l2.getText());
				float s10=Float.parseFloat(l3.getText());
				 float st=s8+s9+s10;
				 l5.setText(String.valueOf(st));
				}
				else
				{
				float s8=Float.parseFloat(l1.getText());
				float s9=Float.parseFloat(l2.getText());
				//float s10=Float.parseFloat(l3.getText());
				float st=s8+s9;
				l5.setText(String.valueOf(st));
				}
				float s11=Float.parseFloat(l5.getText());
				if(r2.isSelected())
				{
				float Tax=(float)(s11*12)/100;
				l4.setText(String.valueOf(Tax));
				}
				
				
			}
				
			}});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(77, 434, 89, 23);
		frame.getContentPane().add(btnNewButton);
	
		JButton btnNewButton_1 = new JButton("Receipt");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(179, 434, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
			 	
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_2.setBounds(339, 434, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(JOptionPane.showConfirmDialog(frame, "Are You Sure?", "Hotel Management System", JOptionPane.YES_OPTION) == JOptionPane.YES_NO_OPTION)
				{
				System.exit(0);
			}
			}});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBounds(438, 434, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_4.setBounds(13, 428, 861, 44);
		frame.getContentPane().add(panel_4);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(583, 66, 289, 353);
		frame.getContentPane().add(tabbedPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		tabbedPane.addTab("Calculator", null, layeredPane, null);
		
		t6 = new JTextField();
		t6.setBounds(10, 41, 262, 61);
		layeredPane.add(t6);
		t6.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("B");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4.setBounds(10, 127, 57, 23);
		layeredPane.add(btnNewButton_4);
		
		JButton button = new JButton("7");
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(10, 161, 57, 23);
		layeredPane.add(button);
		
		JButton button_1 = new JButton("4");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBounds(10, 195, 57, 23);
		layeredPane.add(button_1);
		
		JButton button_2 = new JButton("1");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.setBounds(10, 229, 57, 23);
		layeredPane.add(button_2);
		
		JButton button_3 = new JButton("0");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_3.setBounds(10, 263, 57, 23);
		layeredPane.add(button_3);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.setBounds(73, 128, 57, 23);
		layeredPane.add(btnC);
		
		JButton button_5 = new JButton("8");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_5.setBounds(73, 161, 57, 23);
		layeredPane.add(button_5);
		
		JButton button_6 = new JButton("5");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.setBounds(77, 195, 57, 23);
		layeredPane.add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_7.setBounds(77, 229, 57, 23);
		layeredPane.add(button_7);
		
		JButton button_8 = new JButton(".");
		button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_8.setBounds(77, 263, 57, 23);
		layeredPane.add(button_8);
		
		JButton button_9 = new JButton("New button");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_9.setBounds(140, 128, 57, 23);
		layeredPane.add(button_9);
		
		JButton button_10 = new JButton("9");
		button_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_10.setBounds(140, 161, 57, 23);
		layeredPane.add(button_10);
		
		JButton button_11 = new JButton("6");
		button_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_11.setBounds(140, 195, 57, 23);
		layeredPane.add(button_11);
		
		JButton button_12 = new JButton("3");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_12.setBounds(140, 229, 57, 23);
		layeredPane.add(button_12);
		
		JButton button_13 = new JButton("New button");
		button_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_13.setBounds(140, 263, 57, 23);
		layeredPane.add(button_13);
		
		JButton button_14 = new JButton("+");
		button_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_14.setBounds(215, 127, 57, 23);
		layeredPane.add(button_14);
		
		JButton button_15 = new JButton("-");
		button_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_15.setForeground(Color.BLACK);
		button_15.setBounds(215, 161, 57, 23);
		layeredPane.add(button_15);
		
		JButton button_16 = new JButton("*");
		button_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_16.setBounds(215, 195, 57, 23);
		layeredPane.add(button_16);
		
		JButton button_17 = new JButton("/");
		button_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_17.setBounds(215, 229, 57, 23);
		layeredPane.add(button_17);
		
		JButton button_18 = new JButton("=");
		button_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_18.setBounds(215, 263, 57, 23);
		layeredPane.add(button_18);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		tabbedPane.addTab("Receipt", null, layeredPane_1, null);
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			 	t1.setText("");
			 	t2.setText("");
			 	t3.setText("");
			 	t4.setText("");
			 	t5.setText("");
			 	//l1.setText("");
			 	//l2.setText("");
			 	//l3.setText("");
			 	//l4.setText("");
			 	//l5.setText("");
			 	//l6.setText("");
			
		}
	);
}
}