//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.02 at 10:38:26 PM EDT 
//


package example.eai.trading.oxm.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for buySellIndicatorTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="buySellIndicatorTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUY"/>
 *     &lt;enumeration value="SELL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "buySellIndicatorTypeEnum")
@XmlEnum
public enum BuySellIndicatorTypeEnum {

    BUY,
    SELL;

    public String value() {
        return name();
    }

    public static BuySellIndicatorTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
