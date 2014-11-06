package despacho.rest.bindings;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

public class RespuestaRest {

/**
* 
*/
private String estado;
/**
* 
*/
private String mensaje;

/**
* 
* @return
* The cantidad
*/
public String getEstado() {
	return estado;
}

/**
* 
* @param cantidad
* The cantidad
*/
public void setEstado(String estado) {
this.estado = estado;
}

/**
* 
* @return
* The codigo
*/
public String getMensaje() {
return mensaje;
}

/**
* 
* @param codigo
* The codigo
*/
public void setMensaje(String mensaje) {
this.mensaje = mensaje;
}

}