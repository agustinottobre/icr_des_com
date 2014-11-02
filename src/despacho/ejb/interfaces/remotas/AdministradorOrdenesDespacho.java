package despacho.ejb.interfaces.remotas;

import java.util.List;

import javax.ejb.Remote;

import dto.OrdenDespachoDTO;
import dto.SolicitudArticuloDTO;

@Remote
public interface AdministradorOrdenesDespacho {
	
	public OrdenDespachoDTO altaOrdenDespacho (OrdenDespachoDTO ordenDespachoDTO);
							
	public OrdenDespachoDTO buscarOrdenDespacho (String idOrdenDespacho);
	
	public List<SolicitudArticuloDTO> generarSolicitudArticuloPorDeposito (OrdenDespachoDTO ordenDespachoDTO);
	
	
}
