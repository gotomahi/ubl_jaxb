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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ECParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldID" type="{http://www.w3.org/2009/xmldsig11#}FieldIDType"/&gt;
 *         &lt;element name="Curve" type="{http://www.w3.org/2009/xmldsig11#}CurveType"/&gt;
 *         &lt;element name="Base" type="{http://www.w3.org/2009/xmldsig11#}ECPointType"/&gt;
 *         &lt;element name="Order" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *         &lt;element name="CoFactor" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ValidationData" type="{http://www.w3.org/2009/xmldsig11#}ECValidationDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECParametersType", propOrder = {
    "fieldID",
    "curve",
    "base",
    "order",
    "coFactor",
    "validationData"
})
public class ECParametersType {

    @XmlElement(name = "FieldID", required = true)
    protected FieldIDType fieldID;
    @XmlElement(name = "Curve", required = true)
    protected CurveType curve;
    @XmlElement(name = "Base", required = true)
    protected byte[] base;
    @XmlElement(name = "Order", required = true)
    protected byte[] order;
    @XmlElement(name = "CoFactor")
    protected BigInteger coFactor;
    @XmlElement(name = "ValidationData")
    protected ECValidationDataType validationData;

    /**
     * Gets the value of the fieldID property.
     * 
     * @return
     *     possible object is
     *     {@link FieldIDType }
     *     
     */
    public FieldIDType getFieldID() {
        return fieldID;
    }

    /**
     * Sets the value of the fieldID property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldIDType }
     *     
     */
    public void setFieldID(FieldIDType value) {
        this.fieldID = value;
    }

    /**
     * Gets the value of the curve property.
     * 
     * @return
     *     possible object is
     *     {@link CurveType }
     *     
     */
    public CurveType getCurve() {
        return curve;
    }

    /**
     * Sets the value of the curve property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurveType }
     *     
     */
    public void setCurve(CurveType value) {
        this.curve = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBase(byte[] value) {
        this.base = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOrder(byte[] value) {
        this.order = value;
    }

    /**
     * Gets the value of the coFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCoFactor() {
        return coFactor;
    }

    /**
     * Sets the value of the coFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCoFactor(BigInteger value) {
        this.coFactor = value;
    }

    /**
     * Gets the value of the validationData property.
     * 
     * @return
     *     possible object is
     *     {@link ECValidationDataType }
     *     
     */
    public ECValidationDataType getValidationData() {
        return validationData;
    }

    /**
     * Sets the value of the validationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECValidationDataType }
     *     
     */
    public void setValidationData(ECValidationDataType value) {
        this.validationData = value;
    }

}
