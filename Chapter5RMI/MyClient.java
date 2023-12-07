package com.Chapter5RMI;
import java.rmi.*;

public class MyClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			
			Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/jbc");
			System.out.println("Calling Server : ");
			System.out.println(stub.SimpleInterest(5000,3,5));
			
		}catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Error : " +e.getMessage());
		}

	}

}
