package pl;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PLInterface extends Remote {
	
	double findPL(double cp, double sp) throws RemoteException;

}
