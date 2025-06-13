//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.05.25 at 10:08:12 AM BST 
//


package ubl.xsd.generated.xs11;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PnBFieldParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnBFieldParamsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.w3.org/2009/xmldsig11#}CharTwoFieldParamsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="K1" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="K2" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="K3" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnBFieldParamsType", propOrder = {
    "k1",
    "k2",
    "k3"
})
public class PnBFieldParamsType
    extends CharTwoFieldParamsType
{

    @XmlElement(name = "K1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger k1;
    @XmlElement(name = "K2", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger k2;
    @XmlElement(name = "K3", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger k3;

    /**
     * Gets the value of the k1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getK1() {
        return k1;
    }

    /**
     * Sets the value of the k1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK1(BigInteger value) {
        this.k1 = value;
    }

    /**
     * Gets the value of the k2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getK2() {
        return k2;
    }

    /**
     * Sets the value of the k2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK2(BigInteger value) {
        this.k2 = value;
    }

    /**
     * Gets the value of the k3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getK3() {
        return k3;
    }

    /**
     * Sets the value of the k3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setK3(BigInteger value) {
        this.k3 = value;
    }

}
