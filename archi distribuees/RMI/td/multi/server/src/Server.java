
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Server {
    /* CONSTRUCTOR */
    public Server() {}
    /* METHODS */
    public static void main(String[] args) {
        try {
            HelloImpl obj = new HelloImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            if (registry == null)
                System.err.println("Registry not found");
            else {
                registry.bind("Hello", obj);
                System.err.println("Server is ready");
            }
        } catch (RemoteException | AlreadyBoundException e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}