package despacho.rest.bindings;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Item {

/**
* 
*/
private Double cantidad;
/**
* 
*/
private String codigo;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The cantidad
*/
public Double getCantidad() {
return cantidad;
}

/**
* 
* @param cantidad
* The cantidad
*/
public void setCantidad(Double cantidad) {
this.cantidad = cantidad;
}

/**
* 
* @return
* The codigo
*/
public String getCodigo() {
return codigo;
}

/**
* 
* @param codigo
* The codigo
*/
public void setCodigo(String codigo) {
this.codigo = codigo;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}