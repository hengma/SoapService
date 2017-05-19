package jaxws.mtom.client;

import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import jaxws.mtom.ws.ImageServer;
import jaxws.mtom.ws.ImageServerImpl;

public class ImageUploadClient{
	 
	public static void main(String[] args) throws Exception {

		String currentPath = new File(".").getCanonicalPath() + "\\download\\";

        Endpoint endpoint = Endpoint.create(new ImageServerImpl());
		endpoint.publish("http://localhost:9999/ws/image");
		try {
			URL url = new URL("http://localhost:9999/ws/image?wsdl");

			// 1st argument service URI, refer to wsdl document above
			// 2nd argument is service name, refer to wsdl document above
			QName qname = new QName("http://ws.mtom.jaxws/", "ImageServerImplService");

			Service service = Service.create(url, qname);
	        ImageServer imageServer = service.getPort(ImageServer.class);
	 
	        //************  test upload ****************/
	        Image imgUpload = ImageIO.read(new File(currentPath + "rss.jpg"));
	 
	        //enable MTOM in client
	        BindingProvider bp = (BindingProvider) imageServer;
	        SOAPBinding binding = (SOAPBinding) bp.getBinding();
	        binding.setMTOMEnabled(true);
	 
	        String status = imageServer.uploadImage(imgUpload);
	        System.out.println("imageServer.uploadImage() : " + status);

			endpoint.stop();
		} catch (Exception e) {
			e.printStackTrace();
			endpoint.stop();
		}
 
    }
 
}