
import java.rmi.*;

class SaludoRMIClient {
	public static void main (String[] args) {
		SaludoRMIInterface s;
		String name = "rmi://172.22.90.59/SaludoRMIServer";
		try {
			s = (SaludoRMIInterface)Naming.lookup(name);
			System.out.println(s.saludar("Juan Perez"));
		}catch (Exception e) {
			System.out.println("SaludoRMIClient exception: " + e);
		}
	}
}
