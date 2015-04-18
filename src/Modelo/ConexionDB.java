package Modelo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class ConexionDB {
	//DATOS DE LA CONEXION
	static final String CONTROLADOR_MYSQL= "com.mysql.jdbc.Driver";
	
	//DATOS DE LA BBD
	private String host, bbdd, user, pass;
	
	static //CONEXION
	Connection conexion = null; 
	
	public ConexionDB(String HOST, String BBDD,String USER,String PASS) {
		this.host=HOST;
		this.bbdd=BBDD;
		this.user=USER;
		this.pass=PASS;
	}
	
	public boolean connectDB(){
		try{
			//Lo primero es cargar el controladr MySQL el cual automaticamente se registra
			Class.forName(CONTROLADOR_MYSQL);
			//CONECTARNOS A LA BBDD
			conexion = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.bbdd,this.user,this.pass);
		}
		catch ( SQLException excepcionSql )
		{
			excepcionSql.printStackTrace();
			return false;
		}// fin de catch
		catch ( ClassNotFoundException noEntontroClase){
			noEntontroClase.printStackTrace();
			return false;
		}
		return true;
		
	}
	public static Connection getConexion(){
		return conexion;
	}
}


