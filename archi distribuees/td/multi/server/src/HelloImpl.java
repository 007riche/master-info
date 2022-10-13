import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class HelloImpl extends UnicastRemoteObject implements Hello {
    /* CONSTRUCTOR */
    public HelloImpl() throws RemoteException {
    }
    /* METHODS */
    @Override
    public String sayHello() throws RemoteException {
        return "Hello world!";
    }
    @Override
    public void printHello() throws RemoteException {
        System.out.println("The server prints: Hello world");
    }
}