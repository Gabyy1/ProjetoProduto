package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDAO {

	private Connection c;
	public Connection getConnection() throws ClassNotFoundException, SQLException{
	String hostName = "localhost";
	String dbName = "crud";
	String user = "gabrielly";
	String senha = "1820gaby";
	Class.forName("net.sourceforge.jtds.jdbc.Driver");
	String connect =
	String.format("jdbc:jtds:sqlserver://%s:1433;databaseNme=%s;user=%s;password=%s",hostName, dbName, user, senha);
	c = DriverManager.getConnection(connect);

	return c;
	}

}

