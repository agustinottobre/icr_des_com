package despacho.rest.bindings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

public class ArticulosRecibidos implements Serializable {

/**
* 
*/
private String idModulo;
/**
* 
*/
private String idSolicitud;
/**
* 
*/
private List<Item> items = new ArrayList<Item>();
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The idModulo
*/
public String getIdModulo() {
return idModulo;
}

/**
* 
* @param idModulo
* The idModulo
*/
public void setIdModulo(String idModulo) {
this.idModulo = idModulo;
}

/**
* 
* @return
* The idSolicitud
*/
public String getIdSolicitud() {
return idSolicitud;
}

/**
* 
* @param idSolicitud
* The idSolicitud
*/
public void setIdSolicitud(String idSolicitud) {
this.idSolicitud = idSolicitud;
}

/**
* 
* @return
* The items
*/
public List<Item> getItems() {
return items;
}

/**
* 
* @param items
* The items
*/
public void setItems(List<Item> items) {
this.items = items;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}