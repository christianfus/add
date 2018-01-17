package serpis.ad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PruebaMySql {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/dbprueba","root","sistemas");
		
		Statement s = connection.createStatement();
		ResultSet rs = s.executeQuery ("select * from categoria");
		
		while (rs.next()) 
		{ 
		    System.out.println ("Id: "+rs.getInt("id")+" Nombre: "+rs.getString("nombre")); 
		}
		
		connection.close();

	}

}
