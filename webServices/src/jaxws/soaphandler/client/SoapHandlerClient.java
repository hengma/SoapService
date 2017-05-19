package jaxws.soaphandler.client;

import jaxws.soaphandler.ws.ServerInfo1;
import jaxws.soaphandler.ws.ServerInfoService;


public class SoapHandlerClient {
	public static void main(String[] args) {
		ServerInfoService sis = new ServerInfoService();
		ServerInfo1 si = sis.getServerInfoPort();
 
		System.out.println(si.getServerName());
	}
}
