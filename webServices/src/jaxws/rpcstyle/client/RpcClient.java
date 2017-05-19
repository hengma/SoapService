package jaxws.rpcstyle.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;

import jaxws.rpcstyle.ws.Rpc;
import jaxws.rpcstyle.ws.RpcImpl;

public class RpcClient {

	public static void main(String[] args) throws Exception {

		Endpoint endpoint = Endpoint.create(new RpcImpl());
		endpoint.publish("http://localhost:9999/ws/hello");
		try {
			URL url = new URL("http://localhost:9999/ws/hello?wsdl");

			// 1st argument service URI, refer to wsdl document above
			// 2nd argument is service name, refer to wsdl document above
			QName qname = new QName("http://ws.rpcstyle.jaxws/",
					"RpcImplService");

			Service service = Service.create(url, qname);

			Rpc hello = service.getPort(Rpc.class);

			System.out.println(hello.getHelloWorldAsString("<RPC Style>"));

			endpoint.stop();
		} catch (Exception e) {
			e.printStackTrace();
			endpoint.stop();
		}
	}

}