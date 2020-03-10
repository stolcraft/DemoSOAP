package eu.ensup.demows.presentation;

import javax.jws.soap.*;
import javax.jws.WebService;

@WebService
//@SOAPBinding(style= SOAPBinding.Style.RPC)
//permet de definir tous les types transports ( genre chaine ou des entiers ou des objets)
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface HelloObjis {

	String ditBonjour(String name);
}
