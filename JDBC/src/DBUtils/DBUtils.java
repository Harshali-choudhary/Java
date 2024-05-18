package DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

	private static Connection connection;
	private static final String Db_Url;
	private static final String Db_User;
	private static final String Db_password;
	static {
		Db_Url = "jdbc:mysql://localhost:3306/JDBC";
		Db_User = "root";
		Db_password = "root123";
	}
	
	public static Connection openConnection() throws SQLException
	{
		connection = DriverManager.getConnection(Db_Url, Db_User, Db_password);
		return connection;
	}
	
	public static void closeConnection() throws SQLException
	{
		if(connection !=null)
			connection.close();
		System.out.println("DB connection is closed");
	}
}
