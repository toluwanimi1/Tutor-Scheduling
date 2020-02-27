import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Window.Type;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register frame = new register();
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
	public register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/jvianney/Library/Mobile Documents/com~apple~CloudDocs/CTEC402/bullgod.png"));
		setTitle("Help Your Dawg");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBowieStateUniversity = new JLabel("Bowie State University");
		lblBowieStateUniversity.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblBowieStateUniversity.setBounds(92, 6, 302, 35);
		contentPane.add(lblBowieStateUniversity);
		
		JButton btnStudent = new JButton("Student");
		btnStudent.setForeground(Color.BLACK);
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Student_login stu = new Student_login();    // When button is clicked, it will redirect to Student login page.
				stu.setVisible(true);
			}
		});
		btnStudent.setBounds(166, 101, 117, 29);
		contentPane.add(btnStudent);
		
		JButton btnTutort = new JButton("Tutor");
		btnTutort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tutor_login tut = new tutor_login();		// When button is clicked, it will redirect to Tutor login page.
				tut.setVisible(true);
			}
		});
		btnTutort.setBounds(166, 153, 117, 29);
		contentPane.add(btnTutort);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/jvianney/Library/Mobile Documents/com~apple~CloudDocs/CTEC402/bullgod.png"));
		lblNewLabel.setBounds(32, 39, 412, 249);
		contentPane.add(lblNewLabel);
		
		
	
		
		
	}
}
