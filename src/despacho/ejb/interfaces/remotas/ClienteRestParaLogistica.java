package despacho.ejb.interfaces.remotas;

import java.util.List;

import javax.ejb.Remote;

import dto.ArticuloDTO;
import dto.OrdenDespachoDTO;
import dto.SolicitudArticuloDTO;

//interfaz del session bean AdministradorArticulos
@Remote
public interface ClienteRestParaLogistica {
	
	public boolean enviarCambioEstado(OrdenDespachoDTO ordenDespachoDTO);
}
