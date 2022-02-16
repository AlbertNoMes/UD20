package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class Miniencuesta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Miniencuesta frame = new Miniencuesta();
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
	public Miniencuesta() {
		setTitle("                                                 Minincuesta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Elije un SO (s\u00F3lo una opci\u00F3n)");
		lblNewLabel.setBounds(33, 37, 172, 14);
		contentPane.add(lblNewLabel);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows", false);
		rdbtnNewRadioButton.setBounds(33, 73, 109, 23);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux", false);
		rdbtnNewRadioButton_1.setBounds(33, 99, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac", false);
		rdbtnNewRadioButton_2.setBounds(33, 125, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);

		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnNewRadioButton);
		bgroup.add(rdbtnNewRadioButton_1);
		bgroup.add(rdbtnNewRadioButton_2);

		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad (una o varias)");
		lblNewLabel_1.setBounds(228, 37, 196, 14);
		contentPane.add(lblNewLabel_1);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Programaci\u00F3n");
		chckbxNewCheckBox.setBounds(228, 73, 121, 23);
		contentPane.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Dise\u00F1o gr\u00E1fico");
		chckbxNewCheckBox_1.setBounds(228, 99, 121, 23);
		contentPane.add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administraci\u00F3n");
		chckbxNewCheckBox_2.setBounds(228, 125, 121, 23);
		contentPane.add(chckbxNewCheckBox_2);

		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(1);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(1);
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setBounds(115, 197, 200, 53);
		contentPane.add(slider);

		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el ordenador");
		lblNewLabel_2.setBounds(135, 172, 180, 14);
		contentPane.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String SO = "Sistema Operativo: \n";
				for (Enumeration<AbstractButton> buttons = bgroup.getElements(); buttons.hasMoreElements();) {
					AbstractButton button = buttons.nextElement();
					if (button.isSelected()) {
						SO += button.getText();
					}
				}
				String especialidades = "\nEspecialidades: \n";

				if (chckbxNewCheckBox.isSelected()) {
					especialidades += chckbxNewCheckBox.getText() + "\n";
				}
				if (chckbxNewCheckBox_1.isSelected()) {
					especialidades += chckbxNewCheckBox_1.getText() + "\n";
				}
				if (chckbxNewCheckBox_2.isSelected()) {
					especialidades += chckbxNewCheckBox_2.getText() + "\n";
				}

				int horas = slider.getValue();

				JOptionPane.showMessageDialog(null, SO + "\n" + especialidades + "\nHoras: " + horas);
			}
		});
		btnNewButton.setBounds(172, 277, 89, 23);
		contentPane.add(btnNewButton);
	}
}
