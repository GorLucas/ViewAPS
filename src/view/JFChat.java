package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JLabel;

public class JFChat extends JFrame {

	private JPanel PanelChat;
	private JTextField Pesquisa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFChat frame = new JFChat();
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
	public JFChat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		PanelChat = new JPanel();
		PanelChat.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelChat);
		PanelChat.setLayout(null);
		
		JPanel panelConversas = new JPanel();
		panelConversas.setBounds(0, 46, 110, 215);
		PanelChat.add(panelConversas);
		panelConversas.setLayout(null);
		
		JList listConversa = new JList();
		listConversa.setBounds(0, 0, 110, 215);
		panelConversas.add(listConversa);
		
		JPanel panelConversa = new JPanel();
		panelConversa.setBounds(109, 46, 223, 215);
		PanelChat.add(panelConversa);
		panelConversa.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 223, 215);
		panelConversa.add(textArea);
		
		JPanel panelContato = new JPanel();
		panelContato.setBounds(332, 46, 102, 215);
		PanelChat.add(panelContato);
		panelContato.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("");
		textArea_1.setBounds(0, 0, 102, 215);
		panelContato.add(textArea_1);
		
		Pesquisa = new JTextField();
		Pesquisa.setBounds(0, 26, 86, 20);
		PanelChat.add(Pesquisa);
		Pesquisa.setColumns(10);
		
		JButton btnPesquisa = new JButton("New button");
		btnPesquisa.setBounds(93, 25, 38, 23);
		PanelChat.add(btnPesquisa);
		
		JButton config = new JButton("Config");
		config.setBounds(345, 25, 89, 23);
		PanelChat.add(config);
		
		JLabel lblNewLabel = new JLabel("APS");
		lblNewLabel.setBounds(378, 0, 46, 14);
		PanelChat.add(lblNewLabel);
	}
}
