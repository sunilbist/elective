package pl;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class PLServer {
	public static void main(String[] args) {
		try {
			LocateRegistry.createRegistry(1099);
			Naming.rebind("localhost/pl", new PLInterfaceImpl());
			System.out.println("Server ready...");
		} catch (Exception e) {
			System.out.println("Server Error: "+e.getMessage());
		}
	}
}
