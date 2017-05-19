package jaxws.mtom.ws;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.soap.MTOM;

//Service Implementation Bean
@MTOM(enabled = true, threshold = 2000)
@WebService(endpointInterface = "jaxws.mtom.ws.ImageServer")
public class ImageServerImpl implements ImageServer {
 
	@Override
	public Image downloadImage(String name) {
 
		try {
 
			File image = new File(name);
			return ImageIO.read(image);
 
		} catch (IOException e) {
 
			e.printStackTrace();
			return null; 
 
		}
	}
 
	@Override
	public String uploadImage(Image data) {
 
		if(data!=null){
			
			return "Upload Successful";
		}
 
		throw new WebServiceException("Upload Failed!");
 
	}
 
}
