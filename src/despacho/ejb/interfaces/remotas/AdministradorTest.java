package despacho.ejb.interfaces.remotas;

import javax.ejb.Remote;

//interfaz del session bean AdministradorArticulos
@Remote
public interface AdministradorTest {
	
	public String testEJB();
	
	public void persistirPortal(String descripcionPortal);
	
	public String testEnviarSolicitudArticuloDepositoClienteJMS();
	
	public String testRecibirOrdenDespachoPorWSDesdeLogistica();
	
	public String testRecibirArticulosPorRESTDesdeDeposito();
}
