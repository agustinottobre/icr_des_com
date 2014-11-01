package dto;

import java.io.Serializable;
import java.util.Date;

public class HistorialOrdenDespachoDTO implements Serializable{

	private String timestamp;
	private OrdenDespachoDTO orden;
	private String evento;
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public OrdenDespachoDTO getOrden() {
		return orden;
	}
	public void setOrden(OrdenDespachoDTO orden) {
		this.orden = orden;
	}
	public String getEvento() {
		return evento;
	}
	public void setEvento(String evento) {
		this.evento = evento;
	} 
	
}
