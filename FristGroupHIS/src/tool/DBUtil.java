package tool;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;



public class DBUtil {
	private static ComboPooledDataSource source = new ComboPooledDataSource("mysql-config");
	public static Connection getSqlConnection(){
		Connection con = null;
		try {
			con = source.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public static void closeSqlSource(AutoCloseable...close){
		for (AutoCloseable autoCloseable : close) {
			try {
				autoCloseable.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
