package com.Chapter5RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FactorialServer {
    public static void main(String[] args) {
        try {
            // Create an instance of the factorial service implementation
            FactorialService factorialService = new FactorialServiceImpl();

            // Create the RMI registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the factorial service to the registry with a given name
            registry.rebind("FactorialService", factorialService);

            System.out.println("FactorialService is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

