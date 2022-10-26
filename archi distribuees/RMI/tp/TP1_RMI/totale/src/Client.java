import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Client {
    public static void main(String[] args) {
String host = (args.length < 1) ? null: args[0];

try {
    Registry registryInstance = LocateRegistry.getRegistry(host);

    Animal animal = (Animal) registryInstance.lookup("test");
} catch ( RemoteException e) {

}

    }
}
