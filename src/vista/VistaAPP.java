package vista;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JMenu;

import vista.VistaPrincipal;
import vista.VistaJuegos;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JMenuItem;

import controlador.MainController;

public class VistaAPP extends JFrame {
	

	private JPanel panel;
	private VistaPrincipal VistaPrincipal;
	private VistaJuegos VistaJuegos;
	
	public VistaAPP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 463, 478);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		setContentPane(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		
		
		//MENU
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		//IR A PANTALLA PRINCIPAL:
		JMenu mnPrincipal = new JMenu("Principal");
		menuBar.add(mnPrincipal);
		
		JMenuItem mntmPrincipal = new JMenuItem(new AbstractAction("IR A PRINCIPAL") {
			public void actionPerformed(ActionEvent e) {
				showPrincipal();
			    }
			});
		mnPrincipal.add(mntmPrincipal);
		
		JMenu mnJuegos = new JMenu("Juegos");
		menuBar.add(mnJuegos);
		
		JMenuItem mntmJuegos = new JMenuItem(new AbstractAction("IR A JUEGOS") {
			public void actionPerformed(ActionEvent e) {
				showJuegos();
			    }
			});
		mnJuegos.add(mntmJuegos);
		
		JMenu mnPerfil = new JMenu("Perfil");
		menuBar.add(mnPerfil);
		
		//Añadimos las diferentes ventanas
		VistaPrincipal = new VistaPrincipal();
		panel.add(VistaPrincipal,"VistaPrincipal");
		
		VistaJuegos = new VistaJuegos();
		panel.add(VistaJuegos,"VistaJuegos");
		
	}
	public void showPrincipal(ArrayList<String> usuarios){
		this.VistaPrincipal.putUsuarios(usuarios);
	}
	public void showPrincipal(){
		CardLayout c= (CardLayout) this.panel.getLayout();
		c.show(panel, "VistaPrincipal");
	}
	public void showJuegos(){
		CardLayout c= (CardLayout) this.panel.getLayout();
		c.show(panel, "VistaJuegos");
	}
}
