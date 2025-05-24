
import ubl.xsd.generated.invoice.InvoiceType;
import ubl.xsd.generated.invoice.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestInvoice {
    public static void main(String[] args)throws Exception{

        JAXBContext context = JAXBContext.newInstance(ObjectFactory.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        StreamSource ss = new StreamSource();
        ss.setReader(new StringReader(Files.readString(Paths.get("/Users/mahendragondi/Downloads/UBL-Invoice-2.1-Example-Trivial.xml"))));
        JAXBElement<InvoiceType> invoice =  unmarshaller.unmarshal(ss, InvoiceType.class);
        invoice.getValue().getID().getValue();
    }
}
