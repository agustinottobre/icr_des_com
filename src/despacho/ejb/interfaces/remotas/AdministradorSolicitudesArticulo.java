package despacho.ejb.interfaces.remotas;

import javax.ejb.Remote;

import dto.ArticuloDTO;
import dto.SolicitudArticuloDTO;

@Remote
public interface AdministradorSolicitudesArticulo {

	public long obtenerCantidadSolicitudesArticulo();
	
	public SolicitudArticuloDTO nuevaSolicitud(ArticuloDTO articulo, int cantidad); 
}
