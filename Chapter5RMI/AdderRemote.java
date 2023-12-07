package com.Chapter5RMI;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class AdderRemote extends UnicastRemoteObject implements Adder {
	
	public AdderRemote() throws RemoteException
	{
		super();
	}
	
	public double SimpleInterest(double p, double t, double r)
	{
		return (p*t*r)/100 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
