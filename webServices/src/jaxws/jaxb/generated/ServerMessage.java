//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.15 at 03:14:32 PM ICT 
//


package jaxws.jaxb.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correlation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageProperty" type="{}MessageProperty"/>
 *         &lt;element ref="{}serviceConfiguration"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "correlation",
    "messageProperty",
    "serviceConfiguration"
})
@XmlRootElement(name = "serverMessage")
public class ServerMessage {

    @XmlElement(required = true)
    protected String correlation;
    @XmlElement(required = true)
    protected MessageProperty messageProperty;
    @XmlElement(required = true)
    protected ServiceConfiguration serviceConfiguration;

    /**
     * Gets the value of the correlation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelation() {
        return correlation;
    }

    /**
     * Sets the value of the correlation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelation(String value) {
        this.correlation = value;
    }

    /**
     * Gets the value of the messageProperty property.
     * 
     * @return
     *     possible object is
     *     {@link MessageProperty }
     *     
     */
    public MessageProperty getMessageProperty() {
        return messageProperty;
    }

    /**
     * Sets the value of the messageProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageProperty }
     *     
     */
    public void setMessageProperty(MessageProperty value) {
        this.messageProperty = value;
    }

    /**
     * Gets the value of the serviceConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceConfiguration }
     *     
     */
    public ServiceConfiguration getServiceConfiguration() {
        return serviceConfiguration;
    }

    /**
     * Sets the value of the serviceConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceConfiguration }
     *     
     */
    public void setServiceConfiguration(ServiceConfiguration value) {
        this.serviceConfiguration = value;
    }

}