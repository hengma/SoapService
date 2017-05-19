
package com.linedata.fsb.framework.services.emailsenderservice.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.linedata.fsb.framework.services.emailsenderservice.test package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendMail_QNAME = new QName("http://emailsender.shared.services.fimasys.com/", "sendMail");
    private final static QName _SendMailResponse_QNAME = new QName("http://emailsender.shared.services.fimasys.com/", "sendMailResponse");
    private final static QName _BODY_QNAME = new QName("http://emailsender.shared.services.fimasys.com/", "BODY");
    private final static QName _EMAIL_QNAME = new QName("http://emailsender.shared.services.fimasys.com/", "EMAIL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.linedata.fsb.framework.services.emailsenderservice.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendMail }
     * 
     */
    public SendMail createSendMail() {
        return new SendMail();
    }

    /**
     * Create an instance of {@link SendMailResponse }
     * 
     */
    public SendMailResponse createSendMailResponse() {
        return new SendMailResponse();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://emailsender.shared.services.fimasys.com/", name = "sendMail")
    public JAXBElement<SendMail> createSendMail(SendMail value) {
        return new JAXBElement<SendMail>(_SendMail_QNAME, SendMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://emailsender.shared.services.fimasys.com/", name = "sendMailResponse")
    public JAXBElement<SendMailResponse> createSendMailResponse(SendMailResponse value) {
        return new JAXBElement<SendMailResponse>(_SendMailResponse_QNAME, SendMailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Body }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://emailsender.shared.services.fimasys.com/", name = "BODY")
    public JAXBElement<Body> createBODY(Body value) {
        return new JAXBElement<Body>(_BODY_QNAME, Body.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Email }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://emailsender.shared.services.fimasys.com/", name = "EMAIL")
    public JAXBElement<Email> createEMAIL(Email value) {
        return new JAXBElement<Email>(_EMAIL_QNAME, Email.class, null, value);
    }

}
