package GUIqUIZ2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
public class GUIQuiz2 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIQuiz2 window = new GUIQuiz2();
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
	public GUIQuiz2() {
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
		
		JLabel lblNewLabel = new JLabel("DAILY WATER INTAKE\r\n");
		lblNewLabel.setBounds(154, 62, 173, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("How many water should I drink based on my weight?\r\n");
		lblNewLabel_1.setBounds(64, 74, 304, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(162, 137, 102, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Your weight:");
		lblNewLabel_2.setBounds(183, 112, 117, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DecimalFormat df = new DecimalFormat("0.00");
				try {
					double weight = Double.parseDouble(textField.getText());
					double answer = ((weight*2.205)/2)/33.814;
					JOptionPane.showMessageDialog(null, "You should drink " + df.format(answer) +"L of water.");
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid weight");
				}
			}
		});
		btnNewButton.setBounds(162, 168, 102, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
