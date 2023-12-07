package com.Chapter5RMI;
import java.rmi.*;

public interface Adder extends Remote {
	
	public double SimpleInterest(double p, double t, double r) throws RemoteException;

	

}
