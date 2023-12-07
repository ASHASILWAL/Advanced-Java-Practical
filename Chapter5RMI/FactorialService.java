package com.Chapter5RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FactorialService extends Remote {
    long factorial(int n) throws RemoteException;
}

 