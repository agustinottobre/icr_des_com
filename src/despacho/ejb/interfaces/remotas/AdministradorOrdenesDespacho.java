package despacho.ejb.interfaces.remotas;

import java.util.List;
import javax.ejb.Remote;
import dto.OrdenDespachoDTO;

@Remote
public interface AdministradorOrdenesDespacho {
	
	public OrdenDespachoDTO altaOrdenDespacho (OrdenDespachoDTO ordenDespachoDTO);
							
	public OrdenDespachoDTO buscarOrdenDespacho (String idOrdenDespacho);
	
	public String notificarEntregaDespacho (int idOrdenDespacho);
}
