package despacho.ejb.interfaces.remotas;

import java.util.List;

import javax.ejb.Remote;

import dto.OrdenDespachoDTO;
import dto.SolicitudArticuloDTO;

@Remote
public interface AdministradorOrdenesDespacho {
	
	public boolean altaOrdenDespacho (OrdenDespachoDTO ordenDespachoDTO);
							
//	public OrdenDespachoDTO buscarOrdenDespacho (int idOrdenDespacho);
	
	public List<SolicitudArticuloDTO> procesarSolicitudDespacho (OrdenDespachoDTO ordenDespachoDTO);
	
//	public String notificarEntregaDespacho (OrdenDespachoDTO ordenDespachoDTO);
	
	public List<OrdenDespachoDTO> listarOrdenesDespacho(String estado);
	
	public List<OrdenDespachoDTO> listar();
	
}
