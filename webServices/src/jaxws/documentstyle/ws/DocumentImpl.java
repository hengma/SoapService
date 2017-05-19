package jaxws.documentstyle.ws;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "jaxws.documentstyle.ws.Document")
public class DocumentImpl implements Document {

	@Override
	public String getHelloWorldAsString(String name, String sex) {
		return "Hello World JAX-WS " + name + sex;
	}

}