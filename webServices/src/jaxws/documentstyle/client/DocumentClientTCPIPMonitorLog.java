package jaxws.documentstyle.client;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;

import jaxws.documentstyle.ws.Document;
import jaxws.documentstyle.ws.DocumentImpl;

/**
 * 
 * In Eclipse IDE, access Windows �> Preferences �> Run/Debug �> TCP/IP Monitor
 * 
 * Local monitoring port:8888
 * Host name            : localhost
 * Port                 : 9999(webservice port published)
 * Type					: TCP/IP
 * 
 * @author heng.mao
 *
 */
public class DocumentClientTCPIPMonitorLog {
	public static void main(String[] args) throws Exception {

		Endpoint endpoint = Endpoint.create(new DocumentImpl());
		endpoint.publish("http://localhost:9999/ws/hello");
		try {
			URL url = new URL("http://localhost:8888/ws/hello?wsdl");

			// 1st argument service URI, refer to wsdl document above
			// 2nd argument is service name, refer to wsdl document above
			//For ws.documentstyle.jaxws, it should be package reversed name: ws->documentstyle->jaxws
			QName qname = new QName("http://ws.documentstyle.jaxws/",
					"DocumentImplService");

			Service service = Service.create(url, qname);

			Document hello = service.getPort(Document.class);
			
			System.out.println(hello.getHelloWorldAsString("<Document Style>", "sex"));
			
			endpoint.stop();
		} catch (Exception e) {
			e.printStackTrace();
			endpoint.stop();
		}
	}

}
