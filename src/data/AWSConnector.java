package data;

import java.sql.Connection;
import java.sql.ResultSet;

public class AWSConnector implements DatabaseConnector
{
	@Override
	public void getConnection()
	{
		// TODO: Create implementation
		//return null;
	}
	
	
	@Override
	public boolean insert(String table, String[] columns, String[] values)
	{
		// TODO: Finish implementation
		return false;
	}
	
	@Override
	public ResultSet select(String table, String[] columns, String whereClause, String orderByClause)
	{
		// TODO: Finish implementation
		return null;
	}
	
	@Override
	public boolean update(String table, String[] columns, String[] values, String whereClause)
	{
		// TODO: Finish implementation
		return false;
	}
	
	@Override
	public boolean delete(String table, String whereClause)
	{
		// TODO: Finish implementation
		return false;
	}
}

