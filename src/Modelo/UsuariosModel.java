package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Modelo.ConexionDB;


public class UsuariosModel {

	
	private static String USUARIOS_SEL="SELECT * FROM usuarios";
	private static String USUARIO_COL="usuario";
	
	//CONEXION
		
		Connection conexion;
		Statement instruccion=null;
		ResultSet conjuntoResultados=null;
		ArrayList<String> usuarios;


	public UsuariosModel() {
		conexion=ConexionDB.getConexion();
	}

	public ArrayList<String> getUsuarios(){
		usuarios=new ArrayList<String>();
		//CONDICIONES
		try{
			instruccion = conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(USUARIOS_SEL);
			
			while ( conjuntoResultados.next() ) {
				usuarios.add(conjuntoResultados.getString(USUARIO_COL));		
			}
		}
		catch ( SQLException excepcionSql )
		{
			excepcionSql.printStackTrace();
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
		return usuarios;
	}
	
}
