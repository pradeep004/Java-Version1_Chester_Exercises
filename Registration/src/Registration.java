import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Registration {

	private JFrame frame;
	private JTextField txtuser;
	private JPasswordField passwordField;
	Connection conn;
	Statement stmt;
	ResultSet rs;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Registration window = new Registration();
//					window.getFrame().setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(400, 400, 566,404);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER NAME");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(87, 82, 127, 28);
		getFrame().getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPassword.setBounds(87, 124, 127, 28);
		getFrame().getContentPane().add(lblPassword);
		
		txtuser = new JTextField();
		txtuser.setBounds(226, 83, 145, 30);
		getFrame().getContentPane().add(txtuser);
		txtuser.setColumns(10);
		
		JButton login = new JButton("LOGIN");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/studentReg", "root","Empire@1");
					
					String username = txtuser.getText();
					String passwords = String.valueOf(passwordField.getPassword());
					
					stmt = conn.createStatement();
					String sql = "select * from login where username = '"+username+"' or passwords = '"+passwords+"'";
					rs = stmt.executeQuery(sql);
					
					if (rs.next()) {
						dispose();
						Hompege hpage = new Hompege();
						hpage.show();
						
					}
					else {
						JOptionPane.showMessageDialog(login, "Try Again...!");
						txtuser.setText("");
						passwordField.setText("");
						txtuser.requestFocus();
						
					}
					conn.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		login.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		login.setBounds(116, 188, 85, 21);
		getFrame().getContentPane().add(login);
		
		JButton reset = new JButton("RESET");
		reset.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				txtuser.setText("");
				passwordField.setText("");
			}
		});
		reset.setFont(new Font("Tahoma", Font.ITALIC, 15));
		reset.setBounds(254, 189, 85, 21);
		getFrame().getContentPane().add(reset);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(224, 125, 147, 30);
		getFrame().getContentPane().add(passwordField);
	}

	protected void dispose() {
		// TODO Auto-generated method stub
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
