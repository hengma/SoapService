package jaxws.soaphandler.endpoint;

import javax.xml.ws.Endpoint;

import jaxws.soaphandler.ws.ServerInfo;

public class SoapHandlerPublisher {
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8888/ws/server", new ServerInfo());

		System.out.println("Service is published!");
	}
}
