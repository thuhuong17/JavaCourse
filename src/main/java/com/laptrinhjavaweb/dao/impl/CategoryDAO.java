package com.laptrinhjavaweb.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.dao.ICategoryDAO;
import com.laptrinhjavaweb.model.CategoryModel;

public class CategoryDAO implements ICategoryDAO{
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://locahost:3306/testnew";
			String user= "root";
			String password = "";
			return DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}	
	}
	@Override
	public List<CategoryModel> findAll() {
		// TODO Auto-generated method stub
		List<CategoryModel> results = new ArrayList<>();
		String sql = "SELECT * FROM category";
		
		//open connection
		Connection connection = getConnection();
		PreparedStatement statement = null;
		// doi tuong resultset
		ResultSet resultSet = null;
		if(connection != null)
		{
			try {
				statement = connection.prepareStatement(sql);
				resultSet = statement.executeQuery();
				while(resultSet.next())
				{
					CategoryModel category = new CategoryModel();
					category.setId(resultSet.getLong("id"));
					category.setCode(resultSet.getString("code"));
					category.setName(resultSet.getString("name"));
					results.add(category);
				}
				return results;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				return null;
			}
			finally {
				try {
					if(connection !=null) {
						connection.close();
					}
					if(statement != null)
					{
						statement.close();
					}
					if(resultSet != null)
					{
						resultSet.close();
					}
				}
				catch (SQLException e) {
					// TODO: handle exception
					return null;
				}
			}
		}
		return null;
	}
}
