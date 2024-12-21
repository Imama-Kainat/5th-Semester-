package server;

import java.rmi.RemoteException;
import client.clientRemoteInterface;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import comon.libraryservice;

public class libraryserviceimp extends UnicastRemoteObject implements libraryservice {

    private static List<clientRemoteInterface> clients = new ArrayList<>();

    protected libraryserviceimp() throws RemoteException {
        super();
    }

    @Override
    public String searchBookByTitle(String title) throws RemoteException {
        if (title.equalsIgnoreCase("Java")) {
            return "Found: Java Programming " + new Random().nextInt();
        } else {
            return "Book not found";
        }
    }

    @Override
    public void registerClient(clientRemoteInterface client) {
        clients.add(client);
        System.out.println("Client registered.");
    }

    public void removeClient(clientRemoteInterface client) throws RemoteException {
        clients.remove(client);
        System.out.println("Client removed.");
    }

    public void notifyClient(String message) throws RemoteException {
        for (clientRemoteInterface client : clients) {
            client.notify(message);
        }
    }
}
