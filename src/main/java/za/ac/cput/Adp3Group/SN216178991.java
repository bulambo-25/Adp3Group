package za.ac.cput.Adp3Group;

public class SN216178991
{
    private  String  Cup;
    private  String  Senegal;

    public SN216178991(String cup, String senegal, String egypt) {
        Cup = cup;
        Senegal = senegal;
        Egypt = egypt;
    }

    private  String  Egypt;
    public String getCup() {
        return Cup;
    }

    public void setCup(String cup) {
        Cup = cup;
    }

    public String getSenegal() {
        return Senegal;
    }

    public void setSenegal(String senegal) {
        Senegal = senegal;
    }

    public String getEgypt() {
        return Egypt;
    }

    public void setEgypt(String egypt) {
        Egypt = egypt;
    }


    @Override
    public String toString() {
        return "SN216178991{" +
                "Cup='" + Cup + '\'' +
                ", Senegal='" + Senegal + '\'' +
                ", Egypt='" + Egypt + '\'' +
                '}';
    }


}
