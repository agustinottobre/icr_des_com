package despacho.ejb.interfaces.remotas;

import java.util.List;
import javax.ejb.Remote;
import dto.OrdenDespachoDTO;

@Remote
public interface AdministradorOrdenesDespacho {
	
	public OrdenDespachoDTO altaOrdenDespacho (String codigo_despacho, String codigo_venta, String id_portal, 
			String id_monitoreo, List<String[][]> items);
	
	//public buscarOrdenDespacho (String idOrdenDespacho);
	
}
