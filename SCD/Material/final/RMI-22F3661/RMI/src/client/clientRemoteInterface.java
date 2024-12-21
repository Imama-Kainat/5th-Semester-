package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface clientRemoteInterface extends Remote {
	
	void register() ;
	
	void notify(String message);;
}
