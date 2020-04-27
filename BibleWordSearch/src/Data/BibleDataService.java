package Data;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;


import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;




@Stateless
@Local(DataAccessInterface.class)
@LocalBean
public class BibleDataService implements DataAccessInterface {

	@Override
	public boolean findAll() {
		
		Connection conn = null;
		String url = "jdbc:postgresql://localhost:5432/CLC-Milestone";
		String username = "postgres";
		String password = "Root";
		String sql = "SELECT * FROM biblesearch.bibleword WHERE verse LIKE '%a%'";
		
		
		try
		{
			conn = DriverManager.getConnection(url, username, password);
			Statement stmt = conn.createStatement();
		    stmt.executeUpdate(sql);
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			//Cleanup Database
			if(conn != null)
			{
				try
				{
					conn.close();
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}

		return true;
	}
	}


