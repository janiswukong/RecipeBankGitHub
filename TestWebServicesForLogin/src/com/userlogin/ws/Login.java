package com.userlogin.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Login {
	public String authentication(String userName, String password) {

		String retrievedUserName = "";
		String retrievedPassword = "";
		String status = "";
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/androidlogin", "root",
					"admin");
			PreparedStatement statement = con
					.prepareStatement("SELECT * FROM user WHERE username = '"
							+ userName + "'");
			ResultSet result = statement.executeQuery();

			while (result.next()) {
				retrievedUserName = result.getString("username");
				retrievedPassword = result.getString("password");
			}

			if (retrievedUserName.equals(userName)
					&& retrievedPassword.equals(password)) {
				status = "Success!";
			}

			else {
				status = "Login fail!!!";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;

	}

}