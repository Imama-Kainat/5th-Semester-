package comon;
//comon point pr proposal bnana 
import java.rmi.Remote;
import java.rmi.RemoteException;

import client.clientRemoteInterface;
public interface libraryservice extends Remote {
	
String searchBookByTitle(String title)throws RemoteException;
void registerClient(clientRemoteInterface client);


}
//Overall class and code summary 
//This code implements a remote library service system using Java RMI (Remote Method Invocation).
//It allows clients to search for books on the server and also provides a notification mechanism using callbacks. 


//Common Interface (LibraryService)
//Defines the contract that the server will implement and the client will call.
//Declares methods like searchBookByTitle() for searching books and registerClient() for registering clients for callbacks.


//Server (LibraryServer and LibraryServiceImpl)
//Implements the LibraryService interface.
//Maintains a list of clients for callbacks.
//Hosts the RMI service on a specific port.


//Client (LibraryClient and RemoteClient)
//Implements a RemoteClient interface to allow the server to send notifications to the client.
//Calls methods on the server to search for books and register itself for notifications.