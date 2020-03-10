package eu.ensup.demows.presentation;

import javax.xml.ws.Endpoint;

public class HelloObjisPublisher {
	
	public static final String URL = "http://localhost:8888/hello";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crée une instance de l'implémentation
		HelloObjisWS impl = new HelloObjisWS();
		
		//Rend disponibe l'instance
		Endpoint endpoint = Endpoint.publish(URL, impl);
		
		//Teste la disponibilité du endpoint
		boolean status = endpoint.isPublished();
		System.out.println("web status disponible ? : " + status);
	}

}
