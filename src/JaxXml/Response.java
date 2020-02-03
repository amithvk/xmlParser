package JaxXml;




import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Response")
@XmlAccessorType(XmlAccessType.PROPERTY)

public class Response implements Serializable
{
    private String applicationScoreDate;
    private List<applicationScoreCard> applicationScoreCard;

    public Response(){
        super();
    }
    public Response(String applicationScoreDate,List<applicationScoreCard> applicationScoreCard)
    {
        super();

    }

    public String getApplicationScoreDate() {
        return applicationScoreDate;
    }

    public void setApplicationScoreDate(String applicationScoreDate) {
        this.applicationScoreDate = applicationScoreDate;
    }

    public List<JaxXml.applicationScoreCard> getApplicationScoreCard() {
        return applicationScoreCard;
    }

    public void setApplicationScoreCard(List<JaxXml.applicationScoreCard> applicationScoreCard) {
        this.applicationScoreCard = applicationScoreCard;
    }
}