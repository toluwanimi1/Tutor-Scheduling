//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
//import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class StudentRegister extends JFrame {

	private JPanel contentPane;
	private JTextField studentUsername;
	private JTextField studentLN;
	private JTextField studentEmail;
	private JPasswordField studentPass;
	private JTextField studentFN;
	private JTextField studentID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRegister frame = new StudentRegister();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentRegistration = new JLabel("Student Registration");
		lblStudentRegistration.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblStudentRegistration.setBounds(105, 18, 263, 31);
		contentPane.add(lblStudentRegistration);
		
		studentUsername = new JTextField();
		studentUsername.setHorizontalAlignment(SwingConstants.LEFT);
		studentUsername.setBounds(158, 61, 222, 26);
		contentPane.add(studentUsername);
		studentUsername.setColumns(10);
		
		studentLN = new JTextField();
		studentLN.setHorizontalAlignment(SwingConstants.LEFT);
		studentLN.setColumns(10);
		studentLN.setBounds(158, 145, 222, 26);
		contentPane.add(studentLN);
		
		studentEmail = new JTextField();
		studentEmail.setHorizontalAlignment(SwingConstants.LEFT);
		studentEmail.setColumns(10);
		studentEmail.setBounds(158, 171, 222, 26);
		contentPane.add(studentEmail);
		
		studentPass = new JPasswordField();
		studentPass.setHorizontalAlignment(SwingConstants.LEFT);
		studentPass.setBounds(158, 205, 222, 26);
		contentPane.add(studentPass);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(71, 66, 70, 16);
		contentPane.add(lblUsername);
		
		JLabel lblStudentId = new JLabel("Last Name");
		lblStudentId.setBounds(71, 150, 70, 16);
		contentPane.add(lblStudentId);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(71, 176, 70, 16);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(71, 210, 70, 16);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Sign up!");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				try {
					//Connection to database.
					Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/TutorLog_database", "root", "Password1");
					//SQL statement that inserts data into the database
					PreparedStatement ps = myCon.prepareStatement("insert into Students(studentID,firstname,lastname,studentUserName,studentEmail,studentPassword) values (?,?,?,?,?,?)");
					//
					ps.setString(1, studentID.getText());
					ps.setString(2, studentFN.getText());
					ps.setString(3, studentLN.getText());
					ps.setString(4, studentUsername.getText());
					ps.setString(5, studentEmail.getText());
					ps.setString(6, studentPass.getText());
					
					//checks whether the ps entered anything into the database.
					int x = ps.executeUpdate();
					if (x>0) {
						System.out.println("Update successful");
					}
					else {
						System.out.println("Update failed");
					}
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(71, 243, 321, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(71, 120, 70, 16);
		contentPane.add(lblFirstName);
		
		studentFN = new JTextField();
		studentFN.setHorizontalAlignment(SwingConstants.LEFT);
		studentFN.setColumns(10);
		studentFN.setBounds(158, 115, 222, 26);
		contentPane.add(studentFN);
		
		studentID = new JTextField();
		studentID.setHorizontalAlignment(SwingConstants.LEFT);
		studentID.setColumns(10);
		studentID.setBounds(158, 89, 222, 26);
		contentPane.add(studentID);
		
		JLabel lblStudentId_1 = new JLabel("Student ID");
		lblStudentId_1.setBounds(71, 92, 70, 16);
		contentPane.add(lblStudentId_1);
	}
}
