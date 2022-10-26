import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static int port;

    public Server() {};

    public static void main(String[] args) {
        try
        {
        AnimalImplementation animalImplementation = new AnimalImplementation();
        Registry registryInstance = LocateRegistry.getRegistry(port);
        if (registryInstance == null)
        {
             registryInstance = LocateRegistry.createRegistry(1099);
        }
        else {
            registryInstance.bind("test", animalImplementation);
        }
        } catch (RemoteException | AlreadyBoundException e) {
            // Todo
        }
    }
}
