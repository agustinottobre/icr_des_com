package despacho.ws.servicios.consumidos.clientsample;

import java.net.MalformedURLException;
import java.net.URL;

import despacho.ws.servicios.consumidos.*;

public class ClientSample {
	
//	private static String WS_URL = "http://25.13.74.32:8080/testdespachoWEB/ServidorEstadoEntregaBean?wsdl";
	private static String WS_URL = "http://localhost:8080/testdespachoWEB/ServidorEstadoEntregaBean?wsdl";

	public static void main(String[] args) {
		try{
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        ServidorEstadoEntregaBeanService service1 = new ServidorEstadoEntregaBeanService(new URL(WS_URL));
	        System.out.println("Create Web Service...");
	        ServidorEstadoEntregaBean port1 = service1.getServidorEstadoEntregaBeanPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.notificarEntregaDespacho(57));
	        System.out.println("Create Web Service...");
	        ServidorEstadoEntregaBean port2 = service1.getServidorEstadoEntregaBeanPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.notificarEntregaDespacho(92));
	        System.out.println("***********************");
	        System.out.println("Call Over!");
		}catch(MalformedURLException mue){
			mue.printStackTrace();
		}
	}
}
