package despacho.ejb.interfaces.remotas;

import javax.ejb.Remote;

//interfaz del session bean AdministradorArticulos
@Remote
public interface AdministradorTestJPA {
	
	public void persistirPortal(String descripcionPortal);
}
