package model;

public class Quote {
    private String date;
    private Site site;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public Quote(String date, Site site) {
        this.date = date;
        this.site = site;
    }
}
