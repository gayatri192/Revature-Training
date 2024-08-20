package com.revature.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JDBCDemoStat {
	
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		PreparedStatement preparedStatement = null;
		String url="jdbc:mysql://localhost:3306/classicmodels";
		String uname="root";
		String pwd="Admin@123";
		
		// STEP -1 : LOAD THE DRIVER -- optional from java 6 onwards
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			// STEP 2 - Create the connection Object
			connection=DriverManager.getConnection(url,uname,pwd);
			
			// STEP 3- Create a Statement/PS /CS Object
			//statement=connection.createStatement();
			//String sql1="select * from employees";
			
			// Step 4 - Execute Query and get ResultSet
			//resultSet=statement.executeQuery(sql1);
			
			// Step 5 - Process the result set
			
			// **Create Operation**
            String insertSQL = "INSERT INTO employees (employeeNumber, lastName, firstName, extension, email, officeCode, reportsTo, jobTitle) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setInt(1, 2003); // employeeNumber
            preparedStatement.setString(2, "Lohar"); // lastName
            preparedStatement.setString(3, "Nandini"); // firstName
            preparedStatement.setString(4, "x1234"); // extension
            preparedStatement.setString(5, "gayatrilohar@gamil.com"); // email
            preparedStatement.setString(6, "1"); // officeCode
            preparedStatement.setInt(7, 1002); // reportsTo
            preparedStatement.setString(8, "Sales Manager"); // jobTitle

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new employee was inserted successfully!");
            }

            // **Read Operation**
            String selectSQL = "SELECT * FROM employees WHERE employeeNumber = ?";
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setInt(1, 2002);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("employeeNumber") + " , " +
                        resultSet.getString("lastName") + " , " + resultSet.getString("email"));
            }

            // **Update Operation**
            String update = "UPDATE employees SET lastName = ? WHERE employeeNumber = ?";
            preparedStatement = connection.prepareStatement(update);
            preparedStatement.setString(1, "Doe");
            preparedStatement.setInt(2, 2001);

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing employee's last name was updated successfully!");
            }

            // **Delete Operation**
            String deleteSQL = "DELETE FROM employees WHERE employeeNumber = ?";
            preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, 2001);

            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("An employee was deleted successfully!");
            }

            // step 6 - Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}