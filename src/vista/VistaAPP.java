package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JMenu;

import java.awt.CardLayout;

public class VistaAPP extends JFrame {
	

	private JPanel contentPane;
	private VistaPrincipal VentanaPrincipal;
	
	public VistaAPP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 463, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPrinciapl = new JMenu("Principal");
		menuBar.add(mnPrinciapl);
		
		JMenu mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		

		VentanaPrincipal = new VistaPrincipal();
		contentPane.add(VentanaPrincipal, "principal");
		

	}

	public JPanel getVentanaPrincipal() {
		return VentanaPrincipal;
	}
}
