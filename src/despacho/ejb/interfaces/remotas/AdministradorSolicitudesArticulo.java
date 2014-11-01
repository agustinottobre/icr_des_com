package despacho.ejb.interfaces.remotas;

import javax.ejb.Remote;

@Remote
public interface AdministradorSolicitudesArticulo {

	public long obtenerCantidadSolicitudesArticulo();
}
