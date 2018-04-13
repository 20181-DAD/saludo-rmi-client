
import java.rmi.*;

public interface SaludoRMIInterface extends Remote {
	   public String saludar(String nombre) throws RemoteException;
}