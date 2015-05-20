package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JComboBox;

import Modelo.ConexionDB;

public class VistaJuegos extends JPanel {
	private JTextField CjaNombre;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	/**
	 * Create the panel.
	 */
	public VistaJuegos() {
		setLayout(null);
		
		JLabel lblFiltros = new JLabel("Filtros");
		lblFiltros.setHorizontalAlignment(SwingConstants.CENTER);
		lblFiltros.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFiltros.setBounds(158, 26, 86, 20);
		add(lblFiltros);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(37, 63, 46, 14);
		add(lblNombre);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(181, 63, 46, 14);
		add(lblGenero);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setBounds(313, 63, 65, 14);
		add(lblPlataforma);
		
		CjaNombre = new JTextField();
		CjaNombre.setBounds(20, 88, 86, 20);
		add(CjaNombre);
		CjaNombre.setColumns(10);
		
		JLabel label = new JLabel("Plataforma");
		label.setBounds(313, 139, 65, 14);
		add(label);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(20, 164, 86, 20);
		add(textField);
		
		JLabel label_1 = new JLabel("Nombre");
		label_1.setBounds(37, 139, 46, 14);
		add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(158, 164, 86, 20);
		add(textField_1);
		
		JLabel label_2 = new JLabel("Genero");
		label_2.setBounds(181, 139, 46, 14);
		add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(303, 164, 86, 20);
		add(textField_2);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setHorizontalAlignment(SwingConstants.LEFT);
		btnEditar.setBounds(104, 235, 78, 30);
		add(btnEditar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setHorizontalAlignment(SwingConstants.LEFT);
		btnSalvar.setBounds(241, 235, 86, 30);
		add(btnSalvar);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(158, 88, 96, 20);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(303, 88, 96, 20);
		add(comboBox_1);

	}
}
