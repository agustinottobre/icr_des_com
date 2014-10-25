package despacho.ejb.interfaces.remotas;

import javax.ejb.Remote;

//interfaz del session bean AdministradorArticulos
@Remote
public interface AdministradorArticulos {
	
	public String testEJB();
}
