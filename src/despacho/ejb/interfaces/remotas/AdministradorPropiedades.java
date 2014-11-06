package despacho.ejb.interfaces.remotas;

import java.util.Map;
import java.util.Set;

import javax.ejb.Remote;

@Remote
public interface AdministradorPropiedades {
	public Map<String, String> getPropiedades();
}
