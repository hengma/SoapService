package jaxws.documentstyle.endpoint;

import javax.xml.ws.Endpoint;

import jaxws.documentstyle.ws.DocumentImpl;

//Endpoint publisher
public class DocumentPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new DocumentImpl());
	}

}