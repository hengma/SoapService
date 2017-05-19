package jaxws.mtom.client;

import java.awt.Image;
import java.io.File;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;

import jaxws.mtom.ws.ImageServer;
import jaxws.mtom.ws.ImageServerImpl;

public class ImageDownloadClient{
	 
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
	 
	        //************  test download  ***************//*
	        Image image = imageServer.downloadImage(currentPath + "rss.jpg");
	 
	        //display it in frame
	        JFrame frame = new JFrame();
	        frame.setSize(300, 300);
	        JLabel label = new JLabel(new ImageIcon(image));
	        frame.add(label);
	        frame.setVisible(true);
	 
	        System.out.println("imageServer.downloadImage() : Download Successful!");

			endpoint.stop();
		} catch (Exception e) {
			e.printStackTrace();
			endpoint.stop();
		}
 
    }
 
}