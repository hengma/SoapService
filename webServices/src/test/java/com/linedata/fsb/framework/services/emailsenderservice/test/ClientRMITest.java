package com.linedata.fsb.framework.services.emailsenderservice.test;

/*import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;

import com.fimasys.services.framework.commons.utility.FsbUtil;
import com.fimasys.services.shared.emailsender.EmailSenderService;
import com.linedata.fsb.framework.services.emailsenderservice.EmailSenderServiceHelper;
*/
public class ClientRMITest {

	
	public static void main(String arg[]) {
		
		/*com.fimasys.services.shared.emailsender.vo.Email email = new com.fimasys.services.shared.emailsender.vo.Email();
		email.setRecipient("mao.heng@nokor-group.com");
		email.setSubject("Test");
		
		com.fimasys.services.shared.emailsender.vo.Body body = new com.fimasys.services.shared.emailsender.vo.Body();
		body.setBodyType("<![CDATA[HTML]]>");
		body.setTextBody("Testing EmailSender");
		body.setHtmlBody(EmailSenderServiceHelper.stripCDATA("<![CDATA[<![CDATA[<!DOCTYPE html><html><body><h1>Testing EmailSender</h1></body></html>]]>]]>"));
		
		email.setBody(body);
		
		try {
			Registry reg = FsbUtil.getFsbRegistry();

			EmailSenderService service = (EmailSenderService) reg.lookup("fimasys/framework/fsb-email-sender-service");
			service.sendMail(email);

		} catch (RemoteException e) {
			e.printStackTrace();

		} catch (NotBoundException e) {
			e.printStackTrace();
		}*/
	}
	
}
