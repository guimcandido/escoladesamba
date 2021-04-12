package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDao {

	private Connection c;

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		String cStr =  "jdbc:jtds:sqlserver://localhost:1433/aulacall;user=admin;password=123";
		c = DriverManager.getConnection(String.format(cStr));
		return c;
	}

}