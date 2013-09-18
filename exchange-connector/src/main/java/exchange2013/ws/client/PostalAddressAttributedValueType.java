
package exchange2013.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostalAddressAttributedValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddressAttributedValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://schemas.microsoft.com/exchange/services/2006/types}PersonaPostalAddressType"/>
 *         &lt;element name="Attributions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfValueAttributionsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddressAttributedValueType", propOrder = {
    "value",
    "attributions"
})
public class PostalAddressAttributedValueType {

    @XmlElement(name = "Value", required = true)
    protected PersonaPostalAddressType value;
    @XmlElement(name = "Attributions", required = true)
    protected ArrayOfValueAttributionsType attributions;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link PersonaPostalAddressType }
     *     
     */
    public PersonaPostalAddressType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaPostalAddressType }
     *     
     */
    public void setValue(PersonaPostalAddressType value) {
        this.value = value;
    }

    /**
     * Gets the value of the attributions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfValueAttributionsType }
     *     
     */
    public ArrayOfValueAttributionsType getAttributions() {
        return attributions;
    }

    /**
     * Sets the value of the attributions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfValueAttributionsType }
     *     
     */
    public void setAttributions(ArrayOfValueAttributionsType value) {
        this.attributions = value;
    }

}