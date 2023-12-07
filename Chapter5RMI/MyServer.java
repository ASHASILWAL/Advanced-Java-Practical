 package com.Chapter5RMI;
import java.rmi.*;

public class MyServer {
	
	public static void main(String args[])
	{
		try{
			
			Adder stub = new AdderRemote();
			
			//we are binding the remote object by the name jbc
			
			Naming.rebind("rmi://localhost:5000/jbc, stub", stub);
			System.out.println("Server Ready :");

		}catch(Exception e){
		System.out.println(e);	
		}
	}

}
