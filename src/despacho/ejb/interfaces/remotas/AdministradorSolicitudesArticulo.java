package despacho.ejb.interfaces.remotas;

import java.util.List;

import javax.ejb.Remote;

import dto.ArticuloDTO;
import dto.OrdenDespachoDTO;
import dto.SolicitudArticuloDTO;

@Remote
public interface AdministradorSolicitudesArticulo {

	public SolicitudArticuloDTO altaSolicitudArticulo (SolicitudArticuloDTO solicitudArticuloDTO);
	
	// public SolicitudArticuloDTO buscarSolicitudArticulo (String idSolicitudArticulo);
	
	public List<SolicitudArticuloDTO> listar();
	
	
}
