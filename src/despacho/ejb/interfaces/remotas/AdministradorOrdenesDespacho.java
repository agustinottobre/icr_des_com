package despacho.ejb.interfaces.remotas;

import javax.ejb.Remote;

@Remote
public interface AdministradorOrdenesDespacho {
	
	public long obtenerCantidadOrdenesDespacho();

}
