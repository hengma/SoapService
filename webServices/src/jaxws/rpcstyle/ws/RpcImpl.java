package jaxws.rpcstyle.ws;

import javax.jws.WebService;

//Service Implementation
/**
 * @WebService(endpointInterface, name, portName, serviceName, targetNamespace, wsdlLocation)
 * endpointInterface -> define an interface of webservice. 
 * 						This annotation allows the developer to separate the 
 * 						interface contract from the implementation
 * 
 * name              -> <port name="...Port"(in WSDL file)
 * 
 * portName			 -> <port name="..."(in WSDL file)
 * 
 * serviceName		 -> <service name="RpcImplService"(in WSDL file)
 * 
 * targetNamespace   -> Ex: tns:Rpc
 * 						The targetNamespace is used for the namespace for the wsdl:portType wsdl:service, wsdl:binding
 * 						(and associated XML elements). 
 * 						If this property is not specified, the target namespace is derived from the package name.
 * 
 * wsdlLocation      -> Ex: http://localhost:7777/ws/hello?wsdl
 * 						Define location of wsdl file. The default is the URI at which the service is deployed.
 * 
 * @author heng.mao
 *
 */
@WebService(endpointInterface = "jaxws.rpcstyle.ws.Rpc", name = "Rpc", portName = "RpcPort", serviceName = "RpcImplService")
public class RpcImpl implements Rpc {
 
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}
 
}