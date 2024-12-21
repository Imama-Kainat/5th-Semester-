package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import comon.libraryservice;
public class libraryserver {

	public libraryserver() {
		// TODO Auto-generated constructor stub
	}
 public static void main(String[]args)
{
	try {
		libraryservice service=new libraryserviceimp();
		Registry registry =LocateRegistry.createRegistry(1039);
		registry.rebind("LibraryService", service);
	    System.out.println("library serveer is running..");
		

	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
