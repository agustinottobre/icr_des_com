package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class SolicitudArticuloDTO implements Serializable{
	
	private int idSolicitud;
	private String estadoSolicitud;
	private int idDeposito;
	private int idOrdenDespacho;
	
	private Set<ItemSolicitudArticuloDTO> items;
	public int getIdSolicitud() {
		return idSolicitud;
	}
	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}
	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}
	public int getidDeposito() {
		return idDeposito;
	}
	public void setidDeposito(int idDeposito) {
		this.idDeposito = idDeposito;
	}
	public Set<ItemSolicitudArticuloDTO> getItems() {
		return items;
	}
	public void setItems(Set<ItemSolicitudArticuloDTO> items) {
		this.items = items;
	}

	public int getIdOrdenDespacho() {
		return idOrdenDespacho;
	}
	public void setIdOrdenDespacho(int idOrdenDespacho) {
		this.idOrdenDespacho = idOrdenDespacho;
	}

}
