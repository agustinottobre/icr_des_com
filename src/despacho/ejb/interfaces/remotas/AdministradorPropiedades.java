package despacho.ejb.interfaces.remotas;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.ejb.Remote;

@Remote
public interface AdministradorPropiedades {
	public Properties getPropiedades();
	
	public Object get(String key);
	
	public void put(String key, Object value);
}
