package jaxws.jaxb;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import jaxws.jaxb.generated.ServerMessage;

public class TestJaxb {

	public static void main(String[] args) {
		
		//DOS command to generate java class: xjc ServerMessage.xsd
		
		JAXBContext context;
		try {
			//xml to java
			context = JAXBContext.newInstance(ServerMessage.class);
			javax.xml.bind.Unmarshaller unmarshaller = context.createUnmarshaller();
			ServerMessage serverMessage = (ServerMessage) unmarshaller.unmarshal(new File("./xml/TransferServerMessage.xml"));
			System.out.println(serverMessage);
			
			//java to xml
			javax.xml.bind.Marshaller marshaller = context.createMarshaller();
			StringWriter sw = new StringWriter();
			marshaller.marshal(serverMessage, sw);
			System.out.println(sw.toString());
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
    }
}
