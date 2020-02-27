import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TutorRegister extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TutorRegister frame = new TutorRegister();
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
	public TutorRegister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTutorResgistration = new JLabel("Tutor Resgistration");
		lblTutorResgistration.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblTutorResgistration.setBounds(123, 6, 265, 40);
		contentPane.add(lblTutorResgistration);
		
		JLabel lblReferralCode = new JLabel("Referral Code");
		lblReferralCode.setBounds(105, 69, 92, 16);
		contentPane.add(lblReferralCode);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(105, 99, 92, 16);
		contentPane.add(lblUserName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(105, 127, 92, 16);
		contentPane.add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(105, 155, 92, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(209, 150, 125, 26);
		contentPane.add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(209, 64, 125, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(209, 94, 125, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(209, 122, 125, 26);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Sign Up!");
		btnNewButton.setBounds(105, 206, 243, 29);
		contentPane.add(btnNewButton);
	}
}
