//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.05.25 at 10:08:12 AM BST 
//


package ubl.xsd.generated.udt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ubl.xsd.generated.cbc.ActualTemperatureReductionQuantityType;
import ubl.xsd.generated.cbc.BackorderQuantityType;
import ubl.xsd.generated.cbc.BaseQuantityType;
import ubl.xsd.generated.cbc.BasicConsumedQuantityType;
import ubl.xsd.generated.cbc.BatchQuantityType;
import ubl.xsd.generated.cbc.ChargeableQuantityType;
import ubl.xsd.generated.cbc.ChildConsignmentQuantityType;
import ubl.xsd.generated.cbc.ConsignmentQuantityType;
import ubl.xsd.generated.cbc.ConsumerUnitQuantityType;
import ubl.xsd.generated.cbc.ConsumptionEnergyQuantityType;
import ubl.xsd.generated.cbc.ConsumptionWaterQuantityType;
import ubl.xsd.generated.cbc.ContentUnitQuantityType;
import ubl.xsd.generated.cbc.CreditedQuantityType;
import ubl.xsd.generated.cbc.CrewQuantityType;
import ubl.xsd.generated.cbc.CustomsTariffQuantityType;
import ubl.xsd.generated.cbc.DebitedQuantityType;
import ubl.xsd.generated.cbc.DeliveredQuantityType;
import ubl.xsd.generated.cbc.DifferenceTemperatureReductionQuantityType;
import ubl.xsd.generated.cbc.EmployeeQuantityType;
import ubl.xsd.generated.cbc.EstimatedConsumedQuantityType;
import ubl.xsd.generated.cbc.EstimatedOverallContractQuantityType;
import ubl.xsd.generated.cbc.ExpectedOperatorQuantityType;
import ubl.xsd.generated.cbc.ExpectedQuantityType;
import ubl.xsd.generated.cbc.GasPressureQuantityType;
import ubl.xsd.generated.cbc.InvoicedQuantityType;
import ubl.xsd.generated.cbc.LatestMeterQuantityType;
import ubl.xsd.generated.cbc.MaximumBackorderQuantityType;
import ubl.xsd.generated.cbc.MaximumOperatorQuantityType;
import ubl.xsd.generated.cbc.MaximumOrderQuantityType;
import ubl.xsd.generated.cbc.MaximumQuantityType;
import ubl.xsd.generated.cbc.MaximumVariantQuantityType;
import ubl.xsd.generated.cbc.MinimumBackorderQuantityType;
import ubl.xsd.generated.cbc.MinimumInventoryQuantityType;
import ubl.xsd.generated.cbc.MinimumOrderQuantityType;
import ubl.xsd.generated.cbc.MinimumQuantityType;
import ubl.xsd.generated.cbc.MultipleOrderQuantityType;
import ubl.xsd.generated.cbc.NormalTemperatureReductionQuantityType;
import ubl.xsd.generated.cbc.OperatingYearsQuantityType;
import ubl.xsd.generated.cbc.OutstandingQuantityType;
import ubl.xsd.generated.cbc.OversupplyQuantityType;
import ubl.xsd.generated.cbc.PackQuantityType;
import ubl.xsd.generated.cbc.PassengerQuantityType;
import ubl.xsd.generated.cbc.PerformanceValueQuantityType;
import ubl.xsd.generated.cbc.PreviousMeterQuantityType;
import ubl.xsd.generated.cbc.ReceivedElectronicTenderQuantityType;
import ubl.xsd.generated.cbc.ReceivedForeignTenderQuantityType;
import ubl.xsd.generated.cbc.ReceivedQuantityType;
import ubl.xsd.generated.cbc.ReceivedTenderQuantityType;
import ubl.xsd.generated.cbc.RejectedQuantityType;
import ubl.xsd.generated.cbc.ResponseQuantityType;
import ubl.xsd.generated.cbc.ReturnableQuantityType;
import ubl.xsd.generated.cbc.SharesNumberQuantityType;
import ubl.xsd.generated.cbc.ShortQuantityType;
import ubl.xsd.generated.cbc.TargetInventoryQuantityType;
import ubl.xsd.generated.cbc.ThresholdQuantityType;
import ubl.xsd.generated.cbc.TimeDeltaDaysQuantityType;
import ubl.xsd.generated.cbc.TotalConsumedQuantityType;
import ubl.xsd.generated.cbc.TotalDeliveredQuantityType;
import ubl.xsd.generated.cbc.TotalGoodsItemQuantityType;
import ubl.xsd.generated.cbc.TotalMeteredQuantityType;
import ubl.xsd.generated.cbc.TotalPackageQuantityType;
import ubl.xsd.generated.cbc.TotalPackagesQuantityType;
import ubl.xsd.generated.cbc.TotalTransportHandlingUnitQuantityType;
import ubl.xsd.generated.cbc.ValueQuantityType;
import ubl.xsd.generated.cbc.VarianceQuantityType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UBLUDT0000018&lt;/ccts:UniqueID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:CategoryCode xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;UDT&lt;/ccts:CategoryCode&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:VersionID xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;1.0&lt;/ccts:VersionID&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A counted number of non-monetary units, possibly including a fractional part.&lt;/ccts:Definition&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:RepresentationTermName xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Quantity&lt;/ccts:RepresentationTermName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns:ccts-cct="urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;decimal&lt;/ccts:PrimitiveType&gt;
 * </pre>
 * 
 * 
 * <p>Java class for QuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:un:unece:uncefact:data:specification:CoreComponentTypeSchemaModule:2&gt;QuantityType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityType")
@XmlSeeAlso({
    ActualTemperatureReductionQuantityType.class,
    BackorderQuantityType.class,
    BaseQuantityType.class,
    BasicConsumedQuantityType.class,
    BatchQuantityType.class,
    ChargeableQuantityType.class,
    ChildConsignmentQuantityType.class,
    ConsignmentQuantityType.class,
    ConsumerUnitQuantityType.class,
    ConsumptionEnergyQuantityType.class,
    ConsumptionWaterQuantityType.class,
    ContentUnitQuantityType.class,
    CreditedQuantityType.class,
    CrewQuantityType.class,
    CustomsTariffQuantityType.class,
    DebitedQuantityType.class,
    DeliveredQuantityType.class,
    DifferenceTemperatureReductionQuantityType.class,
    EmployeeQuantityType.class,
    EstimatedConsumedQuantityType.class,
    EstimatedOverallContractQuantityType.class,
    ExpectedOperatorQuantityType.class,
    ExpectedQuantityType.class,
    GasPressureQuantityType.class,
    InvoicedQuantityType.class,
    LatestMeterQuantityType.class,
    MaximumBackorderQuantityType.class,
    MaximumOperatorQuantityType.class,
    MaximumOrderQuantityType.class,
    MaximumQuantityType.class,
    MaximumVariantQuantityType.class,
    MinimumBackorderQuantityType.class,
    MinimumInventoryQuantityType.class,
    MinimumOrderQuantityType.class,
    MinimumQuantityType.class,
    MultipleOrderQuantityType.class,
    NormalTemperatureReductionQuantityType.class,
    OperatingYearsQuantityType.class,
    OutstandingQuantityType.class,
    OversupplyQuantityType.class,
    PackQuantityType.class,
    PassengerQuantityType.class,
    PerformanceValueQuantityType.class,
    PreviousMeterQuantityType.class,
    ubl.xsd.generated.cbc.QuantityType.class,
    ReceivedElectronicTenderQuantityType.class,
    ReceivedForeignTenderQuantityType.class,
    ReceivedQuantityType.class,
    ReceivedTenderQuantityType.class,
    RejectedQuantityType.class,
    ResponseQuantityType.class,
    ReturnableQuantityType.class,
    SharesNumberQuantityType.class,
    ShortQuantityType.class,
    TargetInventoryQuantityType.class,
    ThresholdQuantityType.class,
    TimeDeltaDaysQuantityType.class,
    TotalConsumedQuantityType.class,
    TotalDeliveredQuantityType.class,
    TotalGoodsItemQuantityType.class,
    TotalMeteredQuantityType.class,
    TotalPackageQuantityType.class,
    TotalPackagesQuantityType.class,
    TotalTransportHandlingUnitQuantityType.class,
    ValueQuantityType.class,
    VarianceQuantityType.class
})
public class QuantityType
    extends ubl.xsd.generated.sm.QuantityType
{


}
