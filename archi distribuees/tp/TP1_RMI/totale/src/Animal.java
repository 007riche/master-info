import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Animal extends Remote {

    void printFullName() throws RemoteException;
    String getFullName() throws RemoteException;
}
