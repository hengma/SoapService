package jaxws.rpcstyle.endpoint;

import javax.xml.ws.Endpoint;

import jaxws.rpcstyle.ws.RpcImpl;

//Endpoint publisher
public class RpcPublisher{
 
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7777/ws/hello", new RpcImpl());
    }
 
}