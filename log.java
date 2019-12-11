import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;
public class log 
{
    private JFrame frame;
    private JTextField t1;
    private JPasswordField t2;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    log window = new log();
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
    public log() {
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
        
        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblUsername.setBounds(46, 66, 75, 14);
        frame.getContentPane().add(lblUsername);
        
        JLabel lb = new JLabel("");
        lb.setBounds(150, 209, 172, 14);
        frame.getContentPane().add(lb);
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 11));
        btnSubmit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                String uname=t1.getText();
                String pass=t2.getText();
                if(uname.equals("Kiran Davis")&&pass.equals("12345"))
                {
                    lb.setText("Success");
                }
                else
                {
                    lb.setText("Failed");
                }
            }
        });
        btnSubmit.setBounds(170, 146, 89, 23);
        frame.getContentPane().add(btnSubmit);
        
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblPassword.setBounds(46, 103, 75, 14);
        frame.getContentPane().add(lblPassword);
        
        t1 = new JTextField();
        t1.setBounds(150, 49, 137, 34);
        frame.getContentPane().add(t1);
        t1.setColumns(10);
        
        t2 = new JPasswordField();
        t2.setBounds(150, 94, 137, 34);
        frame.getContentPane().add(t2);
        
        
    }
}