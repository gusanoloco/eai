//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.25 at 11:26:14 PM EDT 
//


package example.eai.trading.oxm.domain;

import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the example.eai.trading.oxm.domain package. 
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

    private final static QName _Timestamp_QNAME = new QName("http://www.dev.com/oxm/domain", "timestamp");
    private final static QName _RoutingContext_QNAME = new QName("http://www.dev.com/oxm/domain", "RoutingContext");
    private final static QName _Response_QNAME = new QName("http://www.dev.com/oxm/domain", "Response");
    private final static QName _Request_QNAME = new QName("http://www.dev.com/oxm/domain", "Request");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: example.eai.trading.oxm.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RoutingContextType }
     * 
     */
    public RoutingContextType createRoutingContextType() {
        return new RoutingContextType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     */
    public RequestType createRequestType() {
        return new RequestType();
    }

    /**
     * Create an instance of {@link QuoteRequestType }
     * 
     */
    public QuoteRequestType createQuoteRequestType() {
        return new QuoteRequestType();
    }

    /**
     * Create an instance of {@link TradeResponseType }
     * 
     */
    public TradeResponseType createTradeResponseType() {
        return new TradeResponseType();
    }

    /**
     * Create an instance of {@link QuoteResponseType }
     * 
     */
    public QuoteResponseType createQuoteResponseType() {
        return new QuoteResponseType();
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link TradeRequestType }
     * 
     */
    public TradeRequestType createTradeRequestType() {
        return new TradeRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Calendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dev.com/oxm/domain", name = "timestamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Calendar> createTimestamp(Calendar value) {
        return new JAXBElement<Calendar>(_Timestamp_QNAME, Calendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingContextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dev.com/oxm/domain", name = "RoutingContext")
    public JAXBElement<RoutingContextType> createRoutingContext(RoutingContextType value) {
        return new JAXBElement<RoutingContextType>(_RoutingContext_QNAME, RoutingContextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dev.com/oxm/domain", name = "Response")
    public JAXBElement<ResponseType> createResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Response_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dev.com/oxm/domain", name = "Request")
    public JAXBElement<RequestType> createRequest(RequestType value) {
        return new JAXBElement<RequestType>(_Request_QNAME, RequestType.class, null, value);
    }

}
