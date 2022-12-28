import java.util.ArrayList;

public class EventOrganizer {
    private int CustId;
    private String CustName;
    private String CustAddres;
    private String CustEmail;
    private int CustPhone;

    public int  getCustId() {
        return CustId;
    }

    public void setCustId(int custId) {
        CustId = custId;
    }

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public String getCustAddres() {
        return CustAddres;
    }

    public void setCustAddres(String custAddres) {
        CustAddres = custAddres;
    }

    public String getCustEmail() {
        return CustEmail;
    }

    public void setCustEmail(String custEmail) {
        CustEmail = custEmail;
    }

    public int getCustPhone() {
        return CustPhone;
    }

    public void setCustPhone(int custPhone) {
        CustPhone = custPhone;
    }
    public EventOrganizer(){

    }
    public EventOrganizer(int custId,String custName,String custAddres, String custEmail,int custPhone){
        this.CustId = custId;
        this.CustName = custName;
        this.CustAddres = custAddres;
        this.CustEmail = custEmail;
        this.CustPhone = custPhone;
    }
    public void printGuest(ArrayList<EventOrganizer>tamu){
            System.out.println(this.getCustId());
            System.out.println(this.getCustName());
            System.out.println(this.getCustAddres());
            System.out.println(this.getCustEmail());
            System.out.println(this.getCustPhone());
    }
}


