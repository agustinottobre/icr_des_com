package dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class OrdenDespachoDTO implements Serializable{

	private int idOrdenDespacho;
	private OrdenVentaDTO ordenVenta;
	private String estadoOrden;
	private String fechaRecepcion;
	private int idLogistica; 
//	private List<ItemOrdenDespachoDTO> items;
	private Set<ItemOrdenDespachoDTO> items;
	
	public int getIdOrdenDespacho() {
		return idOrdenDespacho;
	}
	public void setIdOrdenDespacho(int idOrdenDespacho) {
		this.idOrdenDespacho = idOrdenDespacho;
	}
	public OrdenVentaDTO getOrdenVenta() {
		return ordenVenta;
	}
	public void setOrdenVenta(OrdenVentaDTO ordenVenta) {
		this.ordenVenta = ordenVenta;
	}
	public String getEstadoOrden() {
		return estadoOrden;
	}
	public void setEstadoOrden(String estadoOrden) {
		this.estadoOrden = estadoOrden;
	}
	public String getFechaRecepcion() {
		return fechaRecepcion;
	}
	public void setFechaRecepcion(String fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}
	public Set<ItemOrdenDespachoDTO> getItems() {
		return items;
	}
	public void setItems(Set<ItemOrdenDespachoDTO> items) {
		this.items = items;
	}
	public int getIdLogistica() {
		return idLogistica;
	}
	public void setIdLogistica(int idLogistica) {
		this.idLogistica = idLogistica;
	}

	
}
