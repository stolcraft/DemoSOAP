package eu.ensup.demows.presentation;
import javax.jws.HandlerChain;
import javax.jws.WebService;

@WebService(endpointInterface = "eu.ensup.demows.presentation.HelloObjis")
@HandlerChain(file = "LogMessageHandler.xml")
public class HelloObjisWS implements HelloObjis{

	public String ditBonjour(String nom) {
		// TODO Auto-generated method stub
		return "Hello : " + nom + "!";
	}

}
