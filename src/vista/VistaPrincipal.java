package vista;
import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import Modelo.UsuariosModel;

public class VistaPrincipal extends JPanel {
	private JTextField textField;
	public static JPanel panelprincipal;

	UsuariosModel usuarios;
	
	public VistaPrincipal() {
		setLayout(null);
		
		panelprincipal = new JPanel();
		panelprincipal.setLayout(null);
		panelprincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelprincipal.setBounds(0, 0, 418, 407);
		add(panelprincipal);
		
		JLabel label = new JLabel("New label");
		label.setIcon(new ImageIcon(VistaPrincipal.class.getResource("/imagenes/avatar.jpg")));
		label.setBackground(Color.WHITE);
		label.setBounds(20, 11, 121, 116);
		panelprincipal.add(label);
		
		JButton button = new JButton("Juegos >>");
		button.setBounds(192, 31, 188, 23);
		panelprincipal.add(button);
		
		JButton button_1 = new JButton("Perfil >>");
		button_1.setBounds(192, 65, 188, 23);
		panelprincipal.add(button_1);
		
		JLabel label_1 = new JLabel("Usuario");
		label_1.setBounds(20, 138, 75, 23);
		panelprincipal.add(label_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(20, 172, 141, 20);
		panelprincipal.add(comboBox);
		
		JLabel label_2 = new JLabel("Contrase\u00F1a");
		label_2.setBounds(20, 204, 75, 23);
		panelprincipal.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(20, 238, 141, 20);
		panelprincipal.add(textField);
		
		JButton button_2 = new JButton("Login");
		button_2.setEnabled(false);
		button_2.setBounds(20, 279, 141, 23);
		panelprincipal.add(button_2);
		
		JButton button_3 = new JButton("Registrarse");
		button_3.setEnabled(false);
		button_3.setBounds(20, 315, 141, 23);
		panelprincipal.add(button_3);

		
		//AÑADIMOS LOS DATOS DEL ARRAY AL COMBOBOX
		usuarios =new UsuariosModel();
		
		Iterator<String> it=usuarios.getUsuarios().iterator();
		while(it.hasNext()){
			comboBox.addItem((String)it.next());
		}
	}
}
