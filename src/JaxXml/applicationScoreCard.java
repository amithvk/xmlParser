package JaxXml;



import java.util.List;

public class applicationScoreCard {
    private int correlationid;
    private int creditCaseId;
    private List<party1> party1;

    public applicationScoreCard()
    {
        super();
    }

    public int getCorrelationid() {
        return correlationid;
    }

    public void setCorrelationid(int correlationid) {
        this.correlationid = correlationid;
    }

    public int getCreditCaseId() {
        return creditCaseId;
    }

    public void setCreditCaseId(int creditCaseId) {
        this.creditCaseId = creditCaseId;
    }

    public List<JaxXml.party1> getParty1() {
        return party1;
    }

    public void setParty1(List<JaxXml.party1> party1) {
        this.party1 = party1;
    }




}

