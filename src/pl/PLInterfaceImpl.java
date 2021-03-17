package pl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PLInterfaceImpl extends UnicastRemoteObject implements PLInterface{

	private static final long serialVersionUID = 1L;

	protected PLInterfaceImpl() throws RemoteException {
		super();
	}

	@Override
	public double findPL(double cp, double sp) throws RemoteException {
		return (sp-cp);
	}

}
