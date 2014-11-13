package despacho.ejb.interfaces.remotas;

import java.util.List;

import javax.ejb.Asynchronous;
import javax.ejb.Remote;

import dto.OrdenDespachoDTO;
import dto.SolicitudArticuloDTO;

@Remote
public interface AsyncNotificarLogistica {

	@Asynchronous
	public void notificarLogistica(OrdenDespachoDTO ordenDespachoDTO);
}
