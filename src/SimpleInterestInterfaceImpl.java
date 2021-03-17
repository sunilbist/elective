import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SimpleInterestInterfaceImpl
extends UnicastRemoteObject implements SimpleInterestInterface{

	private static final long serialVersionUID = 1L;

	public SimpleInterestInterfaceImpl() throws RemoteException {
		super();
	}

	@Override
	public double calculate(Double p, double t, double r) throws RemoteException {
		return ((p*t*r)/100);
	}

}
