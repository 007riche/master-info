import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



public class AnimalImplementation extends UnicastRemoteObject implements Animal{
    protected AnimalImplementation() throws RemoteException {
    }

    String nameAnimal="";
    String nameAnimalMaster="";
    String breed="";
    String specie="";

    @Override
    public void printFullName() throws RemoteException {
        System.out.println(nameAnimal+" "+nameAnimalMaster);
    }

    @Override
    public String getFullName() throws RemoteException {
        return nameAnimal+" "+nameAnimalMaster;
    }





}