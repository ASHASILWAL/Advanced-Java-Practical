package com.Chapter5RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class FactorialClient {
    public static void main(String[] args) {
        try {
            // Locate the RMI registry running on the server
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Retrieve the factorial service from the registry
            FactorialService factorialService = (FactorialService) registry.lookup("FactorialService");

            // Call the factorial method on the remote service
            int number = 5;
            long factorial = factorialService.factorial(number);

            System.out.println("Factorial of " + number + " is: " + factorial);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
