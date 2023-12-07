package com.Chapter5RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class FactorialServiceImpl extends UnicastRemoteObject implements FactorialService {
    public FactorialServiceImpl() throws RemoteException {
        // Required default constructor
    }

    @Override
    public long factorial(int n) throws RemoteException {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

