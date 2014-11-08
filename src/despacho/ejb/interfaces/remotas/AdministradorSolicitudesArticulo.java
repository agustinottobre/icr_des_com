package despacho.ejb.interfaces.remotas;

import javax.ejb.Remote;

import despacho.rest.bindings.ArticulosRecibidos;
import dto.ArticuloDTO;
import dto.OrdenDespachoDTO;
import dto.SolicitudArticuloDTO;

@Remote
public interface AdministradorSolicitudesArticulo {

	public SolicitudArticuloDTO altaSolicitudArticulo (SolicitudArticuloDTO solicitudArticuloDTO);
	
	// public SolicitudArticuloDTO buscarSolicitudArticulo (String idSolicitudArticulo);
	public boolean registrarRecepcionDeStock(ArticulosRecibidos articulosRecibidos);
	
}
