package JaxXml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class XmlToJava
{
    public static void main(String[] args) {

    try {

        File file = new File("C:\\Users\\AMITH\\Desktop\\kafka basics\\HelloWorld\\src\\JaxXml\\data.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Response.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Response res= (Response) jaxbUnmarshaller.unmarshal(file);

        System.out.println(res.getApplicationScoreDate()+" appScDate");
        List<applicationScoreCard> list=res.getApplicationScoreCard();
        for(applicationScoreCard aps:list)
            System.out.println(aps.getCorrelationid()+"CRID "+aps.getCreditCaseId()+" CCID ");

    } catch (JAXBException e) {
        e.printStackTrace();
    }

}
}

