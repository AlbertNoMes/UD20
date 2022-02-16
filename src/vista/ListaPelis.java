package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListaPelis extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaPelis frame = new ListaPelis();
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
	public ListaPelis() {
		setTitle("                                                     Pel\u00EDculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Escribe el t\u00EDtulo de una pel\u00EDcula");
		lblNewLabel.setBounds(24, 35, 219, 14);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(24, 73, 180, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("A\u00F1adir");

		btnNewButton.setBounds(24, 116, 89, 23);
		contentPane.add(btnNewButton);

		JLabel lblPeliculas = new JLabel("Pel\u00EDculas");
		lblPeliculas.setBounds(304, 35, 70, 14);
		contentPane.add(lblPeliculas);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(247, 72, 159, 22);
		contentPane.add(comboBox);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String peli = textField.getText();
				comboBox.addItem(peli);
			}
		});
	}
}
