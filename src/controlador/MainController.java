package controlador;

import java.awt.CardLayout;
import java.util.ArrayList;

import vista.VistaAPP;
import Modelo.ConexionDB;
import Modelo.User;
import Modelo.UsuariosModel;


public class MainController {
	
	//Instancia unica
	private static MainController instance;
	//Atributos de bases de datos
	ConexionDB conexionbbdd;
	
	//Vistas
	private VistaAPP VistaMain;
	
	//Autenticador
	private User usuarioRegistrado;

	//Usuarios
	private UsuariosModel usuarios;

	public MainController() {
		//CARGAR LA BASE DE DATOS
		conexionbbdd=ConexionDB.getInstance("localhost","gamedb","root","121esp9.X"); //DATOS DE INICIO DE SESIÓN //AÑADIR CONTRASEÑA
		if(conexionbbdd.connectDB()==true) {
			System.out.println("CONECTADO A LA BASE DE DATOS");
		}else{
			System.out.println("ERROR EN LA CONEXION");
		}
		
		this.showMain();
	}
	
	
	//Implementa SingleTon
	public static MainController getInstance() {
	      if(instance == null) {
	         instance = new MainController();
	      }
	      return instance;
	}
	
	//LANZAR VISTA INICIAL
	public void showMain(){
		//Consultamos los usuarios
		usuarios=new UsuariosModel();
		//Lanzamos la ventana principal
		VistaMain = new VistaAPP();
		//MOSTRAMOS LA VISTA PRINCIPAL
		showPrincipal();
		//Hacemos visible la pantalla inicial
		VistaMain.setVisible(true);
	}
	
	//LANZAR JUEGOS
	public void showJuegos(){
		VistaMain.showJuegos();
	}
	//LAZAR PRINCIPAL
	public void showPrincipal(){
		//CARGAMOS LA VISTA PRINCIPAL Y LE ENVIAMOS LOS USUARIOS
		VistaMain.showPrincipal(usuarios.getUsuarios());
	
	}
}

