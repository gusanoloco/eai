//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.07.25 at 11:26:14 PM EDT 
//


package example.eai.trading.oxm.domain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for codeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="codeTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A100"/>
 *     &lt;enumeration value="B102"/>
 *     &lt;enumeration value="C500"/>
 *     &lt;enumeration value="D200"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "codeTypeEnum")
@XmlEnum
public enum CodeTypeEnum {

    @XmlEnumValue("A100")
    A_100("A100"),
    @XmlEnumValue("B102")
    B_102("B102"),
    @XmlEnumValue("C500")
    C_500("C500"),
    @XmlEnumValue("D200")
    D_200("D200");
    private final String value;

    CodeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodeTypeEnum fromValue(String v) {
        for (CodeTypeEnum c: CodeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
