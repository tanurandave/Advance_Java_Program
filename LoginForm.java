package Simple;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Username :");
		label.setBounds(58, 28, 87, 21);
		contentPane.add(label);
		
		Label label_1 = new Label("Password :");
		label_1.setBounds(58, 68, 87, 21);
		contentPane.add(label_1);
		
		TextField textField = new TextField();
		textField.setBounds(164, 28, 126, 21);
		contentPane.add(textField);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(164, 68, 126, 21);
		contentPane.add(textField_1);
		
		Button button = new Button("Login");
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(264, 218, 162, 21);
		contentPane.add(textField_2);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 String email = textField.getText();
	                String mobile = textField_1.getText();
	                
	                if (isValidEmail(email) && !mobile.isEmpty()) {
	                	textField_2.setText("Successful..!!!");
	                    textField.setText("");
	                    textField_1.setText("");
	                } else {
	                    textField_2.setText("Un_Successful..!!!");
	                }
			}
		});
		button.setBounds(93, 152, 205, 37);
		contentPane.add(button);
		
		
	}

private boolean isValidEmail(String email) {
    // Regular expression for email validation
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    return email.matches(emailRegex);
}}