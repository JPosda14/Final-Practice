package model;

public class Site {
    private String name;
    private String sitenumber;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSitenumber() {
        return sitenumber;
    }

    public void setSitenumber(String sitenumber) {
        this.sitenumber = sitenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Site(String name, String sitenumber, String address) {
        this.name = name;
        this.sitenumber = sitenumber;
        this.address = address;
    }
}
