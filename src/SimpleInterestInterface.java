import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SimpleInterestInterface extends Remote {
	
	double calculate(Double p, double t, double r) throws RemoteException;

}
