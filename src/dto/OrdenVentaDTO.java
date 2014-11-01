package dto;

import java.io.Serializable;


public class OrdenVentaDTO  implements Serializable{
	

	private int idOrdenVenta;
	

	private PortalDTO portal;

	public int getIdOrdenVenta() {
		return idOrdenVenta;
	}

	public void setIdOrdenVenta(int idOrdenVenta) {
		this.idOrdenVenta = idOrdenVenta;
	}

	public PortalDTO getPortal() {
		return portal;
	}

	public void setPortal(PortalDTO portal) {
		this.portal = portal;
	}

}
