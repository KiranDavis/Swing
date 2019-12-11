import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ticket {

	private JFrame frame;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JTextField t10;
	private JTextField t11;
	private JTextField t12;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket window = new ticket();
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
	public ticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.RED);
		frame.setBounds(100, 100, 917, 626);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(2, 2, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(284, 11, 343, 59);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Simplified Arabic", Font.BOLD, 36));
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(27, 88, 58, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextPane t1 = new JTextPane();
		t1.setBounds(95, 88, 143, 31);
		frame.getContentPane().add(t1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(498, 95, 66, 19);
		frame.getContentPane().add(lblName);
		
		t5 = new JTextField();
		t5.setBounds(563, 90, 161, 31);
		frame.getContentPane().add(t5);
		t5.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(498, 150, 66, 19);
		frame.getContentPane().add(lblNewLabel_2);
		
		t6 = new JTextField();
		t6.setBounds(563, 146, 137, 31);
		frame.getContentPane().add(t6);
		t6.setColumns(10);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTo.setBounds(498, 213, 46, 19);
		frame.getContentPane().add(lblTo);
		
		t7 = new JTextField();
		t7.setBounds(563, 203, 137, 31);
		frame.getContentPane().add(t7);
		t7.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Date");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(498, 243, 46, 41);
		frame.getContentPane().add(lblNewLabel_3);
		
		t8 = new JTextField();
		t8.setBounds(563, 245, 137, 29);
		frame.getContentPane().add(t8);
		t8.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Time");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(498, 298, 58, 19);
		frame.getContentPane().add(lblNewLabel_4);
		
		t9 = new JTextField();
		t9.setBounds(563, 290, 137, 29);
		frame.getContentPane().add(t9);
		t9.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Ticket No");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(771, 146, 75, 23);
		frame.getContentPane().add(lblNewLabel_5);
		
		t10 = new JTextField();
		t10.setBounds(760, 169, 106, 31);
		frame.getContentPane().add(t10);
		t10.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Price");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(771, 213, 66, 18);
		frame.getContentPane().add(lblNewLabel_6);
		
		t11 = new JTextField();
		t11.setBounds(760, 232, 106, 31);
		frame.getContentPane().add(t11);
		t11.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Route");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(771, 270, 75, 19);
		frame.getContentPane().add(lblNewLabel_7);
		
		t12 = new JTextField();
		t12.setBounds(760, 290, 106, 29);
		frame.getContentPane().add(t12);
		t12.setColumns(10);
		
		JButton b4 = new JButton("Confirm");
		b4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
             			
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 17));
		b4.setBounds(690, 361, 106, 31);
		frame.getContentPane().add(b4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(468, 69, 423, 383);
		frame.getContentPane().add(panel_1);
		
		JRadioButton r1 = new JRadioButton("Standard");
		r1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		r1.setBounds(16, 150, 87, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Single Ticket");
		r2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		r2.setBounds(101, 150, 109, 23);
		frame.getContentPane().add(r2);
		
		
		
		JRadioButton r3 = new JRadioButton("Adult");
		r3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		r3.setBounds(214, 150, 109, 23);
		frame.getContentPane().add(r3);
		
		JRadioButton r5 = new JRadioButton("First Class");
		r5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		r5.setBounds(16, 189, 87, 23);
		frame.getContentPane().add(r5);
		
		JRadioButton r6 = new JRadioButton("AC");
		r6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		r6.setBounds(101, 189, 51, 23);
		frame.getContentPane().add(r6);
		
		JRadioButton r7 = new JRadioButton("Sleeper");
		r7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		r7.setBounds(154, 188, 66, 23);
		frame.getContentPane().add(r7);
		
		JRadioButton r4 = new JRadioButton("Child");
		r4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		r4.setBounds(225, 189, 109, 23);
		frame.getContentPane().add(r4);
		
		ButtonGroup g1= new ButtonGroup();
		g1.add(r1);
		g1.add(r2);
		ButtonGroup g2= new ButtonGroup();
		g2.add(r3);
		g2.add(r4);
		ButtonGroup g3= new ButtonGroup();
		g3.add(r5);
		g3.add(r6);
		g3.add(r7);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		c1.setModel(new DefaultComboBoxModel(new String[] {" From", "Ernakulam", "Trivandrum", "Thrissur", "Calicut", "Kannur"}));
		c1.setBounds(27, 232, 103, 20);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		c2.setModel(new DefaultComboBoxModel(new String[] {" To", "Ernakulam", "Trivandrum", "Thrissur", "Calicut", "Kannur"}));
		c2.setBounds(140, 232, 98, 20);
		frame.getContentPane().add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		c3.setModel(new DefaultComboBoxModel(new String[] {"No. of Seats", "1", "2", "3", "4", "5", "6"}));
		c3.setBounds(249, 232, 98, 20);
		frame.getContentPane().add(c3);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(27, 130, 366, 13);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(27, 270, 366, 13);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_8 = new JLabel("Tax");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(27, 302, 46, 17);
		frame.getContentPane().add(lblNewLabel_8);
		
		t2 = new JTextField();
		t2.setBounds(111, 299, 109, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Sub Total");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(27, 334, 75, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		t3 = new JTextField();
		t3.setBounds(111, 333, 109, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotal.setBounds(27, 373, 58, 19);
		frame.getContentPane().add(lblTotal);
		
		t4 = new JTextField();
		t4.setBounds(111, 369, 109, 20);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(27, 416, 366, 2);
		frame.getContentPane().add(separator_2);
		
		JButton b1 = new JButton("Total");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String a;
				float tax=0;
				float price=0;
				
				if(r5.isSelected())
				{
					
					tax= 30*price/100;
					switch(c3.getSelectedIndex())
					{
					case 1: tax= tax*1;
					        break;
					case 2: tax= tax*2;
					        break;
					case 3: tax= tax*3;
					        break;
					case 4: tax= tax*4;
					        break;
					case 5: tax= tax*5;
					        break;
					case 6: tax= tax*6;
					        break;
					        default:break;
				}
				}
				
				if (r6.isSelected()) { 
					 
					price=750;
					tax=20*price/100;
					switch(c3.getSelectedIndex())
					{
					case 1: tax=tax*1;
					        break;
					case 2: tax=tax*2;
			                break;
					case 3: tax=tax*3;
			                break;
					case 4: tax=tax*4;
			                break;
			        case 5: tax=tax*5;
			                break;
			        default:break;
					
					}
					}
				
				if(r7.isSelected())
				{
					
					tax= 10*price/100;
					switch(c3.getSelectedIndex())
					{
					case 1: tax= tax*1;
					        break;
					case 2: tax= tax*2;
					        break;
					case 3: tax= tax*3;
					        break;
					case 4: tax= tax*4;
					        break;
					case 5: tax= tax*5;
					        break;
					case 6: tax= tax*6;
					        break;
					        default:break;
				}
				}
				
				if(c1.getSelectedItem()=="Ernakulam")
				{
					if(c2.getSelectedItem()=="Trivandrum")
					{
						price= 500;
						switch(c3.getSelectedIndex())
						{
						case 1: price= price*1;
						        break;
						case 2: price= price*2;
						        break;
						case 3: price= price*3;
						        break;
						case 4: price= price*4;
						        break;
						case 5: price= price*5;
						        break;
						case 6: price= price*6;
						        break;
						        default:break;
					}
					}
					
					/*if(c1.getSelectedItem()=="Ernakulam")
					{
						if(c2.getSelectedItem()=="Trivandrum")
						{
							price= 500;
							switch(c3.getSelectedIndex())
							{
							case 1: price= price*1;
							        break;
							case 2: price= price*2;
							        break;
							case 3: price= price*3;
							        break;
							case 4: price= price*4;
							        break;
							case 5: price= price*5;
							        break;
							case 6: price= price*6;
							        break;
							        default:break;
						}
						}*/
				}
				
				
				
				a= String.valueOf(tax);
				t2.setText(a);
				a= String.valueOf(price);
				t3.setText(a);
				float total=tax+price;
				a= String.valueOf(total);
				t4.setText(a);
				
			    }});
			
		
		b1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b1.setBounds(95, 429, 75, 23);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("Reset");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				g1.clearSelection();
				g2.clearSelection();
				g3.clearSelection();				
			}
		});
		b2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b2.setBounds(174, 429, 75, 23);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("Exit");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		b3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		b3.setBounds(254, 429, 58, 23);
		frame.getContentPane().add(b3);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No.", "From", "To", "No.of Seats", "Time", "Date", "AC - Non AC", "Price"},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(37, 485, 829, 48);
		frame.getContentPane().add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBounds(27, 464, 864, 93);
		frame.getContentPane().add(panel_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.RED);
		separator_3.setBackground(Color.RED);
		separator_3.setBounds(423, 270, -6, -138);
		frame.getContentPane().add(separator_3);
		
	}}
