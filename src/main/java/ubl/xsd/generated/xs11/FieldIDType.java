//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.05.25 at 10:08:12 AM BST 
//


package ubl.xsd.generated.xs11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for FieldIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldIDType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.w3.org/2009/xmldsig11#}Prime"/&gt;
 *         &lt;element ref="{http://www.w3.org/2009/xmldsig11#}TnB"/&gt;
 *         &lt;element ref="{http://www.w3.org/2009/xmldsig11#}PnB"/&gt;
 *         &lt;element ref="{http://www.w3.org/2009/xmldsig11#}GnB"/&gt;
 *         &lt;any processContents='lax' namespace='##other'/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldIDType", propOrder = {
    "prime",
    "tnB",
    "pnB",
    "gnB",
    "any"
})
public class FieldIDType {

    @XmlElement(name = "Prime")
    protected PrimeFieldParamsType prime;
    @XmlElement(name = "TnB")
    protected TnBFieldParamsType tnB;
    @XmlElement(name = "PnB")
    protected PnBFieldParamsType pnB;
    @XmlElement(name = "GnB")
    protected CharTwoFieldParamsType gnB;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the prime property.
     * 
     * @return
     *     possible object is
     *     {@link PrimeFieldParamsType }
     *     
     */
    public PrimeFieldParamsType getPrime() {
        return prime;
    }

    /**
     * Sets the value of the prime property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimeFieldParamsType }
     *     
     */
    public void setPrime(PrimeFieldParamsType value) {
        this.prime = value;
    }

    /**
     * Gets the value of the tnB property.
     * 
     * @return
     *     possible object is
     *     {@link TnBFieldParamsType }
     *     
     */
    public TnBFieldParamsType getTnB() {
        return tnB;
    }

    /**
     * Sets the value of the tnB property.
     * 
     * @param value
     *     allowed object is
     *     {@link TnBFieldParamsType }
     *     
     */
    public void setTnB(TnBFieldParamsType value) {
        this.tnB = value;
    }

    /**
     * Gets the value of the pnB property.
     * 
     * @return
     *     possible object is
     *     {@link PnBFieldParamsType }
     *     
     */
    public PnBFieldParamsType getPnB() {
        return pnB;
    }

    /**
     * Sets the value of the pnB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PnBFieldParamsType }
     *     
     */
    public void setPnB(PnBFieldParamsType value) {
        this.pnB = value;
    }

    /**
     * Gets the value of the gnB property.
     * 
     * @return
     *     possible object is
     *     {@link CharTwoFieldParamsType }
     *     
     */
    public CharTwoFieldParamsType getGnB() {
        return gnB;
    }

    /**
     * Sets the value of the gnB property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharTwoFieldParamsType }
     *     
     */
    public void setGnB(CharTwoFieldParamsType value) {
        this.gnB = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
