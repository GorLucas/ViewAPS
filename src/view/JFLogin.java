package view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class JFLogin extends JFrame {

	private JPanel PanelLogin;
	private JTextField User;
	private JPasswordField Senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFLogin frame = new JFLogin();
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
	public JFLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		PanelLogin = new JPanel();
		PanelLogin.setBackground(Color.WHITE);
		PanelLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelLogin);
		PanelLogin.setLayout(null);
		
		User = new JTextField();
		User.setBounds(95, 62, 221, 20);
		PanelLogin.add(User);
		User.setColumns(10);
		
		Senha = new JPasswordField();
		Senha.setBounds(95, 93, 221, 20);
		PanelLogin.add(Senha);
		
		Button Login = new Button("Login");
		Login.setForeground(Color.WHITE);
		Login.setBackground(new Color(254,84,132));
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFChat frame = new JFChat();
				 
				frame.setVisible(true);
				dispose();
			}
		});
		Login.setBounds(73, 124, 243, 23);
		PanelLogin.add(Login);
		
		JCheckBox LembrarSenha = new JCheckBox("Lembrar Senha");
		LembrarSenha.setBackground(Color.WHITE);
		LembrarSenha.setForeground(Color.BLACK);
		LembrarSenha.setBounds(73, 154, 97, 23);
		PanelLogin.add(LembrarSenha);
		
		JLabel EsqueceuSenha = new JLabel("Esqueceu sua senha?");
		EsqueceuSenha.setBounds(210, 158, 124, 14);
		PanelLogin.add(EsqueceuSenha);
		
		Button Registro = new Button("Registar");
		Registro.setForeground(new Color(255, 255, 255));
		Registro.setBackground(new Color(254,84,132));
		Registro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFRegistro registro= new JFRegistro();
				registro.setVisible(true);
				
			}
		});
		Registro.setBounds(227, 183, 89, 23);
		PanelLogin.add(Registro);
	}
}
