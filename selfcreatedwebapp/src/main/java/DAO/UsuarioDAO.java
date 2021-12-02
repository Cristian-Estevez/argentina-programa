package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conectorbbdd.MiConector;

public class UsuarioDAO {

	public boolean checkEsAdmin(String nombre) throws SQLException {
			
		String query = "SELECT usuario.es_admin FROM usuario WHERE usuario.nombre = ?";
		ResultSet resultado = null;
		
		try {
			Connection conn = MiConector.getConnection();
			PreparedStatement statement = conn.prepareStatement(query);
			statement.setString(1, nombre);
			
			resultado = statement.executeQuery();
			
		} catch (SQLException e) {
			System.err.println("Error al conectar con la BBDD");
		}
		
		return resultado.next() ? resultado.getBoolean(1) : false;
	}
	
//	public static void main(String[] args) throws SQLException {
//		UsuarioDAO ud = new UsuarioDAO();
//		
//		boolean esAdmin = ud.checkEsAdmin("admin");
//		
//		System.out.println(esAdmin);
//	}
	
	
}
