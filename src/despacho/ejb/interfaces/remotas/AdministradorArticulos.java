package despacho.ejb.interfaces.remotas;

import java.util.List;

import javax.ejb.Remote;

import dto.ArticuloDTO;

//interfaz del session bean AdministradorArticulos
@Remote
public interface AdministradorArticulos {
	
	//Devolver null si no pudo guardar, sino devuelve el mismo ArticuloDTO
	//Si existe hacer un update, sino existe hacer el alta
	public boolean altaArticulo(ArticuloDTO articulo);
	
	//Buscar Articulo
//	public ArticuloDTO BuscarArticulo(int idArticulo);
	
	//Actualizar Articulo
	public ArticuloDTO actualizarArticulo(ArticuloDTO articulo);
	
	public List<ArticuloDTO> ArticulosPorDeposito(int idDeposito);
}
