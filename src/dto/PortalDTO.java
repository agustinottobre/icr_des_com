package dto;

import java.io.Serializable;


public class PortalDTO implements Serializable{

	private int idPortal;
	private String descripcion;
	public int getIdPortal() {
		return idPortal;
	}
	public void setIdPortal(int idPortal) {
		this.idPortal = idPortal;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
