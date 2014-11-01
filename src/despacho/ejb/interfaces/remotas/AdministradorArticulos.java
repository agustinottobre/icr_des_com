package despacho.ejb.interfaces.remotas;

import javax.ejb.Remote;

import dto.ArticuloDTO;

//interfaz del session bean AdministradorArticulos
@Remote
public interface AdministradorArticulos {
	
	public String testEJB();
	
	public ArticuloDTO altaArticulo(String codigo, String nombre, String idModulo);
	
	public ArticuloDTO BuscarArticulo(int idArticulo);
}
