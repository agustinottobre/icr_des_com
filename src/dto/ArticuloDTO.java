package dto;

import java.io.Serializable;

public class ArticuloDTO implements Serializable{
	
	private int idArticulo;
	private String descripcion;
	private String marca;
	private String modelo;
	private int idDeposito;
	public int getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getIdDeposito() {
		return idDeposito;
	}
	public void setIdDeposito(int idDeposito) {
		this.idDeposito = idDeposito;
	}
	
}
