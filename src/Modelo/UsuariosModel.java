package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class UsuariosModel {
	//DEVOLVER CORREDORES
	private static String USUARIOS_SEL="SELECT * FROM usuarios";
	private static String USUARIO_COL="usuario";
	
	//CONEXION
		private Connection conexion = null;
		Statement instruccion =null;
		ResultSet conjuntoResultados = null;
		
	//USUARIOSDB
	private ArrayList<String> usuarios = null;

	public UsuariosModel() {
		conexion=ConexionDB.getConexion();
		usuarios= new ArrayList<String>();
	}

	public ArrayList getUsuarios(){
		//CONDICIONES
		try{
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(USUARIOS_SEL);
			
			while ( conjuntoResultados.next() ) {
				usuarios.add(conjuntoResultados.getString(USUARIO_COL));		
			}
			return usuarios;
		}
		catch ( SQLException excepcionSql )
		{
			excepcionSql.printStackTrace();
			return usuarios;
		}
		finally{
			try{	
			conjuntoResultados.close();
			instruccion.close();
			}
			catch ( SQLException exceptionSql )
			{
				exceptionSql.printStackTrace();
			}
		}
	}
	
}
