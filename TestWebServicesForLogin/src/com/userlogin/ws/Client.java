package com.userlogin.ws;

public class Client {

	// TODO Auto-generated constructor stub
	public static void main(String[] args) throws Exception {
		LoginStub stub = new LoginStub();

		// Creating the request
		com.userlogin.ws.LoginStub.Authentication request = new com.userlogin.ws.LoginStub.Authentication();
		request.setUserName("admin");
		request.setPassword("123");

		// Invoking the service
		com.userlogin.ws.LoginStub.AuthenticationResponse response = stub
				.authentication(request);
		System.out.println("Response : " + response.get_return());
	}

}
