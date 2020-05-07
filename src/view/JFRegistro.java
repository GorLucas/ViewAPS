package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class JFRegistro extends JFrame {

	private JPanel panelRegistro;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFRegistro frame = new JFRegistro();
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
	public JFRegistro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panelRegistro = new JPanel();
		panelRegistro.setBackground(Color.WHITE);
		panelRegistro.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelRegistro);
		panelRegistro.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email :");
		lblNewLabel.setBounds(19, 38, 31, 14);
		panelRegistro.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha :");
		lblNewLabel_1.setBounds(19, 63, 37, 14);
		panelRegistro.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Confirmar senha :");
		lblNewLabel_2.setBounds(19, 88, 86, 14);
		panelRegistro.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nome : ");
		lblNewLabel_3.setBounds(19, 13, 37, 14);
		panelRegistro.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(61, 10, 136, 20);
		panelRegistro.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(61, 35, 136, 20);
		panelRegistro.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(61, 60, 136, 20);
		panelRegistro.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(108, 85, 89, 20);
		panelRegistro.add(passwordField_1);
		
		JButton cadastrarBtn = new JButton("Cadastrar");
		cadastrarBtn.setBackground(Color.LIGHT_GRAY);
		cadastrarBtn.setForeground(Color.BLACK);
		cadastrarBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFChat chat=new JFChat();
				chat.setVisible(true);
				dispose();
			}
		});
		cadastrarBtn.setBounds(19, 145, 89, 20);
		panelRegistro.add(cadastrarBtn);
	}
}
