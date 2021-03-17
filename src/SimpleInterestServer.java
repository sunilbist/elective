import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class SimpleInterestServer {
public static void main(String[] args) {
	try {
		LocateRegistry.createRegistry(1099);
		Naming.rebind("192.168.20.202/interest", new SimpleInterestInterfaceImpl());
		System.out.println("Server is ready...");
	} catch (Exception e) {
	System.out.println("Server Error: "+e.getMessage());
	}
}
}
