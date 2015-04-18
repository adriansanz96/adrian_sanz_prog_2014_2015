import Modelo.ConexionDB;
import vista.VistaAPP;


public class Principal {

	public static void main(String[] args) {
		
		ConexionDB gameDb;
		//GENERANDO EL OBJETO
		gameDb=new ConexionDB("localhost","gamedb","root",""); //introducir la contraseña
		
		//CONDICIONES
		if(gameDb.connectDB()==true) System.out.println("CONECTADO CON EXITO");
		else System.out.println("ERROR EN LA CONEXION");
		

		VistaAPP frame = new VistaAPP();
		frame.setVisible(true);

	}

}
