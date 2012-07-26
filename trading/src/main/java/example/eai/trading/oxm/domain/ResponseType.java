//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.25 at 11:14:04 PM EDT 
//


package example.eai.trading.oxm.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuoteResponse" type="{http://www.dev.com/oxm/domain}QuoteResponseType" minOccurs="0"/>
 *         &lt;element name="TradeResponse" type="{http://www.dev.com/oxm/domain}TradeResponseType" minOccurs="0"/>
 *         &lt;element name="Fault" type="{http://www.dev.com/oxm/domain}FaultType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "quoteResponse",
    "tradeResponse",
    "fault"
})
public class ResponseType {

    @XmlElement(name = "QuoteResponse")
    protected QuoteResponseType quoteResponse;
    @XmlElement(name = "TradeResponse")
    protected TradeResponseType tradeResponse;
    @XmlElement(name = "Fault")
    protected FaultType fault;

    /**
     * Gets the value of the quoteResponse property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteResponseType }
     *     
     */
    public QuoteResponseType getQuoteResponse() {
        return quoteResponse;
    }

    /**
     * Sets the value of the quoteResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteResponseType }
     *     
     */
    public void setQuoteResponse(QuoteResponseType value) {
        this.quoteResponse = value;
    }

    /**
     * Gets the value of the tradeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TradeResponseType }
     *     
     */
    public TradeResponseType getTradeResponse() {
        return tradeResponse;
    }

    /**
     * Sets the value of the tradeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeResponseType }
     *     
     */
    public void setTradeResponse(TradeResponseType value) {
        this.tradeResponse = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link FaultType }
     *     
     */
    public FaultType getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultType }
     *     
     */
    public void setFault(FaultType value) {
        this.fault = value;
    }

}