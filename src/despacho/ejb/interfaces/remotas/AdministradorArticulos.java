package despacho.ejb.interfaces.remotas;

import java.util.List;

import javax.ejb.Remote;

import dto.ArticuloDTO;

//interfaz del session bean AdministradorArticulos
@Remote
public interface AdministradorArticulos {
	
	public String testEJB();
	
	//Devolver null si no pudo guardar, sino devuelve el mismo ArticuloDTO
	//Si existe hacer un update, sino existe hacer el alta
	public ArticuloDTO altaArticulo(ArticuloDTO articulo);
	
	//Buscar Articulo
	public ArticuloDTO BuscarArticulo(int idArticulo);
	
	//Actualizar Articulo
	public ArticuloDTO actualizarArticulo(ArticuloDTO articulo);
	
	public List<ArticuloDTO> ArticulosPorDeposito(int idDeposito);
}
