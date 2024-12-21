package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import comon.libraryservice;
public class LibraryClient {
	public static void main(String[]args)
	{
		
	}

	public LibraryClient() {
		// TODO Auto-generated constructor stub
	}
	void Register() {
		try {
			Registry registry=LocateRegistry.getRegistry("localhost",1099);
			libraryservice service=(libraryservice) registry.lookup("libraryservice");
					String result=service.searchBookByTitle("ima");
				   System.out.println(result);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
